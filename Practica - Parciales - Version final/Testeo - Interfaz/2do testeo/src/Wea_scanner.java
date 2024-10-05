import java.util.Scanner;

public class Wea_scanner {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner entrada = new Scanner(System.in);

        // Ingreso de un número entero
        System.out.print("Ingresa un número entero: ");
        int numero = entrada.nextInt();

        // Ingreso de una cadena de texto
        entrada.nextLine(); // Consumir el salto de línea sobrante
        System.out.print("Ingresa una cadena de texto: ");
        String texto = entrada.nextLine();

        // Ingreso de un solo carácter
        System.out.print("Ingresa un solo carácter: ");
        char caracter = entrada.next().charAt(0);

        // Mostrar los valores ingresados
        System.out.println("Número ingresado: " + numero);
        System.out.println("Texto ingresado: " + texto);
        System.out.println("Carácter ingresado: " + caracter);

        // Cerrar el objeto Scanner
        entrada.close();
    }
}