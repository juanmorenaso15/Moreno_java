package Taller_5;
import java.util.Scanner;
public class Eliminar_duplicados_arreglo {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántos números vas a ingresar? ");
        int cantidad = scanner.nextInt();

        int[] numeros = new int[cantidad];

        System.out.println("Ingresa los números:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("\nArreglo original: [");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int[] temporal = new int[cantidad];
        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {
            boolean yaExiste = false;

            for (int j = 0; j < contador; j++) {
                if (numeros[i] == temporal[j]) {
                    yaExiste = true;
                    break;
                }
            }

            if (!yaExiste) {
                temporal[contador] = numeros[i];
                contador++;
            }
        }

        int[] sinDuplicados = new int[contador];
        for (int i = 0; i < contador; i++) {
            sinDuplicados[i] = temporal[i];
        }

        System.out.print("Arreglo sin duplicados: [");
        for (int i = 0; i < sinDuplicados.length; i++) {
            System.out.print(sinDuplicados[i]);
            if (i < sinDuplicados.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.println("Elementos originales: " + cantidad);
        System.out.println("Elementos únicos: " + contador);

        scanner.close();
    }
}