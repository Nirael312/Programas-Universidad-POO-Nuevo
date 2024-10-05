import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Date fecha = new Date();

        NoOperador wea = new NoOperador();

        final String miCaraCuando = "2";

        wea.cantar();
        wea.correr();
        wea.xd();
        wea.metodo();

        System.out.println(fecha);

        System.out.println(miCaraCuando);

    }
}
