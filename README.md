
📌 Este proyecto es una aplicación Java Spring Boot diseñada para gestionar locales dentro de un entorno de shopping.
La aplicación utiliza una arquitectura de tres capas, incluyendo la capa de controladores, servicios y repositorios. 
Se han implementado tests unitarios para cada una de estas capas utilizando Mockito.
Además, la persistencia de datos se maneja a través de JPA, con repositorios que interactúan con la base de datos.

El archivo application.yml se utiliza para la configuración de la aplicación, con perfiles específicos para diferentes entornos como QA, producción, desarrollo, entre otros.
Esto permite una fácil configuración y despliegue en diferentes ambientes.

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

📍 GET | /findAllLocals
 - Obtiene una lista de objetos Local, donde cada objeto representa un local dentro de un Shopping.

📍 GET | /findLocalByNameJPQL/{name}
 - Obtiene un local por su nombre utilizando JPQL.
   
📍 GET | /findByName/{name}
 - Obtiene un local por su nombre utilizando anotacion sin JPQL.

📍 GET | /findByNameIgnoreCase/{name}
 - Obtiene un local por su nombre, ignorando mayúsculas y minúsculas.

📍 GET | /findLocalById/{id}
 - Obtiene un local por su identificador único.

📍 POST | /saveLocal
 - Guarda un nuevo local.

📍 PUT | /updateLocal/{id}
 - Actualiza la información de un local existente por su identificador único.

📍 Delete | /deleteLocal/{id}
 -Elimina un local por su identificador único.
