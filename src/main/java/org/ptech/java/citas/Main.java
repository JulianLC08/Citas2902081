package org.ptech.java.citas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import org.ptech.java.citas.entities.Cita;
import org.ptech.java.citas.entities.Consultorio;
import org.ptech.java.citas.entities.Especialidad;
import org.ptech.java.citas.entities.Medico;
import org.ptech.java.citas.entities.Paciente;
import org.ptech.java.citas.entities.TipoDocumento;
import org.ptech.java.citas.entities.TipoSangre;

public class Main {
    public static void main(String[] args) {
       
        //Crear un objeto medico 
        //Instanciar un medico
        //Una manera de dar valora atributos privados en una clase es a traves del constructor parametrizado
        Medico m = new Medico(1, "Brayan" , "Morales" , TipoDocumento.CC, 1034281342L, 23434565L, Especialidad.MEDICINA_GENERAL);
        

        //instanciar otro medico
        Medico m2 = new Medico();
        m2.setNombre("Brayan");
        m2.setApellido("Morales");
        m2.setNumeroDocumento(1034281342L);
        System.out.println(m2.getNombre()+ " " + m2.getApellido());

        //instanciar un consultorio
        Consultorio c = new Consultorio(1, "Cll 128 b bis a 91-14", 322289728);
        Consultorio c2 = new Consultorio();
        c2.setId(2);
        c2.setDireccion("Cll 127 b bis a 91-13");
        c2.setNumero(321456578);
        System.out.println(c2.getId() + " " + c2.getDireccion() + " " + c2.getNumero());

        //Instanciar cita
        LocalDateTime.now();
        Cita ci = new Cita(1, LocalDateTime.now(), m, p, c, null);


        //Instanciar paciente
        Paciente p = new Paciente (1 , "CRISTIAN" , "BUITRAGO" , TipoDocumento.CC , 234324324L , "cbo@misena.edu.co" , 32432432L , LocalDate.of(2023, Month.JUNE, 1) , 178.0 , 60.7 , TipoSangre.A , '+');
        System.out.println(p.getNombre() + " " + p.getApellido() + " " + p.getTipoDocumento() + " " + p.getNumeroDocumento() + " " + p.getEmail() + " " + p.getCelular() + " " + p.getFechaNacimiento() + " " + p.getAltura() + " " + p.getTipoSangre() + " " + p.getFactorRH());
    }
}