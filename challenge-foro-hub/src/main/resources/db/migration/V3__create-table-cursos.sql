CREATE TABLE cursos (
    id BIGINT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL UNIQUE,
    categoria VARCHAR(100) NOT NULL,
    activo TINYINT,

    PRIMARY KEY (id)
);