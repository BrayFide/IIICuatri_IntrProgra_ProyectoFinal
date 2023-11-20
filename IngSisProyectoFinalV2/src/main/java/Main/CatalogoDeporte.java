
package Main;
import javax.swing.JOptionPane;

public class CatalogoDeporte {
 private String Deporte1;
 private String Estaddo1;
 private String Estaddo2;
 private String Estaddo3;
 private String Deporte2;
 private String Deporte3;

 private int OpcDeporte;
 private char estadoFut;
 private String NombreUsuario;


    public CatalogoDeporte() {
        this.Deporte1 = "";
        this.Estaddo1 = "";
        this.Estaddo2 = "";
        this.Estaddo3 = "";
        this.Deporte2 = "";
        this.Deporte3 = "";
        this.estadoFut= 'S';
        this.NombreUsuario = "Thomas";
    }

    public String getDeporte1() {
     JOptionPane.showMessageDialog(null, "Bienvenido a futball\nCaracteristicas: \nDos equipos compiten para marcar goles en la portería contraria.\nSe juega en un campo rectangular con reglas específicas.\nLos partidos duran 90 minutos, divididos en dos tiempos.\n");   
        return Deporte1;
    }

    public void setDeporte1(String Deporte1) {
        this.Deporte1 = Deporte1;
    }

    public String getEstaddo1() {
        return Estaddo1;
    }

    public void setEstaddo1(String Estaddo1) {
        this.Estaddo1 = Estaddo1;
    }

    public String getEstaddo2() {
        return Estaddo2;
    }

    public void setEstaddo2(String Estaddo2) {
        this.Estaddo2 = Estaddo2;
    }

    public String getEstaddo3() {
        return Estaddo3;
    }

    public void setEstaddo3(String Estaddo3) {
        this.Estaddo3 = Estaddo3;
    }

    public String getDeporte2() {
        JOptionPane.showMessageDialog(null, "Bienvenido a Volleyball\nCaracteristicas: \nJuego de pelota en una red: El voleibol se juega con una pelota en una red que divide el campo en dos mitades. El objetivo es pasar la pelota por encima de la red hacia el lado contrario."
                + "\nEquipos de seis jugadores: Cada equipo consta de seis jugadores en la cancha, divididos en tres posiciones en la red y tres en la zona de defensa."
                + "\nPuntos por contacto en el suelo contrario: Los equipos ganan puntos cuando logran que la pelota toque el suelo del campo contrario o cuando el equipo contrario comete una falta.\n");
        return Deporte2;
    }

    public void setDeporte2(String Deporte2) {
        this.Deporte2 = Deporte2;
    }

    public String getDeporte3() {
         JOptionPane.showMessageDialog(null, "Bienvenido a Basketball\nCaracterísticas:\nCanasta y pelota: El baloncesto se juega con una pelota que los jugadores intentan encestar en una canasta elevada. El objetivo es anotar puntos al encestar la pelota en la canasta del equipo contrario."
            + "\nCinco jugadores en la cancha: Cada equipo tiene cinco jugadores en la cancha a la vez, que desempeñan roles específicos, como bases, escoltas, aleros, alas-pívots y pívots."
            + "\nTiempo limitado y posesión de balón: El baloncesto se juega en períodos de tiempo limitado (generalmente 4 cuartos de 12 minutos en la NBA). Cada equipo tiene una posesión de balón para atacar antes de que se agote el tiempo de posesión, lo que fomenta un juego rápido y estratégico.");

        return Deporte3;
    }
 
    public void setDeporte3(String Deporte3) {
        this.Deporte3 = Deporte3;
    }


    public int getOpcDeporte() {
        return OpcDeporte;
    }

    public void setOpcDeporte(int OpcDeporte) {
        this.OpcDeporte = OpcDeporte;
    }

    public char getEstadoFut() {
        return estadoFut;
    }

    public void setEstadoFut(char estadoFut) {
        this.estadoFut = estadoFut;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

}
