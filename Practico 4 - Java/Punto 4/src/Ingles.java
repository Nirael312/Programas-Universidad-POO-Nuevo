public class Ingles implements Acciones_usadas {

    @Override
    public String saludar() {
        return "Hello, nice to meet you";
    }

    @Override
    public String despedirse() {
        return "Goodbye";
    }

    @Override
    public String perdon() {
        return "I´m sorry";
    }

    @Override
    public String pedirCafe() {
        return "Give me a coffe please";
    }

    @Override
    public String cuantoCuesta() {
        return "How much does it cost?";
    }

    @Override
    public String dondeQueda() {
        return "Where is it?";
    }
}
