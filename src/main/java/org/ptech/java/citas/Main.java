package org.ptech.java.citas;

import org.ptech.java.citas.entities.Enfermero;
import org.ptech.java.citas.entities.Medico;
import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.TipoDocumento;

public class Main {
    public static void main(String[] args) {

        // crear un medico
        Medico m1 = new Medico(1, "Julian", "Londoño", TipoDocumento.CC, 1028655708L, 12345623L,
                Especialidad.CARDIOLOGIA);

        System.out.println("Id del medico es: " + m1.getId() + " El nombre del medico es: " + m1.getNombre()
                + " El apellido del medico es: " + m1.getApellido() + " y la especialidad del medico es: "
                + m1.getEspecialidad());

        // crear un enfermero
        Enfermero e1 = new Enfermero(1, "Brayan", "Morales", TipoDocumento.CC, 1028766544L);

        e1.addProcedure("Aplicar inyecciones");
        e1.addProcedure("Lavado de oidos");

        for( String pr : e1.getProcedimientos()){
            System.out.println(" Procedimiento: " + pr);
        }
        
        
    }

}