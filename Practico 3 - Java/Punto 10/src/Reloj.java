public class Reloj {
    
    public void informe(Docente docente) {
        if (docente.getHoras_mensuales() >= docente.horas_minimas()) {
            System.out.println("Cumple con las horas minimas");
        } else {
            System.out.println("No cumple");
        }

    }

    public void informe(No_docente no_docente) {   // supongo que podria aplicar polimorfismo, donde se dif por lo parametros
        // tal vez no sea necesario, ya de por si puede calcular sus horas por tener el mismo nombre
        // si sera xd, le di como parametro un docente, no se podria si fuese un no docente borren syo
    }
}
