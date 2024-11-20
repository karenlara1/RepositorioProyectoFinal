package co.edu.uniquindio.proyectofinal.model;

import co.edu.uniquindio.proyectofinal.service.ICrudComentario;
import co.edu.uniquindio.proyectofinal.service.ICrudProducto;
import co.edu.uniquindio.proyectofinal.service.ICrudVendedor;

import java.util.ArrayList;
import java.util.List;

public class MarketPlace implements ICrudComentario, ICrudProducto, ICrudVendedor {
    private String nombre;
    List<Producto> listProductos = new ArrayList<>();
    List<Vendedor> listVendedores = new ArrayList<>();
    List<Comentario> listComentarios = new ArrayList<>();

    public MarketPlace() {
    }

    public MarketPlace(String nombre) { this.nombre = nombre; }

    @Override
    public boolean crearVendedor(Vendedor newVendedor) {
        if (newVendedor != null) {
            getListVendedores().add(newVendedor);
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminarVendedor(String cedula) {
        for (Vendedor vendedor : getListVendedores()) {
            if (vendedor.getCedula().equals(cedula)) {
                getListVendedores().remove(vendedor);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean actualizarVendedor(String cedula, Vendedor vendedor) {
        Vendedor vendedorExistente = buscarVendedor(cedula);
        if (vendedorExistente != null) {
            vendedorExistente.setAliados(vendedor.getAliados());
            vendedorExistente.setProductos(vendedor.getProductos());
            vendedorExistente.setUsuario(vendedor.getUsuario());
            return true;
        }

        return false;
    }

    @Override
    public Vendedor buscarVendedor(String cedula) {
        for (Vendedor vendedor : listVendedores) {
            if (vendedor.getCedula().equals(cedula)) {
                return vendedor;
            }
        }
        return null;
    }

    @Override
    public boolean verificarVendedorExistente(String cedula) {
        Vendedor vendedorExistente = null;
        for (Vendedor vendedor : listVendedores) {
            if (vendedor.getCedula().equals(cedula)) {
                vendedorExistente = vendedor;
                break;
            }
        }

        if (vendedorExistente != null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean crearProducto(Producto newProducto) {
        if (newProducto != null) {
            getListProductos().add(newProducto);
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminarProducto(String id) {
        for (Producto producto : getListProductos()) {
            if (producto.getIdProducto().equals(id)) {
                getListProductos().remove(producto);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean actualizarProducto(String idProducto, Producto producto) {

        Producto productoExistente = buscarProducto(idProducto);

        if (productoExistente != null) {
            productoExistente.setNombre(producto.getNombre());
            productoExistente.setImagen(producto.getImagen());
            productoExistente.setCategoria(producto.getCategoria());
            productoExistente.setPrecio(producto.getPrecio());
            productoExistente.setEstadoProducto(producto.getEstadoProducto());
            productoExistente.setFechaHoraPublicacion(producto.getFechaHoraPublicacion());
            return true;
        }

        return false;
    }

    @Override
    public Producto buscarProducto(String id) {
        for (Producto producto : listProductos) {
            if (producto.getIdProducto().equals(id)) {
                return producto;
            }
        }
        return null;
    }

    @Override
    public boolean verificarProductoExistente(String idProducto) {
        Producto productoExistente = null;
        for (Producto producto : listProductos) {
            if (producto.getIdProducto().equals(idProducto)) {
                productoExistente = producto;
                break;
            }
        }

        if (productoExistente == null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean crearComentario(Comentario newComentario) {
        if (newComentario != null) {
            getListComentarios().add(newComentario);
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminarComentario(Comentario newComentario) {
        for (Comentario comentario : getListComentarios()) {
            if (comentario.getContenido().equals(newComentario.getContenido())) {
                getListComentarios().remove(comentario);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean actualizarComentario(Comentario comentario, String contenido) {
        Comentario comentarioExistente = buscarComentarioPorContenido(contenido);

        if (comentarioExistente != null) {
            comentarioExistente.setContenido(comentario.getContenido());
            comentarioExistente.setAutor(comentario.getAutor());
            comentarioExistente.setFechaHora(comentario.getFechaHora());
            return true;
        }

        return false;
    }

    @Override
    public Comentario buscarComentarioPorContenido(String contenido) {
        for (Comentario comentario : listComentarios) {
            if (comentario.getContenido().equals(contenido)) {
                return comentario;
            }
        }
        return null;
    }

    @Override
    public boolean verificarComentarioExistente(String contenido) {
        Comentario comentarioExistente = null;
        for (Comentario comentario : listComentarios) {
            if (comentario.getContenido().equals(contenido)) {
                comentarioExistente = comentario;
                break;
            }
        }

        if (comentarioExistente != null) {
            return true;
        }
        return false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Producto> getListProductos() {
        return listProductos;
    }

    public void setListProductos(List<Producto> listProductos) {
        this.listProductos = listProductos;
    }

    public List<Vendedor> getListVendedores() {
        return listVendedores;
    }

    public void setListVendedores(List<Vendedor> listVendedores) {
        this.listVendedores = listVendedores;
    }

    public List<Comentario> getListComentarios() {
        return listComentarios;
    }

    public void setListComentarios(List<Comentario> listComentarios) {
        this.listComentarios = listComentarios;
    }
}
