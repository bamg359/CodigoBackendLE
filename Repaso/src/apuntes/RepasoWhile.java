package apuntes;

import java.util.Scanner;
public class RepasoWhile {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Oprima 1 para inicializar: ");

        int init = sc.nextInt();

        while(init == 1){

            System.out.println("Mostrar Menu");

            System.out.println("Desea continuar 1 = Si, 0 = No ");


            init = sc.nextInt();

        }


    }
}
