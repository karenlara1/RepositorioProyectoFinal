package co.edu.uniquindio.proyectofinal;


import co.edu.uniquindio.proyectofinal.model.Usuario;
import co.edu.uniquindio.proyectofinal.model.builder.Administrador;
import co.edu.uniquindio.proyectofinal.model.builder.Vendedor;

public class Main {

        public static void main(String[] args){

           Usuario usuarioVendedor = new Usuario("nombre1", "12345", null);

            Vendedor vendedor = Vendedor.builder()
                    .nombre("María")
                    .apellido("López")
                    .cedula("987654321")
                    .direccion("Avenida Siempreviva 456")
                    .usuario(usuarioVendedor)
                    .build();
        }
}
