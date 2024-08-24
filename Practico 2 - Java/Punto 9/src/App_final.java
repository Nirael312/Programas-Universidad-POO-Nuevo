public class App_final {
    
    public static void main(String[] args) {

        Comuna comuna = new Comuna();

        Familia familia1 = new Familia();
        Familia familia2 = new Familia();

        Persona persona1 = new Persona("Ariel", 19, 'M', true, false);
        Persona persona2 = new Persona("Noelia", 25, 'F', true, false);
        Persona persona3 = new Persona("Elsa", 55, 'F', false, true);

        Persona persona4 = new Persona("Walter", 24, 'M', true, false);
        Persona persona5 = new Persona("Selena", 20, 'F', true, true);

        familia1.agregoMiembros(persona1);
        familia1.agregoMiembros(persona2);
        familia1.agregoMiembros(persona3);

        familia2.agregoMiembros(persona4);
        familia2.agregoMiembros(persona5);

        comuna.agregoFamilia(familia1);
        comuna.agregoFamilia(familia2);

        comuna.muestro_comuna();

        comuna.muestro_informe();

    }
}
