package Taller_5;

import java.util.Scanner;

public class NumeroMagico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un numero: ");
        int numero = scanner.nextInt();
        int suma = numero;
        

        while (suma >= 10) {
            int temp = suma;
            suma = 0;
            
            while (temp > 0) {
                suma = suma + (temp % 10);
                temp = temp / 10;
            }
        }
        
    
        if (suma == 1) {
            System.out.println("El numero es magico: " + numero);
        } else {
            System.out.println("El numero no es magico: " + numero);
        }
        
        scanner.close();
    }
}

