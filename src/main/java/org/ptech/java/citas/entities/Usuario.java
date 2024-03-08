package org.ptech.java.citas.entities;

import org.ptech.java.citas.entities.enums.TipoDocumento;

public class Usuario {
    protected int id;
    protected String nombre;
    protected String apellido;
    protected TipoDocumento tipoDocumento;
    protected Long numeroDocumento;

    //sobreescribir el metodo toString
    public String toString(){
        return "nombre: " + this.nombre; 
    }


    public Usuario(int id, String nombre, String apellido, TipoDocumento tipoDocumento, Long numeroDocumento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Long getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Long numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

}
