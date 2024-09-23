public class Portugues implements Acciones_usadas {

    @Override
    public String saludar() {
        return "Olá, prazer em conhecê-lo";
    }

    @Override
    public String despedirse() {
        return "Adeus";
    }

    @Override
    public String perdon() {
        return "Sinto muito";
    }

    @Override
    public String pedirCafe() {
        return "Me dê um café, por favor";
    }

    @Override
    public String cuantoCuesta() {
        return "Quanto custa?";
    }

    @Override
    public String dondeQueda() {
        return "Onde fica?";
    }
}