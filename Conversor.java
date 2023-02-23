import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.DimensionUIResource;

public class Conversor extends JFrame {

    public static void main(String[] args) {
        cambiarApariencia();
        System.out.println(menu());
    }

    public static void cambiarApariencia() {
        UIManager.put("OptionPane.background", new ColorUIResource(36, 36, 36));
        UIManager.put("Panel.background", new ColorUIResource(36, 36, 36));
        UIManager.put("OptionPane.messageForeground", new ColorUIResource(250, 250, 250));
        UIManager.put("OptionPane.messageFont", new Font("Cantarell", Font.PLAIN, 18));
        UIManager.put("OptionPane.buttonFont", new Font("Cantarell", Font.BOLD, 14));
    }

    public static int menu() {
        // Estética del menú
        final ImageIcon icono = new ImageIcon("./Iconos/question-mark.png", "Icono de pregunta");
        UIManager.put("OptionPane.cancelButtonText", "Cancelar");
        UIManager.put("OptionPane.okButtonText", "Seleccionar");
        UIManager.put("OptionPane.minimumSize", new DimensionUIResource(400, 100));

        String[] opciones = { "", "Conversor de moneda", "Conversor de temperatura" };
        String entrada = (String) JOptionPane.showInputDialog(null, "Opción de conversión:", "Menú",
                JOptionPane.QUESTION_MESSAGE, icono, opciones, opciones[0]);
        switch (entrada) {
            case "Conversor de moneda":
                return 1;
            case "Conversor de temperatura":
                return 2;

            default:
                return 0;
        }
    }
}
