import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();

        System.out.println("!Bienvenido a la Tienda COROSO!");

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    usuario.iniciarSesion();
                    break;
                case 2:
                    usuario.registrarUsuario();
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad a recargar: ");
                    int cantidadRecarga = scanner.nextInt();
                    usuario.recargarDinero(cantidadRecarga);
                    System.out.println("Saldo actual: " + usuario.getSaldoCartera());
                    break;
                case 4:
                    System.out.print("Ingrese el nombre del juego a comprar: ");
                    String nombreJuego = scanner.nextLine();
                    usuario.comprarJuego(nombreJuego);
                    System.out.println("Juego comprado: " + nombreJuego);
                    System.out.println("Historial de compras:\n" + usuario.historialCompra.obtenerHistorial());
                    break;
                case 5:
                    System.out.print("Ingrese el nombre del amigo a agregar: ");
                    String nombreAmigo = scanner.nextLine();
                    usuario.agregarAmigo(nombreAmigo);
                    System.out.println("Amigo agregado: " + nombreAmigo);
                    break;
                case 6:
                    usuario.mostrarBiblioteca();
                    break;
                case 7:
                    System.out.println("!Gracias por utilizar nuestra tienda!");
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        } while (opcion != 7);
    }

    public static void mostrarMenu() {
        System.out.println("Menu:");
        System.out.println("1. Iniciar Sesion");
        System.out.println("2. Registrar Usuario");
        System.out.println("3. Recargar Dinero");
        System.out.println("4. Comprar Juego");
        System.out.println("5. Agregar Amigo");
        System.out.println("6. Mostrar Biblioteca");
        System.out.println("7. Salir");
    }
}
