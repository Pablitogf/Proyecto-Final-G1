package org.example;

import java.time.LocalDate;
import java.time.LocalTime;

public class Vuelo {
    //Atributos
    private Aerolinea aerolinea;
    private int numero;
    private CategoriaVuelo categoria;
    private String terminal;
    private String puerta;
    private LocalDate fecha;
    private LocalTime horaDespegue;
    private LocalTime horaAterrizaje;
    private Torre torreControl;
    private int numPasajeros;
    private Estado estado;

//Constructor
    public Vuelo(int numero,Aerolinea aerolinea ,CategoriaVuelo categoria, String terminal, String puerta, LocalDate fecha, LocalTime horaDespegue,
                 LocalTime horaAterrizaje, Torre torreControl, int numPasajeros, Estado estado) {
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
        this.aerolinea = aerolinea;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public CategoriaVuelo getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaVuelo categoria) {
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHoraDespegue() {
        return horaDespegue;
    }

    public void setHoraDespegue(LocalTime horaDespegue) {
        this.horaDespegue = horaDespegue;
    }

    public LocalTime getHoraAterrizaje() {
        return horaAterrizaje;
    }

    public void setHoraAterrizaje(LocalTime horaAterrizaje) {
        this.horaAterrizaje = horaAterrizaje;
    }

    public Torre getTorreControl() {
        return torreControl;
    }

    public void setTorreControl(Torre torreControl) {
        this.torreControl = torreControl;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }

    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    public Estado isEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public Aerolinea getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }
    @Override
    public String toString() {
        return "Vuelo{" +
                "aerolinea=" + aerolinea +
                ", numero=" + numero +
                ", categoria=" + categoria +
                ", terminal='" + terminal + '\'' +
                ", puerta='" + puerta + '\'' +
                ", fecha=" + fecha +
                ", horaDespegue=" + horaDespegue +
                ", horaAterrizaje=" + horaAterrizaje +
                ", torreControl='" + torreControl + '\'' +
                ", numPasajeros=" + numPasajeros +
                ", estado=" + estado +
                '}';
    }
}

