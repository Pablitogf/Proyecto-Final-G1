package com.example;

public class Vuelo {
    private int numero;
    private String categoria;
    private String terminal;
    private String puerta;
    private int fecha;
    private int horaDespegue;
    private int horaAterrizaje;
    private String torreControl;
    private int numPasajeros;
    private boolean estado;


 public Vuelo() {
    }
    
public Vuelo(int numero, String categoria, String terminal, String puerta, int fecha, int horaDespegue,
            int horaAterrizaje, String torreControl, int numPasajeros, boolean estado) {
        this.numero = numero;
        this.categoria = categoria;
        this.terminal = terminal;
        this.puerta = puerta;
        this.fecha = fecha;
        this.horaDespegue = horaDespegue;
        this.horaAterrizaje = horaAterrizaje;
        this.torreControl = torreControl;
        this.numPasajeros = numPasajeros;
        this.estado = estado;
    }

public int getNumero() {
    return numero;
}

public void setNumero(int numero) {
    this.numero = numero;
}

public String getCategoria() {
    return categoria;
}

public void setCategoria(String categoria) {
    this.categoria = categoria;
}

public String getTerminal() {
    return terminal;
}

public void setTerminal(String terminal) {
    this.terminal = terminal;
}

public String getPuerta() {
    return puerta;
}

public void setPuerta(String puerta) {
    this.puerta = puerta;
}

public int getFecha() {
    return fecha;
}

public void setFecha(int fecha) {
    this.fecha = fecha;
}

public int getHoraDespegue() {
    return horaDespegue;
}

public void setHoraDespegue(int horaDespegue) {
    this.horaDespegue = horaDespegue;
}

public int getHoraAterrizaje() {
    return horaAterrizaje;
}

public void setHoraAterrizaje(int horaAterrizaje) {
    this.horaAterrizaje = horaAterrizaje;
}

public String getTorreControl() {
    return torreControl;
}

public void setTorreControl(String torreControl) {
    this.torreControl = torreControl;
}

public int getNumPasajeros() {
    return numPasajeros;
}

public void setNumPasajeros(int numPasajeros) {
    this.numPasajeros = numPasajeros;
}

public boolean isEstado() {
    return estado;
}

public void setEstado(boolean estado) {
    this.estado = estado;
}
   
}

