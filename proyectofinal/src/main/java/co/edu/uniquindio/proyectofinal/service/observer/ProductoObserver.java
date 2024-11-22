package co.edu.uniquindio.proyectofinal.service.observer;

import co.edu.uniquindio.proyectofinal.model.Producto;

public class ProductoObserver implements  IObserver{

    @Override
    public void actualizar(Producto producto, String evento) {
        switch (evento) {
            case "incremento_me_gustas":
                System.out.println("El producto " + producto.getNombre() + " tiene un nuevo 'me gusta'. Total: " + producto.getMeGustas());
                break;
            case "cambio_estado":
                System.out.println("El producto " + producto.getNombre() + " cambió su estado a: " + producto.getEstadoProducto());
                break;
            default:
                System.out.println("Evento no reconocido.");
        }
    }
}
