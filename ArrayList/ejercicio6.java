package scr.ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class ejercicio6 {

    static Random random = new Random();

    //Ejercicio #6
    public static void lista_hasta_diez() {
        ArrayList<Integer> lista = new ArrayList<>();

        int num;
        do{
            num= random.nextInt(21)-10;
            lista.add(num);

        }while(num!=10);

        int suma=0;

        for(int x:lista)
            suma+=x;

        double media = (double)suma/lista.size();

        System.out.println("Lista: "+lista);
        System.out.println("Suma: "+suma);
        System.out.println("Media: "+media+"\n");

    }
     public static void main(String[] args){
        lista_hasta_diez();
     }

}
