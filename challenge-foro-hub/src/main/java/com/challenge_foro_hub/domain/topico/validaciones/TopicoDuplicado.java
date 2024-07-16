package com.challenge_foro_hub.domain.topico.validaciones;

import com.challenge_foro_hub.domain.topico.Itopicorepository;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class TopicoDuplicado implements IValidadorDeTopicos {

    @Autowired
    private Itopicorepository repositorio;

    @Override
    public void validarTopico(String titulo, String mensaje) {

        if (repositorio.existsByTituloAndMensaje(titulo, mensaje)){
            throw new ValidationException("Este topico ya existe");
        }

    }

}