package Main;
public class RegistroUsuarios {
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String contraseña;  
    
       public RegistroUsuarios() {
        this.nombre = "";
        this.primerApellido = "";
        this.segundoApellido = "";
        this.contraseña = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
       
}
