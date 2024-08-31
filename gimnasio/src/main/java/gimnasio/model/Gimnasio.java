package gimnasio.model;

import gimnasio.enumeraciones.TipoClase;
import gimnasio.enumeraciones.TipoEjercicio;

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
        this.listaClases = new ArrayList<>();
        this.inscritos = new ArrayList<>();
    }

    /**
     * Getters y Setters de la clase gimnasio
     *
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
     *
     * @param nombre     nombre del cliente
     * @param direccion  direccion del cliente
     * @param id         cedula del cliente
     * @param correo     correo del cliente
     * @param contrasena contraseña del cliente
     * @param telefono   telefono del cliente
     * @throws Exception excepciones para cada uno de los parámetros
     */
    public void registrarCliente(String nombre, String direccion, String id, String correo, String contrasena, String telefono) throws Exception {

        if (id == null || id.isBlank()) {
            throw new Exception("Recuerde que el número de cédula es obligatorio");
        }

        if (buscarCliente(id) != null) {
            throw new Exception("Ya existe un usuario con el número de identificación: " + id);
        }

        if (nombre == null || nombre.isBlank()) {
            throw new Exception("El nombre es obligatorio");
        }
        if (telefono == null || telefono.isBlank()) {
            throw new Exception("El teléfono es obligatorio");
        }

        if (correo == null || correo.isBlank()) {
            throw new Exception("El correo electrónico es obligatorio");
        }

        if (contrasena == null || contrasena.isBlank()) {
            throw new Exception("La contraseña es obligatoria");
        }

        if (contrasena.length() < 6) {
            throw new Exception("La contraseña debe tener mínimo 6 caracteres");
        }
        // Creación del objeto Usuario usando un constructor
        Cliente cliente = new Cliente(nombre, id, direccion, telefono, correo, contrasena);

        listaClientes.add(cliente);


    }

    /**
     * Método que agrega un entrenador al gimnasio y verifica que no exista un entrenador con el mismo número de identificación
     *
     * @param nombre       nombre del entrenador
     * @param id           cedula del entrenador
     * @param especialidad especialidad del entrenador
     * @throws Exception excepciones para cada uno de los parámetros
     */
    public void registrarEntrenador(String nombre, String id, String especialidad) throws Exception {

        if (id == null || id.isBlank()) {
            throw new Exception("Recuerde que el número de cédula es obligatorio");
        }

        if (buscarEntrenador(id) != null) {
            throw new Exception("Ya existe un entrenador con el número de identificación: " + id);
        }

        if (nombre == null || nombre.isBlank()) {
            throw new Exception("El nombre es obligatorio");
        }
        if (especialidad == null || especialidad.isBlank()) {
            throw new Exception("La especialidad es obligatoria");
        }

        // Creación del objeto Usuario usando un constructor
        Entrenador entrenador = new Entrenador(nombre, id, especialidad);

        listaEntrenadores.add(entrenador);


    }

    /**
     * Método para buscar un entrenador
     * @param idEntrenador el entrenador se busca con su cedula
     * @return
     */
    public Entrenador buscarEntrenador(String idEntrenador) {

        //Recorrer la lista de entrenadores
        for (int i = 0; i < listaEntrenadores.size(); i++) {
            Entrenador entrenador = listaEntrenadores.get(i);
            if (entrenador.getId().equals(idEntrenador)) {
                return entrenador;
            }
        }

        return null;

    }

    /**
     * Método para imprimir clientes
     */
    public void imprimirClientes() {
        System.out.println(listaClientes);
    }

    /**
     * Método para imprimir entrenadores
     */
    public void imprimirEntrenadores() {
        System.out.println(listaEntrenadores);
    }

    /**
     * Metodo para imprimir clases
     */
    public void imprimirClases(){
        System.out.println(listaClases);

    }


    /**
     * Método que busca un Cliente con el numero de identificacion
     *
     * @param id cedula del cliente para buscarlo
     * @return cliente o null si no existe
     */

    public Cliente buscarCliente(String id) {

        //Recorrer la lista de clientes
        for (int i = 0; i < listaClientes.size(); i++) {
            Cliente cliente = listaClientes.get(i);
            if (cliente.getId().equals(id)) {
                return cliente;
            }
        }

        return null;
    }

    /**
     * Método que actualiza los datos de un usuario
     *
     * @param nombre     nombre del cliente para actualizar
     * @param direccion  dirección del cliente para actualizar
     * @param id         cedula del cliente para actualizar
     * @param correo     correo del cliente para actualizar
     * @param contrasena contraseña del cliente para actualizar
     */
    public void actualizarCliente(String nombre, String telefono, String direccion,String id, String correo, String contrasena) throws Exception {

        if (nombre == null || nombre.isBlank()) {
            throw new Exception("El nombre es obligatorio");
        }

        if (direccion == null || direccion.isBlank()) {
            throw new Exception("La dirección es obligatoria");
        }

        if (correo == null || correo.isBlank()) {
            throw new Exception("El correo electronico es obligatorio");
        }

        if (contrasena == null || contrasena.isBlank()) {
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
                Cliente cliente = new Cliente(nombre, telefono, direccion, id, correo, contrasena);
                listaClientes.set(i, cliente);
                break;
            }
        }
    }

    /**
     * Metodo para eliminar un cliente con su cédula
     *
     * @param id cedula del cliente para eliminarlo de la lista de clientes
     * @throws Exception
     */
    public void eliminarCliente(String id) throws Exception {
        Cliente cliente = buscarCliente(id);
        if (cliente != null) {
            listaClientes.remove(cliente);
        } else {
            throw new Exception("El usuario no existe");
        }
    }

    /**
     * Método que le permite al cliente buscar una clase
     *
     * @param tipoClase el cliente puede buscar la clase con el tipo de clase que desee
     * @param id    se necesita el id del entrenador para saber con quien va a ver la clase
     * @return
     */
    public List<Clase> buscarClase(TipoClase tipoClase, String id) {

        List<Clase> clasesEncontradas = new ArrayList<>();

        for (Clase clase : listaClases) {
            if (clase.getTipoClase() == tipoClase &&
                    clase.getEntrenador().getId().equalsIgnoreCase(id)) {
                clasesEncontradas.add(clase);
            }
        }

        if (clasesEncontradas.isEmpty()) {
            System.out.println("No se encontraron clases para el tipo '" + tipoClase +
                    "' con el entrenador '" + id + "'.");
        } else {
            for (Clase clase : clasesEncontradas) {
                System.out.println("Clase: " + clase.getTipoClase() +
                        ", Entrenador: " + clase.getEntrenador().getId() +
                        ", Horarios: " + clase.getHorario());
            }
        }

        return clasesEncontradas;
    }

    /**
     * * Método para crear una clase en el gimnasio
     * @param tipoClase para saber qué tipo de clase será creada
     * @param id para asignarle un entrenador a cada clase
     * @param horario para colocar el horario en el que se dictará la clase
     * @param capacidad   para manejar los cupos disponibles
     * @param fechaFin  para saber cuando se acaba la clase
     * @param fechaInicio para saber cuando inicia la clase
     * @param disponible para poder asignar las personas que se inscriban a la clase
     * @param idClase para saber si esa clase tiene disponibilidad
     * @throws Exception  para que tenga un codigo
     */
    public void crearClase(TipoClase tipoClase, String id, List<String> horario, int capacidad, LocalDate fechaFin, LocalDate fechaInicio, boolean disponible, String idClase) throws Exception{

        Entrenador entrenador = buscarEntrenador(id);

        if(entrenador == null){
            throw new Exception("El id del entrenador NO existe");
        }


        Clase nuevaClase = new Clase(entrenador, horario, fechaFin, fechaInicio, capacidad, tipoClase, disponible, id);
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
    public void reservarClase(TipoClase tipoClase,Cliente cliente, LocalDateTime fechaReserva, String codigoReserva) {

        Clase claseReservada = null;

        // Buscar la clase por tipoClase
        for (Clase clase : listaClases) {
            if (clase.getTipoClase().equals(tipoClase)) {
                claseReservada = clase;
                break;
            }
        }

        if (claseReservada == null) {
            System.out.println("No se encontró una clase con el tipo: " + tipoClase);
            return;
        }

        // Realizar la reserva si la clase fue encontrada
        List<Reserva> inscritos = claseReservada.getInscritos();

        if (inscritos.size() < claseReservada.getCapacidad()) {
            Reserva nuevaReserva = new Reserva(fechaReserva, cliente, codigoReserva);
            inscritos.add(nuevaReserva);

            System.out.println("Reserva realizada con éxito para la clase: " +
                    claseReservada.getTipoClase() +
                    "\nEntrenador: " + claseReservada.getEntrenador().getNombre() +
                    "\nHorarios: " + claseReservada.getHorario() +
                    "\nFecha de la reserva: " + fechaReserva +
                    "\nCódigo de reserva: " + codigoReserva);
        } else {
            System.out.println("La clase está llena. No se puede realizar la reserva.");
        }
    }

    /**
     * Método para que el cliente pueda cancelar la reserva
     *
     * @param clase     la clase a la que el usuario se inscribió
     * @param idUsuario el numero de identificacion para buscar la reserva
     * @param codigo    el código de la reserva
     */
    public void cancelarReserva(TipoClase tipoClase, String idUsuario, String codigo, Clase clase) {
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

    // Metodo Clase mas activa,
    // usuario mas activo(top3 calorias quemadas),
    // tipo ejercicio que mas se practica

    public Clase obtenerClaseMasPopular() {
        Clase claseMasPopular = null;
        int maxInscritos = 0;

        for (Clase clase : listaClases) {
            if (clase.getInscritos().size() > maxInscritos) {
                maxInscritos = clase.getInscritos().size();
                claseMasPopular = clase;
            }
        }

        //pendientes con este null
        return null;
    }

    /**
     * Método para obtener los tres usuarios más activos
     * @return se retorna la lista con los usuarios más activos
     */
    public List<Cliente> obtenerTresUsuariosMasActivos() {
        List<Cliente> usuariosMasActivos = new ArrayList<>();
        int[] maxCalorias = {0, 0, 0};

        for (Cliente cliente : listaClientes) {
            int caloriasTotales = calcularCaloriasTotales(cliente);
            boolean insertado = false;

            for (int i = 0; i < 3; i++) {
                if (caloriasTotales > maxCalorias[i] && !insertado) {
                    usuariosMasActivos.add(i, cliente);
                    maxCalorias[i] = caloriasTotales;
                    insertado = true;
                }
            }

            if (usuariosMasActivos.size() > 3) {
                usuariosMasActivos.remove(3);
            }
        }

        return usuariosMasActivos;
    }

    /**
     * Método para calcular las calorías totales de cada cliente de acuerdo a su entrenamiento
     * @param cliente se revisan los entrenamientos de cada cliente
     * @return
     */

    private int calcularCaloriasTotales(Cliente cliente) {
        int totalCalorias = 0;
        for (Entrenamiento entrenamiento : cliente.getEntrenamientos()) {
            totalCalorias += entrenamiento.getCaloriasQuemadas();
        }
        return totalCalorias;
    }

    /**
     * Método para obtener el tipo de ejercicio más practicado en el gimnasio
     * @return se retorna el tipo de ejercicio más pracitcado
     */
    public TipoEjercicio obtenerTipoEjercicioMasPracticado() {
        // Inicializa las variables para almacenar el tiempo total por tipo de ejercicio
        int[] tiempoPorEjercicio = new int[TipoEjercicio.values().length];

        // Suma la duración de los entrenamientos por tipo de ejercicio
        for (Cliente cliente : listaClientes) {
            for (Entrenamiento entrenamiento : cliente.getEntrenamientos()) {
                TipoEjercicio tipo = entrenamiento.getTipoEjercicio();
                tiempoPorEjercicio[tipo.ordinal()] += entrenamiento.getDuracion();
            }
        }

        // Encuentra el tipo de ejercicio con mayor duración acumulada
        TipoEjercicio tipoMasPracticado = null;
        int maxTiempo = 0;

        for (TipoEjercicio tipo : TipoEjercicio.values()) {
            int tiempo = tiempoPorEjercicio[tipo.ordinal()];
            if (tiempo > maxTiempo) {
                maxTiempo = tiempo;
                tipoMasPracticado = tipo;
            }
        }

        return tipoMasPracticado;
    }

    /**
     * Método para que el cliente pueda registrar los entrenamientos
     * @param id para agregar el entrenamiento a ese cliente
     * @param tipoEjercicio para que se pueda determinar que tipo de ejercicio realizó
     * @param duracion para saber cuánto duró
     * @param caloriasQuemadas para registrar cuántas calorías quemó
     * @param fecha para que pueda mirar la fecha en tiempo real en la que se realizó el ejercicio
     * @return retorna un mensaje con la cédula del cliente para que sepa que se registró el entrenamiento
     */
    public String registrarEntrenamiento(String id, TipoEjercicio tipoEjercicio, int duracion, int caloriasQuemadas, LocalDateTime fecha) {
        Cliente cliente = buscarCliente(id);

        if (cliente == null) {
            return "Cliente no encontrado con el ID: " + id;
        }

        Entrenamiento nuevoEntrenamiento = new Entrenamiento(tipoEjercicio, duracion,fecha, caloriasQuemadas );
        cliente.agregarEntrenamiento(nuevoEntrenamiento);

        return "Entrenamiento registrado con éxito para el cliente: " + cliente.getId();
    }

    /**
     * Método para que el cliente pueda consultar los entrenamientos, fechas, detalles del ejercicio
     * @param idCliente para poder buscar los entrenamientos que ese cliente tiene registrados
     * @return retorna todos los detalles del entrenamiento
     */
    public String consultarEntrenamientos(String idCliente) {
        Cliente cliente = buscarCliente(idCliente);

        if (cliente == null) {
            return "Cliente no encontrado con el ID: " + idCliente;
        }

        List<Entrenamiento> entrenamientos = cliente.getEntrenamientos();

        if (entrenamientos.isEmpty()) {
            return "No hay entrenamientos registrados para el cliente: " + cliente.getId();
        }

        StringBuilder detallesEntrenamientos = new StringBuilder();
        detallesEntrenamientos.append("Entrenamientos del cliente ID: ").append(idCliente).append("\n");

        for (Entrenamiento e : entrenamientos) {
            detallesEntrenamientos.append("Fecha: ").append(e.getFecha())
                    .append(", Ejercicio: ").append(e.getTipoEjercicio())
                    .append(", Duración: ").append(e.getDuracion()).append(" minutos")
                    .append(", Calorías quemadas: ").append(e.getCaloriasQuemadas()).append("\n");
        }

        return detallesEntrenamientos.toString();
    }
}


