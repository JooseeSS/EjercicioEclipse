package prueba;
import java.util.*;
public class Ejercicio3 {
	   // Definición de la clase Producto
    static class Producto {
        String nombre;
        int stock;
        double precio;

        Producto(String nombre, int stock, double precio) {
            this.nombre = nombre;
            this.stock = stock;
            this.precio = precio;
        }
    }

    // Variables globales
    static Producto[] inventario = new Producto[100];
    static int contadorProductos = 0;
    static final int STOCK_SEGURIDAD = 50;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE GESTIÓN DE INVENTARIO ---");
            System.out.println("1. Introducir datos nuevo inventario");
            System.out.println("2. Nuevo producto");
            System.out.println("3. Buscar producto y modificar información");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Mostrar valor total del inventario");
            System.out.println("6. Informe rotura de stock");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    introducirInventario(scanner);
                    break;
                case 2:
                    agregarProducto(scanner);
                    break;
                case 3:
                    modificarProducto(scanner);
                    break;
                case 4:
                    eliminarProducto(scanner);
                    break;
                case 5:
                    mostrarValorTotal();
                    break;
                case 6:
                    informeRoturaStock();
                    break;
                case 7:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 7);

        scanner.close();
    }

    // a. Función para introducir datos de nuevo inventario
    static void introducirInventario(Scanner scanner) {
        System.out.print("¿Cuántos productos desea añadir? ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        for (int i = 0; i < cantidad; i++) {
            if (contadorProductos >= 100) {
                System.out.println("El inventario está lleno.");
                return;
            }
            System.out.println("\nIntroduciendo producto " + (i + 1) + ":");
            agregarProducto(scanner);
        }
    }

    // b. Función para agregar un nuevo producto
    static void agregarProducto(Scanner scanner) {
        if (contadorProductos >= 100) {
            System.out.println("El inventario está lleno.");
            return;
        }

        System.out.print("Nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Stock del producto: ");
        int stock = scanner.nextInt();
        System.out.print("Precio del producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // Consumir salto de línea

        inventario[contadorProductos++] = new Producto(nombre, stock, precio);
        System.out.println("Producto añadido con éxito.");
    }

    // c. Función para buscar y modificar información de un producto
    static void modificarProducto(Scanner scanner) {
        System.out.print("Ingrese el nombre del producto a buscar: ");
        String nombre = scanner.nextLine();

        for (int i = 0; i < contadorProductos; i++) {
            if (inventario[i].nombre.equalsIgnoreCase(nombre)) {
                System.out.println("Producto encontrado: " + inventario[i].nombre);
                System.out.print("Nuevo stock: ");
                inventario[i].stock = scanner.nextInt();
                System.out.print("Nuevo precio: ");
                inventario[i].precio = scanner.nextDouble();
                scanner.nextLine(); // Consumir salto de línea
                System.out.println("Información actualizada.");
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    // d. Función para eliminar un producto
    static void eliminarProducto(Scanner scanner) {
        System.out.print("Ingrese el nombre del producto a eliminar: ");
        String nombre = scanner.nextLine();

        for (int i = 0; i < contadorProductos; i++) {
            if (inventario[i].nombre.equalsIgnoreCase(nombre)) {
                System.out.println("Producto encontrado y eliminado: " + inventario[i].nombre);
                // Mover productos hacia atrás para llenar el hueco
                for (int j = i; j < contadorProductos - 1; j++) {
                    inventario[j] = inventario[j + 1];
                }
                inventario[--contadorProductos] = null;
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    // e. Función para mostrar el valor total del inventario
    static void mostrarValorTotal() {
        double valorTotal = 0;

        for (int i = 0; i < contadorProductos; i++) {
            valorTotal += inventario[i].stock * inventario[i].precio;
        }

        System.out.println("El valor total del inventario es: " + valorTotal);
    }

    // f. Función para mostrar informe de rotura de stock
    static void informeRoturaStock() {
        System.out.println("\n--- Productos con rotura de stock ---");

        for (int i = 0; i < contadorProductos; i++) {
            if (inventario[i].stock < STOCK_SEGURIDAD) {
                System.out.println("Producto: " + inventario[i].nombre + ", Stock: " + inventario[i].stock);
            }
        }
    }
}

	
