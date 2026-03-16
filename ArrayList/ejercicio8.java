package scr.ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class ejercicio8 {

    static Random random = new Random();


    //Ejercicio #8
    public static void frecuencia (){
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i=0;i<100;i++)
            lista.add(random.nextInt(20)+1);

        int max=0;
        int num_max=0;
        for(int i=1;i<=20;i++){

            int cont=0;
            for(int x:lista)
                if(x==i)
                    cont++;
            
            System.out.println(i+" aparece "+cont+" veces ");
            if(cont>max){
                max=cont;
                num_max=i;
            }
        }
        System.out.println("Numero mas repetido: "+num_max+"\n");
    }
        public static void main(String[] args){
            frecuencia();
        }
}
