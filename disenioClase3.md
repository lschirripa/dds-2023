# CLASE PRACTICA EJ 'tendencias musicales' & seminario java+maven

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
    - NO vamos a hacer herencia de clases concretas, si de ABSTRACTAS
    - NO usar constructores con muchos parametros. Poner minimos y obligatorios al momento de instanciacion, el resto, setters y getters.
- setters y getters: IDE los genera solos escribiendo el atributo ,o clickD generate...
- La clase abstracta es una clase con almenos 1 metodo abstracto. puede tener todo (metodos concretos, abastractos, etc)menos ser instanciada. el metodo abstracto si o si tengo que redefinirlo, el concreto lo esta compartiendo.
- atributos tipo static: 
    - NO es una constante, es un ATRIBUTO/VARIABLE DE UNA CLASE
    - no hace falta instanciar la clase para usarlo. (+research)
    - se inicializan 1 sola vez
    - le pertenece a la clase y NO a las instancias en si. Osea que todas las instancias de la clase van a ver exactamente el mismo valor para ese atributo, y si alguna de ellas modifica el valor, todas las demas tambien lo ven reflejado porque le PERTENECE A LA CLASE.
    - "private static int comprasMaximas;"
- para que no pueda variar la constante se le pone FINAL (capaz se confunde eso con static)
- para fecha y hora: type: LocalDateTime
- metodos protected: visibles para las clases hijas y la misma clase nada mas
- las interfaces NO pueden llevar metodos con cuerpo
- los tests tambien son clases (siempre publico y tipo void). anotation @test
- patron STATE y TEMPLATE METHOD usados en el ej. Ojo con sobrediseniar con el patron state pensando que por ver estados en el enunciado, tengo que utilizar el patron cuando simplemente son etiquetas y no objetos.
- en template method las interfaces no me sirven
- interfaz: 
>`public interface Manejable{...}`
 
>`public class Auto implementsManejable{...}`
- Asi como en una clase abstracta es obliatorio que sus hijas definan el comportamiento de su metodo abstracto, una INTERFAZ obliga a que las clases que la heredan hayan definido sus clases abstractas con sus metodos abstractos. puede tener metodos abstractos tambien. IMPLEMENT. 
    - no se puede instanciar
    - en la mayoria de los casos solo tiene metodos abstractos
- clase abstracta: 
>`public abstract class vehiculo`
- redefinicion de metodos: 

```
public void encendete(){ 

  super.encendete();

 ...}
```
- COLECCIONES: ( list <'ArrayList'>, set <'HashSet'>, map <'HashMap'>)

- annotations: agregan metadata a los elementos de una clase (definicion de clase/atributo/metodos)

    - @Override: annotation para sobrescribir 1 metodo

- ENUMS: 

> ` public enum Dia  {LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SAB, DOM};`

- EXCEPCIONES: 
    - CHEQUEADAS: `public void comprar() throws SaldoInsuficienteExcepcion`
        - heredan de `exception`
    - NO CHEQUEADAS: heredan de `RuntimeException`
        - ``` 
            public class SaldoInsuficienteExcepcion extends RuntimeException {
            public SaldoInsuficienteExcepcion(String message) {
                super(message);
            }     
            }  
            ```
    - se utilizan de la sig manera:
        - ``` 
            public void comprar(){
                try{
                    //codigo que puede lanzar una SaldoInsuficienteExcepcion
                }
                catch (saldoInsuficienteException e){
                    // Hago algo, por eso la atrape
                } finally {
                    // se ejecuta siempre
                }
            }
            ```


## notes:
* Siempre que se me cruce usar un ENUM, debo analizar la frecuencia al cambio (que tan probable es un alta o baja o modificacion de un enumerado)
* JUnit (https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.9.2)
* para no escribir todos los setters y getters -> lombok de maven (https://projectlombok.org/setup/maven)