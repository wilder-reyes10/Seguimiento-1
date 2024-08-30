package gimnasio.app;

import gimnasio.enumeraciones.TipoClase;
import gimnasio.model.Gimnasio;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class GimnasioApp {
    public static void main(String[] args) throws Exception {

        Gimnasio gimnasio = new Gimnasio("Gym 24/7", "Av 19N", "87278287");

        //Datos de prueba
        gimnasio.registrarCliente("Mauricio", "Barrio los álamos", "1238", "mauro@gmail.com", "1234567", "3218042309");
        gimnasio.registrarCliente("Alisson", "Barrio los quindos", "1509", "alisson@gmail.com", "0987654", "3238880349");
        gimnasio.registrarCliente("Maria", "Barrio bosques de pinares", "3108", "maria@gmail.com", "1234689", "3118347251");

        gimnasio.imprimirClientes();
        gimnasio.eliminarCliente("3108");
        gimnasio.imprimirClientes();

        // Datos de prueba
        gimnasio.crearClase(TipoClase.YOGA, "111", List.of("Lunes 9 am", "Jueves 10 am"), 10, LocalDate.of(2024, 10, 5), LocalDate.of(2024, 9, 5), true, "Clase1");
        gimnasio.crearClase(TipoClase.YOGA, "123", List.of("Lunes 9 am", "Jueves 10 am", "viernes 8 am"), 8, LocalDate.of(2024, 11, 8), LocalDate.of(2024, 10, 6), true, "Clase2");
        gimnasio.crearClase(TipoClase.YOGA, "112", List.of("Lunes 9 am", "martes 10 am"), 10, LocalDate.of(2024, 12, 7), LocalDate.of(2024, 11, 5), false, "Clase3");

        gimnasio.imprimirClases();

        // METODOS DE GENERAR REPORTES, COMPLETAR....
        gimnasio.obtenerClaseMasPopular();

        //Datos de prueba
        gimnasio.registrarEntrenador("Berto", "147", "Deporte");
        gimnasio.registrarEntrenador("Mario", "789", "full vody");
        gimnasio.registrarEntrenador("Berto", "456", "porras");

        gimnasio.imprimirEntrenadores();

    }

}
