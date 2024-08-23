package gimnasio.model;

public class Cliente extends  Usuario {

    private String correo;
    private String direccion;
    private String telefono;
    private String contrasena;

    public Cliente(String nombre, String id, String correo, String contrasena, String direccion, String telefono) {
        super(nombre, id);
        this.correo = correo;
        this.contrasena = contrasena;
        this.direccion = direccion;
        this.telefono = telefono;
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
}
