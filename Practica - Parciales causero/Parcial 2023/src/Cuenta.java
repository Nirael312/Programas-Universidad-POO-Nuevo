public abstract class Cuenta {

    protected String dueño;
    protected String nro_cuenta;
    protected double saldo;

    public Cuenta(String dueño, String nro_cuenta, double saldo) {
        this.dueño = dueño;
        this.nro_cuenta = nro_cuenta;
        this.saldo = saldo;
    }

    public boolean pagar(double monto) {
        if (saldo <= monto) {
            saldo -= monto;  // aqui ese -= es equivalente a hacer saldo = saldo - monto;
            System.out.println("El pago se realizo con exito, su saldo actual es de: " + saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente para pagar el monto");
            return false;
        }

    }

    public abstract void pagar_debito(double monto);
    public abstract void pagar_credito(double monto, int cuotas);
}
