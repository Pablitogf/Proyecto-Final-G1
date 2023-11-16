package org.example;

public class Ruta {


    private String origen;
    private String destino;
    private TipoRuta tipoRuta;

    public Ruta(String origen, String destino, TipoRuta tipoRuta) {
        this.origen = origen;
        this.destino = destino;
        this.tipoRuta = tipoRuta;
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

    public TipoRuta getTipoRuta() {
        return tipoRuta;
    }

    public void setTipoRuta(TipoRuta tipoRuta) {
        this.tipoRuta = tipoRuta;
    }
}
