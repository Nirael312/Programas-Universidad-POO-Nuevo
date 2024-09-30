import javax.swing.JOptionPane;

public class Calculadora {
    
    public static void main(String[] args) {
        
        while (true) {
            try {
                // Pedir el primer número
                String input1 = JOptionPane.showInputDialog("Ingrese el primer número (o 'salir' para terminar):");
                if (input1 == null || input1.equalsIgnoreCase("salir")) {
                    break;
                }
                double num1 = Double.parseDouble(input1);

                // Pedir el segundo número
                String input2 = JOptionPane.showInputDialog("Ingrese el segundo número:");
                double num2 = Double.parseDouble(input2);

                // Mostrar la operación
                String[] operaciones = {"Sumar", "Restar", "Multiplicar", "Dividir"};
                int choice = JOptionPane.showOptionDialog(null, "Seleccione la operación:",
                        "Operaciones", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, operaciones, operaciones[0]);

                double resultado = 0;
                String operacion = "";

                switch (choice) {
                    case 0: // Sumar
                        resultado = num1 + num2;
                        operacion = "Suma";
                        break;
                    case 1: // Restar
                        resultado = num1 - num2;
                        operacion = "Resta";
                        break;
                    case 2: // Multiplicar
                        resultado = num1 * num2;
                        operacion = "Multiplicación";
                        break;
                    case 3: // Dividir
                        if (num2 == 0) {
                            JOptionPane.showMessageDialog(null, "Error: División por cero no está permitida.", "Error", JOptionPane.ERROR_MESSAGE);
                            continue;
                        }
                        resultado = num1 / num2;
                        operacion = "División";
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Operación no válida.", "Error", JOptionPane.ERROR_MESSAGE);
                        continue;
                }

                // Mostrar el resultado
                String message = String.format("Resultado de la %s: %.2f", operacion, resultado);
                JOptionPane.showMessageDialog(null, message, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada no válida. Por favor ingrese un número.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}