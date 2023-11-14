package org.example;

public enum Licencia {
    //Licencia de Piloto Privado (PPL)
    //Licencia de Piloto Comercial (CPL)
    //Licencia de Piloto de Transporte de Línea Aérea (ATPL)
    PPL("Domestico"),
    CPL("Internacional"),
    ATPL("Carga");
    //Final: lo que significa que su valor no puede cambiar después de ser asignado. Este atributo almacena una descripción más legible del tipo de licencia.
    private final String categoriaLicencia;
    Licencia(String categoriaLicencia) {
        this.categoriaLicencia = categoriaLicencia;
    }
    public String getCategoriaLicencia() {
        return categoriaLicencia;
    }

}
