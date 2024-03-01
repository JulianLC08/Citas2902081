package org.ptech.java.citas.entities;

import java.time.LocalDate;

import org.ptech.java.citas.entities.enums.TipoDocumento;
import org.ptech.java.citas.entities.enums.TipoSangre;

public class Paciente extends Usuario {

    private String email;
    private Long celular;
    private LocalDate fechaNacimiento;
    private Double altura;
    private Double peso;
    private TipoSangre tipoSangre;
    private char factorRH;

    public Paciente(int id, String nombre, String apellido, TipoDocumento tipoDocumento, Long numeroDocumento,
            String email, Long celular, LocalDate fechaNacimiento, Double altura, Double peso, TipoSangre tipoSangre,
            char factorRH) {
        super(id, nombre, apellido, tipoDocumento, numeroDocumento);
        this.email = email;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        this.factorRH = factorRH;
    }

}
