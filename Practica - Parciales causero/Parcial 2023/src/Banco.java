public class Banco extends Cuenta {

    private String cbu;

    public Banco(String dueño, String nro_cuenta, double saldo, String cbu) {
        super(dueño, nro_cuenta, saldo);
        this.cbu = cbu;
    }

    public void pagar_debito (double monto) {
        double val_reintegro = monto*10;
        if (pagar(monto - val_reintegro)) {
            System.out.println("El reintegro aplicado fue de: " + val_reintegro);
        } else {
            System.out.println("No se realizo el pago, por lo que no se realizo ningun reintegro");
        }



    }

    public void pagar_credito(double monto, int cuotas) {
        if (cuotas >= 3) {
            System.out.println("El pago se realizara sin interes");
            pagar(monto/cuotas);

        } else {
            double valor_interes = monto*(cuotas*0.02);
            double val_usado = monto + valor_interes;
            
            if (pagar(val_usado/cuotas)) {
            System.out.println("El pago se realizo con un interes de: " + valor_interes);
            }
        }
    }

}
