package Taller_6;

import java.util.Scanner;

public class Numero_Cuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros: ");
        int cantidad = sc.nextInt();

        for (int i = 0; i <= cantidad; i++) {
            int cuadrado = i*i;
            System.out.println(i + "² = "+ cuadrado);
        }

        System.out.println("Serie de numeros cuadrados perfectos: ");

        for (int i = 0; i <= cantidad; i++) {
            System.out.print(i*i);
            if (i < cantidad) {
                System.out.print(", ");
            }else if(i == cantidad){
                System.out.print(" ");
            }
        }

        sc.close();
    }
}
