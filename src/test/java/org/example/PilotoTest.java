package org.example;

import junit.framework.TestCase;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class PilotoTest extends TestCase {
    @Test
    public void testAsignarVuelo() {
        Piloto piloto = new Piloto("Carlos", Licencia.CPL);
        Licencia licencia = Licencia.CPL;
        CategoriaVuelo internacional = CategoriaVuelo.Internacional;
        Vuelo categoriaVuelo1 = new Vuelo(0, null, internacional, null, null, null, null, null, null, 0, null,null);
        Vuelo categoriaVuelo2 = new Vuelo(0, null, internacional, null, null, null, null, null, null, 0, null,null);
        ArrayList<Vuelo> vuelos = new ArrayList<>(Arrays.asList(categoriaVuelo1,categoriaVuelo2));
            piloto.asignarVuelo(vuelos);

        ArrayList<Vuelo> asignarOriginal = new ArrayList<>();
        ArrayList<Vuelo> asignarEsperado = new ArrayList<>(Arrays.asList(categoriaVuelo1,categoriaVuelo2));
        ArrayList<Vuelo> asignarResultado = piloto.getAsignadosVuelos();
        assertEquals(asignarEsperado,asignarResultado);
    }
}
