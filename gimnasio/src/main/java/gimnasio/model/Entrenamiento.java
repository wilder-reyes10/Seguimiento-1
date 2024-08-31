package gimnasio.model;

import gimnasio.enumeraciones.TipoEjercicio;

import java.time.LocalDateTime;

public class Entrenamiento {

    private TipoEjercicio tipoEjercicio;
    private int duracion;
    private LocalDateTime fecha;
    private int caloriasQuemadas;

    public Entrenamiento(TipoEjercicio tipoEjercicio, int duracion, LocalDateTime fecha, int caloriasQuemadas) {
        this.tipoEjercicio = tipoEjercicio;
        this.duracion = duracion;
        this.fecha = fecha;
        this.caloriasQuemadas = caloriasQuemadas;
    }

    public TipoEjercicio getTipoEjercicio() {
        return tipoEjercicio;
    }

    public void setTipoEjercicio(TipoEjercicio tipoEjercicio) {
        this.tipoEjercicio = tipoEjercicio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCaloriasQuemadas() {
        return caloriasQuemadas;
    }

    public void setCaloriasQuemadas(int caloriasQuemadas) {
        this.caloriasQuemadas = caloriasQuemadas;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Entrenamiento{" +
                "tipoEjercicio=" + tipoEjercicio +
                ", duracion=" + duracion +
                ", fecha=" + fecha +
                ", caloriasQuemadas=" + caloriasQuemadas +
                '}';
    }
}
