package scr.matrices;

import java.util.Random;

public class ejercicio15 {
    static Random random = new Random();

//Ejercicio #15
    public static void intercambiar_filas(){
        int[][] m = new int[3][3];

        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                m[i][j] = random.nextInt(10);

        for(int j=0;j<3;j++){
            int temp = m[0][j];
            m[0][j] = m[1][j];
            m[1][j] = temp;
        }

        System.out.println("Matriz con filas intercambiadas: ");
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
            System.out.print(m[i][j]+" ");

        System.out.println();
        }
    }

    public static void main(String[] args){
        intercambiar_filas();
    }

}
