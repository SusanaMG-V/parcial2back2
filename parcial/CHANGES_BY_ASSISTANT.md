Resumen de cambios realizados por el asistente:

- Actualizado pom.xml con dependencias necesarias (Spring Boot JPA, Web, H2).
- Añadida clase de aplicación Parcial2Application.java.
- Completadas 3 entidades: Cine, DetalleCine, Sala con relaciones JPA correctas.
- Creado 3 repositorios con consultas personalizadas: findByNit, findByCiudad, findByTipo.
- Añadido DTO y mapper para Cine (CineDTO, CineMapper).
- Implementados 3 servicios que permiten guardar las entidades con validaciones básicas.
- Configuración H2 en application.properties y consola habilitada.
