import gimnasio.model.Gimnasio;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class gimnasioTest {

    @Test
    public void registroClienteTest(){

        //Se crea una instancia de la clase Gimnasio
        Gimnasio gimnasio = new Gimnasio("Gym 24/7", "calle 19A", "3235659878");

        //Se verifica que no se lance ninguna excepción al registrar un cliente
        assertDoesNotThrow(() -> {
            //Se registra un cliente en el gimnasio
            gimnasio.registrarCliente(
                    "123456789",
                    "Carlos Perez",
                    "Calle 123",
                    "1234567",
                    "carlos@email.com",
                    "123456"
            );
        });


    }

    @Test
    public void eliminarClienteTest() throws Exception {

        Gimnasio gimnasio = new Gimnasio("Gym 24/7", "calle 19A", "3235659878");
        // Se agrega un usuario al banco
        gimnasio.registrarCliente("Juan Perez", "Calle 123", "654321", "juan@gmail.com", "123");

        // Se elimina el usuario
        gimnasio.eliminarCliente("654321");

        // Se verifica que el usuario haya sido eliminado
        Assertions.assertTrue(gimnasio.getListaClientes().isEmpty());
    }

}

