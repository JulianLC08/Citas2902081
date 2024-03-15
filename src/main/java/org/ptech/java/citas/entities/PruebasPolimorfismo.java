/* package org.ptech.java.citas.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.EstadoCita;
import org.ptech.java.citas.entities.enums.TipoDocumento;
import org.ptech.java.citas.entities.enums.TipoSangre;

public class PruebasPolimorfismo {
    public static void main(String[] args) {
        //Instanciar un usuario
        Medico u = new Medico(1, "Brayan", "Morales", TipoDocumento.CC, 12345678L, 123456L, Especialidad.DERMATOLOGIA);
       System.out.println( u.toString()); 
       Paciente u1 = new Paciente (1, 
                                "Juian", 
                                "Londoño", 
                                TipoDocumento.CC, 
                                1234L, 
                                "estiben234@gmail.com", 
                                3222897231L, 
                                LocalDate.of(1, Month.DECEMBER, 2005), 
                                1.45, 
                                60.0 , 
                                TipoSangre.O, 
                                '+' );

      System.out.println(u1.toString());  
      Usuario u2 = new Enfermero(1, "Carlos", "Mora", TipoDocumento.CC, 1236785L);
      System.out.println(u2.toString());

      Consultorio u3 = new Consultorio(1, "Cll 170 101-93", 306320);
      System.out.println(u3.toString());
      Cita u4 = new Cita(1, LocalDateTime.now(), u, u1, u3, EstadoCita.AGENDADA);
      System.out.println(u4.toString());

    }

   

} */
