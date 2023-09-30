package apuntes;

import java.util.Scanner;

public class ArrayApp {

    static Scanner sc = new Scanner(System.in);


    static String [] usuario1 = new String[5];


    public static void main(String[] args) {

        menuApp();


    }

    // Crear las funciones


    public static void menuApp(){

        System.out.println("Oprima 1 para comenzar:");

        int init = sc.nextInt();

        while(init!=0) {


            System.out.println("Seleccione \n 1: Registrar  \n 2: Iniciar sesión \n 3: Ver Registro \n 4: Salir");

            int opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Registro");
                    registrar();
                    break;
                case 2:
                    System.out.println("Login");
                    iniciarSesion();
                    break;
                case 3:
                    System.out.println("Ver Registro");
                    imprimirDatos();
                    break;
                case 4:
                    System.out.println("Salir");
                    init = 0;
                    break;
                default:
                    System.out.println("Seleccione una opción valida");
            }


        }



    }

    public static void registrar(){

        System.out.println("--------------------REGISTRO------------------------------");

        int id = 0;

        String idParse = id + ""; //Parseo de entero a String
        sc.skip("\n");
        System.out.println("Ingrese el id del usuario");
        idParse = sc.nextLine();
        usuario1[0]= idParse;



        //int idParseInt = Integer.parseInt(idParse); // Parseo de String a entero

        System.out.println("Ingrese el nombre del usuario: ");
        String nombre = sc.nextLine();
        usuario1[1] = nombre;

        System.out.println("Ingrese el apellido:");
        String apellido = sc.nextLine();
        usuario1[2] = apellido;

        System.out.println("Ingrese el correo: ");
        String correo = sc.nextLine();
        usuario1[3] = correo;

        System.out.println("Ingrese el password:");
        String contrasena = sc.nextLine();
        usuario1[4] = contrasena;

    }


    public static void iniciarSesion(){
        System.out.println("--------------------INICIO DE SESION------------------------------");
        sc.skip("\n");
        System.out.println("Ingrese el correo registrado:");
        String correoUsuario = sc.nextLine();

        System.out.println("INgrese el password registrado");

        String contrasenaRegistrada = sc.nextLine();

        if( correoUsuario.equals(usuario1[3]) && contrasenaRegistrada.equals(usuario1[4])){
            System.out.println("Bienvenido " + usuario1[1]);
        }else{
            System.out.println("Valide sus credenciales");
        }
    }


    public static void imprimirDatos(){

        System.out.println("--------------------IMPRIMIR DATOS------------------------------");
        for (int i = 0 ; i <  usuario1.length; i++){

            System.out.println("dato " + i + ": " + usuario1[i]);
        }


    }





}
