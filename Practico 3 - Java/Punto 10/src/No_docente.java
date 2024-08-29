public class No_docente extends Personal {
    private String jornada;

    public No_docente(String nombre_completo, int antiguedad, String sector, String jornada) {
        super(nombre_completo, antiguedad, sector);
        this.jornada = jornada;
    }
    
    public int getHoras_mensuales() {
        return horas_mensuales;
    }
    
    public int horas_minimas() {
        switch (jornada) {

        case "Completa":
        return 30 * 4;
        case "Reducida":
        return 20 * 4;
        }

    }

    
}
