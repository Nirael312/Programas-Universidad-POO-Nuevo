import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        Random random = new Random();

        int max = 200_000;
        int min = 150_000;

        int sueldo_1 = random.nextInt(max - min + 1) + min;
        int sueldo_2 = random.nextInt(max - min + 1) + min;

        Empleado empleado1 = new Empleado("Ariel Zerna Rodriguez", 46143403, 'M', "Argentino", "Desarollador de Software", "9:00-17:00hs", "44-AB - Unreal", sueldo_1);
        Empleado empleado2 = new Empleado("Kadir Martinez", 11111111, 'M', "Argentino (creoxd)", "Modelado 3D", "8:00-16:00hs", "56-DF - Blender", sueldo_2);

        System.out.println(" ");
        empleado1.muestroEmpleado();
        empleado2.muestroEmpleado();

    }
}
