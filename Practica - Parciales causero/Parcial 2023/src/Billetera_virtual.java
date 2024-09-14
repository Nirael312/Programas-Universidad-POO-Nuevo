
public class Billetera_virtual extends Cuenta {

    private String cvu;

    public Billetera_virtual(String dueño, String nro_cuenta, double saldo, String cvu) {
        super(dueño, nro_cuenta, saldo);
        this.cvu = cvu;
    }

    public void pagar_debito (double monto) {
        pagar(monto);
    }

    public void pagar_credito(double monto, int cuotas) {

            double valor_interes = monto*(cuotas*0.08);
            double val_usado = monto + valor_interes;
            
            if (pagar(val_usado/cuotas)) {
            System.out.println("El pago se realizo con un interes de: " + valor_interes);
            }
        
    }

}
