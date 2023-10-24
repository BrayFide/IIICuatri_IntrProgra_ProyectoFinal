/*Proyecto Introducción a la Programación
III Cuatrimestre
Estudiantes:
            Brayton Maccoy Artola
            
            

Profesor: Esteban Marín Chinchilla

 * 
 */
package Main;
import javax.swing.JOptionPane;

public class IngSisProyectoFinalV2 {

    public static void main(String[] args) {
      boolean continuar = true;
      
      
      while(continuar){
            
            int seleccion = (Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al Menú principal\n"
                  +"Escoga la opcion que desea ingresar \n1- Agregar Usuario\n2- Catalogo Padres\n3- Catalogo Deportistas\n4- Catalogo Deportes\n5- Catalogo Rutinas\n6- Salir"  )));
            
            switch (seleccion) {
                case 0:
                    continuar = false;
                    break;

                case 1:
                    continuar = false;
                    break;

                case 2:
                   
                    continuar = false;
                    break;
                case 3:
                    
                    continuar = false;
                    break;
                    
                case 4:
                    
                    continuar = false;
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Bienvenido al Catálogo de Rutinasl\n");
                    CatalogoRutinas cl1 = new CatalogoRutinas();
                    cl1.setNombreUsuario(JOptionPane.showInputDialog("Ingrese su nombre de usuario: "));
                    cl1.setContraseña(JOptionPane.showInputDialog("Ingrese su contaseña: "));
                    cl1.setDeporte(Integer.parseInt(JOptionPane.showInputDialog("Seleccione el deporte al que va ingresar \n1- Futball\n2- Basketball \n3- Volleyball")));
                    int deporte = cl1.getDeporte();
                    switch (deporte) {
                    
                        
                    case 0:
                    
                    break;   
                        
                    case 1:
                    JOptionPane.showMessageDialog(null, "Bienvenido a la Rutina de Futball\n");
                    cl1.getRutina();
                    break;

                    case 2:
                    JOptionPane.showMessageDialog(null, "Bienvenido a la rutina de Basketball\n");
                    cl1.getRutina2();
                    break;

                    case 3:
                    JOptionPane.showMessageDialog(null, "Bienvenido a la rutina de Volleybal\n");
                    cl1.getRutina3();
                    
                    break;
                    
                    default:
                    // Opción no válida
                    
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                    break;
                    
                    }
                   
                    
                    continuar = false;
                    break;

                default:
                    // Opción no válida
                    
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                    break;
            }
      }
    }
}
