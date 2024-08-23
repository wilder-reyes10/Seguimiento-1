package gimnasio.model;

public class Entrenador extends Usuario{

    private String especialidad;

    public Entrenador(String nombre, String id,String especialidad) {
        super(nombre, id);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
