package com.example;

public class Ruta {
    

    private String origen;
    private String destino;
    private int distancia;

public Ruta(){

}

public Ruta(String origen, String destino, int distancia) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
    }

public String getOrigen() {
    return origen;
}

public void setOrigen(String origen) {
    this.origen = origen;
}

public String getDestino() {
    return destino;
}

public void setDestino(String destino) {
    this.destino = destino;
}

public int getDistancia() {
    return distancia;
}

public void setDistancia(int distancia) {
    this.distancia = distancia;
}


}
