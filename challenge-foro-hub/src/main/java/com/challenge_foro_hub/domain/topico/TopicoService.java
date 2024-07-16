package com.challenge_foro_hub.domain.topico;

import com.challenge_foro_hub.domain.curso.Curso;
import com.challenge_foro_hub.domain.curso.ICursoRepository;
import com.challenge_foro_hub.domain.topico.validaciones.IValidadorDeTopicos;
import com.challenge_foro_hub.domain.usuario.Usuario;
import com.challenge_foro_hub.domain.usuario.IUsuarioRepository;
import com.challenge_foro_hub.infra.errores.ValidacionDeIntegridad;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class TopicoService {


    @Autowired
    private Itopicorepository itopicorepository;
    @Autowired
    private IUsuarioRepository IUsuarioRepository;
    @Autowired
    private ICursoRepository cursoRepository;

    @Autowired
    List<IValidadorDeTopicos> validaciones;

    public Topico registrarTopico(RequestTopicoDTO datos){

        if(!IUsuarioRepository.findById(datos.usuarioId()).isPresent()){
            throw new ValidacionDeIntegridad("este id para el usuario no fue encontrado");
        }
        if(!cursoRepository.existsByNombre(datos.curso())){
            throw new ValidacionDeIntegridad("este curso no fue encontrado");
        }

        for (IValidadorDeTopicos validador : validaciones) {
            validador.validarTopico(datos.titulo(), datos.mensaje());
        }

        Curso curso = cursoRepository.findByNombre(datos.curso());
        Usuario usuario = IUsuarioRepository.getReferenceById(datos.usuarioId());
        Topico topico = new Topico(
                datos.titulo(),
                datos.mensaje(),
                usuario,
                curso
        );
        itopicorepository.save(topico);

        return topico;
    }

    public Topico actualizarTopico(@PathVariable Long id, @RequestBody @Valid ActualizarTopicoDTO datos){
        Topico topico = itopicorepository.getReferenceById(id);
        if(!cursoRepository.existsByNombre(datos.curso())){
            throw new ValidacionDeIntegridad("este curso no fue encontrado");
        }
        for (IValidadorDeTopicos validador : validaciones) {
            validador.validarTopico(datos.titulo(), datos.mensaje());
        }
        Curso curso = cursoRepository.findByNombre(datos.curso());
        topico.actualizarTopico(
                datos.titulo(),
                datos.mensaje(),
                datos.status(),
                curso
        );
        return topico;
    }

}
