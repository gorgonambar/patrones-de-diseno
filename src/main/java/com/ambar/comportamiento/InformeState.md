El patrón de diseño State se utiliza cuando un objeto necesita alterar su comportamiento drásticamente
dependiendo de su estado interno en tiempo de ejecución, simulando que el objeto en sí ha cambiado de clase.
Es ideal para situaciones donde tienes un elemento con ciclos de vida muy marcados. 
En lugar de tener un código espagueti lleno de gigantescos bloques `if/else` o `switch` el patrón delega esa 
toma de decisiones a objetos independientes, haciendo que el comportamiento dinámico sea fluido y estructurado.

Para aplicar este patrón, se dividen las responsabilidades en tres componentes fundamentales. Primero, se crea una Interfaz de Estado
que establece el contrato o las acciones posibles que el sistema puede intentar ejecutar. Segundo, se construyen los Estados Concretos,
que son clases individuales que implementan esa interfaz y contienen la lógica específica de lo que debe ocurrir en ese momento exacto,
dictando además cuándo y cómo se debe transicionar hacia el siguiente estado. Por último, se tiene el Contexto (el objeto principal que el usuario manipula),
el cual guarda una variable con su estado actual y, al recibir una orden, simplemente se la delega a ese estado para que la resuelva.

Como toda arquitectura en el desarrollo de software, este patrón presenta claras ventajas y desventajas. Su mayor ventaja es el orden absoluto:
cumple a la perfección con los principios de Responsabilidad Única y Abierto/Cerrado (SOLID), ya que puedes agregar nuevos estados en el futuro 
creando nuevas clases sin tener que modificar el código del contexto principal ni arriesgarte a romper la lógica de los estados ya existentes. 
Sin embargo, su principal desventaja es la "sobreingeniería". Si tu programa tiene una lógica de estados muy simple o que rara vez va a cambiar,
implementar este patrón aumentará innecesariamente la complejidad de tu proyecto al obligarte a crear un montón de clases pequeñas y archivos
separados para algo que podría haberse resuelto con un par de condicionales.