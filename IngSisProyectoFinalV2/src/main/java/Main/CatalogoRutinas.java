
package Main;
import javax.swing.JOptionPane;
public class CatalogoRutinas {
    private int Deporte;
    private String NombreUsuario;
    private String contraseña;
    private String Rutina;
    private String Rutina2;
    private String Rutina3;
    private String rut;
    private char estado;

    public CatalogoRutinas() {
        this.Deporte = 0;
        this.NombreUsuario = "Pepe";
        this.contraseña ="" ;
        this.Rutina = "";
        this.Rutina2 = "";
        this.Rutina3 = "";
        this.rut = "";
        this.estado= 'S';
        
        
        
    }

    public int getDeporte() {
        return Deporte;
    }

    public void setDeporte(int Deporte) {
        this.Deporte = Deporte;
    }

    

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRutina() {
        String rutinaFutbol = "Rutina de entrenamiento para fútbol:\n\n" +
                "Entrenamiento de fuerza y resistencia:\n" +
                "1. Sentadillas: 3 series de 10-12 repeticiones.\n" +
                "2. Flexiones (push-ups): 3 series de 10-12 repeticiones.\n" +
                "3. Zancadas (lunges): 3 series de 10-12 repeticiones por pierna.\n" +
                "4. Plancha abdominal: 3 series de 30-60 segundos.\n\n" +
                "Entrenamiento de agilidad y velocidad:\n" +
                "1. Carrera en zigzag.\n" +
                "2. Entrenamiento de sprint: 6-8 sprints de 30-40 metros.\n\n" +
                "Entrenamiento de resistencia cardiovascular:\n" +
                "1. Carrera continua: Corre durante 20-30 minutos a un ritmo constante.\n" +
                "2. Entrenamiento en intervalos: Corre a máxima velocidad durante 30 segundos, seguido de 1-2 minutos de recuperación, repite 5-8 veces.";

        JOptionPane.showMessageDialog(null, rutinaFutbol, "Rutina de entrenamiento para fútbol", JOptionPane.INFORMATION_MESSAGE);
        return Rutina;
    }

    public void setRutina(String Rutina) {
        this.Rutina = Rutina;
    }

    public String getRutina2() {
        String rutinaBaloncesto = "Rutina de entrenamiento para baloncesto:\n\n" +
                "Entrenamiento de fuerza y resistencia:\n" +
                "1. Sentadillas: 3 series de 10-12 repeticiones.\n" +
                "2. Flexiones (push-ups): 3 series de 10-12 repeticiones.\n" +
                "3. Levantamiento de pesas rusas o mancuernas: 3 series de 10-12 repeticiones.\n" +
                "4. Plancha abdominal: 3 series de 30-60 segundos.\n\n" +
                "Entrenamiento de agilidad y velocidad:\n" +
                "1. Ejercicios de dribbling y cambios de dirección.\n" +
                "2. Saltos verticales: 3 series de 10 repeticiones.\n" +
                "3. Carrera de intervalos: 8-10 sprints de 30 metros.\n\n" +
                "Entrenamiento de resistencia cardiovascular:\n" +
                "1. Carrera continua: Corre durante 20-30 minutos a un ritmo constante.\n" +
                "2. Entrenamiento en intervalos: Corre a máxima velocidad durante 30 segundos, seguido de 1-2 minutos de recuperación, repite 5-8 veces.";

        JOptionPane.showMessageDialog(null, rutinaBaloncesto, "Rutina de entrenamiento para baloncesto", JOptionPane.INFORMATION_MESSAGE);
        return Rutina2;
    }

    public void setRutina2(String Rutina2) {
        this.Rutina2 = Rutina2;
    }

    public String getRutina3() {
         String rutinaVoleibol = "Rutina de entrenamiento para voleibol:\n\n" +
                "Entrenamiento de fuerza y resistencia:\n" +
                "1. Sentadillas: 3 series de 10-12 repeticiones.\n" +
                "2. Flexiones (push-ups): 3 series de 10-12 repeticiones.\n" +
                "3. Zancadas (lunges): 3 series de 10-12 repeticiones por pierna.\n" +
                "4. Plancha abdominal: 3 series de 30-60 segundos.\n\n" +
                "Entrenamiento de agilidad y velocidad:\n" +
                "1. Ejercicios de salto vertical.\n" +
                "2. Carrera de agilidad: 8-10 carreras en zigzag.\n" +
                "3. Saltos laterales: 3 series de 10 repeticiones.\n\n" +
                "Entrenamiento de resistencia cardiovascular:\n" +
                "1. Carrera continua: Corre durante 20-30 minutos a un ritmo constante.\n" +
                "2. Entrenamiento en intervalos: Corre a máxima velocidad durante 30 segundos, seguido de 1-2 minutos de recuperación, repite 5-8 veces.";
        return Rutina3;
        
    }

    public void setRutina3(String Rutina3) {
        this.Rutina3 = Rutina3;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
    
    
          
    
     
}
