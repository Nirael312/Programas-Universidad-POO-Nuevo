public class Movistar extends TarifaProveedor {

    public String getNombre() {
        return "Movistar";
    }

    public int calcular(int totalSMS, int totalMinutos, int totalGigas) {
        int total = super.calcular(totalSMS, totalMinutos, totalGigas);
        total += (devuelvo_total_SMS(totalSMS) * 0.10);
        total += (devuelvo_total_minutos(totalMinutos) * 0.20);
        total += (devuelvo_total_Gigas(totalGigas) * 0.30);

        return total;
    }

}
