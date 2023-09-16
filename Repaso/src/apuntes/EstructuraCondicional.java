package apuntes;

import java.util.Scanner;

public class EstructuraCondicional {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        // if simple, if - else - , if - else if  - else


        // usted debe realizar un inicio de sesion que permita ingresar usando el correo o usando el numero
        // de telefono, al ingresar debe mostrar el nombre de la persona que inicia la sesion y se quiere que valide un capchat

        String nombre = "Pepito";
        String correo = "pepito@mail.com";
        String telefono = "322222222";
        //String telReg = "";
        String correoReg = "";
        int contrasena = 123456;
        int capchat = 33;
        /*
        System.out.println("Ingrese el correo registrado:");
        String correoReg = leer.next();
        */

        System.out.println("Ingrese el num de telefono registrado");
        String telReg = leer.next();



        System.out.println("Ingrese la contraseña registrada:");
        int contReg= leer.nextInt();

        System.out.println("Resuelva la siguiente operacion : 5+4*5/(2+3)*7");
        int resCapchat = leer.nextInt();
        /*
        if( // condiciones){

            //Instrucciones
        }else{

            // Sino se cumplen las instrucciones ejecuta esto

        }
        */

        if((telefono.equals(telReg) || correo.equals(correoReg)) && contrasena==contReg && capchat==resCapchat){

            System.out.println("Bienvenido" + nombre);

        }else{

            System.out.println("Valide sus credenciales");

        }



    }
}
