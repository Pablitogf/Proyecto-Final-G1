package org.example;

//Comparable<Aerolinea> que se mencionó en ejemplos anteriores, estás indicando que las instancias de la clase Aerolinea pueden ser comparadas entre sí y ordenadas según un criterio específico que defines en el método compareTo.
public class Aerolinea implements  Comparable<Aerolinea> {
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
    @Override
    public int compareTo(Aerolinea otraAerolinea) {
        // Ordenar en orden decreciente basándose en el número total de vuelos
        int totalVuelosActual = this.vuelosOperados + this.vuelosProgramados + this.vuelosCancelados;
        int totalVuelosOtra = otraAerolinea.getVuelosOperados() +
                otraAerolinea.getVuelosProgramados() +
                otraAerolinea.getVuelosCancelados();
        return Integer.compare(totalVuelosOtra, totalVuelosActual);
    }

}
