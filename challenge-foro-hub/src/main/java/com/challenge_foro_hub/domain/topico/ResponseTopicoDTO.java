package com.challenge_foro_hub.domain.topico;

import java.time.LocalDateTime;

public record ResponseTopicoDTO(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion
) {

    public ResponseTopicoDTO(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(),
                topico.getFechaCreacion()
        );
    }
}
