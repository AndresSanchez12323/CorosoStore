public class HistorialCompra {
    public String comprasRealizadas;

    public HistorialCompra() {
        comprasRealizadas = "";
    }

    public void registrarCompra(String nombreJuego) {
        comprasRealizadas += "Juego comprado: " + nombreJuego + "\n";
    }

    public String obtenerHistorial() {
        return comprasRealizadas;
    }
}
