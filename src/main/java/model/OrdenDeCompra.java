package model;
// Generated 30-may-2015 11:21:15 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * OrdenDeCompra generated by hbm2java
 */
public class OrdenDeCompra  implements java.io.Serializable {


     private int idOrden;
     private Cotizacion cotizacion;
     private Empleado empleado;
     private Date fechaOrden;
     private BigDecimal estadoOrden;
     private Set<Devolucion> devolucions = new HashSet<Devolucion>(0);
     private Set<Transaccion> transaccions = new HashSet<Transaccion>(0);
     private Set<DetalleDeOrdenCompra> detalleDeOrdenCompras = new HashSet<DetalleDeOrdenCompra>(0);

    public OrdenDeCompra() {
    }

	
    public OrdenDeCompra(int idOrden, Cotizacion cotizacion, Empleado empleado, Date fechaOrden, BigDecimal estadoOrden) {
        this.idOrden = idOrden;
        this.cotizacion = cotizacion;
        this.empleado = empleado;
        this.fechaOrden = fechaOrden;
        this.estadoOrden = estadoOrden;
    }
    public OrdenDeCompra(int idOrden, Cotizacion cotizacion, Empleado empleado, Date fechaOrden, BigDecimal estadoOrden, Set<Devolucion> devolucions, Set<Transaccion> transaccions, Set<DetalleDeOrdenCompra> detalleDeOrdenCompras) {
       this.idOrden = idOrden;
       this.cotizacion = cotizacion;
       this.empleado = empleado;
       this.fechaOrden = fechaOrden;
       this.estadoOrden = estadoOrden;
       this.devolucions = devolucions;
       this.transaccions = transaccions;
       this.detalleDeOrdenCompras = detalleDeOrdenCompras;
    }
   
    public int getIdOrden() {
        return this.idOrden;
    }
    
    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }
    public Cotizacion getCotizacion() {
        return this.cotizacion;
    }
    
    public void setCotizacion(Cotizacion cotizacion) {
        this.cotizacion = cotizacion;
    }
    public Empleado getEmpleado() {
        return this.empleado;
    }
    
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    public Date getFechaOrden() {
        return this.fechaOrden;
    }
    
    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }
    public BigDecimal getEstadoOrden() {
        return this.estadoOrden;
    }
    
    public void setEstadoOrden(BigDecimal estadoOrden) {
        this.estadoOrden = estadoOrden;
    }
    public Set<Devolucion> getDevolucions() {
        return this.devolucions;
    }
    
    public void setDevolucions(Set<Devolucion> devolucions) {
        this.devolucions = devolucions;
    }
    public Set<Transaccion> getTransaccions() {
        return this.transaccions;
    }
    
    public void setTransaccions(Set<Transaccion> transaccions) {
        this.transaccions = transaccions;
    }
    public Set<DetalleDeOrdenCompra> getDetalleDeOrdenCompras() {
        return this.detalleDeOrdenCompras;
    }
    
    public void setDetalleDeOrdenCompras(Set<DetalleDeOrdenCompra> detalleDeOrdenCompras) {
        this.detalleDeOrdenCompras = detalleDeOrdenCompras;
    }




}

