## M5 Diseño UML con el Patrón Abstract Factory

En esta actividad se desarrolló un ejemplo de una posible implementación del patrón de Abstract Factory. Su objetivo es permitir la creación de familias de objetos que pueden ser utilizados desde una clase creadora, sin tener que especificar la clase específica de los mismos, permitiendo la creación de futuras implementaciones sin tener que modificar el código base de la clase superior que utiliza sus características.

El tema particular que utilicé fue la creación de una PC, ya que conocemos los componentes base que es necesario tener para su construcción, como un Gpu y un Cpu, pero puede que no conozcamos el tipo específico. Al crear clases abstractas para ambos y usar estas desde el método creador, podemos crear nuevas clases concretas ya sea de Cpu o Gpu, sin tener que modificar el código superior que las utiliza. También es posible crear fabricas concretas que utilizan ciertos componentes específicos, y así asegurarnos que las pc's construidas por cada fabrica concreta siempre van a ser iguales, por dar un ejemplo.

Imágen del diagrama UML:

![Abstract Factory](https://github.com/user-attachments/assets/00e21baf-1be0-4df3-946a-9ce76a202f2e)
