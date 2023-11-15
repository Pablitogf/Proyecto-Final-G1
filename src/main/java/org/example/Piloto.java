package org.example;

import org.example.Vuelo;

import java.util.ArrayList;

public class Piloto {

    private ArrayList<Vuelo>asignadosVuelos = new ArrayList<>();
    private String nombre;
    private Licencia licencia;

    public Piloto(String nombre, Licencia licencia){
        this.nombre=nombre;
        this.licencia=licencia;
    }
    public Licencia getLicencia() {
        return licencia;
    }
    public String getNombre() {
    return nombre;
}

    public void setNombre(String nombre) {
    this.nombre = nombre;
}
    //Asignar vuelo
    public void asignarVuelo(ArrayList<Vuelo> vuelos ){
        for (Vuelo categoriaVuelo:vuelos) {
            //Comparamos categorias
            if(categoriaVuelo.getCategoria().name().equals(getLicencia().getCategoriaLicencia())){
                asignadosVuelos.add(categoriaVuelo);
                System.out.println("Asigne el vuelo" + categoriaVuelo.toString());
            }
        }
    }
}
