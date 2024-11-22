package co.edu.uniquindio.proyectofinal.controller;

import co.edu.uniquindio.proyectofinal.factory.ModelFactory;
import co.edu.uniquindio.proyectofinal.mapping.dto.VendedorDto;
import co.edu.uniquindio.proyectofinal.service.IVendedorControllerService;

import java.util.List;

public class VendedorController implements IVendedorControllerService {
    ModelFactory modelFactory;

    public VendedorController() { modelFactory = ModelFactory.getInstance(); }

    @Override
    public List<VendedorDto> getVendedoresDto() { return modelFactory.getVendedoresDto(); }

    @Override
    public boolean agregarVendedor(VendedorDto vendedorDto) { return modelFactory.agregarVendedor(vendedorDto); }

    @Override
    public boolean eliminarVendedor(String usuario) { return modelFactory.eliminarVendedor(usuario); }

    @Override
    public boolean actualizarVendedor(String usuario, VendedorDto vendedorDto) { return modelFactory.actualizarVendedor(usuario, vendedorDto); }

}
