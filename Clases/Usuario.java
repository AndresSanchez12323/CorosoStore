import java.util.Scanner;

public class Usuario {
    public String nombre;
    public String contrasena;
    public Cartera cartera;
    public HistorialCompra historialCompra;
    public Biblioteca biblioteca;
    private String nombreAmigo;

    public Usuario() {
        cartera = new Cartera();
        historialCompra = new HistorialCompra();
        biblioteca = new Biblioteca();
    }

    public void iniciarSesion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre de usuario: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese su contrasena: ");
        contrasena = scanner.nextLine();
        System.out.println("Inicio de sesion exitoso.");
    }

    public void registrarUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre de usuario: ");
        nombre = scanner.nextLine();
        System.out.print("Contrasena: ");
        contrasena = scanner.nextLine();
        System.out.println("Registro de usuario exitoso.");
    }

    public void recargarDinero(int cantidad) {
        cartera.agregarDinero(cantidad);
    }

    public void comprarJuego(String nombreJuego) {
        historialCompra.registrarCompra(nombreJuego);
        biblioteca.agregarJuegoABiblioteca(nombreJuego);
    }

    public void agregarAmigo(String nombreAmigo) {
        this.nombreAmigo = nombreAmigo;
    }

    public void mostrarBiblioteca() {
        biblioteca.mostrarBiblioteca();
    }

    public int getSaldoCartera() {
        return cartera.getSaldo();
    }
}
