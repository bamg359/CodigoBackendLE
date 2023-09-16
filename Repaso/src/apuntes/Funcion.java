package apuntes;

public class Funcion {

    public static void main(String[] args) {

        verSuma();

    }


    public static int sumar(){

        int num1 = 10;
        int num2 = 5;
        int result = num1 + num2;

        return result;
    }

    public static void verSuma(){

        int suma= sumar();

        System.out.println("El resultado de la suma es : " + suma);
    }


}
