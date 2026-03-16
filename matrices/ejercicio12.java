package scr.matrices;

import java.util.Random;

public class ejercicio12 {
    static Random random = new Random();

//Ejercicio #12
    public static void diagonal_secundaria(){
        int n=4;

        int[][] matriz = new int [n][n];

        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                matriz[i][j] = random.nextInt(101)-50;

        int suma=0;

        for(int i=0;i<n;i++)
            suma += matriz[i][n-1-i];

        System.out.println("Suma diagonal secundaria: "+suma+"\n");
    }
    public static void main(String[] args){
        diagonal_secundaria
        ();
    }
}
