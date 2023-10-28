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
        
        Login cly = new Login();
   cly.setUsuario(JOptionPane.showInputDialog("Ingrese su nombre de usuario"));
   cly.setContraseña(JOptionPane.showInputDialog("Ingrese su contraseña"));
        boolean continuar = true;

        while (continuar) {

            int seleccion = (Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al Menú principal\n"
                    + "Escoga la opcion que desea ingresar \n1- Agregar Usuario\n2- Catalogo Padres\n3- Catalogo Deportistas\n4- Catalogo Deportes\n5- Catalogo Rutinas\n6-Facturacion\n7- Salir")));

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
                    JOptionPane.showMessageDialog(null, "Bienvenido al Catálogo de Deportes\n");
                    CatalogoDeporte clx = new CatalogoDeporte();
                    clx.setOpcDeporte(Integer.parseInt(JOptionPane.showInputDialog("Seleccione el deporte al que va ingresar \n1- Futball\n2-Volleyball  \n3-Basketball")));
                    int opcdeporte = clx.getOpcDeporte();

                    switch (opcdeporte) {

                        case 0:

                            break;

                        case 1:
                            JOptionPane.showMessageDialog(null, "Bienvenido al deporte de Futball\n");
                            clx.getDeporte1();
                            //Activar o desactivar
                            clx.setEstaddo1(JOptionPane.showInputDialog("Activar deporte? S/N"));
                            String estadoFut = clx.getEstaddo1();

                            switch (estadoFut) {

                                case "S":
                                    JOptionPane.showMessageDialog(null, "Deporte Futball Activado en su cuenta\n");
                                    break;

                                case "N":
                                    JOptionPane.showMessageDialog(null, "Estado Desactivado");

                                    break;

                                default:
                                    // Opción no válida

                                    JOptionPane.showMessageDialog(null, "Opción no válida");
                                    break;

                            }

                            break;

                        case 2:
                            JOptionPane.showMessageDialog(null, "Bienvenido al deporte de Volleyball\n");
                            clx.getDeporte2();
                            //Activar o desactivar
                            clx.setEstaddo2(JOptionPane.showInputDialog("Activar deporte? S/N"));
                            String estadoVoll = clx.getEstaddo2();

                            switch (estadoVoll) {

                                case "S":
                                    JOptionPane.showMessageDialog(null, "Deporte Volleyball Activado en su cuenta\n");
                                    //Agregar Ver rutina
                                    break;

                                case "N":
                                    JOptionPane.showMessageDialog(null, "Estado Desactivado");

                                    break;

                                default:
                                    // Opción no válida

                                    JOptionPane.showMessageDialog(null, "Opción no válida");
                                    break;

                            }

                            break;

                        case 3:
                            JOptionPane.showMessageDialog(null, "Bienvenido al deporte de Basketball\n");
                            clx.getDeporte3();
                            //Activar o desactivar
                            clx.setEstaddo3(JOptionPane.showInputDialog("Activar deporte? S/N"));
                            String estadoBask = clx.getEstaddo3();

                            switch (estadoBask) {

                                case "S":
                                    JOptionPane.showMessageDialog(null, "Deporte Basketball Activado en su cuenta\n");
                                    break;

                                case "N":
                                    JOptionPane.showMessageDialog(null, "Estado Desactivado");

                                    break;

                                default:
                                    // Opción no válida

                                    JOptionPane.showMessageDialog(null, "Opción no válida");
                                    break;

                            }

                            break;
                    }
                    continuar = false;
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, "Bienvenido al Catálogo de Rutinas\n");
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
                
                case 6:
                    
                    Facturacion clr = new Facturacion();
                    clr.setMes(JOptionPane.showInputDialog("Ingrese Mes de Pago"));
                    clr.setDeporte(JOptionPane.showInputDialog("Ingrese Deporte activos"));
                    clr.setPago(Integer.parseInt(JOptionPane.showInputDialog("Ingrese monto a pagar")));
                    JOptionPane.showMessageDialog(null, "Gracias Por su pago");

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
