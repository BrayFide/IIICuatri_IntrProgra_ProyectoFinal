package Main;

import javax.swing.JOptionPane;

public class Rutina {

    //Info de Padres
    private CatalogoPadre inventario[] = new CatalogoPadre[10];
    private int indice = 0;

    //Info de Rutinas
    private CatalogoRutinas rutinas[] = new CatalogoRutinas[10];
    private int x = 0;

    // Info De Deportes
    private CatalogoDeporte deps[] = new CatalogoDeporte[10];
    private int s = 0;

    // Registro usuario
    private RegistroUsuarios usuario[] = new RegistroUsuarios[10];
    private int indi = 0;

    // registro deportista
    static private CatalogoDeportista catDeporAll[] = new CatalogoDeportista[10];

    private Facturacion pagos[] = new Facturacion[10];
    private int numFacturas = 0;

    public void SubMenuFacturacion() {

        boolean continuar = true;

        while (continuar) {

            char seleccion = JOptionPane.showInputDialog("1-Hacer factura Nueva \n 2- Consultar Facturas \n 3- Salir").charAt(0);
            switch (seleccion) {

                case '1':

                    continuar = true;

                    Facturacion fact = new Facturacion();
                    JOptionPane.showMessageDialog(null, "Menú de Facturación");
                    String nombreUsuario = JOptionPane.showInputDialog("Ingrese el nombre del usuario:");

                    CatalogoDeporte usu = null;
                    for (CatalogoDeporte dep : deps) {
                        if (dep != null && dep.getNombreUsuario().equals(nombreUsuario)) {

                            fact.setNombre(dep.getNombreUsuario());
                            JOptionPane.showMessageDialog(null, "Usuario Registrado");

                            fact.setDeporte(dep.getEstaddo1());
                            double costo = 0;

                            switch (fact.getDeporte()) {
                                case "Deporte futball agregado":
                                    JOptionPane.showMessageDialog(null, "Cobro de $500");
                                    costo = 500;
                                    fact.setCosto(500);
                                    break;
                                case "Deporte Basketball agregado":
                                    JOptionPane.showMessageDialog(null, "Cobro de $1000");
                                    costo = 1000;
                                    fact.setCosto(1000);
                                    break;
                                case "Deporte Volleyball agregado":
                                    JOptionPane.showMessageDialog(null, "Cobro de $1500");
                                    costo = 1500;
                                    fact.setCosto(1500);
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Deporte no válido");
                                    return; // Salir del método si el deporte no es válido
                            }

                            fact.setFecha(JOptionPane.showInputDialog("Ingrese la fecha (Ejemplo: 2023-11-20)"));
                            fact.setHora(JOptionPane.showInputDialog("Ingrese la hora (Ejemplo: 14:30)"));
                            fact.setPagoRealizado(JOptionPane.showInputDialog("¿Se realizó el pago? (Si/No)"));

                            if (numFacturas < pagos.length) {

                                pagos[numFacturas] = fact;
                                numFacturas++;

                                /*private String Mes;
        private String Deporte;
        private int Pago;
        private String Nombre;
        private String Fecha;
        private String Hora;
        private String Rutina;*/
                                JOptionPane.showMessageDialog(null, "Factura Guardada"
                                        + "\nUsuario: " + fact.getNombre() + "\n"
                                        + "Deporte: " + fact.getDeporte() + "\n"
                                        + "Costo: " + fact.getCosto() + "\n"
                                        + "Fecha: " + fact.getFecha() + "\n"
                                        + "Hora: " + fact.getHora() + "\n"
                                        + "Pago Realizado?: " + fact.getPagoRealizado() + "\n");
                            } else {
                                JOptionPane.showMessageDialog(null, "No se pueden guardar más facturas. El arreglo está lleno.");
                            }
                            break;
                        }
                    }

                    if (usu == null) {
                        JOptionPane.showMessageDialog(null, "Usuario No encontrado");
                    }

                case '2':

                    for (int i = 0; i < numFacturas; i++) {
                        fact = pagos[i];
                        JOptionPane.showMessageDialog(null, "Factura Guardada"
                                + "\nUsuario: " + fact.getNombre() + "\n"
                                + "Deporte: " + fact.getDeporte() + "\n"
                                + "Costo: " + fact.getCosto() + "\n"
                                + "Fecha: " + fact.getFecha() + "\n"
                                + "Hora: " + fact.getHora() + "\n"
                                + "Pago Realizado?: " + fact.getPagoRealizado() + "\n");

                    }
                    break;

                case '3':

                    JOptionPane.showMessageDialog(null, "Volviendo al Menu Principal");
                    continuar = false;
break;
            }break;

        }

    }

    public void SubmenuDeportista() {

        boolean continuarDeportista = true;
        boolean existeDeportista = false;
        int x;
        int indice;

        indice = 0;

        while (continuarDeportista) {

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

                    catDeporAll[0] = catDepor;
                    existeDeportista = true;
                    indice = indice + 1;

                    break;

                case '2':
                    continuarDeportista = true;

                    JOptionPane.showMessageDialog(null, catDeporAll.length);

                    if (existeDeportista) {

                        for (x = 0; x < catDeporAll.length; x++) {

                            JOptionPane.showMessageDialog(null, "Has introducido correctamente los datos del deportista, aquí están los datos:"
                                    + "\nIdentificación: " + catDeporAll[x].getIdentificacionDeportista() + "\n"
                                    + "Nombre del niño: " + catDeporAll[x].getNombreCompletoDeportista() + "\n"
                                    + "Ciudad: " + catDeporAll[x].getCiudadDeportista() + "\n"
                                    + "Dirección: " + catDeporAll[x].getDireccionDeportista() + "\n"
                                    + "Teléfono: " + catDeporAll[x].getTelefonoDeportista() + "\n"
                                    + "Correo: " + catDeporAll[x].getCorreoDeportista() + "\n"
                                    + "Estado: " + catDeporAll[x].getEstadoDeportista() + "\n");
                        }

                    } else {

                        JOptionPane.showMessageDialog(null, "No existen deportistas en el catálogo, debes crear uno");

                    }

                    break;

                default: {
                    JOptionPane.showMessageDialog(null, "¡Opción incorrecta!");
                }

            }

        }

    }

    public void SubmenuRegistro() {
        boolean continuar = true;
        while (continuar) {
            RegistroUsuarios catRegistro = new RegistroUsuarios();
            char seleccion = JOptionPane.showInputDialog("1-Agregar Usuario nuevo \n 2- Consultar lista de usuarios \n 3- Salir").charAt(0);
            switch (seleccion) {

                case '1':

                    continuar = true;
                    catRegistro.setNombre(JOptionPane.showInputDialog(null, "Digite el nombre:"));
                    catRegistro.setPrimerApellido(JOptionPane.showInputDialog(null, "Digite su primer apellido:"));
                    catRegistro.setSegundoApellido(JOptionPane.showInputDialog(null, "Digite su segundo apellido:"));
                    catRegistro.setContraseña(JOptionPane.showInputDialog(null, "Digite su contraseña:"));
                    if (indi < usuario.length) {
                        usuario[indi] = catRegistro;
                        indi++; // Incrementa el índice
                        JOptionPane.showMessageDialog(null, "Has introducido correctamente los datos de tu nuevo usuario, aquí están los datos:"
                                + "Nombre: " + catRegistro.getNombre() + "\n"
                                + "Primer apellido: " + catRegistro.getPrimerApellido() + "\n"
                                + "Segundo apellido: " + catRegistro.getSegundoApellido() + "\n"
                                + "Contraseña: " + catRegistro.getContraseña());

                    } else {
                        JOptionPane.showMessageDialog(null, "El inventario está lleno. No se pueden agregar más elementos.");
                    }

                    break;

                case '2':
                    for (int y = 0; y < indi; y++) {
                        catRegistro = usuario[y];
                        JOptionPane.showMessageDialog(null, "Has introducido correctamente los datos de tu nuevo usuario, aquí están los datos:"
                                + "Nombre: " + catRegistro.getNombre() + "\n"
                                + "Primer apellido: " + catRegistro.getPrimerApellido() + "\n"
                                + "Segundo apellido: " + catRegistro.getSegundoApellido() + "\n"
                                + "Contraseña: " + catRegistro.getContraseña());
                    }
                    break;

                case '3':
                    continuar = false;

            }
        }
    }

    public void SubmenuPadre() {

        boolean continuar = true;

        while (continuar) {
            CatalogoPadre catPadre = new CatalogoPadre();
            char seleccion = JOptionPane.showInputDialog("1-Agregar Padre nuevo \n 2- Consultar lista de padres \n 3- Salir").charAt(0);
            switch (seleccion) {

                case '1':

                    continuar = true;

                    //Datos de la cuenta en la clase #2
                    catPadre.setNombreCompletoPadre(JOptionPane.showInputDialog(null, "Digite el nombre completo del padre:"));
                    catPadre.setNombreNinoPadre(JOptionPane.showInputDialog(null, "Seleccione el niño del padre:"));
                    catPadre.setCiudadPadre(JOptionPane.showInputDialog(null, "Digite la ciudad del padre:"));
                    catPadre.setDireccionPadre(JOptionPane.showInputDialog(null, "Digite la dirección del padre:"));
                    catPadre.setTelefonoPadre(JOptionPane.showInputDialog(null, "Digite el teléfono del padre:"));
                    catPadre.setCorreoPadre(JOptionPane.showInputDialog(null, "Digite el correo del padre:"));
                    catPadre.setEstadoPadre(JOptionPane.showInputDialog(null, "Digite el estado del padre:"));

                    if (indice < inventario.length) {
                        inventario[indice] = catPadre;
                        indice++; // Incrementa el índice
                        JOptionPane.showMessageDialog(null, "Has introducido correctamente los datos del padre, aquí están los datos:"
                                + "Nombre: " + catPadre.getNombreCompletoPadre() + "\n"
                                + "Nombre del niño: " + catPadre.getNombreNinoPadre() + "\n"
                                + "Ciudad: " + catPadre.getCiudadPadre() + "\n"
                                + "Dirección: " + catPadre.getDireccionPadre() + "\n"
                                + "Teléfono: " + catPadre.getTelefonoPadre() + "\n"
                                + "Correo: " + catPadre.getCorreoPadre() + "\n"
                                + "Estado: " + catPadre.getEstadoPadre() + "\n");
                    } else {
                        JOptionPane.showMessageDialog(null, "El inventario está lleno. No se pueden agregar más elementos.");
                    }

                    break;

                case '2':
                    // Display the information of all CatalogoPadre objects in inventario
                    for (int i = 0; i < indice; i++) {
                        catPadre = inventario[i];
                        JOptionPane.showMessageDialog(null, "Datos del Padre #" + (i + 1) + ":\n"
                                + "Nombre: " + catPadre.getNombreCompletoPadre() + "\n"
                                + "Nombre del niño: " + catPadre.getNombreNinoPadre() + "\n"
                                + "Ciudad: " + catPadre.getCiudadPadre() + "\n"
                                + "Dirección: " + catPadre.getDireccionPadre() + "\n"
                                + "Teléfono: " + catPadre.getTelefonoPadre() + "\n"
                                + "Correo: " + catPadre.getCorreoPadre() + "\n"
                                + "Estado: " + catPadre.getEstadoPadre() + "\n");
                    }
                    break;

                case '3':

                    JOptionPane.showMessageDialog(null, "Volviendo al Menu Principal");
                    continuar = false;

            }

        }
    }

    public String SubMenuRutina() {

        //private CatalogoRutinas rutinas[] = new CatalogoRutinas[3];
        //private int x = 0;    
        boolean continuar = true;

        while (continuar) {

            CatalogoRutinas cl1 = new CatalogoRutinas();

            char seleccion = JOptionPane.showInputDialog("1-Agregar Rutina \n 2- Consultar lista de Rutinas \n 3- Salir").charAt(0);

            switch (seleccion) {

                case '1':
                    continuar = true;
                    cl1.setDeporte(Integer.parseInt(JOptionPane.showInputDialog("Seleccione el deporte al que va ingresar \n1- Futball\n2- Basketball \n3- Volleyball")));
                    int deporte = cl1.getDeporte();

                    switch (deporte) {

                        case 1:

                            JOptionPane.showMessageDialog(null, "Bienvenido a la Rutina de Futball\n");
                            cl1.getRutina();
                            String est = JOptionPane.showInputDialog("Activar rutina? S/N");

                            cl1.setEstado(est.charAt(0));
                            cl1.setRut("Rutina de futball agregada");

                            cl1.setNombreUsuario(JOptionPane.showInputDialog("Ingrese su nombre de Usuario"));

                            if (cl1.getEstado() == 'S') {
                                if (x < rutinas.length) {
                                    rutinas[x] = cl1;
                                    x++;
                                    JOptionPane.showMessageDialog(null,
                                            "Usuario: " + cl1.getNombreUsuario() + "\n"
                                            + "Activo: " + cl1.getEstado() + "\n" + cl1.getRut());

                                } else {
                                    continuar = false;
                                }
                            }
                            break;

                        case 2:
                            JOptionPane.showMessageDialog(null, "Bienvenido a la Rutina de Basketball\n");
                            cl1.getRutina2();
                            String est2 = JOptionPane.showInputDialog("Activar rutina? S/N");

                            cl1.setEstado(est2.charAt(0));
                            cl1.setRut("Rutina de Basketball agregada");
                            cl1.setNombreUsuario(JOptionPane.showInputDialog("Ingrese su nombre de Usuario"));

                            if (cl1.getEstado() == 'S') {
                                if (x < rutinas.length) {
                                    rutinas[x] = cl1;
                                    x++;
                                    JOptionPane.showMessageDialog(null,
                                            "Usuario: " + cl1.getNombreUsuario() + "\n"
                                            + "Activo: " + cl1.getEstado() + "\n" + cl1.getRut());

                                } else {
                                    continuar = false;
                                }
                            }
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "Bienvenido a la Rutina de Futball\n");
                            cl1.getRutina3();
                            String est3 = JOptionPane.showInputDialog("Activar rutina? S/N");

                            cl1.setEstado(est3.charAt(0));
                            cl1.setRut("Rutina de Volleyball agregada");
                            cl1.setNombreUsuario(JOptionPane.showInputDialog("Ingrese su nombre de Usuario"));

                            if (cl1.getEstado() == 'S') {
                                if (x < rutinas.length) {
                                    rutinas[x] = cl1;
                                    x++;
                                    JOptionPane.showMessageDialog(null,
                                            "Usuario: " + cl1.getNombreUsuario() + "\n"
                                            + "Activo: " + cl1.getEstado() + "\n" + cl1.getRut());

                                } else {
                                    continuar = false;
                                }
                            }
                            break;
                    }
                    break;

                case '2':

                    for (int b = 0; b < x; b++) {

                        cl1 = rutinas[b];
                        JOptionPane.showMessageDialog(null, "Datos del "
                                + "Usuario: " + rutinas[b].getNombreUsuario() + "\n"
                                + "Activo: " + rutinas[b].getEstado() + "\n" + "Rutina: " + rutinas[b].getRut());
                    }

                    break;

                case '3':
                    JOptionPane.showMessageDialog(null, "Volviendo al Menu Principal");
                    continuar = false;
                    break;
            }

        }
        return null;
    }

    public void SubMenuDeportes() {

        /* private CatalogoDeporte deps[] = new CatalogoDeporte[10];
    private int s = 0;*/
        boolean continuar = true;

        while (continuar == true) {

            CatalogoDeporte clx = new CatalogoDeporte();
            JOptionPane.showMessageDialog(null, "Bienvenido al Catálogo de Deportes\n");

            char seleccion = JOptionPane.showInputDialog("1-Agregar Deporte \n 2- Consultar Deportes \n 3- Salir").charAt(0);

            switch (seleccion) {

                case '1':

                    continuar = true;
                    int deporte = (Integer.parseInt(JOptionPane.showInputDialog("Seleccione el deporte al que va ingresar \n1- Futball\n2- Basketball \n3- Volleyball")));
                    switch (deporte) {

                        case 1:
                            JOptionPane.showMessageDialog(null, "Bienvenido al deporte de Futball\n");
                            clx.getDeporte1();
                            //Activar o desactivar

                            clx.setEstadoFut(JOptionPane.showInputDialog("Activar deporte? S/N").charAt(0));
                            clx.setEstaddo1("Deporte futball agregado");
                            clx.setNombreUsuario(JOptionPane.showInputDialog("Ingrese su nombre de Usuario"));

                            if (clx.getEstadoFut() == 'S') {
                                if (s < deps.length) {
                                    deps[s] = clx;
                                    s++;
                                    JOptionPane.showMessageDialog(null, "Deporte Futball Agregado\n"
                                            + "Usuario: " + clx.getNombreUsuario() + "\n"
                                            + clx.getEstaddo1() + "\n" + "Activado?: " + clx.getEstadoFut());

                                } else {
                                    continuar = false;
                                }
                            }
                            break;

                        case 2:
                            JOptionPane.showMessageDialog(null, "Bienvenido al deporte de Basketball\n");
                            clx.getDeporte3();
                            //Activar o desactivar

                            clx.setEstadoFut(JOptionPane.showInputDialog("Activar deporte? S/N").charAt(0));
                            clx.setEstaddo1("Deporte Basketball agregado");
                            clx.setNombreUsuario(JOptionPane.showInputDialog("Ingrese su nombre de Usuario"));

                            if (clx.getEstadoFut() == 'S') {
                                if (s < deps.length) {
                                    deps[s] = clx;
                                    s++;
                                    JOptionPane.showMessageDialog(null, "Deporte Basketball Agregado\n"
                                            + "Usuario: " + clx.getNombreUsuario() + "\n"
                                            + clx.getEstaddo1() + "\n" + "Activado?: " + clx.getEstadoFut());

                                } else {
                                    continuar = false;
                                }
                            }
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "Bienvenido al deporte de Volleyball\n");
                            clx.getDeporte2();
                            //Activar o desactivar

                            clx.setEstadoFut(JOptionPane.showInputDialog("Activar deporte? S/N").charAt(0));
                            clx.setEstaddo1("Deporte Volleyball agregado");
                            clx.setNombreUsuario(JOptionPane.showInputDialog("Ingrese su nombre de Usuario"));

                            if (clx.getEstadoFut() == 'S') {
                                if (s < deps.length) {
                                    deps[s] = clx;
                                    s++;
                                    JOptionPane.showMessageDialog(null, "Deporte Volleyball Agregado\n"
                                            + "Usuario: " + clx.getNombreUsuario() + "\n"
                                            + clx.getEstaddo1() + "\n" + "Activado?: " + clx.getEstadoFut());

                                } else {
                                    continuar = false;
                                }
                            }
                            break;

                    }
                    break;

                case '2':
                    continuar = true;
                    for (int y = 0; y < s; y++) {
                        clx = deps[y];
                        JOptionPane.showMessageDialog(null, "Datos del "
                                + "Usuario: " + deps[y].getNombreUsuario() + "\n"
                                + "Activo: " + deps[y].getEstaddo1() + "\n" + "Activado?: " + deps[y].getEstadoFut());
                    }
                    break;

                case '3':
                    JOptionPane.showMessageDialog(null, "Volviendo al Menu Principal");
                    continuar = false;
                    break;
            }
        }
    }

}
