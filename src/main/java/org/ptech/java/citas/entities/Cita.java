package org.ptech.java.citas.entities;
import java.time.LocalDateTime;

import org.ptech.java.citas.entities.enums.EstadoCita;
import org.ptech.java.citas.entities.enums.MotivoCita;

public class Cita {
    int id;
    LocalDateTime fecha;
    Consultorio consultorio;
    Medico medico;
    Enfermero enfermero;
    Paciente paciente;
    MotivoCita motivoCita;
    EstadoCita estadoCita;
    public Cita(int id, LocalDateTime fecha, Consultorio consultorio, Medico medico, Enfermero enfermero,
            Paciente paciente, MotivoCita motivoCita, EstadoCita estadoCita) {
        this.id = id;
        this.fecha = fecha;
        this.consultorio = consultorio;
        this.medico = medico;
        this.enfermero = enfermero;
        this.paciente = paciente;
        this.motivoCita = motivoCita;
        this.estadoCita = estadoCita;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    public Consultorio getConsultorio() {
        return consultorio;
    }
    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }
    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public Enfermero getEnfermero() {
        return enfermero;
    }
    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public MotivoCita getMotivoCita() {
        return motivoCita;
    }
    public void setMotivoCita(MotivoCita motivoCita) {
        this.motivoCita = motivoCita;
    }
    public EstadoCita getEstadoCita() {
        return estadoCita;
    }
    public void setEstadoCita(EstadoCita estadoCita) {
        this.estadoCita = estadoCita;
    }
    
    
}
