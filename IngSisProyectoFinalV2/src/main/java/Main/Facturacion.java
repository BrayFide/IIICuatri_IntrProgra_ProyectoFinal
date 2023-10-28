
package Main;


public class Facturacion {
    private String Mes;
    private String Deporte;
    private int Pago;

    public Facturacion() {
        this.Mes = "";
        this.Deporte = "";
        this.Pago = 0;
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
    
    
    
}
