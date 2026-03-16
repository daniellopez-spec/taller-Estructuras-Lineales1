package scr.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio7 {
    

    //Ejercicio #7
    public static void insertar_eliminar(){
        ArrayList<Integer> lista = new ArrayList<>();

        for(int i=1;i<=20;i++)
            lista.add(i*2);

        Scanner sc = new Scanner(System.in);

        System.out.println("Lista inicial: "+lista);
        System.out.print("Numero a ingresar: ");
        int n = sc.nextInt();

        int pos=0;

        while(pos<lista.size() && lista.get(pos)<n)
            pos++;
        lista.add(pos,n);

        System.out.println("Lista actualizada: "+lista);
        System.out.print("Numero a eliminar: ");
        int borrar = sc.nextInt();

        lista.remove(Integer.valueOf(borrar));

        System.out.println("Lista final: "+lista+"\n");
    }
        public static void main(String[] args){
            insertar_eliminar();
        }

}
