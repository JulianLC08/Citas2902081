package org.ptech.java.citas;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.ptech.java.citas.entities.Cita;
import org.ptech.java.citas.entities.CitaEnfermero;
import org.ptech.java.citas.entities.CitaMedico;
import org.ptech.java.citas.entities.Consultorio;
import org.ptech.java.citas.entities.Enfermero;
import org.ptech.java.citas.entities.Medico;
import org.ptech.java.citas.entities.Paciente;
import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.EstadoCita;
import org.ptech.java.citas.entities.enums.MotivoCita;
import org.ptech.java.citas.entities.enums.TipoDocumento;
import org.ptech.java.citas.entities.enums.TipoSangre;

public class Main {
    public static void main(String[] args) {

        // crear un medico
        Medico m1 = new Medico(1, "Julian", "Londoño", TipoDocumento.CC, 1028655708L, 12345623L,
                Especialidad.CARDIOLOGIA);

        // Crear segundo medico
        Medico m2 = new Medico(1, "Brayan", "Morales", TipoDocumento.CC, 1028655765L, 12345987L,
                Especialidad.MEDICINA_GENERAL);

        // crear un enfermero
        Enfermero e1 = new Enfermero(1, "Carlos", "Sanchez", TipoDocumento.CC, 1028766544L);
        Enfermero e2 = new Enfermero(1, "Rodolfo", "Hernandez", TipoDocumento.CC, 1028766769L);
        Enfermero e3 = new Enfermero(1, "Brayan", "Camacho", TipoDocumento.CC, 1028766645L);

        e1.addProcedure("Aplicar inyecciones");
        e2.addProcedure("Lavado de oidos");



        Paciente p1 = new Paciente(1, "Jaime", "Molina", TipoDocumento.CC, 1324568L, "jaimemo@gmail.com", 3182265439L, LocalDate.of(1999, 02, 23), 1.95, 80.0, TipoSangre.AB, '+');
        Paciente p2 = new Paciente(2, "Diomedes", "Diaz", TipoDocumento.CC, 1324456L, "diomedesd@gmail.com", 3182265123L, LocalDate.of(1987, 06, 21), 1.90, 85.0, TipoSangre.B, '+');
        Paciente p3 = new Paciente(3, "Kaleth", "Morales", TipoDocumento.CC, 1324123L, "kalethm@gmail.com", 3182265098L, LocalDate.of(1973, 03, 20), 1.80, 81.0, TipoSangre.A, '+');
        Paciente p4 = new Paciente(4, "Martin Elias", "Diaz", TipoDocumento.CC, 1324036L, "martind@gmail.com", 3182265765L, LocalDate.of(1965, 02, 16), 1.76, 80.0, TipoSangre.O, '+');
        Paciente p5 = new Paciente(5, "Rafael", "Orozco", TipoDocumento.CC, 1324309L, "rafaelo@gmail.com", 3182265376L, LocalDate.of(1998, 03, 30), 1.79, 70.0, TipoSangre.O, '+');

        //Crear Consultorio

        Consultorio cu = new Consultorio(1, "Cll 128B Bis A 91-18", 32145676);

        //Crear citas medico
        Cita c = new Cita(1, LocalDateTime.now(), cu, m2, e3, p2,MotivoCita.ESCOPOLAMINA, EstadoCita.AGENDADA);
        Cita c1 = new Cita(2, LocalDateTime.now(), cu, m1, e3, p3,MotivoCita.GRIPE, EstadoCita.AGENDADA);

        System.out.println("Fecha cita: " + LocalDateTime.now() + " " + "Consultorio: " + " " + cu.getDireccion() + " " + cu.getNumero() + " " + "Nombre y apellido del medico: " + m2.getNombre() + " " + m2.getApellido() + " " + "Paciente: " + p2.getNombre() + " " + p2.getApellido() + " " + "Motivo Cita: " + MotivoCita.ESCOPOLAMINA );

        //Crear cita enfermero
        CitaEnfermero ci = new CitaEnfermero(1, LocalDateTime.now(), cu, m1, e1, p2, MotivoCita.GRIPE, EstadoCita.AGENDADA, e3, null, "Lavado de oidos");
        

        CitaEnfermero ci1 = new CitaEnfermero(2, LocalDateTime.now(), cu, m1, e2, p3, MotivoCita.ESCOPOLAMINA, EstadoCita.AGENDADA, e3, null, "Inyecciones");

        CitaEnfermero ci2 = new CitaEnfermero(3, LocalDateTime.now(), cu, m1, e1, p4, MotivoCita.GRIPE, EstadoCita.AGENDADA, e3, null, "Lavado de oidos");
    

        System.out.println("Fecha cita: " + LocalDateTime.now() + " " + "Consultorio: " + " " + cu.getDireccion() + " " + cu.getNumero() + " " + "Nombre y apellido del medico: " + m2.getNombre() + " " + m2.getApellido() + " " + "Paciente: " + p2.getNombre() + " " + p2.getApellido() + " ");
        for (String pr : e1.getProcedimientos()) {
            System.out.println(" procedimiento: " + pr);
        }
        System.out.println("Fecha cita: " + LocalDateTime.now() + " " + "Consultorio: " + " " + cu.getDireccion() + " " + cu.getNumero() + " " + "Nombre y apellido del medico: " + m1.getNombre() + " " + m1.getApellido() + " " + "Paciente: " + p3.getNombre() + " " + p3.getApellido() + " ");
        for (String pr1 : e2.getProcedimientos()) {
            System.out.println(" procedimiento: " + pr1);
        }
        System.out.println("Fecha cita: " + LocalDateTime.now() + " " + "Consultorio: " + " " + cu.getDireccion() + " " + cu.getNumero() + " " + "Nombre y apellido del medico: " + m2.getNombre() + " " + m2.getApellido() + " " + "Paciente: " + p1.getNombre() + " " + p1.getApellido() + " ");
        for (String pr : e1.getProcedimientos()) {
            System.out.println(" procedimiento: " + pr);
        }

        ci.cancelarCita();
        System.out.println("Estado cita: " + ci.getEstadoCita());

    }



}