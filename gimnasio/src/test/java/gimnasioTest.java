import gimnasio.enumeraciones.TipoClase;
import gimnasio.model.Clase;
import gimnasio.model.Gimnasio;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
    public void registroEntrenadorTest(){

        //Se crea una instancia de la clase Gimnasio
        Gimnasio gimnasio = new Gimnasio("Gym 24/7", "calle 19A", "3235659878");

        //Se verifica que no se lance ninguna excepción al registrar un cliente
        assertDoesNotThrow(() -> {
            //Se registra un cliente en el gimnasio
            gimnasio.registrarEntrenador(
                    "mario",
                    "123456",
                    "deporte"
            );
        });


    }


    @Test
    public void eliminarClienteTest() throws Exception {

        Gimnasio gimnasio = new Gimnasio("Gym 24/7", "calle 19A", "3235659878");
        // Se agrega un usuario al banco
        gimnasio.registrarCliente("Mauricio", "Barrio los álamos", "1238", "mauro@gmail.com", "1234567", "3218042309");

        // Se elimina el usuario
        gimnasio.eliminarCliente("1238");

        // Se verifica que el usuario haya sido eliminado
        Assertions.assertTrue(gimnasio.getListaClientes().isEmpty());
    }


    @Test
    public void testObtenerClaseMasPopular() {
        // Crear instancias de Clase
        Clase clase = new Clase(TipoClase.YOGA, "147", List.of("Lunes 9 am", "Jueves 10 am"), 10, LocalDate.of(2024, 10, 5), LocalDate.of(2024, 9, 5), true, "Clase1");
        
        // Ejecutar el método obtenerClaseMasPopular
        Clase claseMasPopular = gimnasio.obtenerClaseMasPopular();

        // Verificar que la clase más popular es la de Ciencias
        assertEquals("YOGA", claseMasPopular.getNombre());
    }
}
}

