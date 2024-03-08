package org.ptech.java.citas.entities;

import org.ptech.java.citas.entities.enums.TipoDocumento;

import java.util.ArrayList;
import java.util.List;




public class Enfermero extends Usuario{
    @Override
    public String toString() {
        return "Enfermero [procedimientos=" + procedimientos + "]";
    }

    private List<String> procedimientos;

    public Enfermero(int id, String nombre, String apellido, TipoDocumento tipoDocumento, Long numeroDocumento) {
        super(id, nombre, apellido, tipoDocumento, numeroDocumento);
        this.procedimientos = new ArrayList<String>();
    }
    
    public void addProcedure(String procedure){
        this.procedimientos.add(procedure);
    }

    public List<String> getProcedimientos() {
        return procedimientos;
    }
    
    
}
