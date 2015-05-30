package model;
// Generated 30-may-2015 11:21:15 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * DetalleDeOrdenCompra generated by hbm2java
 */
public class DetalleDeOrdenCompra  implements java.io.Serializable {


     private int idDetalleDeOrdenCompra;
     private OrdenDeCompra ordenDeCompra;
     private BigDecimal cantidad;
     private Set<DetalleProducto> detalleProductos = new HashSet<DetalleProducto>(0);

    public DetalleDeOrdenCompra() {
    }

	
    public DetalleDeOrdenCompra(int idDetalleDeOrdenCompra, OrdenDeCompra ordenDeCompra, BigDecimal cantidad) {
        this.idDetalleDeOrdenCompra = idDetalleDeOrdenCompra;
        this.ordenDeCompra = ordenDeCompra;
        this.cantidad = cantidad;
    }
    public DetalleDeOrdenCompra(int idDetalleDeOrdenCompra, OrdenDeCompra ordenDeCompra, BigDecimal cantidad, Set<DetalleProducto> detalleProductos) {
       this.idDetalleDeOrdenCompra = idDetalleDeOrdenCompra;
       this.ordenDeCompra = ordenDeCompra;
       this.cantidad = cantidad;
       this.detalleProductos = detalleProductos;
    }
   
    public int getIdDetalleDeOrdenCompra() {
        return this.idDetalleDeOrdenCompra;
    }
    
    public void setIdDetalleDeOrdenCompra(int idDetalleDeOrdenCompra) {
        this.idDetalleDeOrdenCompra = idDetalleDeOrdenCompra;
    }
    public OrdenDeCompra getOrdenDeCompra() {
        return this.ordenDeCompra;
    }
    
    public void setOrdenDeCompra(OrdenDeCompra ordenDeCompra) {
        this.ordenDeCompra = ordenDeCompra;
    }
    public BigDecimal getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }
    public Set<DetalleProducto> getDetalleProductos() {
        return this.detalleProductos;
    }
    
    public void setDetalleProductos(Set<DetalleProducto> detalleProductos) {
        this.detalleProductos = detalleProductos;
    }




}


