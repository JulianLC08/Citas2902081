package org.ptech.java.citas.entities;

import java.time.LocalDateTime;

import org.ptech.java.citas.entities.enums.EstadoCita;
import org.ptech.java.citas.entities.enums.MotivoCita;
import org.ptech.java.citas.interfaces.IAgendable;

public class CitaEnfermero extends Cita implements IAgendable {

    Enfermero enfermero;
    EstadoCita estadoCita;
    String procedimiento;
    public CitaEnfermero(int id, LocalDateTime fecha, Consultorio consultorio, Medico medico, Enfermero enfermero,
            Paciente paciente, MotivoCita motivoCita, EstadoCita estadoCita, Enfermero enfermero2,
            EstadoCita estadoCita2, String procedimiento) {
        super(id, fecha, consultorio, medico, enfermero, paciente, motivoCita, estadoCita);
        enfermero = enfermero2;
        estadoCita = estadoCita2;
        this.procedimiento = procedimiento;
    }
    public Enfermero getEnfermero() {
        return enfermero;
    }
    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }
    public EstadoCita getEstadoCita() {
        return estadoCita;
    }
    public void setEstadoCita(EstadoCita estadoCita) {
        this.estadoCita = estadoCita;
    }
    public String getProcedimiento() {
        return procedimiento;
    }
    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }
    @Override
    public boolean agendarCita(LocalDateTime fecha, Consultorio c) {
        throw new UnsupportedOperationException("Unimplemented method 'agendarCita'");
    }
    @Override
    public boolean reAgendarCita(LocalDateTime nuevafecha, Consultorio nuevoc) {
        throw new UnsupportedOperationException("Unimplemented method 'reAgendarCita'");
    }
    @Override
    public boolean cancelarCita() {
        this.estadoCita = EstadoCita.CANCELADA;
        return true;
    }
    

    

    


}
