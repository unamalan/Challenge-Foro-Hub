package com.challenge_foro_hub.domain.topico;

import jakarta.validation.constraints.NotNull;

public record RequestTopicoDTO(
        @NotNull
        String titulo,
        @NotNull
        String mensaje,
        @NotNull
        Long usuarioId,
        @NotNull
        String curso
) {

}
