import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");

        Gacha ArK = new Arknigths();
        Gacha Wuwa = new Wuthering_waves();
        Gacha Star_rai =  new Star_rail();

        Random random = new Random();

        int val = random.nextInt(1,4);

        Gacha opcion_elegida = null;
        String nombre = null;

        switch (val) {
            case 1:
                opcion_elegida = ArK;
                nombre = "Arknights";
                break;
            case 2:
                opcion_elegida = Wuwa;
                nombre = "Wuthering waves";
                break;
            case 3:
                opcion_elegida = Star_rai;
                nombre = "Star rail";
                break;
            default:
                break;
        }

        System.out.println("A ver que gacha te toco jsjsjs:");
        System.out.println(" ");

        System.out.println("Te toco el " + nombre);

        opcion_elegida.diarias_de_mrd();
        opcion_elegida.mostrar_bestos_monas();
        opcion_elegida.proximos_pulls();
    }
}
