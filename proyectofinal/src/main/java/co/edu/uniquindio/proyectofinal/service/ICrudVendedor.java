package co.edu.uniquindio.proyectofinal.service;

import co.edu.uniquindio.proyectofinal.model.Usuario;
import co.edu.uniquindio.proyectofinal.model.Vendedor;

public interface ICrudVendedor {
    boolean crearVendedor(Vendedor newVendedor);
    boolean eliminarVendedor(String cedula);
    boolean actualizarVendedor(String cedula, Vendedor vendedor);
    Vendedor buscarVendedor(String cedula);
    boolean verificarVendedorExistente(String cedula);
}
