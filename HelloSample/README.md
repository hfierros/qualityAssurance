# Práctica 1: Herramientas de análisis estático. 
## Uso de checkstyle. 

Instrucciones:

Dale una leida a la pagina de [checkstyle](https://checkstyle.org/index.html) y al plugin de [checkstyle de maven](https://maven.apache.org/plugins/maven-checkstyle-plugin/).


Instala Java y Maven en tu sistema

Asegurate que ambos corren sin problema: 

```sh
java --version
mvn --version
```

Clona este repositorio en tu máquina. 

```sh
git -clone git@github.com:hfierros/qualityAssurance.git
```

Crea un branch con tu nombre: 
```
git branch nombre_alumno
```

Intenta correr el servicio: 

```sh
mvn clean install
```
para compilar 
```sh
mvn spring-boot:run
```
para ejecutar. (O abre el código fuente de HelloSample en tu IDE de preferencia). 

Y verifica que este corriendo con tu browser:

![image](https://user-images.githubusercontent.com/25756273/158038586-63e532ba-f355-469d-9d00-7a0cef6242fe.png)

Deten la ejecución con CTRL-C o desde el stop de tu IDE. Ahora desde la linea de comandos intenta: 
```
mvn checkstyle:check
```

Aparecerán varios errores de estilo. 
Maven viene con el plugin de ```checkstyle``` instalado por defecto, el comando anterior ejecuta el checkstyle.  

Tu misión en esta práctica, si decides aceptarla será:

1. Altera el archivo pom.xml para que el checkstyle se ejecute cuando realizamos una compilación (```mvn clean install```). 
2. El estilo por defecto es el de la compañía [Sun](https://checkstyle.org/sun_style.html) (creadores de Java) y esta definido en el archivo 
[sun_checks.xml](https://maven.apache.org/plugins-archives/maven-checkstyle-plugin-2.14/config/sun_checks.html), 
sin embargo chekstyle puede usar otros estilos. Altera el archivo pom.xml para usar el estilo de [Google](https://checkstyle.org/google_style.html)
3. Una de las limitantes que tiene el estilo de google, es que solo acepta lineas de 100 caracteres. Altera el ```pom.xml``` para que use tus reglas, y prueba que funcione con una linea de comentarios de más de 100 lineas

Haz un push de tu branch, con el ```pom.xml``` modificado. Si no tienes usuario de github, enviame en correo el archivo como attachment. 


