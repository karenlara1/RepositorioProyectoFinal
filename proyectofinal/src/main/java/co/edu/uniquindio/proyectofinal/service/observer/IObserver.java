package co.edu.uniquindio.proyectofinal.service.observer;

import co.edu.uniquindio.proyectofinal.model.Producto;

public interface IObserver {
    void actualizar(Producto producto, String evento);
}
