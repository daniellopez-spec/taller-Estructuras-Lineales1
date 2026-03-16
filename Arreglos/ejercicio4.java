package scr.Arreglos;

import java.util.Random;

public class ejercicio4 {
         static Random random = new Random();

//Ejercicio #4
    public static void mayor_menor(){

        int[] numeros = new int[25];
        
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MIN_VALUE;

        for(int i=0;i<25;i++){
            numeros[i] = random.nextInt(101)-50;

            if(numeros[i] > mayor)
                mayor = numeros[i];
            if(numeros[i] < menor)
                menor = numeros[i];
        }

        System.out.println("Mayor: "+ mayor);
        System.out.println("Menor: "+ menor+"\n");
    }
        public static void main(String[] args){
            mayor_menor();
        }
}
