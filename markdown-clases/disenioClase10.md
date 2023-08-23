EVALUO EN CUANTO DISPONIBILIDAD:

- veo si por ejemplo el internet me limita en algun sentido de la disponibilidad. Porque por ejemplo si tengo dispositivos que dependen de internet para enviarme alarmas cuando pasa algo, si se me cae internet nunca me va a enviar los datos o alarmas

EVALUO PERFORMANCE, TIEMPO DE RTA:
- MUCHISIMA latencia por internet, llegada de info al sv nube y eso


EVALUO EN CUANTO A SEGURIDAD:

- si me hackean el sv de mi empresa de alarmas que todos los dispositivos se me comunican, me ganan el acceso a todos los dispositivos de todas las casas.


### PENSANDO DE OTRA MANERA =>

 ANALIZAR QUE PASARIA SI EN VEZ DE UN SERVIDOR EN LA NUBE YO TENDRIA UN SERVIDOR LOCAL:

-  siguiendo el ejemplo, en mi casa correria el server y conecto los dispositivos a mi RED LOCAL. entonces INTERNET ya no seria un problema y mejoraria mi DISPONIBILIDAD

- AHORA cada hogar sera responsable de la carga de dispositivos que tendra cada hogar mismo. Ya no tengo un sv central donde tenga que aguantar toda la info de todos los dispositivos de todas las casas.

- Que pasa si tengo que actualizar el sistema? mando un tecnico a cada casa? eso no pasaria si estuviese en la nube.
Pensando como resolverlo para que sea mas barato, necesitaria tener un componente que vaya chequeando si hay actualizaciones o no (centro de actualizaciones, como tiene windows)



## dos esquemas distintos pensando en los componentes:

1_  desde los servidores voy a ir hasta a los sensores para ir a buscar el dato o alrevez? que es mejor?
si desde el sv constantemente pregunto los datos no tiene sentido (while que nunca termina, eso es una ESPERA ACTIVA)

2_ Si los sensores envian cada cierto tiempo los datos al sv. El sv no consume recursos ni cpu al pedo. MUCHO mas eficiente

    Estos dos esquemas se llaman: 
    1_ PULL BASED: Vamos a buscar el dato constantemente
        - sv busca el dato constantemente
    2_ PUSH BASED
        - esperamos que el dato nos llegue y actuamos
        - ejemplo con las notificaciones PUSH

gralmente se hace un mix. Si por x motivo el user no recibio la notificacion, se hace un PULL BASED cada cierto tiempo por las dudas. O para chequear el estado de salud del sensor 

Como consecuencia de tener algo PUSH BASED, NUUUUNCA podre tener por ejemplo un metodo que diga buscarDato() de parte del sv, eso seria recontra PULL


<br/>
<br/>

------------------------


## PATRON COMMAND

Se sugiere cuando:

- se requiere configurar en momento de ejecucion una serie de acciones que debe realizar un objeto

- se requiere configurar en momento de ejecucion una serie de acciones a realizar en un momento posterior al de coniguracoin, formando una cola

- ...

