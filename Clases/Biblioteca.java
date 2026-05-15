public class Biblioteca {
    public String juegosEnBiblioteca;

    public Biblioteca() {
        juegosEnBiblioteca = "";
    }

    public void agregarJuegoABiblioteca(String nombreJuego) {
        juegosEnBiblioteca += nombreJuego + "\n";
    }

    public void mostrarBiblioteca() {
        System.out.println("Juegos en tu biblioteca:");
        System.out.println(juegosEnBiblioteca);
    }
}
