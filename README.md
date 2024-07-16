![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white) ![GitHub](https://img.shields.io/badge/GitHub-%23121011.svg?style=for-the-badge&logo=github&logoColor=white) ![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)  ![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
<h1>
Descripcion del proyecto
</h1>
<p align="justify">
El challenge Foro Hub consiste en una API REST desarrollada con Spring Boot, diseñada para gestionar tópicos de discusión.</p>



## Características

##### CRUD de Tópicos
- Crear, leer, actualizar y eliminar tópicos.
##### Autenticación y Autorización
- Implementada con JWT (JSON Web Token) .
##### Validaciones
- Validaciones de entrada de datos utilizando Jakarta Bean Validation.
##### Swagger
- Documentación de la API generada automáticamente.
  
- Modelo de desarrollo SOLID.

## Dependencias Utilizadas

- Spring Web
- Spring Boot DevTools
- Spring Data JPA
- Flyway Migration
- MySQL Driver
- Validation
- Spring Security
- Swagger
- Lombok

  
### Endpoints Principales

- **POST /topicos**: Crea un nuevo tópico.
- **GET /topicos**: Obtiene la lista de tópicos.
- **PUT /topicos/{id}**: Actualiza un tópico existente.
- **DELETE /topicos/{id}**: Elimina un tópico de la base de datos.
