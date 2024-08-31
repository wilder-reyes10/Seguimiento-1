package gimnasio.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends  Usuario {

    private String correo;
    private String direccion;
    private String telefono;
    private String contrasena;

    private List<Entrenamiento> entrenamientos;

    public Cliente(String nombre, String id, String correo, String direccion, String telefono, String contrasena) {
        super(nombre, id);
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void agregarEntrenamiento(Entrenamiento entrenamiento) {
        entrenamientos.add(entrenamiento);
    }

    public List<Entrenamiento> getEntrenamientos() {
        return entrenamientos;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "correo='" + telefono + '\'' +
                ", direccion='" + correo + '\'' +
                ", telefono='" + direccion + '\'' +
                ", contrasena='" + contrasena + '\'' +
                '}';
    }
}
