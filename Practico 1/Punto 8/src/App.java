public class App {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona("Ariel", 19, true, true);
        Persona persona2 = new Persona("Walter", 24, true, false);
        Familia familia1 = new Familia();

        persona1.muestro();
        persona2.muestro();

        familia1.agregoMiembros(persona1);
        familia1.agregoMiembros(persona2);

        familia1.muestro_familia();

    }
}
