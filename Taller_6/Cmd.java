package Taller_6;

import java.util.Scanner;

public class Cmd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingese numero 1: ");
        int a = sc.nextInt();

        System.out.println("Ingrese numero 2: ");
        int b = sc.nextInt();

        int numeroA = a;
        int numeroB = b;

        while (b != 0) {
            int residuo = a % b;
            a = b;
            b = residuo;
        }
       
        System.out.println("El MCD de:\n"+"Numero 1: "+numeroA +"\n"+"Numero 2: "+numeroB +"\n"+"Es: "+ a);
    

    sc.close();
}
}