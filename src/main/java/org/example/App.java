package org.example;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.LocalTime;
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
        DirectorioAerolineas inicializar = new DirectorioAerolineas();
        ArrayList<Aerolinea> directorio =  inicializar.inicializarDatos();
        CategoriaVuelo comercial = CategoriaVuelo.Internacional;
        Estado pronto = Estado.programado;
        Vuelo vuelo1 = new Vuelo(1,directorio.get(0),comercial,
                "Armenia","201",LocalDate.now(),
                LocalTime.MIDNIGHT,LocalTime.now(),"1",20,pronto);
        Torre torre1 = new Torre("norte","cualquiercosa","32123133");
        torre1.guardarVuelo(vuelo1);
        for (int i = 0; i < directorio.size(); i++) {

        }
    }
    
}
