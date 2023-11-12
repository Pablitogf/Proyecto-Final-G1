package com.example;

public class Torre {
    

    private int id;
    private String ubicacion;
    private String correo;
    private int telefono;

public Torre(){

}

public Torre(int id, String ubicacion, String correo, int telefono) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.correo = correo;
        this.telefono = telefono;
    }

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
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

public int getTelefono() {
    return telefono;
}

public void setTelefono(int telefono) {
    this.telefono = telefono;
}


}
