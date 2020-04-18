package AgenciaInmoviliaria.Principal;

import AgenciaInmoviliaria.Clases.Contrato;
import AgenciaInmoviliaria.Clases.Inmueble;
import AgenciaInmoviliaria.Clases.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static ArrayList<Persona> listaPersona = new ArrayList<>();
    public static ArrayList<Inmueble> listaInmueble = new ArrayList<>();
    public static ArrayList<Contrato> listaContrato = new ArrayList<>();
    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        datos();
        int respuesta=20;
        do{
            System.out.println("*****************Menu*****************");
            System.out.println("1.Persona");
            System.out.println("2.Inmueble");
            System.out.println("3.Contrato");
            System.out.println("0.Salir");
            System.out.print("Ingrese el indicador:");
            respuesta= Integer.parseInt(leer.nextLine());

            switch(respuesta) {
                case 1:
                    persona();
                    break;
                case 2:
                    inmueble();
                    break;
                case 3:
                    contrato();
                    break;
                case 0:
                    respuesta=0;
                    break;
                default:
                    respuesta =20;
                    break;
            }
        }while(respuesta!=0);
    }

    public static void persona () {
        int respuesta=20;
        do{
            System.out.println("*****************Persona*****************");
            System.out.println("1.Crear");
            System.out.println("2.Editar");
            System.out.println("3.Eliminar");
            System.out.println("4.Ver");
            System.out.println("0.Salir");
            System.out.print("Ingrese el indicador:");
            respuesta= Integer.parseInt(leer.nextLine());
            String nombre="";
            String apellido="";
            int cedula=0;
            int tipo=5;

            switch(respuesta) {
                case 1:
                    System.out.println("*****************Crear Persona*****************");
                    System.out.print("1.Nombre:");
                    nombre=leer.nextLine();
                    System.out.print("2.Apellido:");
                    apellido=leer.nextLine();
                    cedula=0;
                    boolean estado;
                    do {
                        System.out.print("3.Cedula:");
                        estado=false;
                        try {
                            cedula=Integer.parseInt(leer.nextLine());
                            estado=true;
                        } catch (Exception e) {
                            System.out.println("Error");
                            estado=false;
                        }
                    }while(estado!=true);
                    do {
                        System.out.print("4.Tipo(0=>Propietario/1=>Inquilino):");
                        estado=false;
                        try {
                            tipo=Integer.parseInt(leer.nextLine());
                            estado=true;
                        } catch (Exception e) {
                            System.out.println("Error");
                            estado=false;
                        }

                    }while(estado!=true);

                    Persona persona = new Persona(nombre,apellido,cedula,tipo);
                    listaPersona.add(persona);
                    break;

                case 2:
                    System.out.println("*****************Editar Persona*****************");
                    imprimirPersonas();
                    System.out.print("Ingrese el indice de la persona a modificar:");
                    int indice=Integer.parseInt(leer.nextLine());
                    System.out.println("");
                    System.out.println("1. Nombre:"+listaPersona.get(indice).getNombre());
                    System.out.println("2. Apellido:"+listaPersona.get(indice).getApellido());
                    System.out.println("3. Cedula:"+listaPersona.get(indice).getCedula());
                    System.out.println("4. Tipo(0=>Propietario/1=>Inquilino):"+listaPersona.get(indice).getTipo());
                    System.out.print("Ingrese el indice de la persona a modificar:");
                    respuesta=Integer.parseInt(leer.nextLine());

                    switch(respuesta) {
                        case 1:
                            System.out.print("1.Nombre:");
                            nombre=leer.nextLine();
                            listaPersona.get(indice).setNombre(nombre);
                            break;
                        case 2:
                            System.out.print("2.Apellido:");
                            apellido=leer.nextLine();
                            listaPersona.get(indice).setApellido(apellido);
                            break;
                        case 3:
                            do {
                                System.out.print("3.Cedula:");
                                estado=false;
                                try {
                                    cedula=Integer.parseInt(apellido=leer.nextLine());
                                    estado=true;
                                } catch (Exception e) {
                                    System.out.println("Error");
                                    estado=false;
                                }
                            }while(estado!=true);
                            listaPersona.get(indice).setCedula(cedula);
                            break;
                        case 4:
                            do {
                                System.out.print("4.Tipo(0=>Propietario/1=>Inquilino):");
                                estado=false;
                                try {
                                    tipo=Integer.parseInt(apellido=leer.nextLine());
                                    estado=true;
                                } catch (Exception e) {
                                    System.out.println("Error");
                                    estado=false;
                                }

                            }while(estado!=true);
                            listaPersona.get(indice).setTipo(tipo);
                            break;
                        default:
                            System.out.println("No se realizo ninguna accion");
                    }
                    break;
                case 3:
                    System.out.println("*****************Eliminar Persona*****************");
                    imprimirPersonas();
                    System.out.print("Ingrese el indice de la persona a eliminar:");
                    indice=Integer.parseInt(leer.nextLine());
                    listaPersona.remove(indice);
                    System.out.println("***Persona eliminada***");
                    break;
                case 4:
                    System.out.println("*****************Ver Personas*****************");
                    imprimirPersonas();
                    break;
                case 0:
                    respuesta=0;
                    break;
                default:
                    respuesta =20;
                    break;
            }
        }while(respuesta!=0);
    }

    public static void imprimirPersonas () {
        for(int i=0; i<listaPersona.size();i++) {
            System.out.println("Indice:"+i );
            System.out.println("1. Nombre:"+listaPersona.get(i).getNombre());
            System.out.println("2. Apellido:"+listaPersona.get(i).getApellido());
            System.out.println("3. Cedula:"+listaPersona.get(i).getCedula());
            System.out.println("4. Tipo(0=>Propietario/1=>Inquilino):"+listaPersona.get(i).getTipo());
            System.out.println("");
        }
    }

    public static void inmueble () {
        int respuesta=20;
        do{
            System.out.println("*****************Inmueble*****************");
            System.out.println("1.Crear");
            System.out.println("2.Editar");
            System.out.println("3.Eliminar");
            System.out.println("4.Ver");
            System.out.println("0.Salir");
            System.out.print("Ingrese el indicador:");
            respuesta= Integer.parseInt(leer.nextLine());
            String nombre="";
            String idInmueble="";
            int cedulaPropietario=0;
            String direcionImnueble="";

            switch(respuesta) {
                case 1:
                    System.out.println("*****************Crear Inmueble*****************");
                    System.out.print("1.Nombre Propietario:");
                    nombre=leer.nextLine();
                    System.out.print("2.Id Inmueble:");
                    idInmueble=leer.nextLine();
                    cedulaPropietario=0;
                    boolean estado;
                    do {
                        System.out.print("3.Cedula Propietario:");
                        estado=false;
                        try {
                            cedulaPropietario=Integer.parseInt(leer.nextLine());
                            estado=true;
                        } catch (Exception e) {
                            System.out.println("Error");
                            estado=false;
                        }
                    }while(estado!=true);
                    System.out.print("4.Direcion Inmueble:");
                    direcionImnueble=(leer.nextLine());
                    Inmueble inmueble = new Inmueble(nombre, idInmueble,direcionImnueble,cedulaPropietario);
                    listaInmueble.add(inmueble);
                    break;
                case 2:
                    System.out.println("*****************Editar Inmueble*****************");
                    imprimirInmueble();
                    System.out.print("Ingrese el indice del inmueble a modificar:");
                    int indice=Integer.parseInt(leer.nextLine());
                    System.out.println("");
                    System.out.println("1. Nombre Propietario:"+listaInmueble.get(indice).getNombrePropietario());
                    System.out.println("2. Id Inmueble:"+listaInmueble.get(indice).getIdInmueble());
                    System.out.println("3. Direccion Inmueble:"+listaInmueble.get(indice).getDireccion());
                    System.out.println("4. Cedula Propietario:"+listaInmueble.get(indice).getCedulaPropietario());
                    System.out.print("Ingrese el indice de la persona a modificar:");
                    respuesta=Integer.parseInt(leer.nextLine());

                    switch(respuesta) {
                        case 1:
                            System.out.print("1.Nombre Propietario:");
                            nombre=leer.nextLine();
                            listaInmueble.get(indice).setNombrePropietario(nombre);
                            break;
                        case 2:
                            System.out.print("2.Id Inmueble:");
                            idInmueble=leer.nextLine();
                            listaInmueble.get(indice).setIdInmueble(idInmueble);
                            break;
                        case 4:
                            do {
                                System.out.print("4.Cedula Propietario:");
                                estado=false;
                                try {
                                    cedulaPropietario=Integer.parseInt(leer.nextLine());
                                    estado=true;
                                } catch (Exception e) {
                                    System.out.println("Error");
                                    estado=false;
                                }
                            }while(estado!=true);
                            listaInmueble.get(indice).setCedulaPropietario(cedulaPropietario);
                            break;
                        case 3:
                            System.out.print("3.Direccion Inmueble:");
                            direcionImnueble=leer.nextLine();
                            listaInmueble.get(indice).setDireccion(direcionImnueble);
                            break;
                        default:
                            System.out.println("No se realizo ninguna accion");
                    }
                    break;
                case 3:
                    System.out.println("*****************Eliminar Inmueble*****************");
                    imprimirInmueble();
                    System.out.print("Ingrese el indice del inmueble a eliminar:");
                    indice=Integer.parseInt(leer.nextLine());
                    listaInmueble.remove(indice);
                    System.out.println("***Inmueble eliminado***");
                    break;
                case 4:
                    System.out.println("*****************Ver Inmuebles*****************");
                    imprimirInmueble();
                    break;
                case 0:
                    respuesta=0;
                    break;
                default:
                    respuesta =20;
                    break;
            }
        }while(respuesta!=0);
    }

    public static void imprimirInmueble () {
        for(int i=0; i<listaInmueble.size();i++) {
            System.out.println("Indice:"+i );
            System.out.println("1. Nombre Propietario:"+listaInmueble.get(i).getNombrePropietario());
            System.out.println("2. Id Inmueble:"+listaInmueble.get(i).getIdInmueble());
            System.out.println("3. Direccion Inmueble:"+listaInmueble.get(i).getDireccion());
            System.out.println("4. Cedula Propietario:"+listaInmueble.get(i).getCedulaPropietario());
            System.out.println("");
        }
    }

    public static void contrato () {
        int respuesta=20;
        do{
            System.out.println("*****************Contrato*****************");
            System.out.println("1.Crear");
            System.out.println("2.Eliminar");
            System.out.println("3.Ver");
            System.out.println("0.Salir");
            System.out.print("Ingrese el indicador:");
            respuesta= Integer.parseInt(leer.nextLine());
            String nombrePropietario="";
            int cedulaPropietario=0;
            String nombreinquilino="";
            int cedulaInquilino=0;
            String direccionInmueble="";
            String idInmueble="";
            double precio=0;
            int duracion=0;
            boolean estado=false;
            int posicionPropietario=0;
            int posicionInquilino=0;
            int posicionInmueble=0;

            switch(respuesta){
                case 1:
                    System.out.println("*****************Crear Contrato*****************");
                    do{
                        System.out.print("1.Nombre Propietario:");
                        nombrePropietario=leer.nextLine();
                        estado=false;

                        for(int i=0; i<listaPersona.size();i++) {
                            if(listaPersona.get(i).getNombre().equals(nombrePropietario) && listaPersona.get(i).getTipo()==0) {
                                posicionPropietario=i;
                                estado=true;
                                break;
                            }
                            else{
                                estado=false;
                            }
                        }
                        if(estado==false){System.out.println("-------------La persona no existe o no es propietaria o ingreso mal el nombre-------------");}
                    }while(estado!=true);
                    do {
                        System.out.print("2.Cedula Propietario:");
                        estado=false;
                        try {
                            cedulaPropietario=Integer.parseInt(leer.nextLine());
                            estado=true;
                            if(cedulaPropietario!=listaPersona.get(posicionPropietario).getCedula())
                            {
                                estado=false;
                                System.out.println("La cedula no coincide con el nombre del propietario");
                            }

                        } catch (Exception e) {
                            System.out.println("Error");
                            estado=false;
                        }
                    }while(estado!=true);
                    do {
                        System.out.print("3.Nombre Inquilino:");
                        nombreinquilino=leer.nextLine();
                        for(int i=0; i<listaPersona.size();i++) {
                            if(listaPersona.get(i).getNombre().equals(nombreinquilino) && listaPersona.get(i).getTipo()==1) {
                                posicionInquilino=i;
                                estado=true;
                                break;
                            }
                            else{
                                estado=false;
                            }
                        }
                        if(estado==false){System.out.println("-------------La persona no existe o no es inquilino o ingreso mal el nombre-------------");}
                    }while(estado!=true);
                    do {
                        System.out.print("4.Cedula inquilino:");
                        estado=false;
                        try {
                            cedulaInquilino=Integer.parseInt(leer.nextLine());
                            estado=true;
                            if(cedulaInquilino!=listaPersona.get(posicionInquilino).getCedula()) {
                                estado=false;
                                System.out.println("La cedula no coincide con el nombre del inquilino");
                            }
                        } catch (Exception e) {
                            System.out.println("Error");
                            estado=false;
                        }
                    }while(estado!=true);
                    do {
                        System.out.print("5.Id inmueble:");
                        idInmueble=leer.nextLine();
                        for(int i=0; i<listaInmueble.size();i++) {
                            if(listaInmueble.get(i).getIdInmueble().equals(idInmueble)) {
                                posicionInmueble=i;
                                estado=true;
                                break;
                            }
                            else{
                                estado=false;
                            }
                        }
                        if(estado==false){System.out.println("-------------El inmueble no existe o  ingreso mal el id-------------");}
                    }while(estado!=true);
                    do {
                        System.out.print("6.Direcion inmueble:");
                        estado=false;
                        try {
                            direccionInmueble=leer.nextLine();
                            estado=true;
                            if(!direccionInmueble.equals(listaInmueble.get(posicionInmueble).getDireccion())) {
                                estado=false;
                                System.out.println("La direccion no coincide con el id del inmueble");
                            }
                        } catch (Exception e) {
                            System.out.println("Error");
                            estado=false;
                        }
                    }while(estado!=true);
                    System.out.print("7.Precio del contrato por mes:");
                    precio=Double.parseDouble(leer.nextLine());
                    System.out.print("8.Tiempo de duracion en meses:");
                    precio=Double.parseDouble(leer.nextLine());
                    Contrato contrato =new Contrato(nombrePropietario, cedulaPropietario, nombreinquilino, cedulaInquilino, direccionInmueble, idInmueble, precio, duracion);
                    listaContrato.add(contrato);
                    break;
                case 2:
                    System.out.println("*****************Eliminar Contrato*****************");
                    imprimirContrato();
                    System.out.print("Ingrese el indice del contrato a eliminar:");
                    int indice=Integer.parseInt(leer.nextLine());
                    listaContrato.remove(indice);
                    System.out.println("***contrato eliminado***");
                    break;
                case 3:
                    System.out.println("*****************Ver Contratos*****************");
                    imprimirContrato();
                    break;
                case 0:
                    respuesta=0;
                    break;
                default:
                    respuesta =20;
                    break;
            }
        }while(respuesta!=0);
    }

    public static void imprimirContrato () {
        for(int i=0; i<listaContrato.size();i++) {
            System.out.println("Indice:"+i );
            System.out.println("1. Nombre Propietario:"+listaContrato.get(i).getNombrePropietario());
            System.out.println("2. Cedula Propietario:"+listaContrato.get(i).getCedulaPropietario());
            System.out.println("3. Nombre Inquilino:"+listaContrato.get(i).getNombreinqquilino());
            System.out.println("4. Cedula Inquilino:"+listaContrato.get(i).getCedulaInquilino());
            System.out.println("5. Id Inmueble:"+listaContrato.get(i).getIdInmueble());
            System.out.println("6. Direccion Inmueble:"+listaContrato.get(i).getDireccionInmueble());
            System.out.println("7. Precio contrato por mes:"+listaContrato.get(i).getPrecio());
            System.out.println("8. Tiempo de duracion en meses:"+listaContrato.get(i).getDuracion());
            System.out.println("");
        }
    }

    public static void datos(){
        Persona persona1 = new Persona("juan","sanches",123456,0);
        Persona persona2 = new Persona("pedro","gomez",654321,0);
        Persona persona3 = new Persona("paola","zaens",147258,1);
        Persona persona4 = new Persona("santiago","perez",369258,1);
        listaPersona.add(persona1);
        listaPersona.add(persona2);
        listaPersona.add(persona3);
        listaPersona.add(persona4);

        Inmueble inmueble1 = new Inmueble("casa 1G", "01","casa 1G",123456);
        Inmueble inmueble2 = new Inmueble("casa 10G", "02","casa 10G",654321);
        listaInmueble.add(inmueble1);
        listaInmueble.add(inmueble2);

        Contrato contrato =new Contrato("pedro", 123456, "paola", 147258, "casa 1G", "01", 5000.0, 6);
        listaContrato.add(contrato);
    }

}
