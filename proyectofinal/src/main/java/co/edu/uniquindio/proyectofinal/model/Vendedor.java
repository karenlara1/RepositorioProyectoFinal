package co.edu.uniquindio.proyectofinal.model;

import co.edu.uniquindio.proyectofinal.model.builder.Persona;
import co.edu.uniquindio.proyectofinal.model.builder.ProductoBuilder;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Persona {

    private List<Producto> productos;
    private List<Vendedor> aliados;
    private List<Vendedor> contactos;
    private final int numeroMaxContactos = 10;
    private List<Mensaje> mensajesEnviados;
    public Vendedor(PersonaBuilder builder) {
        super(builder);
        this.productos = new ArrayList<>();
        this.aliados = new ArrayList<>();
        this.contactos = new ArrayList<>();
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public static ProductoBuilder builder() { return new ProductoBuilder(); }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Vendedor> getAliados() {
        return aliados;
    }

    public void setAliados(List<Vendedor> aliados) {
        this.aliados = aliados;
    }

    public List<Vendedor> getContactos() { return contactos; }

    public void setContactos(List<Vendedor> contactos) { this.contactos = contactos; }

    public boolean agregarAliado(Vendedor aliado) {
        if (!aliados.contains(aliado) && !this.equals(aliado)) {
            aliados.add(aliado);
            aliado.getAliados().add(this); // Relación bidireccional
            return true;
        }
        return false;
    }

    public boolean eliminarAliado(Vendedor aliado) {
        if (aliados.contains(aliado)) {
            aliados.remove(aliado);
            aliado.getAliados().remove(this); // Romper relación bidireccional
            return true;
        }
        return false;
    }

    public boolean addContacto(Vendedor nuevoContacto) {
        if (nuevoContacto == null) {
            System.out.println("El contacto no puede ser nulo.");
            return false;
        }
        if (contactos.contains(nuevoContacto)) {
            System.out.println("El contacto ya existe en la lista.");
            return false;
        }

        if (contactos.size() >= numeroMaxContactos) {
            System.out.println("No se pueden agregar más contactos. Límite alcanzado.");
            return false;
        }

        // Agregar el contacto a la lista
        contactos.add(nuevoContacto);
        // Agregar recíprocamente
        nuevoContacto.getContactos().add(this);

        System.out.println("Contacto agregado con éxito.");
        return true;
    }

    //Metodo para ver la cantidad de mensajes enviados entre dos vendedores
    public int contarMensajesEnviadosA(Vendedor destinatario) {
        return (int) this.mensajesEnviados.stream()
                .filter(mensaje -> mensaje.getDestinatario().equals(destinatario))
                .count();
    }

}
