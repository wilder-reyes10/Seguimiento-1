package gimnasio.model;

import java.util.ArrayList;

public class Gimnasio {

    private String nombre;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Entrenador> listaEntrenador;
    private ArrayList<Reserva> listaReservas;
    // mas listas

    public Gimnasio(String nombre, ArrayList<Entrenador> listaEntrenador, ArrayList<Cliente> listaClientes, ArrayList<Reserva> listaReservas) {
        this.nombre = nombre;
        this.listaEntrenador = listaEntrenador;
        this.listaClientes = listaClientes;
        this.listaReservas = listaReservas;
    }

    public ArrayList<Entrenador> getListaEntrenador() {
        return listaEntrenador;
    }

    public void setListaEntrenador(ArrayList<Entrenador> listaEntrenador) {
        this.listaEntrenador = listaEntrenador;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(ArrayList<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }
}
