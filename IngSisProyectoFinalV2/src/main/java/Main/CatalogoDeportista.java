package Main;

import javax.swing.JOptionPane;

public class CatalogoDeportista {
    private String Usuario;
    private String identificacionDeportista;
    private String nombreCompletoDeportista;
    private String ciudadDeportista;
    private String direccionDeportista;
    private String telefonoDeportista;
    private String correoDeportista;
    private String estadoDeportista;
    
    public CatalogoDeportista() {
        this.identificacionDeportista = "";
        this.nombreCompletoDeportista = "";
        this.ciudadDeportista = "";
        this.direccionDeportista = "";
        this.telefonoDeportista = "";
        this.correoDeportista = "";
        this.estadoDeportista = "";
        this.Usuario = "";
    }
    
    public String getIdentificacionDeportista() {   
        return identificacionDeportista;
    }

    public void setIdentificacionDeportista(String identificacionDeportista) {
           
        this.identificacionDeportista = identificacionDeportista;
    }
    
    public String getNombreCompletoDeportista() {   
        return nombreCompletoDeportista;
    }

    public void setNombreCompletoDeportista(String nombreCompletoDeportista) {
        this.nombreCompletoDeportista = nombreCompletoDeportista;
    }
    
    public String getCiudadDeportista() {   
        return ciudadDeportista;
    }

    public void setCiudadDeportista(String ciudadDeportista) {
        this.ciudadDeportista = ciudadDeportista;
    }
    
    public String getDireccionDeportista() {   
        return direccionDeportista;
    }

    public void setDireccionDeportista(String direccionDeportista) {
        this.direccionDeportista = direccionDeportista;
    }
    
    public String getTelefonoDeportista() {   
        return telefonoDeportista;
    }

    public void setTelefonoDeportista(String telefonoDeportista) {
        this.telefonoDeportista = telefonoDeportista;
    }
    
    public String getCorreoDeportista() {   
        return correoDeportista;
    }

    public void setCorreoDeportista(String correoDeportista) {
        
        this.correoDeportista = correoDeportista;
    }
    
    public String getEstadoDeportista() {   
        return estadoDeportista;
    }

    public void setEstadoDeportista(String estadoDeportista) {
        this.estadoDeportista = estadoDeportista;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }
}
