# TALLER 1: APLICACIONES DISTRIBUIDAS (HTTP, SOCKETS, HTML, JS,MAVEN, GIT)

Una aplicación para consultar la información de películas de cine. La aplicación recibe una frase de búsqueda del título, por ejemplo “Guardians of the galaxy” y deberá mostrar el los datos de la película correspondiente.

Utiliza el API gratuito de [omdbapi](https://www.omdbapi.com/). La implementación es eficiente en cuanto a recursos así que implementa un Caché que permite evitar hacer consultas repetidas al API externo.


### Requisitos 

* [Git](https://git-scm.com/) - Control de versiones
* [Maven](https://maven.apache.org/) - Manejador de dependencias
* [Java](https://www.oracle.com/java/technologies/downloads/#java11) - Lenguaje de programación


### Instalación 

Clonamos el proyecto con el comando:

```bash
git clone https://github.com/cattus09/taller_1_AREP.git

```

## Ejecutando la aplicación

Para ejecutar la aplicación, usamos el siguiente comando en la terminal:

```bash
mvn exec:java '-Dexec.mainClass=edu.escuelaing.arep.app.server.HttpServer'

```

En el buscador de su preferencia ingresamos a: 

[http://localhost:35000/](http://localhost:35000/).

En esta página, tenemos la posibilidad de buscar películas y obtener detallada información sobre ellas.

## Ejecutando las pruebas 

Usamos el siguiente comando para ejecutar las pruebas:

```bash
mvn test
```

## Generando Javadoc 

Para generar la documentación de la aplicación, use el siguiente comando: los archivos Javadoc se generarán en el directorio `target/site/apidocs` dentro del proyecto.

```bash
mvn site
```
entre a la la carpeta `target/site/` y ejecute el `index.html` en la pagina encontrar la documentacion del trabajo 

## Descripción de la aplicación 

Esta aplicación es un cliente web multiusuario que opera directamente en el navegador y utiliza el formato JSON para la comunicación de mensajes. Su función principal es actuar como un servidor de fachada, encapsulando las solicitudes a servicios web externos mediante el protocolo HTTP.

La fachada de servicios incluye una implementación de caché que evita realizar llamadas duplicadas almacenando las respuestas como cadenas y comparándolas para optimizar el rendimiento.

Los módulos de la aplicación incluyen:

* **Cache**: Contiene la implementación del caché de la aplicación.
* **HttpServer**: Contiene la implementación del servidor web de la aplicación.
* **HTTPApiConection**: Contiene la implementación del servicio de conexión a la API externa.

## Autores ✒️

* **Sergio gonzalez** - [cattus09](https://github.com/cattus09)


