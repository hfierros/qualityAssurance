# Pruebas de caja negra. 

Este programa regresa una palabra indicando 
si el ángulo formado por dos coordenadas es 
obtuso, agudo o recto.
Arranca el programa con maven:

```
mvn clean install
mvn spring-boot:run
```
O simplemente cargalo en tu IDE y hazlo correr. 

Una vez ejecutado intenta lo siguiente:

Con tu navegador abre la siguiente dirección:

````
http://localhost:8080/angle?x=-5&y=0
````

Los valores de x y y deben ser enteros. 

¿cómo automatizarias las pruebas de caja negra? Intenta una de 
estas opciones:

* Usa ``postman`` para intentar diferentes valores.

* Usa ``curl`` para automatizar la prueba. 

* Usa  python ```request``` para automatizar la prueba.