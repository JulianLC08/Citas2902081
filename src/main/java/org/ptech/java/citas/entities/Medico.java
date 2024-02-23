package org.ptech.java.citas.entities;

public class Medico {
   private int id;
   private String nombre;
   private String apellido;
   private TipoDocumento tipoDocumento;
   private Long numeroDocumento;
   private long registroMedico;
   private Especialidad especialidad;
public Medico() {
}

//POR REGLA GENERAL
//Los atributos de una clase sea cual sea deben ser private
public Medico(int id, String nombre, String apellido, TipoDocumento tipoDocumento, Long numeroDocumento,
        long registroMedico, Especialidad especialidad) {
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.tipoDocumento = tipoDocumento;
    this.numeroDocumento = numeroDocumento;
    this.registroMedico = registroMedico;
    this.especialidad = especialidad;
}

  //Getters y Setters deben ser publicos
public String getNombre() {
    //return sirve para retomar el valor al invocante
    return this.nombre;
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

