package co.edu.uniquindio.proyectofinal;


import co.edu.uniquindio.proyectofinal.model.Usuario;
import co.edu.uniquindio.proyectofinal.model.builder.Persona;
import co.edu.uniquindio.proyectofinal.model.builder.VendedorBuilder;

public class Main {

        public static void main(String[] args){

            Persona vendedor = VendedorBuilder.builder()
                    .nombre("nombre")
                    .apellido("apellido")
                    .cedula("12345")
                    .direccion("barrio x")
                    .build();

            Usuario usuarioVendedor = new Usuario("xxxxx", "12345", vendedor);

            vendedor.setUsuario(usuarioVendedor);


            System.out.println(vendedor);
            System.out.println(usuarioVendedor);
        }
}
