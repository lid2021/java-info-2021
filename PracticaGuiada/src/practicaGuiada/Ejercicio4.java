package practicaGuiada;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
      
        int num; 
        Scanner numInt = new Scanner(System.in);
        System.out.println("Introduce un numero del 1 al 7: ");
        num= numInt.nextInt();
        numInt.close();

        if (num == 1) {
            System.out.println("Lunes");
        } else if(num == 2) {
            System.out.println("Martes");
        } else if (num == 3) {
            System.out.println("Miercoles");
        } else if (num == 4) {
            System.out.println("Jueves");
        } else if (num == 5) {
            System.out.println("Viernes");
        } else if (num == 6) {
            System.out.println("Sabado");
        } else if (num == 7) {
            System.out.println("Domingo");
        }
      
    }
} 
