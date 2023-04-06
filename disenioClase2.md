##Cualidades de Diseño


<!-- using markdown preview enhanced -> ctrl+shift+v to preview -->

#####ACOPLAMIENTO
- Mejorar la mantenibilidad
- Aumentar la reutilización
- Evitar tener que inspeccionar y/o modificar múltiples componentes ante una modificación en uno
solo de ellos

#####COHESION
- mientras mas responsabilidades tiene, menos cohesivo sera
- Cada componente debe tener una sola responsabilidad o objetivo.

#####COHESION Y ACOPLAMIENTO:
- Se busca alta cohesion y bajo acoplamiento entre componentes. 

-  Siempre tendran un minimo grado de acoplamiento, pero se debe mantener bajo, por que si falla un componente el otro fallara, dependeran mucho entre si.

#####SIMPLICITY:
- keep it simple

#####ROBUSTEZ:
- El sistema debe reportar los errores y volver a un estado consistente. Load balancer?
- El sistema debe facilitar la busqueda para la posible deteccion del probelma . debuggers, loggeos

#####FLEXIBILIDAD:
- Extensibilidad: capacidad de agregar nuevas caracts con poco impacto
- Mantenibilidad: capacidad de modificar las caracts existentes con el menor esfuerzo posible


#####PATRONES DE DISEÑO

- no siempre hay aplicarlo es una buena solucion. kiss.

1.  Creacionales
2.  Comportamiento
3. Estructurales

##TP:

######26/04 1ER ENTREGA

*hay que ver quien son los actores de mi sistema y quienes no*

#####ACTORES:
proveedor de la plataforma
admin
user
comunidad (o miembro?)
...

#####notes:
- validacion de conflicto de intereses: NO esta dentro del alcance (el proceso)
- se evitan herencias
- se recomiendan interfaces
- guava o bcrypt(para encriptar, no es =) para hashear pw

#####req generales:
modelar las clases con sus atributos y relaciones
setters y getters

#####req de seguridad:
- cred por defecto ej: id.admin pw.admin, o esos casos
- quedara modular, separado de lo demas
- el punto que se choque con req generales, sera el usuario.
- limite o incremento: no se toma en cuenta x ahora. Rotacion de pw tampoco se toma en cuenta.
- las demas: modulo o conjunto de clases que el metodo principal sea el: esValida(), osea sea el core. 
- Y dentro (como dev) poder modificar las validaciones q se hacen para esa pw. Por ej las 10k peores contrasenias. Otra, verificar la longitud

#####entregables:

a. casos de uso
b. UML (no es definitivo, es incremental)
c. decisiones de disenio justificadas mediante cohesion, acoplamiento etc etc
