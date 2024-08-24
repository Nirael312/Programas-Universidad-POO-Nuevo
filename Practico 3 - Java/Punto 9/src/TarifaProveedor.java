public abstract class TarifaProveedor {

    public int devuelvo_total_SMS(int totalSMS) {
        return totalSMS * 1;
    }

    public int devuelvo_total_minutos(int totalMinutos) {
        return totalMinutos * 15;
    }

    public int devuelvo_total_Gigas(int totalGigas) {
        return totalGigas * 20;
    }

    public int calcular(int totalSMS, int totalMinutos, int totalGigas) {
        int total = devuelvo_total_SMS(totalSMS) + devuelvo_total_minutos(totalMinutos) + devuelvo_total_Gigas(totalGigas);
        return total;
    }

    public abstract String getNombre();
    
}