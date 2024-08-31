import gimnasio.model.Gimnasio;
import org.junit.Test;

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
}

