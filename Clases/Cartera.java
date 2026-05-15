public class Cartera {
    public int saldo;

    public Cartera() {
        saldo = 0;
    }

    public void agregarDinero(int cantidad) {
        saldo += cantidad;
    }

    public int getSaldo() {
        return saldo;
    }
}
