
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);

        TarifaProveedor claro = new Claro();
        TarifaProveedor movistar = new Movistar();
        TarifaProveedor personal = new Personal();
        
        System.out.println("");
        System.out.println(" ------ Ingrese los siguientes datos para ver las distintas tarifas ------ ");
        System.out.println("");

        System.out.print("Total de SMS: ");
        int totalSMS = teclado.nextInt();

        System.out.print("Total de minutos por llamada: ");
        int totalMinutos = teclado.nextInt();

        System.out.print("Total de gigas: ");
        int totalGigas = teclado.nextInt();
        System.out.println("");

        teclado.close();

        System.out.println(" -------- Todas las tarifas distintas ------");

        System.out.println("Para Claro: " + claro.calcular(totalSMS, totalMinutos, totalGigas) + " pesos");
        System.out.println("Para Personal: " + personal.calcular(totalSMS, totalMinutos, totalGigas) + " pesos");
        System.out.println("Para Movistar: " + movistar.calcular(totalSMS, totalMinutos, totalGigas) + " pesos");

        System.out.println(" ------- fin de las tarifas distintas -----");
        System.out.println(" ");
    }
}
