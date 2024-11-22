package co.edu.uniquindio.proyectofinal.service;

import co.edu.uniquindio.proyectofinal.mapping.dto.VendedorDto;

import java.util.List;

public interface IVendedorControllerService {
    List<VendedorDto> getVendedoresDto();
    boolean agregarVendedor(VendedorDto vendedorDto);
    boolean eliminarVendedor(String usuario);
    boolean actualizarVendedor(String usuario, VendedorDto vendedorDto);
}
