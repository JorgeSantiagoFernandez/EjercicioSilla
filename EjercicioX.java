package Seccion_13;

import java.util.Scanner;

public class EjercicioX {
    public static void main(String[] args) {
        System.out.println("Introduzca el valor de la matriz: ");
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();
        if (valor <= 0){
            System.out.println("ERROR");
            System.exit(0);
        }
        String[][] matriz = new String[valor][valor];




        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){

                if (i == j || i == matriz.length-1-j)
                    matriz[i][j] = "X";
                else
                    matriz[i][j] = "_";
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
