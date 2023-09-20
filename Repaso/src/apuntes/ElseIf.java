package apuntes;

import java.util.Scanner;

public class ElseIf {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Usted debe desarrollar una funcionalidad que valide el bono que recibira
        // un empleado en la navidad dependiendo de su antiguedad en la empresa, la cual tiene 30 años
        // en el mercado. El bono se dará así:
        // Si tiene mas de 20 años recibe 2 salarios
        // Si tiene entre 10 y 20 recibe 1.5 salarios
        // Si tiene entre 5 y 10 años recibe 1 salario
        // si tiene entre 2 y 5 años recibe 0.5 salarios
        // Si tiene entre 6 y 24 meses recine 0.3
        // si tiene menos de 6 meses no recibe bono


        System.out.println("Ingrese la antiguedad del empleado");
        int antiguedad = sc.nextInt();

        System.out.println("Ingrese el salario del empleado");
        double salario = sc.nextDouble();

        double bono;

        if(antiguedad > 20){
            bono = salario*2;
            System.out.println("El bono a pagar es: "+ bono);
        }else if(antiguedad > 10 && antiguedad <= 20){
            bono = salario*1.5;
            System.out.println("El bono a pagar es: "+ bono);
        }else if(antiguedad >= 5 && antiguedad <= 10 ){
            bono = salario;
            System.out.println("El bono a pagar es: "+ bono);
        }else if(antiguedad >= 2 && antiguedad < 5){
            bono = salario*0.5;
            System.out.println("El bono a pagar es: "+ bono);
        }else if(antiguedad < 2 && antiguedad >= 0.5){
            bono = salario*0.3;
            System.out.println("El bono a pagar es: "+ bono);
        }else{
            System.out.println("El bono a pagar es: 0");
        }


    }
}
