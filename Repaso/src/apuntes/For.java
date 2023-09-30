package apuntes;

import java.util.Scanner;

public class For {

    public static void main(String[] args) {
        String [] nombres = { "Maria","Juan","David", "pedro","Laura"};
        //Indices

        //Si quiero acceder a la posicion de un elemento de un array
        //debi ibicar la misma de siguiente manera array[1]

        System.out.println("El elemento de la posicion 3 es : "+ nombres [3]);
        nombres[3] ="pepito";
        System.out.println("El elemento de la posicion 3 es : "+nombres[3]);
        System.out.println("El numero de elementos es: "+ nombres.length);

        //Ciclo For

        for (int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);


        }

       int [] edades =new int [4];
            edades[0]=17;
            edades[1]=34;
            edades[2]=10;
            edades[3]=33;
        for (int x = 0; x < edades.length; x++ ){


            System.out.println(edades[x]);





        }


    }
}
