package model;
// Generated 30-may-2015 11:21:15 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private int idCliente;
     private TipoCliente tipoCliente;
     private Persona persona;
     private Set<Devolucion> devolucions = new HashSet<Devolucion>(0);
     private Set<Requisicion> requisicions = new HashSet<Requisicion>(0);

    public Cliente() {
    }

	
    public Cliente(int idCliente, Persona persona) {
        this.idCliente = idCliente;
        this.persona = persona;
    }
    public Cliente(int idCliente, TipoCliente tipoCliente, Persona persona, Set<Devolucion> devolucions, Set<Requisicion> requisicions) {
       this.idCliente = idCliente;
       this.tipoCliente = tipoCliente;
       this.persona = persona;
       this.devolucions = devolucions;
       this.requisicions = requisicions;
    }
   
    public int getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public TipoCliente getTipoCliente() {
        return this.tipoCliente;
    }
    
    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    public Set<Devolucion> getDevolucions() {
        return this.devolucions;
    }
    
    public void setDevolucions(Set<Devolucion> devolucions) {
        this.devolucions = devolucions;
    }
    public Set<Requisicion> getRequisicions() {
        return this.requisicions;
    }
    
    public void setRequisicions(Set<Requisicion> requisicions) {
        this.requisicions = requisicions;
    }




}

