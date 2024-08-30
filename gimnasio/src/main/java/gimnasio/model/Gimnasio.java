package gimnasio.model;

import gimnasio.enumeraciones.TipoClase;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Gimnasio {
    /**
     * Atributos de la clase Gimnasio
     */
    private String nombre;
    private String direccion;
    private String telefono;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Entrenador> listaEntrenadores;
    private ArrayList<Clase> listaClases;

    private ArrayList<Clase> inscritos;

    /**
     * Constructor de la clase Gimnasio
     */
    public Gimnasio(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.listaClientes = new ArrayList<>();
        this.listaEntrenadores = new ArrayList<>();
        this.listaClases  = new ArrayList<>();
        this.inscritos  = new ArrayList<>();
    }

    /**
     * Getters y Setters de la clase gimnasio
     * @return retorno de los atributos
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ArrayList<Entrenador> getListaEntrenadores() {
        return listaEntrenadores;
    }

    public void setListaEntrenadores(ArrayList<Entrenador> listaEntrenadores) {
        this.listaEntrenadores = listaEntrenadores;
    }

    public ArrayList<Clase> getListaClases() {
        return listaClases;
    }

    public void setListaClases(ArrayList<Clase> listaClases) {
        this.listaClases = listaClases;
    }

    // implementacion de los metodos
    /**
     * Método que agrega un cliente al gimnasio y verifica que no exista un usuario con el mismo número de identificación
     * @param nombre nombre del cliente
     * @param direccion direccion del cliente
     * @param id cedula del cliente
     * @param correo correo del cliente
     * @param contrasena contraseña del cliente
     * @param telefono telefono del cliente
     * @throws Exception excepciones para cada uno de los parámetros
     */
    public void registrarCliente(String nombre, String direccion, String id, String correo, String contrasena, String telefono) throws Exception{

        if(id == null || id.isBlank()){
            throw new Exception("Recuerde que el número de cédula es obligatorio");
        }

        if(buscarCliente(id) != null){
            throw new Exception("Ya existe un usuario con el número de identificación: "+id);
        }

        if(nombre == null || nombre.isBlank()){
            throw new Exception("El nombre es obligatorio");
        }
        if(telefono == null || telefono.isBlank()){
            throw new Exception("El teléfono es obligatorio");
        }

        if(correo == null || correo.isBlank()){
            throw new Exception("El correo electrónico es obligatorio");
        }

        if(contrasena == null || contrasena.isBlank()){
            throw new Exception("La contraseña es obligatoria");
        }

        if(contrasena.length() < 6) {
            throw new Exception("La contraseña debe tener mínimo 6 caracteres");
        }
        // Creación del objeto Usuario usando un constructor
        Cliente cliente = new Cliente(nombre, id,  direccion, telefono, correo, contrasena);

        listaClientes.add(cliente);


    }
    /**
     * Método que agrega un entrenador al gimnasio y verifica que no exista un entrenador con el mismo número de identificación
     * @param nombre nombre del entrenador
     * @param id cedula del entrenador
     * @param especialidad especialidad del entrenador
     * @throws Exception excepciones para cada uno de los parámetros
     */
    public void registrarEntrenador(String nombre, String id, String especialidad) throws Exception{

        if(id == null || id.isBlank()){
            throw new Exception("Recuerde que el número de cédula es obligatorio");
        }

        if(buscarEntrenador(id) != null){
            throw new Exception("Ya existe un entrenador con el número de identificación: "+id);
        }

        if(nombre == null || nombre.isBlank()){
            throw new Exception("El nombre es obligatorio");
        }
        if(especialidad == null || especialidad.isBlank()){
            throw new Exception("La especialidad es obligatoria");
        }

        // Creación del objeto Usuario usando un constructor
        Entrenador entrenador = new Entrenador(nombre, id, especialidad);

        listaEntrenadores.add(entrenador);


    }

    /**
     * Método para registrar un entrenador
     * @param id
     * @return
     * @throws Exception
     */
    public Entrenador buscarEntrenador(String id)throws Exception{

        //Recorrer la lista de entrenadores
        for(int i = 0; i<listaEntrenadores.size(); i++){
            Entrenador entrenador = listaEntrenadores.get(i);
            if(entrenador.getId().equals(id)){
                return entrenador;
            }
        }

        //Si no se encontró el entrenador lanza una excepción
        throw new Exception("El id "+id+" NO existe");
    } {
    }

    /**
     * Método para imprimir clientes
     */
    public void imprimirClientes(){
        System.out.println(listaClientes);
    }

    /**
     * Método para imprimir entrenadores
     */
    public void imprimirEntrenadores(){
        System.out.println(listaEntrenadores);
    }


    /**
     * Método que busca un Cliente con el numero de identificacion
     * @param id cedula del cliente para buscarlo
     * @return cliente o null si no existe
     */

    public Cliente buscarCliente(String id){

        //Recorrer la lista de clientes
        for(int i = 0; i<listaClientes.size(); i++){
            Cliente cliente = listaClientes.get(i);
            if(cliente.getId().equals(id)){
                return cliente;
            }
        }

        return null;
    }
    /**
     * Método que actualiza los datos de un usuario
     * @param nombre nombre del cliente para actualizar
     * @param direccion dirección del cliente para actualizar
     * @param id cedula del cliente para actualizar
     * @param correo correo del cliente para actualizar
     * @param contrasena contraseña del cliente para actualizar
     */
    public void actualizarCliente(String nombre, String telefono, String direccion, String id, String correo, String contrasena) throws Exception{

        if(nombre == null || nombre.isBlank()){
            throw new Exception("El nombre es obligatorio");
        }

        if(direccion == null || direccion.isBlank()){
            throw new Exception("La dirección es obligatoria");
        }

        if(correo == null || correo.isBlank()){
            throw new Exception("El correo electronico es obligatorio");
        }

        if(contrasena == null || contrasena.isBlank()){
            throw new Exception("La contraseña es obligatoria");
        }

        // Verificación de la existencia del cliente
        Cliente clienteExistente = buscarCliente(id);
        if (clienteExistente == null) {
            throw new Exception("No existe un Cliente con el número de identificación: " + id);
        }
        // Validación para asegurar que la cédula no se cambie
        if (!clienteExistente.getId().equals(id)) {
            throw new Exception("La cédula no se puede cambiar.");
        }

        for (int i = 0; i < listaClientes.size(); i++) {
            if (listaClientes.get(i).getId().equals(id)) {
                Cliente cliente = new Cliente(nombre,telefono, direccion, id, correo, contrasena);
                listaClientes.set(i, cliente);
                break;
            }
        }
    }

    /**
     * Metodo para eliminar un cliente con su cédula
     * @param id cedula del cliente para eliminarlo de la lista de clientes
     * @throws Exception
     *
     */
    public void eliminarCliente(String id) throws Exception{
        Cliente cliente = buscarCliente(id);
        if (cliente != null) {
            listaClientes.remove(cliente);
        }else{
            throw new Exception("El usuario no existe");
        }
    }

    /**
     * Método que le permite al cliente buscar una clase
     * @param tipoClase el cliente puede buscar la clase con el tipo de clase que desee
     * @param nombre se necesita el nombre del entrenador para saber con quién puede ver la clase
     * @return
     */
    public List<Clase> buscarClase(TipoClase tipoClase, String nombre) {

        List<Clase> clasesEncontradas = new ArrayList<>();

        for (Clase clase : listaClases) {
            if (clase.getTipoClase() == tipoClase &&
                    clase.getEntrenador().getNombre().equalsIgnoreCase(nombre)) {
                clasesEncontradas.add(clase);
            }
        }

        if (clasesEncontradas.isEmpty()) {
            System.out.println("No se encontraron clases para el tipo '" + tipoClase +
                    "' con el entrenador '" + nombre+ "'.");
        } else {
            for (Clase clase : clasesEncontradas) {
                System.out.println("Clase: " + clase.getTipoClase() +
                        ", Entrenador: " + clase.getEntrenador().getNombre() +
                        ", Horarios: " + clase.getHorario());
            }
        }

        return clasesEncontradas;
    }

    /**
     * Método para crear una clase en el gimnasio
     * @param tipoClase para saber qué tipo de clase será creada
     * @param entrenador para asignarle un entrenador a cada clase
     * @param horario para colocar el horario en el que se dictará la clase
     * @param capacidad para manejar los cupos disponibles
     * @param fechaFin para saber cuando se acaba la clase
     * @param fechaInicio para saber cuando inicia la clase
     * @param inscritos para poder asignar las personas que se inscriban a la clase
     * @param disponible para saber si esa clase tiene disponibilidad
     * @param id para que tenga un codigo
     */
    public void crearClase(TipoClase tipoClase, Entrenador entrenador, ArrayList<String> horario, int capacidad, LocalDate fechaFin, LocalDate fechaInicio, List<Reserva> inscritos, boolean disponible, String id) {
        Clase nuevaClase = new Clase(entrenador, horario, fechaFin, fechaInicio, inscritos, capacidad, tipoClase, disponible, id);
        listaClases.add(nuevaClase);

        // Formatear la lista de horarios en una sola cadena
        String horariosFormateados = String.join(", ", horario);

        // Imprimir el mensaje con todos los atributos
        System.out.println("Clase creada: " + tipoClase +
                "\nEntrenador: " + entrenador.getNombre() +
                "\nHorarios: " + horariosFormateados +
                "\nCapacidad: " + capacidad +
                "\nFecha de inicio: " + fechaInicio +
                "\nFecha de fin: " + fechaFin +
                "\nInscritos: " + inscritos.size() + " personas" +
                "\nDisponible: " + (disponible ? "Sí" : "No") +
                "\nID de clase: " + id);
    }

    /**
     * Método para que el cliente pueda reservar una clase
     */
    public void reservarClase(Clase clase, Cliente cliente, LocalDateTime fechaReserva, String codigoReserva) {
        List<Reserva> inscritos = clase.getInscritos();

        if (inscritos.size() < clase.getCapacidad()) {
            Reserva nuevaReserva = new Reserva(fechaReserva, cliente, codigoReserva);
            inscritos.add(nuevaReserva);

            System.out.println("Reserva realizada con éxito para la clase: " +
                    clase.getTipoClase() +
                    "\nEntrenador: " + clase.getEntrenador().getNombre() +
                    "\nHorarios: " + clase.getHorario() +
                    "\nFecha de la reserva: " + fechaReserva +
                    "\nCódigo de reserva: " + codigoReserva);
        } else {
            System.out.println("La clase está llena. No se puede realizar la reserva.");
        }
    }

    /**
     * Método para que el cliente pueda cancelar la reserva
     * @param clase la clase a la que el usuario se inscribió
     * @param idUsuario el numero de identificacion para buscar la reserva
     * @param codigo el código de la reserva
     */
    public void cancelarReserva(Clase clase, String idUsuario, String codigo) {
        List<Reserva> inscritos = clase.getInscritos();
        Reserva reservaACancelar = null;
        boolean encontrada = false;

        // Buscar la reserva correspondiente
        for (Reserva reserva : inscritos) {
            if (reserva.getCliente().getId().equals(idUsuario) && reserva.getCodigo().equals(codigo)) {
                reservaACancelar = reserva;
                encontrada = true;
            }
        }

        if (encontrada) {
            // Eliminar la reserva de la lista de inscritos
            inscritos.remove(reservaACancelar);
            System.out.println("Reserva cancelada con éxito. Código de reserva: " + codigo);

            // Actualizar la disponibilidad de la clase
            if (inscritos.size() < clase.getCapacidad()) {
                clase.setDisponible(true);
            }

        } else {
            System.out.println("No se encontró una reserva con el ID de usuario: " + idUsuario + " y código de reserva: " + codigo);
        }
    }







}