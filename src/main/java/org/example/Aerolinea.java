package org.example;

import java.util.ArrayList;

public class Aerolinea {
     private String nombre;
     private int vuelosOperados;
     private  int vuelosCancelados;
     private  int vuelosProgramados;

    public Aerolinea(String nombre, int vuelosOperados, int vuelosCancelados, int vuelosProgramados) {
        this.nombre = nombre;
        this.vuelosOperados = vuelosOperados;
        this.vuelosCancelados = vuelosCancelados;
        this.vuelosProgramados = vuelosProgramados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVuelosOperados() {
        return vuelosOperados;
    }

    public void setVuelosOperados(int vuelosOperados) {
        this.vuelosOperados = vuelosOperados;
    }

    public int getVuelosCancelados() {
        return vuelosCancelados;
    }

    public void setVuelosCancelados(int vuelosCancelados) {
        this.vuelosCancelados = vuelosCancelados;
    }

    public int getVuelosProgramados() {
        return vuelosProgramados;
    }

    public void setVuelosProgramados(int vuelosProgramados) {
        this.vuelosProgramados = vuelosProgramados;
    }
}
