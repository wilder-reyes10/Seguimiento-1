public class gimnasioTest {

    @Test
    public void registroClienteTest(){


        //Se crea una instancia de la clase Gimnasio
        Gimnasio gimnasio = new Gimnasio();


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

}
