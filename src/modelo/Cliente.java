package modelo;


public class Cliente {

    //Atributos
    private int idCliente;
    private String DNI;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;

    
     public Cliente() {
        this.DNI = "";
        this.idCliente = 0;
        this.nombre = "";
        this.apellido = "";
        this.telefono = "";
        this.direccion = "";
        
    }
    public Cliente(int idCliente, String DNI, String nombre, String apellido, String telefono, String direccion) {
        this.idCliente = idCliente;
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    

}
