package apuntes;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Array inicializado:

        String[] animales = {"Leon", "Gato", "Perro", "Loro"};

        //Array definido:

        float notas[] = new float[3];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese nota " + i);
            notas[i] = sc.nextFloat();


        }

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }


        float notas2[] = new float[3];
        int j = 0;
        while (j < notas2.length) {

            System.out.println("Ingrese nota " + j);
            notas2[j] = sc.nextFloat();
            j++;
        }


               int k= 0;
        while (k < notas2.length) {
            System.out.println(notas2[k]);
            k++;
        }


        for (String l : animales) {
            System.out.println(l);

        }


    }
}
