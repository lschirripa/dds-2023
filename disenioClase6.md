# PRINCIPIOS SOLID:

1. <b> SINGLE RESPONSABILITY PRINCIPLE </b>
    - clases cohesivas, una unica responsabilidad
    - evitar clase dios
    - resp ecapsulada x la clase

2. <b>OPEN CLOSED PRINCIPLE: </b>
    - entidades deben estar abiertas para expansion(extensibilidad, etc), cerradas para modificacion(si me viene un requerimiento nuevo NO)
    - es la implementacion de herencias e interfaces para resolver el problema
    - sugiere evitar switchs y propiciar polimorfismo entre objetos

3. <b>LISKOV SUBSTITUTION PRINCIPLE: </b>
    - dificil de cumplirlo
    - Siempre intenta tipar con la clase o interfaz mas general que puedas
    - Cada clase que hereda de otra puede usarse como su superclase sin necesidad de conocer las diferencias entre las clases derivadas. Lo mismo para interfaces.
    - Se propicia el polimorfismo pero a veces no es indispensable, cuidado.
    - Osea las clases hijas, no deberian tener mas metodos que los que tiene la superclase
    - no hace falta forzarlo ni cumplirlo.

4. <b> INTERFACE SEGREGATION PRINCIPLE: </b>
    - disenio orientado a interfaces
    - un objeto necesita conocer del otro lo minimo
    - Los clientes de un componente(objeto, etc) solo deberian conocer de este aquellos metodos que realmente usan y no aquellos que no necesitan usar
    - Muchas interfaces cliente especificas son mejores que una interfaz de proposito general
    - Se deberia propiciar un disenio orientado a interfaces, para mantener el acoplamiento entre clases al minimo posible, y tambien evitar generar interfaces extensas (con muchos metodos)

5. <b> DEPENDENCY INVERSION PRINCIPLE:</b>
    - Los modulos de lato nivel no deben depender de modulos de bajo nivel. Ambos deben depender de abstracciones.
    - Es una forma de desacoplar modulos.
    - Se sugiere utilizar inyectores de dependencias.
    - las abstracciones mas generales no deberian depender de las mas especificas, sino alrevez (?)


# REFACTORING:

- NO es incorporar funcionalidades nuevas
- NO es optimizar codigo
- ES cambiar la estructura del codigo para hacerlo mas simple y extensible.
    - cambiar nombre de clase,metodo,etc
    - reemplazar condicionales por objetos polimorficos
    - separar clase en varias

El refactor busca:
1. metodos cortos y nombres definidos
2. metodos y clases con responsabilidades claras
3. respecto a las variables de instancia: hay que evaluar costo-beneficio de tener en variables valores que pueden calcularse, como el total de deuda de un cliente, o cant de hijos de un empleado. 
    - motivo: desnormalizacion de datos: dato que puedo calcular, pero decido guardarlo por algun proposito. Ej: si es muy consultado el dato, en vez de tener el calculado en forma de un count de una collecion(calcula siempre), es mejor tenerlo como un contador o acumulador.
4. No tener GOD objects ni managers. Objetos que roban responsabilidades que les corresponden a otros objetos.
5. Preferible Objetos chicos, a grandes con muchas responsabilidades.
6. Evitar ciclos de dependencia entre objetos si no los necesito. Intentar evitar relaciones bidireccionales innecesarias. EJ: Cada cliente conoce a sus facturas, la factura necesita conocer al cliente?.

# CODE SMELLS:

![image](assets/codesmell1.png)
![image](assets/codesmell2.png)
![image](assets/codesmell3.png)


- Hacer las cosas una sola vez
- Dont repeat yourself (DRY)
- Dos de las formas mas conocidas para evitar este smell en disenio es la composicion y herencia.

- Se podria seguir refactorizando, aplicando template method ya que hacen lo mismo los dos hasta en el mismo orden.



## <u> METODOS LARGOS: </u>

El metodo largo podemos descomponerlo en varias partes.

## <u> GOD CLASS: </u>

- Clases con demasiadas responsabilidades, que estan fuertemente acopladas a muchos otros objetos y que por consecuencia ante cualquier cambio se ven afectadas
- NUNCA hacer una clase que se llame SISTEMA xd
- SOLUCIONES A GOD CLASS:
    ![image](assets/Solucionesagodclass.png)
    1. Generar nuevas clases: Principio de responsabilidad unica (S de SOLID):
    2. Generar subclases: Principio de Liskov. Que no se intente cambiar el tipo generico (GODCLASS) que antes estaba usando. A cada clase hija la debo tratar como la mas general.
    3. Generar interfaces: Segregacion de interfaces


Si la god class es respponsable de una interfaz grafica, se debe comenzxar a pensar en el patron MVC, e ir descomponiendo a las responsabilidades entre las diferentes capas involucradas

## <u> PARAMETROS LARGOS: </u>

- Puede darse cuando varios algoritmos se combinan en un metodo <?>

- Si un objeto va a brindar un servicio a otro, lo mejor seria que la cantidad de parametros del metodo en cuestion no varie

EJ:
    ![image](assets/paramlargo1.png)

Ahora se creo un objeto de tipo BusquedaPelicula. Todos esos parametros pasaron a estar dentro de busqueda pelicula.

        BusquedaPelicula()
            - nombre
            - autor
            - estrellas
            - ...
            - DIRECTOR (nueva) -> la agrego sin romper los parametros

## <u> CADENA DE MSJS: </u>

Si un objeto envia un msj de la forma

        a.b().c().d();

Va en contra del consejo `tell, dont ask` o, `dont talk to strangers`, donde un objeto deberia (deeeberia, no hace falta cumplirlo SI O SI) enviar mensajes:
- a si mismo
- a objetos que conoce (como variables de instancia)
- a objetos que recibe como parametro
- a objetos que instancia

`A VECES` se hace adrede para no generar un stackoverflow con la pila de mensajes

no es un code smell tan impotante.

## <u> HERENCIA RECHAZADA: </u>

Se puede dar cuando una clase sobreescribe completamente un metodo base definido por su padre sin importarle lo que este le haya dicho que tenia que hacer, o cuando una clase hereda metodos que en realidad no deberia tener.

La herencia es rigida:
    - Obliga a definir mas metodos que los necesarios(en ciertos casos)
    - En la mayoria de los lenguajes la herencia es simple lo que la transforma en limitante

posible solucion: si no son lo mismo par que forzarlo? usar COMPOSICION (interfaz y distintas clases para tratarlas polimorficamente)  POR SOBRE HERENCIA

## <u> LAZY CLASS: </u>

- Caso de extrema delegacion o porque el componente fue creado 'por las dudas'
- Para evitarlo:
    - No agregar funcionalidad hasta que sea necesario. YAGNI('no lo necesitas')
    - Eliminar de nuestro disenio las clases que no hagan nada, si necesito algo asi a lo sumo tengo el mockeo.

## <u> NOMBRES DE VARIABLES CORTOS O ILEGIBLES: </u>

Los nombres:
- Deben tener expresividad
- Deben representar su funcionalidad

## <u> Nombre de metodo muy largo: </u>

Si nos esta costando elegir un nombre bien representativo para el metodo y nos queda muy largo, seguramente hay mas de una logica comprendida dentro del mismo.

## <u> CODIGO MUERTO: </u>

- Codigo 'por las dudas' ->  se borra
- Comentarios tambien considerados

## <u> PRIMITIVE OBSSESION: </u>

Suele darse al representar con ints, booleans o Strings o enums cosas que podrian ser objetos con comportamiento. Las enums nos llevan a tener sentencias condicionales en lugar de trabajar con objetos polimorficos.

SOLUCION: Buscar abstracciones que nos permitan trabajar polimorficamente

## <u> DATA CLASS - ONLY ACCESORS: </u>

Una clase que solo representa datos es reconocible porque solo presenta setters y getters

        Alumno
            - datos: DataAlumno
        metodo1(){

        }

        Data Alumno
            - edad
            - materias


## <u> METODOS FUERA DE LUGAR E INTERMEDIARIO: </u>

![image](assets/metodosintermediarios.png)


Si no accedemos a nigun atributo ni tampoco utilizamos comportamiento interno, posiblemente estamos ubicando mal el metodo. Por q no enviar directamente el msj

<br>
<br>
<br>
<br>

# ENTITIY VS VALUE OBJECT:

Tanto las entidades como los value objects representan abstracciones para el dominio.

DIFERENCIA: Las ENTIDADES son generalmente, abstracciones principales (CORE) y/o relevantes para el dominio con sentido de existencia propio (o anidadas a otras entidades), mientras que los VALUE OBJECTS generalmente representan abstracciones accesorias.

ejemplos:
- En tendencias musicales: la clase Artista era una ENTIDAD core
- tenemos una clase Alumno con atributo 'telefono', el cual podria estar siendo representando con una instancia de la clase 'telefono'. Esta clase podria tener como atributos el numero, codigo de area, etcetcetc.

<b>TIPOS DE IGUALDAD: </b>

![image](assets/entityvsvalueobjectTiposDeIgualdad.png)

<b>VIDA:</b>
- Los VALUE OBJECTS No tienen algo que los identifique de forma univoca, las ENTIDADES SI.
- Las ENTIDADES viven 'A largo plazo', pueden tener historial, tienen sentido de existencia propio.
- Los VALUE OBJECTS son desechables, vida util 'muy corta'. No tienen sentido de existencia propia.

<b>INMUTABILIDAD:</b>
 
- ENTIDADES: Generalmente, son `mutables`, es decir que sus atributos pueden cambiar sus valores a lo largo del tiempo.

- V.O: Son `inmutables`. Los atributos NO pueden cambiar de valores. Si se necesita cambiar el valor de algun atributo, se DESECHA la instancia y se crea un VO nuevo.

En JAVA, para darle INMUTABILIDAD a un objeto se usa la palabra 'final'



<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>


# TP:

- Si hicimos clase USUARIO, o MIEMBRO, es tendencia a ser clase DIOS. Estara fuertemente acoplada al resto de las clases.

<!-- to research:
- polimorfismo -->

## OFF THE RECORD
- Se puede INSTANCIAR OBJETOS en tiempo de ejecucion. NO confundir con crear clases ni codigo nuevo. Este instanciamiento no nos permiten los ENUMS a diferencia de los objetos, en caso de que quiera permitir algo extensible.
