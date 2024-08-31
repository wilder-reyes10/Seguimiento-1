package gimnasio.model;

import java.time.LocalDateTime;

public class Reserva {

    private LocalDateTime fechaReserva;
    private Cliente cliente;
    private String codigo;

    public Reserva(LocalDateTime fechaReserva, Cliente cliente, String codigo) {
        this.fechaReserva = fechaReserva;
        this.cliente = cliente;
        this.codigo = codigo;
    }

    public LocalDateTime getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(LocalDateTime fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
