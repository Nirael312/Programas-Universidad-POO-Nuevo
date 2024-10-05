public interface Operador {

    void cantar();

    default void correr() {
        System.out.println("cuando eres: soy, cuando no eres: no soy");
    }
}