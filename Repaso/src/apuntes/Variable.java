package apuntes;

public class Variable {

    public static void main(String[] args){

        System.out.println("Hola mundo");

        //una variable es declarada, inicializada o ambas

        String nombre; //Esta es una variable declarada

        nombre="Pepito"; //varibale Inicializada

        int edad = 25; //Podemos declarar e inicializar la variable la mismo tiempo

        byte numByte = 127;
        short numShort = 32767;
        int numInt = 2147483647;

        //Casting -->Convertir entre numeros primitivos

        short castNumByte = (short)numByte;

        System.out.println(castNumByte);

        castNumByte = 129;

        System.out.println(castNumByte);

        int castNumByte2 = (int)castNumByte;

        System.out.println(castNumByte2);





    }
}
