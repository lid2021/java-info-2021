package practicaGuiada;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        Scanner numInt = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        num1 = numInt.nextInt();

        System.out.println("Introduce otro número entero: ");
        num2 = numInt.nextInt();

        System.out.println("Introduce otro número entero: ");
        num3 = numInt.nextInt();
     
        
        System.out.println("El primer num es " + num1);
        System.out.println("El segundo num es " + num2);
        System.out.println("El tercer num es " + num3);
        numInt.close();
    }
}