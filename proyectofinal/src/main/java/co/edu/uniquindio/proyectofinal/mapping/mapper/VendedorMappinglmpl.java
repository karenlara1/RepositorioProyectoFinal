package co.edu.uniquindio.proyectofinal.mapping.mapper;

import co.edu.uniquindio.proyectofinal.mapping.dto.VendedorDto;
import co.edu.uniquindio.proyectofinal.model.Vendedor;
import co.edu.uniquindio.proyectofinal.service.IVendedorMapping;

import java.util.ArrayList;
import java.util.List;

public class VendedorMappinglmpl implements IVendedorMapping {
    @Override
    public List<VendedorDto> getVendedoresDto(List<Vendedor> vendedores) {
        if (vendedores == null){
            return null;
        }

        List<VendedorDto> vendedoresDto = new ArrayList<V>();
        for (Vendedor vendedor : vendedores) {
            vendedoresDto.add(vendedorToVendedorDto(vendedor));
        }
    }

    @Override
    public VendedorDto vendedorToVendedorDto(Vendedor vendedor) {
        return new VendedorDto(
                vendedor.getNombre(),
                vendedor.getApellido(),
                vendedor.getUsuario(),
                vendedor.getProductos()
        );
    }

    @Override
    public Vendedor vendedorDtoToVendedor(VendedorDto dto) {
        return Vendedor.build()


    }

}
