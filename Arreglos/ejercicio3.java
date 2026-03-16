package scr.Arreglos;

import java.util.Random;

public class ejercicio3 {
    static Random random = new Random();

//Ejercicio #3
    public static long factorial(int n){
        long f=1;
        for(int i=1;i<=n;i++)
            f*=i;
        return f;     
    }

    public static void factoriales(){
        int[] numeros = new int[5];
        long[] factoriales = new long[5];

        for(int i=0;i<5;i++){
            numeros[i] = random.nextInt(10)+1;
            factoriales[i] = factorial(numeros[i]);
        }

        System.out.println("Numeros: ");
        for(int x:numeros)
            System.out.print(x+" ");

        System.out.println("\nFactoriales: ");
        for(long x:factoriales)
            System.out.print(x+" ");

        System.out.println("\n");
    }
        public static void main(String[] args){
            factoriales();
        }

}
