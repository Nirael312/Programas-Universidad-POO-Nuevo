public class NoOperador implements Operador, Operador2 {

    @Override
    public void cantar() {
        System.out.println("cante xd");
    }

    @Override
    public void correr() {
        Operador.super.correr();
        System.out.println("No opero xd");
    }

    public void xd() {
        System.out.println("xd");
    }

    @Override
    public void metodo() {
        System.out.println("Metodo");
    }
    
}
