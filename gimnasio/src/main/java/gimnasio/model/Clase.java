package gimnasio.model;

import gimnasio.enumeraciones.TipoClase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Clase {

    private String id;
    private boolean disponible;
    private TipoClase tipoClase;
    private int capacidad;
    private List<Reserva> inscritos;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private List<String> horario;
    private Entrenador entrenador;

    public Clase(Entrenador entrenador, List<String> horario, LocalDate fechaFin, LocalDate fechaInicio, int capacidad, TipoClase tipoClase, boolean disponible, String id) {
        this.entrenador = entrenador;
        this.horario = horario;
        this.fechaFin = fechaFin;
        this.fechaInicio = fechaInicio;
        this.inscritos = new ArrayList<>();
        this.capacidad = capacidad;
        this.tipoClase = tipoClase;
        this.disponible = disponible;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public TipoClase getTipoClase() {
        return tipoClase;
    }

    public void setTipoClase(TipoClase tipoClase) {
        this.tipoClase = tipoClase;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public List<Reserva> getInscritos() {
        return inscritos;
    }

    public void setInscritos(List<Reserva> inscritos) {
        this.inscritos = inscritos;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<String> getHorario() {
        return horario;
    }

    public void setHorario(List<String> horario) {
        this.horario = horario;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    @Override
    public String toString() {
        return "Clase{" +
                "id='" + id + '\'' +
                ", disponible=" + disponible +
                ", tipoClase=" + tipoClase +
                ", capacidad=" + capacidad +
                ", inscritos=" + inscritos +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", horario=" + horario +
                ", entrenador=" + entrenador +
                '}';
    }
}
