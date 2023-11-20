package Main;
import javax.swing.JOptionPane;

public class Menu {
    
    private byte opcion;
   
    public void mostrarMenu(){
        Rutina r=new Rutina();
        while(opcion!=0){ 
            opcion=Byte.parseByte(JOptionPane.showInputDialog(null, """
                ***MENÚ PRINCIPAL***

                1.Catálogo de Deportistas
                2.Catálogo de Padres
                3.Catálogo de Deportes
                4.Catálogo de Rutinas
                5.Facturación
                0.Salir

                Digite su opción:"""
            ));
            
            switch(opcion){
                case 1:{
                   r.SubmenuDeportista();
                   break;
                } 
                case 2:{
                   r.SubmenuPadre();
                   break;
                }
                case 3:{
                   r.SubMenuDeportes();
                   break;
                }
                case 4:{
                   r.SubMenuRutina();
                   break;
                }
                case 5:{
                   r.SubMenuFacturacion();
                   break;
                }
                case 0:{
                   System.exit(0);
                   break;
                }
                default:{
                   JOptionPane.showMessageDialog(null,"¡Opción incorrecta!");
                }
            }
        }
    }
    
}
