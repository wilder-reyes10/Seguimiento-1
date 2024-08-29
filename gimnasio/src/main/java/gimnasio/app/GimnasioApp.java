package gimnasio.app;

import gimnasio.model.Gimnasio;

public class GimnasioApp {
    public static void main(String[] args) throws Exception {

        Gimnasio gimnasio = new Gimnasio();
        gimnasio.registrarCliente("Mauricio","Barrio los álamos", "1238", "mauro@gmail.com", "1234567", "3218042309");
        gimnasio.registrarCliente("Alisson","Barrio los quindos", "1509", "alisson@gmail.com", "0987654", "3238880349");
        gimnasio.registrarCliente("Maria","Barrio bosques de pinares", "3108", "maria@gmail.com", "1234689", "3118347251");

        gimnasio.imprimirClientes();

        gimnasio.eliminarCliente("3108");

        gimnasio.imprimirClientes();

    }
}
