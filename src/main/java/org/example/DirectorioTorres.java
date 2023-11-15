package org.example;

import java.util.ArrayList;

public class DirectorioTorres {
    public ArrayList<Torre> inicializarDirectorioTorre(){
        // Crear una lista de torres con datos quemados
        ArrayList<Torre> directorioTorres = new ArrayList<>();
        // Agregar datos quemados
        directorioTorres.add(new Torre("Ubicacion1", "correo1@example.com", "123456789"));
        directorioTorres.add(new Torre("Ubicacion2", "correo2@example.com", "987654321"));
        directorioTorres.add(new Torre("Ubicacion3", "correo3@example.com", "456789123"));
        // Imprimir la lista
        for (Torre torre : directorioTorres) {
            System.out.println("ID: " + torre.getId() +
                    ", Ubicacion: " + torre.getUbicacion() +
                    ", Correo: " + torre.getCorreo() +
                    ", Telefono: " + torre.getTelefono());
        }
        return directorioTorres;
    }
}
