package org.example;

import junit.framework.TestCase;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

public class PilotoTest extends TestCase {

    public void testAsignarVuelo() {
        Piloto piloto = new Piloto("Carlos", Licencia.CPL);
        Licencia licencia = licencia.CPL;
        CategoriaVuelo internacional = CategoriaVuelo.Internacional;
        Vuelo categoriaVuelo = new Vuelo(0, aerolinea, comercial, "lol", "201", LocalDate.now(), LocalTime.MIN, LocalTime.now(), torre, 20, estado);

        Piloto.asignarVuelo(categoriaVuelo);

        ArrayList<Vuelo> asignarOriginal = new ArrayList<>();
        ArrayList<Vuelo> asignarEsperado = new ArrayList<>(Arrays.asList(categoriaVuelo));       
        ArrayList<Vuelo> asignarResultado = piloto.getAsignadosVuelos();

        assertEquals(asignarEsperado.get(0), asignarResultado.get(0));
    }
}
