package Taller_5;

public class Matriz_Traspuestas {

    public static void main(String[] args) {
        int a [][] = {
            {51, 21, 33, 49},
            {12, 22, 34, 84},
            {19, 21, 23, 44},
            {13, 54, 36, 62}
        };

        int filas = a.length;
        int columns = a[0].length;

        int b[][] = new int [columns][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columns; j++) {
               b[j][i] = a[i][j] ;

            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(""+b[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
