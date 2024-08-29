public class Docente extends Personal {
    private String categoria;
    
    public Docente(String nombre_completo, int antiguedad, String sector, String categoria) {
        super(nombre_completo, antiguedad, sector);
        this.categoria = categoria;
    }

    public int getHoras_mensuales() {
        return horas_mensuales;
    }

    public int horas_minimas() {
        switch(categoria) {

            case "Simple": 
            return 40*4;
            case "Semiexclusiva":
        }
    }

}