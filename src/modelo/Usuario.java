package modelo;


public class Usuario {

    //Atributos
    private int idUsuario;
    private String usuario;
    private String password;
    private String nombre;
    private String apellido;
    private String telefono;
    

    //Contructor vacío
    public Usuario() {
        
        this.idUsuario = 0;
        this.usuario = "";
        this.password = "";
        this.nombre = "";
        this.apellido = "";
        this.telefono = "";
    
    }

    //set and get
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


}
