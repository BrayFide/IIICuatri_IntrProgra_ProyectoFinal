package Main;

import javax.swing.JOptionPane;

public class Arregloregistro {
    private RegistroUsuarios usuario[] = new RegistroUsuarios[10];
    private int indi = 0;
    public void SubmenuRegistro(){
       boolean continuar = true;
       while(continuar){
           RegistroUsuarios catRegistro = new RegistroUsuarios();
        char seleccion = JOptionPane.showInputDialog("1-Agregar Usuario nuevo \n 2- Consultar lista de usuarios \n 3- Salir").charAt(0);
        switch (seleccion) {

                case'1':

                    continuar = true;
                    catRegistro.setNombre(JOptionPane.showInputDialog(null, "Digite el nombre:"));
                    catRegistro.setPrimerApellido(JOptionPane.showInputDialog(null, "Digite su primer apellido:"));
                    catRegistro.setSegundoApellido(JOptionPane.showInputDialog(null, "Digite su segundo apellido:"));
                    catRegistro.setContraseña(JOptionPane.showInputDialog(null, "Digite su contraseña:"));
                    if (indi < usuario.length) {
                    usuario[indi] = catRegistro;
                    indi++; // Incrementa el índice
                    JOptionPane.showMessageDialog(null, "Has introducido correctamente los datos de tu nuevo usuario, aquí están los datos:" +
                        "Nombre: " + catRegistro.getNombre()+ "\n" +
                        "Primer apellido: " + catRegistro.getPrimerApellido() + "\n" +
                        "Segundo apellido: " + catRegistro.getSegundoApellido()+ "\n" +
                        "Contraseña: Tu contraseña ha sido tenido exito!!\n");

                 }else {
                    JOptionPane.showMessageDialog(null, "El inventario está lleno. No se pueden agregar más elementos.");
                }

                break;
               
              case '2':
                for (int y = 0; y < indi; y++) {
                   catRegistro= usuario[y];
                     JOptionPane.showMessageDialog(null, "Has introducido correctamente los datos de tu nuevo usuario, aquí están los datos:" +
                        "Nombre: " + catRegistro.getNombre()+ "\n" +
                        "Primer apellido: " + catRegistro.getPrimerApellido() + "\n" +
                        "Segundo apellido: " + catRegistro.getSegundoApellido()+ "\n" +
                        "Contraseña: Tu contraseña ha sido tenido exito!!\n");
                }
                break;
         }
       }
    }
    
}
