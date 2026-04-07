El factory method que busca delegar la creacion de objetos a ciertos metodos y evitar utilizar "new" repetidamente.
Esto se logra definiendo una interfaz para crear objetos y la eleccion del tipo de objeto a crear se delega en las clases hijas.

Este patrón permite que las clases se puedan extender y escalar, colaborando además con el principio de responsabilidad única de las clases.

Para que funcione, en lugar de que tu programa principal decida exactamente qué clase concreta instanciar, se le delega esa responsabilidad a
un método especial (el "método fábrica"). Así, uno trabaja siempre interactuando con una interfaz general, y son las clases hijas las que se encargan
de decidir qué objeto específico construir en el momento adecuado.

Para implementarlo, primero se define una interfaz  base para los objetos que se quieran crear y una clase creadora genérica que contiene el método fábrica.
Luego, cuando se arman subclases de este creador, cada una de ellas redefine ese método para construir y devolver una versión distinta del producto.
De esta manera, cuando tu sistema necesita un objeto, simplemente se lo pide al creador correspondiente y este se lo entrega listo para usar, ocultando toda
la lógica pesada de inicialización.

La mayor ventaja de este enfoque es que el proyecto se vuelve flexible y fácil de mantener.