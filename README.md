# Simulador de Supervivencia Zombie

Este proyecto es un simulador por consola que representa un escenario de supervivencia en medio de un apocalipsis zombie. El jugador debe gestionar un inventario de recursos y registrar eventos diarios en una bitácora.

## 👨‍💻 Autor
Jesús Xamir Higuera Losada


## 🛠️ Tecnologías Utilizadas
- Java 17+
- Estructuras de datos: `ArrayList`, `LinkedList`
- Consola (interacción vía `Scanner`)

## 📋 Funcionalidades
### Inventario (`ArrayList<String>`)
- Agregar ítems (agua, comida, medicina, etc.)
- Eliminar ítems por nombre
- Buscar ítems
- Contar ítems
- Listar todos los ítems
- Ordenar alfabéticamente
- Vaciar inventario

### Bitácora (`LinkedList<String>`)
- Agregar eventos diarios (máx. 15 eventos)
- Eliminar el evento más antiguo si se supera el límite
- Buscar eventos por palabra clave
- Mostrar los últimos 5 eventos
- Contar eventos
- Vaciar bitácora

### Evaluación de Supervivencia
Se determina si el jugador sobrevive basándose en la presencia de ítems clave en el inventario: `agua`, `comida` y `botiquín`.

## 🧪 Ejecución
Al ejecutar el programa, el usuario interactúa con un menú de opciones para gestionar el inventario y bitácora. Al finalizar, el sistema evalúa la supervivencia.

## 🚀 Cómo ejecutar el proyecto
1. Abrir el archivo `Main.java` en un IDE como IntelliJ, NetBeans o VSCode.
2. Ejecutar la clase `Main`.
3. Usar el menú para interactuar.