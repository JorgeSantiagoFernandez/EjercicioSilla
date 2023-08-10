package Seccion_13;

import java.util.Scanner;

public class EjercicioSilla {
    public static void main(String[] args) {
        System.out.println("Introduzca el valor de la matriz: ");
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();
        if (valor <= 0){
            System.out.println("ERROR");
            System.exit(0);
        }
        int[][] matriz = new int[valor][valor];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){

                if (j == 0 || i == matriz.length/2 || (i > matriz.length/2 && j== matriz.length-1))
                    matriz[i][j] = 1;
            }
        }

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
