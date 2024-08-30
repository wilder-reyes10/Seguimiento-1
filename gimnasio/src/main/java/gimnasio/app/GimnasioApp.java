package gimnasio.app;

import gimnasio.enumeraciones.TipoClase;
import gimnasio.model.Gimnasio;

import java.time.LocalDateTime;

public class GimnasioApp {
    public static void main(String[] args) throws Exception {

        Gimnasio gimnasio = new Gimnasio("Gym 24/7", "Av 19N", "87278287");
        gimnasio.registrarCliente("Mauricio","Barrio los álamos", "1238", "mauro@gmail.com", "1234567", "3218042309");
        gimnasio.registrarCliente("Alisson","Barrio los quindos", "1509", "alisson@gmail.com", "0987654", "3238880349");
        gimnasio.registrarCliente("Maria","Barrio bosques de pinares", "3108", "maria@gmail.com", "1234689", "3118347251");

        gimnasio.imprimirClientes();

        gimnasio.eliminarCliente("3108");

        gimnasio.imprimirClientes();



        // METODOS DE GENERAR REPORTES, COMPLETAR....

        gimnasio.crearClase(TipoClase.YOGA, "Mario",5:10);

        gimnasio.obtenerClaseMasPopular();


    }
}
