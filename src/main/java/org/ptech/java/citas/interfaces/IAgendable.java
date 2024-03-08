package org.ptech.java.citas.interfaces;

import java.time.LocalDateTime;

import org.ptech.java.citas.entities.Consultorio;

public interface IAgendable {
    public boolean agendarCita(LocalDateTime fecha, Consultorio c);

    public boolean reAgendarCita(LocalDateTime nuevafecha, Consultorio nuevoc);

    public boolean cancelarCita();
}
