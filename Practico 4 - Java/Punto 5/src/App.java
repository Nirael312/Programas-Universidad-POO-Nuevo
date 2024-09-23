import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        String [] opciones = {"Sumar", "Restar", "Multiplicar", "Dividir"};

        int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una operacion: ", "Operaciones ", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        switch (seleccion) {
            case 0: 
                
                break;
            default:
                throw new AssertionError();
        }
    }
}
