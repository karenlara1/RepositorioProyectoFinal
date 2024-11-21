package co.edu.uniquindio.proyectofinal.service.proxy;

import co.edu.uniquindio.proyectofinal.model.Producto;
import co.edu.uniquindio.proyectofinal.model.Usuario;
import co.edu.uniquindio.proyectofinal.model.Vendedor;

import java.util.List;

public class VendedorProxy implements IVendedor {
    private IVendedor servicio;
    private Usuario usuario;

    public VendedorProxy(IVendedor servicio, Usuario usuario) {
        this.servicio = servicio;
        this.usuario = usuario;
    }

    public IVendedor getServicio() {
        return servicio;
    }

    public void setServicio(IVendedor servicio) {
        this.servicio = servicio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    private boolean autenticar() {
        return usuario.estaAutenticado();
    }

    @Override
    public List<Producto> getProductos() {
        if(autenticar()) {
            return servicio.getProductos();
        } else {
            throw new SecurityException("Acceso denegado: Usuario no autenticado");
        }
    }

    @Override
    public void agregarContacto(Vendedor contacto) {
        if (autenticar()) {
            servicio.agregarContacto(contacto);
        } else {
            throw new SecurityException("Acceso denegado: Usuario no autenticado");
        }
    }
}
