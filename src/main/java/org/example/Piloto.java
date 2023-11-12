package com.example;

public class Piloto {
    private String nombre;
    private String licencia;

public Piloto(){

}

public Piloto(String nombre, String licencia){
    this.nombre=nombre;
    this.licencia=licencia;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getLicencia() {
    return licencia;
}

public void setLicencia(String licencia) {
    this.licencia = licencia;
}
}
