package Main;
import javax.swing.JOptionPane;

public class Rutina {

    static private CatalogoPadre catPadreAll[]=new CatalogoPadre[1]; 
    static private CatalogoDeportista catDeporAll[]=new CatalogoDeportista[1]; 
    
    public void SubmenuPadre(){
        
        boolean continuarPadre = true;
        boolean existePadre = false;
        int x;
      
        while(continuarPadre){

            char seleccionPadre = (JOptionPane.showInputDialog("1- Agregar Padre\n2- Consultar lista de Padres\n0- Salir").charAt(0));

            switch (seleccionPadre) {
                case '0':
                    continuarPadre = false;
                    break;

                case '1':
                    continuarPadre = true;

                    //Datos de la cuenta en la clase #2
                    CatalogoPadre catPadre = new CatalogoPadre();
                    catPadre.setNombreCompletoPadre(JOptionPane.showInputDialog(null, "Digite el nombre completo del padre:"));
                    catPadre.setNombreNinoPadre(JOptionPane.showInputDialog(null, "Seleccione el niño del padre:"));
                    catPadre.setCiudadPadre(JOptionPane.showInputDialog(null, "Digite la ciudad del padre:"));
                    catPadre.setDireccionPadre(JOptionPane.showInputDialog(null, "Digite la dirección del padre:"));
                    catPadre.setTelefonoPadre(JOptionPane.showInputDialog(null, "Digite el teléfono del padre:"));
                    catPadre.setCorreoPadre(JOptionPane.showInputDialog(null, "Digite el correo del padre:"));
                    catPadre.setEstadoPadre(JOptionPane.showInputDialog(null, "Digite el estado del padre:"));

                    catPadreAll[0]=catPadre;
                    existePadre = true;

                    break;

                case '2':
                    continuarPadre = true;

                    JOptionPane.showMessageDialog(null, existePadre);

                    if(existePadre){

                        for(x=0;x<catPadreAll.length;x++){

                            JOptionPane.showMessageDialog(null, "Has introducido correctamente los datos del padre, aquí están los datos:\n" +
                                "Nombre: " + catPadreAll[x].getNombreCompletoPadre() + "\n" + 
                                "Nombre del niño: " + catPadreAll[x].getNombreNinoPadre() + "\n" +
                                "Ciudad: " + catPadreAll[x].getCiudadPadre() + "\n" +
                                "Dirección: " + catPadreAll[x].getDireccionPadre() + "\n" +
                                "Teléfono: " + catPadreAll[x].getTelefonoPadre() + "\n" +
                                "Correo: " + catPadreAll[x].getCorreoPadre() + "\n" +
                                "Estado: " + catPadreAll[x].getEstadoPadre() + "\n");
                        }

                    }else{

                        JOptionPane.showMessageDialog(null, "No existe padres en el catálogo, debes crear uno");

                    }

                    break;
                    
                default:{
                   JOptionPane.showMessageDialog(null,"¡Opción incorrecta!");
                }
            }

        }
    
    }
    
    public void SubmenuDeportista(){
        
        boolean continuarDeportista = true;
        boolean existeDeportista = false;
        int x;
        int indice;
        
        indice = 0;
      
        while(continuarDeportista){

            char seleccionDeportista = (JOptionPane.showInputDialog("1- Agregar Deportista\n2- Consultar lista de Deportista\n0- Salir").charAt(0));

            switch (seleccionDeportista) {
                case '0':
                    continuarDeportista = false;
                    break;

                case '1':
                    continuarDeportista = true;

                    //Datos de la cuenta en la clase #2
                    CatalogoDeportista catDepor = new CatalogoDeportista();
                    catDepor.setIdentificacionDeportista(JOptionPane.showInputDialog(null, "Digite el identificación del deportista:"));
                    catDepor.setNombreCompletoDeportista(JOptionPane.showInputDialog(null, "Digite el nombre completo del deportista:"));
                    catDepor.setCiudadDeportista(JOptionPane.showInputDialog(null, "Digite la ciudad del deportista:"));
                    catDepor.setDireccionDeportista(JOptionPane.showInputDialog(null, "Digite la dirección del deportista:"));
                    catDepor.setTelefonoDeportista(JOptionPane.showInputDialog(null, "Digite el teléfono del deportista:"));
                    catDepor.setCorreoDeportista(JOptionPane.showInputDialog(null, "Digite el correo del deportista:"));
                    catDepor.setEstadoDeportista(JOptionPane.showInputDialog(null, "Digite el estado del deportista:"));

                    catDeporAll[0]=catDepor;
                    existeDeportista = true;
                    indice = indice + 1;

                    break;

                case '2':
                    continuarDeportista = true;

                    JOptionPane.showMessageDialog(null, catDeporAll.length);

                    if(existeDeportista){

                        for(x=0;x<catDeporAll.length;x++){

                            JOptionPane.showMessageDialog(null, "Has introducido correctamente los datos del deportista, aquí están los datos:" +
                                "\nIdentificación: " + catDeporAll[x].getIdentificacionDeportista() + "\n" + 
                                "Nombre del niño: " + catDeporAll[x].getNombreCompletoDeportista() + "\n" +
                                "Ciudad: " + catDeporAll[x].getCiudadDeportista() + "\n" +
                                "Dirección: " + catDeporAll[x].getDireccionDeportista() + "\n" +
                                "Teléfono: " + catDeporAll[x].getTelefonoDeportista() + "\n" +
                                "Correo: " + catDeporAll[x].getCorreoDeportista() + "\n" +
                                "Estado: " + catDeporAll[x].getEstadoDeportista() + "\n");
                        }

                    }else{

                        JOptionPane.showMessageDialog(null, "No existen deportistas en el catálogo, debes crear uno");

                    }

                    break;
                    
                default:{
                   JOptionPane.showMessageDialog(null,"¡Opción incorrecta!");
                }
                    
            }
            
            

        }
    
    }

}
