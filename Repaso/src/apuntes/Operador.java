package apuntes;

public class Operador {


    public static void main(String [] args){

        //Esto es un comentario
        //Operadores aritmeticos (+,-,/,*,%)

        int num1 = 20;
        int num2 = 5;

        int suma= num1 + num2;
        System.out.println("El resultado de la suma es : " + suma);
        int resta = num1-num2;
        System.out.println("El resultado de la resta es : " + resta);
        int mult = num1*num2;
        System.out.println("El resultado de la mult es : " + mult);
        int div= num1/num2;
        System.out.println("El resultado de la div es : " + div);
        int mod= num1%num2;
        System.out.println("El resultado de modulo es : " + mod);

        // existe una jerarquia de operadores (), pow-sqr, / * %, + -

        int operacion = 5+4*5/(2+3)*7;
        System.out.println(operacion);


        // Operadores de comparación <,> , <=, >=, !=, ==
        // Estos operadores devuelve true, false (valor booleano)

        boolean mayorQue = num1> num2;
        System.out.println("num 1 es mayor que num 2 : " + mayorQue);
        boolean mayorIgualQue = num1 >= num2;
        System.out.println("num 1 es mayor igual que num 2 : " + mayorIgualQue);
        boolean menorQue = num1 < num2;
        System.out.println("num 1 es menor que num 2 : " + menorQue);
        boolean menorIgualQue = num1 <= num2;
        System.out.println("num 1 es menor igual que num 2 : " + menorIgualQue);
        boolean noEsIgual = num1 != num2;
        System.out.println("num 1 no Es Igual a num 2 : " + noEsIgual);
        boolean esIgualIgual = num1 == num2;
        System.out.println("num 1  es Igual Igual que num 2 : " + esIgualIgual);

        // Operadores logicos && || not

        boolean inicia = true && true;
        System.out.println(inicia);
        boolean inicia1= !true && !true;
        System.out.println(inicia1);
        boolean inicia2 = !false || false;
        System.out.println(inicia2);

        // Operadores de asignación =, +=, -=, *=, /=, %=

        int res = 5;

        res = res +1;

        System.out.println(res);

        res += 1;

        System.out.println(res);

    }
}
