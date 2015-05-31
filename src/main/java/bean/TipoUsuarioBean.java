/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dao.TipoUsuarioDao;
import dao.implement.TipoUsuarioDaoImplement;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import model.TipoUsuario;

/**
 *
 * @author Administrador
 */
@Named(value = "TipoUsuarioBean")
@Dependent
public class TipoUsuarioBean implements java.io.Serializable{

    TipoUsuario tipoUsuario;
    List<TipoUsuario> tipoUsuarios;

    /**
     * Creates a new instance of TipoUsuarioManagedBean
     */
    public TipoUsuarioBean() {
        tipoUsuario = new TipoUsuario();
    }

    public void insertar() {
        TipoUsuarioDao linkDAO = new TipoUsuarioDaoImplement();
        linkDAO.insertarTipoUsuario(tipoUsuario);
        tipoUsuario = new TipoUsuario();
    }

    public void modificar() {
        TipoUsuarioDao linkDAO = new TipoUsuarioDaoImplement();
        linkDAO.modificarTipoUsuario(tipoUsuario);
        tipoUsuario = new TipoUsuario();
    }

    public void eliminar() {
        TipoUsuarioDao linkDAO = new TipoUsuarioDaoImplement();
        linkDAO.eliminarTipoUsuario(tipoUsuario);
        tipoUsuario = new TipoUsuario();
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public List<TipoUsuario> getTipoUsuarios() {
        return tipoUsuarios;
    }

    public void setTipoUsuarios(List<TipoUsuario> tipoUsuarios) {
        this.tipoUsuarios = tipoUsuarios;
    }

}
