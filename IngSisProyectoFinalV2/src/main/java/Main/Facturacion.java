
package Main;


public class Facturacion {


    private String Mes;
    private String Deporte;
    private int Pago;
    private String Nombre;
    private String Fecha;
    private String Hora;
    private String Rutina;
    private double Costo;
    private String pagoRealizado;
    
    
    

    private String Mes;
    private String Deporte;
    private int Pago;


    public Facturacion() {
        this.Mes = "";
        this.Deporte = "";
        this.Pago = 0;

        this.Nombre = "";
        this.Fecha = "";
        this.Hora = "";
        this.Rutina = "";
        this.Costo = 0.00;
        this.pagoRealizado="";

    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String Mes) {
        this.Mes = Mes;
    }

    public String getDeporte() {
        return Deporte;
    }

    public void setDeporte(String Deporte) {
        this.Deporte = Deporte;
    }

    public int getPago() {
        return Pago;
    }

    public void setPago(int Pago) {
        this.Pago = Pago;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getRutina() {
        return Rutina;
    }

    public void setRutina(String Rutina) {
        this.Rutina = Rutina;
    }

    public double getCosto() {
        return Costo;
    }

    public void setCosto(double Costo) {
        this.Costo = Costo;
    }

    public String getPagoRealizado() {
        return pagoRealizado;
    }

    public void setPagoRealizado(String pagoRealizado) {
        this.pagoRealizado = pagoRealizado;
    }
    
    


    
}
