package org.example;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        String input;
        LocalDate date;
        do {
            // Pedir al usuario que ingrese la fecha en el formato dd/MM/yyyy
            input = JOptionPane.showInputDialog(null, "Ingrese la fecha en el formato dd/MM/yyyy:");
            // Verificar si la entrada del usuario es una fecha válida
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                date = LocalDate.parse(input, formatter);
            } catch (DateTimeParseException e) {
                // Si la entrada del usuario no es una fecha válida, mostrar un mensaje de error
                JOptionPane.showMessageDialog(null, "La fecha ingresada no es válida. Por favor, intente de nuevo.");
                date = null;
            }
        } while (date == null); // Repetir el proceso hasta que se ingrese una fecha válida

        // Imprimir la fecha válida ingresada por el usuario
        JOptionPane.showMessageDialog(null, "La fecha ingresada es: " + date);
    }
    
}
