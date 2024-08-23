package gimnasio.model;

import gimnasio.enumeraciones.TipoClase;

import java.time.LocalDate;
import java.util.ArrayList;

public class Clase {

    private String id;
    private boolean disponible;
    private TipoClase tipoClase;
    private String nombre;
    private int capacidad;
    private int inscritos;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    //////
    private ArrayList<String> horario;
    private Entrenador entrenador;

    public Clase(String id, int capacidad, TipoClase tipoClase, boolean disponible, String nombre, int inscritos, LocalDate fechaInicio, LocalDate fechaFin, ArrayList<String> horario, Entrenador entrenador) {
        this.id = id;
        this.capacidad = capacidad;
        this.tipoClase = tipoClase;
        this.disponible = disponible;
        this.nombre = nombre;
        this.inscritos = inscritos;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.horario = horario;
        this.entrenador = entrenador;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public ArrayList<String> getHorario() {
        return horario;
    }

    public void setHorario(ArrayList<String> horario) {
        this.horario = horario;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getInscritos() {
        return inscritos;
    }

    public void setInscritos(int inscritos) {
        this.inscritos = inscritos;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoClase getTipoClase() {
        return tipoClase;
    }

    public void setTipoClase(TipoClase tipoClase) {
        this.tipoClase = tipoClase;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
