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
        DirectorioTorres directorioTorres = new DirectorioTorres();
        ArrayList<Torre> torre = directorioTorres.inicializarDirectorioTorre();
        CategoriaVuelo comercial = CategoriaVuelo.Internacional;
        Estado pronto = Estado.programado;
        TipoRuta tipoRuta1 = TipoRuta.nacional;
        Ruta ruta1 = new Ruta("Bogota","Armenia",tipoRuta1);
        Vuelo vuelo1 = new Vuelo(1,directorio.get(0),comercial,
                "Armenia","201",LocalDate.now(),
                LocalTime.MIDNIGHT,LocalTime.now(),torre.get(0),20,pronto,ruta1);
        Torre torre1 = new Torre("norte","cualquiercosa","32123133");
        torre1.guardarVuelo(vuelo1);
    }
    
}
