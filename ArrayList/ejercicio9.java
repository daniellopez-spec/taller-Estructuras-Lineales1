package scr.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ejercicio9 {

    static Random random = new Random();

    //Ejercicio #9
    public static void ordenar_separar(){
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i=0;i<20;i++)
            lista.add(random.nextInt(100)+1);
        
        System.out.println("Original: "+lista);

        Collections.sort(lista);
        System.out.println("Ascendente: "+lista);

        Collections.sort(lista,Collections.reverseOrder());
        System.out.println("Descendente: "+lista);

        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        for(int x:lista){
            if(x%2==0)
                pares.add(x);
            else
                impares.add(x);
        }
        System.out.println("Pares: "+pares); 
        System.out.println("Impares: "+impares+"\n");       
    }
        public static void main(String[] args){
            ordenar_separar();
        }

}
