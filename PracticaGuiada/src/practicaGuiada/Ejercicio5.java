package practicaGuiada;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int num; 
        Scanner numInt = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        num= numInt.nextInt();
        numInt.close();
        for (int i=1; i<=10;i++) {
            System.out.println(num +" * "+ i + " = " + (num*i));
        }

    }
    
}
