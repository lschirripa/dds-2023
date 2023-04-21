`stateless`: no guarda información sobre las operaciones, no las recuerda, no se ve afectado
Podríamos llegar a la conclusión de que ellos son reutilizables; es decir, que no dependen de otros objetos para sobrevivir, sino que tienen sentido de existencia propio.

`Stateful`: mi componente va a cambiar por cada vez que llame a algún método o algo por el estilo, se ve afectado su comportamiento


##EJ MODULO EXPORTADOR



1. se reconoce la 1era clase: exportador
2. se modela interfaz exportable
    - expresividad
    - segregar
    - contiene getDatos()
    -  `Map String, List[string]`
3. el exportador conoce a la interfaz
4. clases de terceros que USARIAN NUESTRO MODULO: implementan de la interfaz EXPORTABLE, y ya tienen el metodo `getDatos` para estandarizar y que mande los datos SI O SI de esa manera
    - facturaDeTercero
    - Documento
5. por que EXPORTADOR no puede recibir el map?
    - poder crecer en parametros sin romper la firma
    - si le quiero agregar algo mas, se lo agrego a la interfaz `exportable` (?).

6. disenio de formato: 
    
    - UN MAL DISENIO:
    ``` 
        Formato(enum){
            PDF, 
            EXCEL
        }

        Exportador(exportable, formato){
            if (formato==EXCEL)
            {
                //APACHE POI
            }
        }
     ```
        - inmantenible (tocar en los metodos cuando se me actualice la libreria)
        - poco cohesivo
        - agregar un nuevo formato cambia todo y agrega if
        - muchos ifs xd

    - BUEN DISENIO:
        - separar en dos clases separadas los formatos PDF y EXCEL (strategy) 
            - CLASE `ExportarAExcel`
            - CLASE `ExportarAPDF`
        - implementan de la interfaz EstrategiaDeExportacion
        - se borra la logica de los ifs
        - extensible (agregando clase segun formatos quiera)

    - REQUERIMIENTO ACTUALIZAR O BIBLIOTECA DEPRECADA:
        - Tendria que desechar toda la clase ExportarAPDF (si no es un upgrade de version, solo si se depreca la biblioteca)
        - ahora `exportarAPDF`, va a tener un adapter para usar, que sera la interfaz `AdapterExportarAPDF`. De esta se desprenderan cada biblioteca (`AdapterPDFBOX` y `iLovePDF`)
        - Que biblioteca usar queda a cargo del desarrollador, solo cambiando el atributo adapter de la clase `exportarPDF`



>>> ### PATRON STRATEGY

• Encapsula distintas formas (o algoritmos) de resolver el mismo problema en diferentes clases.

• Permite intercambiar en momento de ejecución la forma en que un tercero resuelve un problema.

- SE USA CUANDO:
    • Se requiere que un objeto realice una misma acción pero con un algoritmo distinto o de una forma
distinta.
    • Existen muchas formas de realizar la misma acción (pero con distintos pasos) en el mismo objeto.
    • Se requiere permitir configurar en momento de ejecución la forma en que un objeto realizará una
    acción.

- DIFERENCIA con ejemplo en el patron strategy del pdf y el ejercicio: El contexto es stateful por atributo, mientras que el ejercicio se hizo stateless por parametro

>>> ### PATRON ADAPTER:

- Encapsula el uso (llamadas/envío de mensajes) de la clase que se quiere adaptar en otra clase que concuerda con la interfaz requerida.


     - SE USA CUANDO: 
        • Se requiere seguir adelante con el diseño y/o implementación (código) sin conocer exactamente
        cómo, quién y cuándo resolverá una parte necesaria; y solamente se conoce qué responsabilidad
        tendrá dicha parte.
        • Se requiere usar una clase que ya existe, pero su interfaz no concuerda con la que se necesita.

    - EN EL EJEMPLO DE LA PPT Y EL EJERCICIO:
        - Las 3 clases que estan vacias: son las clases de 3ros que no conocemos, para eso estana arriba los 3 adapters que hacemos y nos hacemos cargo recien ahi
        - Arriba de nuestros 3 adapters va a estar nuestra clase `PDFAdapter`
        - Siguiendo el adapter esta nuestra clase que aplica Strategy


>>>EJERCICIO CUIDANDONOS