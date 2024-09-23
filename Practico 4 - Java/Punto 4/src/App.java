import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        // Crear las instancias de cada idioma
        Acciones_usadas ingles = new Ingles();
        Acciones_usadas frances = new Frances();
        Acciones_usadas portugues = new Portugues();

        // Opciones para seleccionar el idioma
        String[] options = {"Inglés", "Francés", "Portugués"};

        // Cuadro de diálogo para seleccionar el idioma
        int choice = JOptionPane.showOptionDialog(
                null,  // Ventana padre
                "Seleccione un idioma:",  // Mensaje
                "Opciones de Idioma",  // Título
                JOptionPane.DEFAULT_OPTION,  // Tipo de opción
                JOptionPane.INFORMATION_MESSAGE,  // Icono
                null,  // Icono personalizado (puedes usar uno)
                options,  // Opciones (botones)
                options[0]  // Opción por defecto seleccionada
        );

        // Seleccionar la instancia de idioma según la elección
        Acciones_usadas selectedLanguage = null;
        switch (choice) {
            case 0 -> selectedLanguage = ingles;
            case 1 -> selectedLanguage = frances;
            case 2 -> selectedLanguage = portugues;
            default -> {
            }
        }

        // Verificar que se haya seleccionado un idioma
        if (selectedLanguage != null) {
            String message = "Saludo: " + selectedLanguage.saludar() + "\n" +
                            "Despedida: " + selectedLanguage.despedirse() + "\n" +
                            "Perdón: " + selectedLanguage.perdon() + "\n" +
                            "Pedir Café: " + selectedLanguage.pedirCafe() + "\n" +
                            "Cuánto Cuesta: " + selectedLanguage.cuantoCuesta() + "\n" +
                            "Dónde Queda: " + selectedLanguage.dondeQueda();
            
            // Mostrar el mensaje en un cuadro de diálogo
            JOptionPane.showMessageDialog(null, message, "Mensajes en " + options[choice], JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ningún idioma.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}