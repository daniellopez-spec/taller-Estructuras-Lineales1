package scr.Arreglos;

import java.util.Random;

public class ejercicio5 {
         static Random random = new Random();
         
//Ejercicio #5
    public static int invertir(int n){
        int inv=0;
        while(n!=0){
            inv = inv*10 + n%10;
            n/=10;
        }
        return inv;
    }

    public static void invertir_arreglo(){
        int[] numeros = new int[20];
        int[] invertidos = new int[20];

        for(int i=0;i<20;i++){

            numeros[i] = random.nextInt(1000);
            invertidos[i] = invertir(numeros[i]);
        }

        System.out.println("Original: ");

        for(int x:numeros)
            System.out.print(x+" ");

        System.out.println("\nInvertidos: ");

        for(int x:invertidos)
            System.out.print(x+" ");

        System.out.println("\n");

    }
    public static void main(String[] args){
        invertir_arreglo();
    }

}


