public class Impuesto {
    
    private String nombre;
    private double monto;
    private boolean cobrado;
    private int periodo;
    private String comprobante;

    public Impuesto(String nombre, double monto, int periodo) {
        this.nombre = nombre;
        this.monto = monto;
        this.cobrado = false;
        this.periodo = periodo;
    }

    public void valido_pago(double monto, int mes, String comprobante) {

    if (!cobrado && this.monto == monto && this.periodo == mes) {
        this.comprobante = comprobante;
        this.cobrado = true;
        System.out.println("Impuesto " + nombre + " cobrado. Comprobante: " + comprobante);
    } else {
        System.out.println("Error en el pago del impuesto " + nombre);
    }
}


}
