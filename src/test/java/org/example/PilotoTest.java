package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import junit.framework.TestCase;

public class PilotoTest extends TestCase {

    public void testAsignarVuelo() {
        // Crear objetos de la clase Piloto y Vuelo
        Piloto piloto = new Piloto("Carlos", Licencia.CPL);
        Licencia licencia = licencia.CPL;
        Vuelo categoriaVuelo = new Vuelo(0, null, null, null, null, null, null, null, null, 0, null)

        Piloto.asignarVuelo(categoriaVuelo);

        ArrayList<Vuelo> asignarOriginal = new ArrayList<>();
        ArrayList<Vuelo> asignarEsperado = new ArrayList<>(Arrays.asList(categoriaVuelo));       
        ArrayList<Vuelo> asignarResultado = piloto.getAsignadosVuelos();

        assertEquals(asignarEsperado.get(0), asignarResultado.get(0));
    }
}
