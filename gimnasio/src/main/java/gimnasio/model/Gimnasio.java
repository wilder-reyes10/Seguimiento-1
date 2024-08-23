package gimnasio.model;

import java.util.ArrayList;

public class Gimnasio {

    private String nombre;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Entrenador> listaEntrenadores;
    private ArrayList<Reserva> listaReservas;
    private ArrayList<Clase> listaClases;

    public Gimnasio(String nombre, ArrayList<Entrenador> listaEntrenadores, ArrayList<Cliente> listaClientes, ArrayList<Reserva> listaReservas, ArrayList<Clase> listaClases) {
        this.nombre = nombre;
        this.listaEntrenadores = listaEntrenadores;
        this.listaClientes = listaClientes;
        this.listaReservas = listaReservas;
        this.listaClases = listaClases;
    }

    public ArrayList<Clase> getListaClases() {
        return listaClases;
    }

    public void setListaClases(ArrayList<Clase> listaClases) {
        this.listaClases = listaClases;
    }

    public ArrayList<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(ArrayList<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

    public ArrayList<Entrenador> getListaEntrenadores() {
        return listaEntrenadores;
    }

    public void setListaEntrenadores(ArrayList<Entrenador> listaEntrenadores) {
        this.listaEntrenadores = listaEntrenadores;
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
}