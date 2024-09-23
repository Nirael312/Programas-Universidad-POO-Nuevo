public class Frances implements Acciones_usadas {

    @Override
    public String saludar() {
        return "Bonjour, enchanté de vous rencontrer";
    }

    @Override
    public String despedirse() {
        return "Au revoir";
    }

    @Override
    public String perdon() {
        return "Je suis désolé";
    }

    @Override
    public String pedirCafe() {
        return "Donnez-moi un café s'il vous plaît";
    }

    @Override
    public String cuantoCuesta() {
        return "Combien ça coûte ?";
    }

    @Override
    public String dondeQueda() {
        return "Où est-ce ?";
    }
}