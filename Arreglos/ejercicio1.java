package scr.Arreglos;

public class ejercicio1 {

//Ejercicio #1
    public static void numeros_primos(){
        int[] numeros_primos = {2,3,5,7,11,13,17,19,23,29};

        System.out.println("Primeros 10 numeros primos:");
        for(int p : numeros_primos)
            System.out.print(p + " ");
        System.out.println("\n");
    }
        public static void main(String[] args){
            numeros_primos();
        }
}
