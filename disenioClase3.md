# CLASE PRACTICA EJ 'tendencias musicales'

restricciones del enunciado:
1. canciones de 1 unico artista
2. no van a haber canciones sin albumes
3. las canciones pertenecen solo a 1 album

## Problema de consistencia de datos:

De muchas formas diferentes , nos estamos refiriendo al mismo artista
ejemplo de que una artista no podria ser string, provocaria que si se quiere referir al mismo artista por medio de un string, pueden ocurrir cosas como mal tipeo o diferentes strings para referirse al mismo artista (luis miguel , luismi, luismiguel, etc)

la solucion a esto es un modelado de una clase sin comportamiento, donde se me permita referirme a una misma instancia sin problema.


## uml:
relaciones posibles entre objetos:
1. asociacion
2. composicion
3. agregacion

## java:

- toda clase debe pertenecer a un package (clases relacionadas segun conceptos o modelo de negocio)
- metodo main principal (arranca desde ahi)
- convenciones: 
    - todo camel case
    - todos atributos en privados
    - setters y getters: IDE los genera solos escribiendo el atributo ,o clickD generate...
    - NO usar constructores con muchos parametros. Poner minimos y obligatorios al momento de instanciacion, el resto, setters y getters.
    - La clase abstracta puede tener todo (metodos concretos, abastractos, etc)menos ser instanciada. el metodo abstracto si o si tengo que redefinirlo, el concreto lo esta compartiendo.
    - NO vamos a hacer herencia de clases concretas, si de ABSTRACTAS
    - atributos tipo static: 
        - NO es una constante, es un ATRIBUTO DE CLASE
        - no hace falta instanciar la clase para usarlo. (+research)
        - le pertenece a la clase y NO a las instancias en si. Osea que todas las instancias de la clase van a ver exactamente el mismo valor para ese atributo, y si alguna de ellas modifica el valor, todas las demas tambien lo ven reflejado.
    - para que no pueda variar la constante se le pone FINAL (capaz se confunde eso con static)
    - para fecha y hora: type: LocalDateTime
    - metodos protected: visibles para las clases hijas y las padres nada mas
    - las interfaces NO pueden llevar metodos con cuerpo
    - los tests tambien son clases (siempre publico y tipo void). anotation @test
    - patron STATE y TEMPLATE METHOD usados en el ej. Ojo con sobrediseniar con el patron state pensando que por ver estados en el enunciado, tengo que utilizar el patron cuando simplemente son etiquetas y no objetos.
    - en template method las interfaces no me sirven




## notes:
* Siempre que se me cruce usar un ENUM, debo analizar la frecuencia al cambio (que tan probable es un alta o baja o modificacion de un enumerado)
* JUnit (https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.9.2)
* para no escribir todos los setters y getters -> lombok de maven (https://projectlombok.org/setup/maven)