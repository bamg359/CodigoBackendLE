package apuntes;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione \n 1: Registrar  \n 2: Iniciar sesión \n 3: Ver Registro \n 4: Salir");

        int opc = sc.nextInt();

        switch (opc){
            case 1:
                System.out.println("Registro");
                break;
            case 2:
                System.out.println("Login");
                break;
            case 3:
                System.out.println("Ver Registro");
                break;
            case 4:
                System.out.println("Salir");
                break;
            default:
                System.out.println("Seleccione una opción valida");
        }







    }

}
