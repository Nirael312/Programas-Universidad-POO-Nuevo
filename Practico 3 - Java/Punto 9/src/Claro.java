public class Claro extends TarifaProveedor {

    public String getNombre() {
        return "Claro";
    }

    public int calcular(int totalSMS, int totalMinutos, int totalGigas) {
        int total = super.calcular(totalSMS, totalMinutos, totalGigas);
        return (int) (total * 1.20);
    }

}
