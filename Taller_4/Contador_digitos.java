package Taller_4;

import java.util.Scanner;

public class Contador_digitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();
        int contador = 0;
        
        if (numero == 0) {
            contador = 1;
        } else {
            while (numero != 0) {
                numero /= 10;
                contador++;
            }
        }
        
        System.out.println("El número tiene " + contador + " dígitos.");
        sc.close();
    }
    
}
