package org.example;

import junit.framework.TestCase;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

public class TorreTest extends TestCase {
    
    public void testGuardarVuelo() {
        Aerolinea aerolinea = new Aerolinea("Perro",20,20,60);
        Torre torre = new Torre("Ubicacion1", "Correo1", "12345678");
        CategoriaVuelo comercial = CategoriaVuelo.Internacional;
        Estado estado = Estado.programado;
        Vuelo vueloSupervicion = new Vuelo(0, aerolinea, comercial, "lol", "201", LocalDate.now(), LocalTime.MIN, LocalTime.now(), torre, 20, estado);

        torre.guardarVuelo(vueloSupervicion);

        ArrayList<Vuelo> vueloOriginal = new ArrayList<>();
        ArrayList<Vuelo> vueloEsperado = new ArrayList<>(Arrays.asList(vueloSupervicion));
        ArrayList<Vuelo> vueloResultado = torre.getVuelos();

        assertEquals(vueloEsperado.get(0), vueloResultado.get(0));
    }
}