package org.example;

import java.util.ArrayList;

public class Torre {
    
    private int id;
    private String ubicacion;
    private String correo;
    private String telefono;
    private ArrayList<Vuelo> vuelos = new ArrayList<>();



    public static int contador = 0;
    public Torre(String ubicacion, String correo, String telefono) {
        this.id = contador++;
        this.ubicacion = ubicacion;
        this.correo = correo;
        this.telefono = telefono;
    }

    public int getId() {
    return id;
}

    public String getUbicacion() {
    return ubicacion;
}

    public void setUbicacion(String ubicacion) {
    this.ubicacion = ubicacion;
}

    public String getCorreo() {
    return correo;
}

    public void setCorreo(String correo) {
    this.correo = correo;
}

    public String getTelefono() {
    return telefono;
}

    public void setTelefono(String telefono) {
    this.telefono = telefono;
}

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public void guardarVuelo(Vuelo vueloSupervicion){
        this.vuelos.add(vueloSupervicion);
        System.out.println("Guardo" + vueloSupervicion.toString());
    }
}
