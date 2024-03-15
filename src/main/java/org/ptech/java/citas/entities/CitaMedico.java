package org.ptech.java.citas.entities;

import java.time.LocalDateTime;

import org.ptech.java.citas.entities.enums.EstadoCita;
import org.ptech.java.citas.entities.enums.MotivoCita;
import org.ptech.java.citas.interfaces.IAgendable;

public class CitaMedico extends Cita implements IAgendable {

    Medico medico;
    EstadoCita estadoCita;
    MotivoCita motivoCita;
    Consultorio consultorio;
    Paciente paciente;
    public CitaMedico(int id, LocalDateTime fecha, Consultorio consultorio, Medico medico, Enfermero enfermero,
            Paciente paciente, MotivoCita motivoCita, EstadoCita estadoCita, Medico medico2, EstadoCita estadoCita2,
            MotivoCita motivoCita2, Consultorio consultorio2, Paciente paciente2) {
        super(id, fecha, consultorio, medico, enfermero, paciente, motivoCita, estadoCita);
        medico = medico2;
        estadoCita = estadoCita2;
        motivoCita = motivoCita2;
        consultorio = consultorio2;
        paciente = paciente2;
    }
    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public EstadoCita getEstadoCita() {
        return estadoCita;
    }
    public void setEstadoCita(EstadoCita estadoCita) {
        this.estadoCita = estadoCita;
    }
    public MotivoCita getMotivoCita() {
        return motivoCita;
    }
    public void setMotivoCita(MotivoCita motivoCita) {
        this.motivoCita = motivoCita;
    }
    public Consultorio getConsultorio() {
        return consultorio;
    }
    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    @Override
    public boolean agendarCita(LocalDateTime fecha, Consultorio c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agendarCita'");
    }
    @Override
    public boolean reAgendarCita(LocalDateTime nuevafecha, Consultorio nuevoc) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reAgendarCita'");
    }
    @Override
    public boolean cancelarCita() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancelarCita'");
    }

    

    
    
}
