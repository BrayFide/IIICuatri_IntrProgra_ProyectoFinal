/*Proyecto Introducción a la Programación
III Cuatrimestre
Estudiantes:
            Brayton Maccoy Artola
            Jean Paulo Monge Alfaro
            Jeremy Acuña Brenes
            

Profesor: Esteban Marín Chinchilla

 * 
 */
package Main;
import javax.swing.JOptionPane;

public class IngSisProyectoFinalV2 {

    public static void main(String[] args) {
      boolean continuar = true;
      AgregarConsultar agreconsul=new AgregarConsultar();
      
      while(continuar){
            
            int seleccion = (Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al Menú principal\n"
                  +"Escoga la opcion que desea ingresar \n1- Agregar Usuario\n2- Catalogo Padres\n3- Catalogo Deportistas\n4- Catalogo Deportes\n5- Catalogo Rutinas\n6- Salir"  )));
            
            switch (seleccion) {
                case 0:
                    continuar = false;
                    break;
            //Agregar usuario
                case 1:
                    continuar = false;

                    
                    //Datos de la cuenta en la clase #2
                    CatalogoPadre catPadre = new CatalogoPadre();
                    catPadre.setNombreCompletoPadre(JOptionPane.showInputDialog(null, "Digite el nombre completo del padre:"));
                    catPadre.setNombreNinoPadre(JOptionPane.showInputDialog(null, "Seleccione el niño del padre:"));
                    catPadre.setCiudadPadre(JOptionPane.showInputDialog(null, "Digite la ciudad del padre:"));
                    catPadre.setDireccionPadre(JOptionPane.showInputDialog(null, "Digite la dirección del padre:"));
                    catPadre.setTelefonoPadre(JOptionPane.showInputDialog(null, "Digite el teléfono del padre:"));
                    catPadre.setCorreoPadre(JOptionPane.showInputDialog(null, "Digite el correo del padre:"));
                    catPadre.setEstadoPadre(JOptionPane.showInputDialog(null, "Digite el estado del padre:"));

                    JOptionPane.showMessageDialog(null, "Has introducido correctamente los datos del padre, aquí están los datos:" +
                    "Nombre: " + catPadre.getNombreCompletoPadre() + "\n" + 
                    "Nombre del niño: " + catPadre.getNombreNinoPadre() + "\n" +
                    "Ciudad: " + catPadre.getCiudadPadre() + "\n" +
                    "Dirección: " + catPadre.getDireccionPadre() + "\n" +
                    "Teléfono: " + catPadre.getTelefonoPadre() + "\n" +
                    "Correo: " + catPadre.getCorreoPadre() + "\n" +
                    "Estado: " + catPadre.getEstadoPadre() + "\n");

                    

                    RegistroUsuarios regis=new RegistroUsuarios();
                        regis.setNombre(JOptionPane.showInputDialog(null,"Digite su nombre:"));
            regis.setPrimerApellido(JOptionPane.showInputDialog(null, "Digite su primer apellido:"));
            regis.setSegundoApellido(JOptionPane.showInputDialog(null,"Digite su segundo apellido:"));
            regis.setContraseña(JOptionPane.showInputDialog(null,"Digite su contraseña:"));

                    break;
                    

                case 2:
                   
                    continuar = false;

                    
                    //Datos de la cuenta en la clase #2
                    CatalogoDeportista catDepor = new CatalogoDeportista();
                    catDepor.setIdentificacionDeportista(JOptionPane.showInputDialog(null, "Digite el nombre completo del deportista:"));
                    catDepor.setNombreCompletoDeportista(JOptionPane.showInputDialog(null, "Seleccione el niño del deportista:"));
                    catDepor.setCiudadDeportista(JOptionPane.showInputDialog(null, "Digite la ciudad del deportista:"));
                    catDepor.setDireccionDeportista(JOptionPane.showInputDialog(null, "Digite la dirección del deportista:"));
                    catDepor.setTelefonoDeportista(JOptionPane.showInputDialog(null, "Digite el teléfono del deportista:"));
                    catDepor.setCorreoDeportista(JOptionPane.showInputDialog(null, "Digite el correo del deportista:"));
                    catDepor.setEstadoDeportista(JOptionPane.showInputDialog(null, "Digite el estado del deportista:"));

                    JOptionPane.showMessageDialog(null, "Has introducido correctamente los datos del deportista, aquí están los datos:" +
                    "Identificación: " + catDepor.getIdentificacionDeportista() + "\n" + 
                    "Nombre del niño: " + catDepor.getNombreCompletoDeportista() + "\n" +
                    "Ciudad: " + catDepor.getCiudadDeportista() + "\n" +
                    "Dirección: " + catDepor.getDireccionDeportista() + "\n" +
                    "Teléfono: " + catDepor.getTelefonoDeportista() + "\n" +
                    "Correo: " + catDepor.getCorreoDeportista() + "\n" +
                    "Estado: " + catDepor.getEstadoDeportista() + "\n");
                    

                    agreconsul.setAgregarConsultar(JOptionPane.showInputDialog(null,"En esta seccion puede agregar y consultar información A/C \n A: Agregar \n C: Consultar").charAt(0));

                    break;
                case 3:
                    
                    continuar = false;
                    agreconsul.setAgregarConsultar(JOptionPane.showInputDialog(null,"En esta seccion puede agregar y consultar información A/C \n A: Agregar \n C: Consultar").charAt(0));
                    break;
                    
                case 4:
            
                    continuar = false;
                    agreconsul.setAgregarConsultar(JOptionPane.showInputDialog(null,"En esta seccion puede agregar y consultar información A/C \n A: Agregar \n C: Consultar").charAt(0));
                    break;
                case 5:
                    agreconsul.setAgregarConsultar(JOptionPane.showInputDialog(null,"En esta seccion puede agregar y consultar información A/C \n A: Agregar \n C: Consultar").charAt(0));
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
