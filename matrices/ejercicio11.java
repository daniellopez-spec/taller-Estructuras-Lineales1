package scr.matrices;

import java.util.Random;
import java.util.Scanner;

public class ejercicio11 {
        static Random random = new Random();

//Ejercicio #11
    public static void buscar_numero(){
        int [][] matriz = new int [4][4];
        
        for(int i=0;i<4;i++)
            for(int j=0;j<4;j++)
                matriz[i][j] = random.nextInt(50);
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero a buscar: ");
        int num = sc.nextInt();

        boolean numero_encontrado=false;

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(matriz[i][j]==num){

                    System.out.println("Encontrado en: "+i+","+j);
                    numero_encontrado=true;
                    break;
                }
            }

            if(numero_encontrado)
                break;
        }

        if(!numero_encontrado)
            System.out.println("No fue encontrado ");

        System.out.println();
    }
    public static void main(String[] args){
        buscar_numero();
    }

}
