package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DirectorioAerolineas {
    public static void main(String[] args) {
        List<Aerolinea> directorioAerolineas = new ArrayList<>();

        // Agregar algunas aerolíneas al directorio (puedes adaptar esto según tus datos)
        directorioAerolineas.add(new Aerolinea("Aerolínea1", 100, 50, 10));
        directorioAerolineas.add(new Aerolinea("Aerolínea2", 200, 30, 5));
        directorioAerolineas.add(new Aerolinea("Aerolínea3", 150, 40, 8));

        // Ordenar el directorio en orden decreciente según el número total de vuelos
        Collections.sort(directorioAerolineas);

        // Imprimir el directorio ordenado
        System.out.println("Directorio de Aerolíneas (Ordenado):");
        for (Aerolinea aerolinea : directorioAerolineas) {
            System.out.println(aerolinea);
        }
    }
}


