package practicaGuiada;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int nota; 
        Scanner numInt = new Scanner(System.in);
        System.out.println("Introduce la nota: ");
        nota= numInt.nextInt();

        numInt.close();
        if (nota > 92) {
            System.out.println("Excelente");
        } else if (nota > 84) {
            System.out.println("Sobresaliente");
        } else if (nota > 74) {
            System.out.println("Distinguido");
        } else if (nota > 59) {
            System.out.println("Bueno");
        } else  {
            System.out.println("Desaprobado");
        }
      
    }
} 


