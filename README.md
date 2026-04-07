# Prácticas de Patrones de Diseño en Java

Este repositorio contiene implementaciones prácticas de los patrones de diseño de software clásicos. El objetivo es demostrar cómo aplicar soluciones probadas a problemas comunes de arquitectura de software, divididos en las tres familias principales: Comportamiento, Estructura y Creación.

---

## ⚙️ 1. Patrones de Comportamiento: State
**Proyecto:** El Horno Inteligente
**Paquete:** `com.ambar.comportamiento`

### Descripción
Este ejercicio implementa el patrón **State**, el cual permite que un objeto altere su comportamiento cuando su estado interno cambia, pareciendo que cambia de clase. 

Simulamos el sistema interno de un horno que pasa por 4 estados concretos:
1. `EstadoApagado`
2. `EstadoPrecalentando`
3. `EstadoHorneando`
4. `EstadoFinalizado`

### Qué problema resuelve
Evita el uso de complejas y largas sentencias `if/else` o `switch` dentro de la clase principal (`Horno`). Al delegar las acciones (iniciar cocción, cancelar, retirar comida) a clases de estado independientes, el código respeta el principio de Responsabilidad Única y es mucho más fácil de escalar si en el futuro se necesitan nuevos estados (como "Descongelar").

---

## 🏛️ 2. Patrones Estructurales: Facade (Fachada)
**Proyecto:** Sistema de Inscripción Universitaria
**Paquete:** `com.ambar.estructura`

### Descripción
Este ejercicio implementa el patrón **Facade**, que proporciona una interfaz unificada y simple para acceder a un conjunto de subsistemas complejos.

Simulamos la inscripción de un alumno donde, por detrás, intervienen tres departamentos distintos:
* `SistemaFinanzas` (Verifica deudas)
* `SistemaCorrelativas` (Verifica materias aprobadas)
* `GestionCupos` (Verifica y asigna asientos)

### Qué problema resuelve
Oculta la "burocracia" y complejidad del sistema interno al cliente (la clase `MainEstructura` que simula la app del alumno). El cliente solo interactúa con un único método `inscribir()` dentro de la `FacadeInscripcion`, promoviendo un bajo acoplamiento. Si los sistemas internos cambian mañana, el código de la aplicación del alumno no se verá afectado.

---
## 🏗️ 3. Patrones Creacionales: Factory Method
**Proyecto:** Sistema de Impresión
**Paquete:** `com.ambar.creacional`

### Descripción
Este ejercicio implementa el patrón **Factory Method**, que proporciona una interfaz para crear objetos en una superclase, pero permite que las subclases alteren el tipo de objetos que se crearán.

Simulamos una impresora que funciona como nuestra "fábrica" o creadora, la cual centraliza la lógica para instanciar diferentes formatos de productos impresos según lo que se le solicite:
* `ImpresionRevista`
* `ImpresionFolleto`
* `ImpresionCuaderno`

### Qué problema resuelve
Desacopla el código cliente de las clases concretas que necesita instanciar. El cliente solo le pide a la fábrica (la impresora) un trabajo de impresión general, sin preocuparse por los detalles de cómo se construye cada producto específico mediante la palabra reservada `new`. Esto respeta el principio Abierto/Cerrado (Open/Closed), ya que si en el futuro se necesita añadir un nuevo formato (por ejemplo, `ImpresionLibro`), solo se crea la nueva clase sin tener que modificar el código cliente existente.
