package gimnasio.app;

import gimnasio.enumeraciones.TipoClase;
import gimnasio.enumeraciones.TipoEjercicio;
import gimnasio.model.Clase;
import gimnasio.model.Cliente;
import gimnasio.model.Gimnasio;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static gimnasio.enumeraciones.TipoClase.MEDITACION;

public class GimnasioApp {

    public static void main(String[] args) throws Exception {

        Gimnasio gimnasio = new Gimnasio("Gym 24/7", "Av 19N", "87278287");
        //crear una instancia de la fecha
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        System.out.println("Fecha y hora actual: " + fechaHoraActual);


        //Datos de prueba
        gimnasio.registrarCliente("Mauricio", "Barrio los álamos", "1238", "mauro@gmail.com", "1234567", "3218042309");
        gimnasio.registrarCliente("Alisson", "Barrio los quindos", "1509", "alisson@gmail.com", "0987654", "3238880349");
        gimnasio.registrarCliente("Maria", "Barrio bosques de pinares", "3108", "maria@gmail.com", "1234689", "3118347251");

        gimnasio.imprimirClientes();
        gimnasio.eliminarCliente("3108");
        gimnasio.imprimirClientes();

        //actualizar usuarios
        gimnasio.actualizarCliente("Mauricio Pineda", "3102285645", "Barrio la pavona", "1238", "mauro2118@gmail.com", "mauro12345");
        gimnasio.imprimirClientes();

        //Datos de prueba
        gimnasio.registrarEntrenador("Berto", "147", "Deporte");
        gimnasio.registrarEntrenador("Mario", "789", "full vody");
        gimnasio.registrarEntrenador("Berto", "456", "porras");
        gimnasio.imprimirEntrenadores();

        // Datos de prueba
        gimnasio.crearClase(TipoClase.YOGA, "147", List.of("Lunes 9 am", "Jueves 10 am"), 10, LocalDate.of(2024, 10, 5), LocalDate.of(2024, 9, 5), true, "Clase1");
        gimnasio.crearClase(TipoClase.MEDITACION, "789", List.of("Lunes 9 am", "Jueves 10 am", "viernes 8 am"), 8, LocalDate.of(2024, 11, 8), LocalDate.of(2024, 10, 6), true, "Clase2");
        gimnasio.crearClase(TipoClase.YOGA, "456", List.of("Lunes 9 am", "martes 10 am"), 10, LocalDate.of(2024, 12, 7), LocalDate.of(2024, 11, 5), false, "Clase3");

        gimnasio.imprimirClases();


        //Buscar clase
        gimnasio.buscarClase(TipoClase.YOGA, "147");


        //reservar clases MEDITACION, cliente, fechaHoraActual, "2109");
        gimnasio.reservarClase(TipoClase.YOGA,new Cliente("Mauricio", "Barrio los álamos", "1238", "mauro@gmail.com", "1234567", "3218042309"),LocalDateTime.now(),"123");

        //Registrar entrenamientos
        gimnasio.registrarEntrenamiento("1238", TipoEjercicio.EQUILIBRIO, 60, 1000, fechaHoraActual);
        //Cancelar clases

        //Registrar entrenamientos
        gimnasio.registrarEntrenamiento("1238", TipoEjercicio.EQUILIBRIO, 60, 1000, fechaHoraActual);


        //Consultar entrenamientos
        gimnasio.consultarEntrenamientos("1238");
        gimnasio.consultarEntrenamientos("1509");

        // METODOS DE GENERAR REPORTES
        gimnasio.obtenerClaseMasPopular();
        gimnasio.obtenerTresUsuariosMasActivos();
        gimnasio.obtenerTipoEjercicioMasPracticado();

    }

}
