package gimnasio.model;

import gimnasio.enumeraciones.TipoClase;

import java.time.LocalDate;

public class Clase {

    private String id;
    private boolean disponible;
    private TipoClase tipoClase;
    private String nombre;
    private int capacidad;
    private int inscritos;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;


    private List<String> horario
    private Entrenador entrenador;
}
