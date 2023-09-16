package apuntes;

public class Variable {

    static String marca;

    public static void main(String [] args){

        System.out.println("Hola Mundo");

        //Una variable es declarada, inicializada o ambas

        String nombre;  // Esto es una variable declarada.

        nombre = "Pepito";// Inicializada

        int edad = 25; // Podemos declarar e inicializar la var al mismo

        byte numByte = 127;
        short numShort = 32767;
        int numInt = 2147483647;

        marca = "otra cosa";




        // Casting --> Concertir entree

        short castNumByte = (short)numByte;

        System.out.println(castNumByte);

        castNumByte = 129;

        System.out.println(castNumByte);

        int castNumShort = (int)castNumByte;

        // Esto es el llamado de una funcion

        imprimirMarca();








    }

    // esto es una función

    public static void imprimirMarca(){

        int valor = 245;
        marca = "anything";

        System.out.println(valor);


    }

    public void verValor(){

        //valor
    }

    public void imprimirValor(String name){


    }

}
