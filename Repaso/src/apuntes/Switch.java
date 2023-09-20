package apuntes;

import java.util.Scanner;

public class Switch {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {


        //Tiene una aplicacion con 4 opciones
        // 1. Registra el producto
        // 2. Lista el producto
        // 3. Actualiza el producto
        // 4. Elimina el producto
        // 5. Salir del programa
        // default : Ingrese una opcion valida

        System.out.println(" Ingrese una opción: ");
        int opc = leer.nextInt();

        switch (opc){
            case 1:
                System.out.println("Registro");

                registrarProducto();

                break;
            case 2:
                System.out.println("Listado");
                break;
            case 3:
                System.out.println("Actualización");
                break;
            case 4:
                System.out.println("Elimina");
                break;
            case 5:
                System.out.println("Salir");
                break;
            default:
                System.out.println("Ingrese una opción valida");

        }
    }

    public static void registrarProducto(){

        System.out.println("Ingrese el id del producto: ");
        int idProducto = leer.nextInt();
        System.out.println("ingrese el nombre del producto");
        String nombreProd = leer.next();
        System.out.println("Ingrese el costo del producto:");
        double costoProducto = leer.nextDouble();
        System.out.println("Ingrese la cantidad del producto:");
        double cantidad = leer.nextDouble();
        System.out.println("Ingrese el margen de ganancia producto:");
        double margenGanancia = leer.nextDouble();
    }
}
