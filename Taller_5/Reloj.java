package Taller_5;
import java.util.Scanner;

public class Reloj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de segundos: ");
        int Totalsegundos = sc.nextInt();

        int horas = Totalsegundos / 3600;
        int minutos = (Totalsegundos % 3600) / 60;
        int segundos = Totalsegundos % 60;

        System.out.printf("Tiempo:  %02d:%02d:%02d%n", horas, minutos, segundos );
        sc.close();
    }
    }
