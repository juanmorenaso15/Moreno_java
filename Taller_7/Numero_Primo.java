package Taller_7;

import java.util.Scanner;

public class Numero_Primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero positivo: ");
        int numero = sc.nextInt();

        int divisor = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero %i ==0) {
            divisor++;
        }
        }
        

        if (divisor==2) {
            System.out.println( "EL numero es primo: "+ numero);
        }else{
            System.out.println("El numero no es primo: "+ numero);
        }
        
        sc.close();
    }
}
