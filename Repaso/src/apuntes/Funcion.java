package apuntes;

import java.util.Scanner;

public class Funcion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Usted debe desarrollar una funcionalidad que valide el bono que
        //recibira un empleado en la navidad dependiendo de su antiguedad
        //en la empresa, la cual lleva 30 años en el mercado. El bono se dara asi:
        //Si tiene mas de 20 años recibe 2 salarios,
        //Si tiene entre 10 y 20 años, 1.5 salarios
        //Si tiene entre 5 y 10  años recibe 1 salario
        //Si tiene entre 2 y 5 años, recibe 0.5 salario
        //Si tiene entre 6 y 24 meses, recibe 0.3 salario
        //Si tiene menos de 6 meses, no recibe bono


        System.out.println("Ingrese la antiguedad del empleado");
        int antiguedad = sc.nextInt();
        System.out.println("Igrese el salario del empleado");
        double salario = sc.nextDouble();
        double bono;

        if (antiguedad > 20) {
            bono = salario * 2;
            System.out.println("El bono a pagar es: "+ bono);
        }else if(antiguedad > 10 && antiguedad <= 20){
            bono = salario * 1.5;
            System.out.println("El bono a pagar es: "+ bono);
        }else if(antiguedad >= 5 && antiguedad <=10){
            bono = salario;
            System.out.println("El bono a pagar es: "+ bono);
        }else if(antiguedad >=2 && antiguedad < 5){
            bono = salario*0.5;
            System.out.println("El bono a pagar es: "+bono);
        }else if(antiguedad <2 && antiguedad >=0.5) {
            bono = salario * 0.3;
            System.out.println("El bono a pagar es: " + bono);
        }else{
            System.out.println("El bono a pagar es: 0");
        }

    }


    }


