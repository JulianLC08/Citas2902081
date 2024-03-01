package org.ptech.java.citas.entities;

import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.TipoDocumento;

public class Medico extends Usuario {
    private long registroMedico;
    private Especialidad especialidad;

    public Medico(int id, String nombre, String apellido, TipoDocumento tipoDocumento, Long numeroDocumento,
            long registroMedico, Especialidad especialidad) {
        super(id, nombre, apellido, tipoDocumento, numeroDocumento);
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

    public long getRegistroMedico() {
        return registroMedico;
    }

    public void setRegistroMedico(long registroMedico) {
        this.registroMedico = registroMedico;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    

}
