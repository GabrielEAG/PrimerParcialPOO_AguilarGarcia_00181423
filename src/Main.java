import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean seguir = true;
        int opc;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("------------------------------------");
            System.out.println("1. Ageregar articulo\n");
            System.out.println("2. Modificar articulo\n");
            System.out.println("3. Lista de articulos");
            System.out.println("------------------------------------");

            int numero = sc.nextInt();
            System.out.println(numero);

            switch (numero){
                case 1:
                    System.out.println("Que tipo de articulo desea agregar?");
                    System.out.println("1. Telefono");
                    System.out.println("2. Laptop");
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Unexpected value: " + numero);
            }
            //seguir = false;
        }while(seguir);

    }
}

//for (int i = 1; i <= 5; i++) {
//System.out.println("i = " + i);
