import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> inventario = new ArrayList<>();
        LinkedList<String> bitacora = new LinkedList<>();
        int opcion;

        do {
            System.out.println("\n===== Simulador de Supervivencia Zombie =====");
            System.out.println("1. Agregar item al inventario");
            System.out.println("2. Eliminar item del inventario");
            System.out.println("3. Buscar item en inventario");
            System.out.println("4. Contar items");
            System.out.println("5. Listar items");
            System.out.println("6. Ordenar inventario");
            System.out.println("7. Vaciar inventario");
            System.out.println("8. Agregar evento a la bitácora");
            System.out.println("9. Mostrar últimos 5 eventos");
            System.out.println("10. Buscar evento en bitacora");
            System.out.println("11. Contar eventos");
            System.out.println("12. Vaciar bitácora");
            System.out.println("13. Salir y evaluar supervivencia");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> agregarItem(inventario);
                case 2 -> eliminarItem(inventario);
                case 3 -> buscarItem(inventario);
                case 4 -> contarItems(inventario);
                case 5 -> listarItems(inventario);
                case 6 -> ordenarItems(inventario);
                case 7 -> vaciarInventario(inventario);
                case 8 -> agregarEvento(bitacora);
                case 9 -> mostrarUltimosEventos(bitacora);
                case 10 -> buscarEvento(bitacora);
                case 11 -> contarEventos(bitacora);
                case 12 -> vaciarBitacora(bitacora);
                case 13 -> evaluarSupervivencia(inventario);
                default -> System.out.println("Opción inválida");
            }
        } while (opcion != 13);
    }

    // Métodos para el inventario
    static void agregarItem(ArrayList<String> inventario) {
        System.out.print("Ingrese el nombre del ítem: ");
        String item = sc.nextLine();
        inventario.add(item);
        System.out.println("Item agregado.");
    }

    static void eliminarItem(ArrayList<String> inventario) {
        System.out.print("Ingrese el nombre del ítem a eliminar: ");
        String item = sc.nextLine();
        if (inventario.remove(item)) System.out.println("Item eliminado.");
        else System.out.println("Item no encontrado.");
    }

    static void buscarItem(ArrayList<String> inventario) {
        System.out.print("Ingrese el item a buscar: ");
        String item = sc.nextLine();
        if (inventario.contains(item)) System.out.println("Ítem encontrado.");
        else System.out.println("item no encontrado.");
    }

    static void contarItems(ArrayList<String> inventario) {
        System.out.println("Total de items: " + inventario.size());
    }

    static void listarItems(ArrayList<String> inventario) {
        System.out.println("Inventario: " + inventario);
    }

    static void ordenarItems(ArrayList<String> inventario) {
        Collections.sort(inventario);
        System.out.println("Inventario ordenado.");
    }

    static void vaciarInventario(ArrayList<String> inventario) {
        inventario.clear();
        System.out.println("Inventario vaciado.");
    }

    // Métodos para la bitácora
    static void agregarEvento(LinkedList<String> bitacora) {
        System.out.print("Describa el evento: ");
        String evento = sc.nextLine();
        if (bitacora.size() >= 15) bitacora.removeFirst();
        bitacora.add(evento);
        System.out.println("Evento agregado a la bitácora.");
    }

    static void mostrarUltimosEventos(LinkedList<String> bitacora) {
        System.out.println("Últimos eventos:");
        int desde = Math.max(0, bitacora.size() - 5);
        for (int i = desde; i < bitacora.size(); i++) {
            System.out.println((i + 1) + ". " + bitacora.get(i));
        }
    }

    static void buscarEvento(LinkedList<String> bitacora) {
        System.out.print("Ingrese palabra clave: ");
        String palabra = sc.nextLine();
        boolean encontrado = false;
        for (String evento : bitacora) {
            if (evento.contains(palabra)) {
                System.out.println("Evento encontrado: " + evento);
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("No se encontraron eventos.");
    }

    static void contarEventos(LinkedList<String> bitacora) {
        System.out.println("Total de eventos: " + bitacora.size());
    }

    static void vaciarBitacora(LinkedList<String> bitacora) {
        bitacora.clear();
        System.out.println("Bitácora vaciada.");
    }

    // Evaluación de supervivencia
    static void evaluarSupervivencia(ArrayList<String> inventario) {
        List<String> esenciales = Arrays.asList("agua", "comida", "botiquín");
        boolean sobrevive = inventario.containsAll(esenciales);

        System.out.println("\nEvaluando supervivencia...");
        if (sobrevive) {
            System.out.println("¡Felicidades! Has sobrevivido al apocalipsis zombie :D");
        } else {
            System.out.println("¿Que paso Master? ¿No que muy pro?");
            System.out.println("No lograste sobrevivir");
        }
    }
}
