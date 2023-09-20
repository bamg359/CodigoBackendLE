package apuntes;

import java.util.Scanner;

public class WhileApp {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Oprima 1 para iniciar");
        int appInit = sc.nextInt();

        while(appInit!=0){

            System.out.println(" Ingrese una opción: ");
            int opc = sc.nextInt();

            switch (opc){
                case 1:
                    System.out.println("Registro");
                    //registrarProducto();
                    break;
                case 2:
                    System.out.println("Listado");
                    break;
                case 3:
                    System.out.println("Calcular el precio de venta");
                    // precioVenta = costo/ (1-margenGanacia)
                    break;
                case 4:
                    System.out.println("calcular el valor del inventario");
                    break;
                case 5:
                    System.out.println("Salir");
                    appInit=0;
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
            }
        }
    }
}
