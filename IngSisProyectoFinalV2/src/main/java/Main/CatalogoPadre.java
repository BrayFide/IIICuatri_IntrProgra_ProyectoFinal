package Main;

import javax.swing.JOptionPane;

public class CatalogoPadre {
    
    private String nombreCompletoPadre;
    private String nombreNinoPadre;
    private String ciudadPadre;
    private String direccionPadre;
    private String telefonoPadre;
    private String correoPadre;
    private String estadoPadre;
    
    public CatalogoPadre() {
        this.nombreCompletoPadre = "";
        this.nombreNinoPadre = "";
        this.ciudadPadre = "";
        this.direccionPadre = "";
        this.telefonoPadre = "";
        this.correoPadre = "";
        this.estadoPadre = "";
    }
    
    public String getNombreCompletoPadre() {   
        return nombreCompletoPadre;
    }

    public void setNombreCompletoPadre(String nombreCompletoPadre) {
        this.nombreCompletoPadre = nombreCompletoPadre;
    }
    
    public String getNombreNinoPadre() {   
        return nombreNinoPadre;
    }

    public void setNombreNinoPadre(String nombreNinoPadre) {
        JOptionPane.showMessageDialog(null, "Aquí saldrá una lista de deportistas ya registrados");   
        this.nombreNinoPadre = nombreNinoPadre;
    }
    
    public String getCiudadPadre() {   
        return ciudadPadre;
    }

    public void setCiudadPadre(String ciudadPadre) {
        this.ciudadPadre = ciudadPadre;
    }
    
    public String getDireccionPadre() {   
        return direccionPadre;
    }

    public void setDireccionPadre(String direccionPadre) {
        this.direccionPadre = direccionPadre;
    }
    
    public String getTelefonoPadre() {   
        return telefonoPadre;
    }

    public void setTelefonoPadre(String telefonoPadre) {
        this.telefonoPadre = telefonoPadre;
    }
    
    public String getCorreoPadre() {   
        return correoPadre;
    }

    public void setCorreoPadre(String correoPadre) {
        JOptionPane.showMessageDialog(null, "Aquí se validará si el dato ingresado es un correo");   
        this.correoPadre = correoPadre;
    }
    
    public String getEstadoPadre() {   
        return estadoPadre;
    }

    public void setEstadoPadre(String estadoPadre) {
        this.estadoPadre = estadoPadre;
    }
    
}
