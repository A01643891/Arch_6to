## Programa a una interfaz, no a una implementación

A continuación explicaré como se aplicó el concepto de la actividad a este código.

Al crear la clase abtracta NPC que se utiliza al nivel general de la clase también abstracta Level, no es necesario preocuparse por la implementación específica a este nivel, ya que sabemos que todos los npc's pueden ser llamados utilizando los mismos métodos.

Además, podemos dejar la definición de los métodos como parte de la interfáz Enemy. De esta manera, podemos determinar cuales van a ser los métodos específicos que debemos asegurarnos que todos los enemigos tengan su propia implementación.

Finalmente, los niveles específicos que extiendad a la clase Level no necesitan modificar la manera en que se corre el nivel por así decirle, solamente indicar los enemigos específicos que van a tener, pero la llamada a la función utilizando la implementación general de la clase Level seguirá funcionando.

A continuación la imágen del diagrama uml:

