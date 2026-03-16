package scr.Arreglos;

public class ejercicio2 {

//Ejercicio #2
    public static void numeros_pares(){
        int[] numeros_pares = new int[100];

        for(int i=0; i<100; i++)
            numeros_pares[i] = (i+1)*2;

        System.out.println("Pares en una linea");
        for (int n:numeros_pares)
            System.out.print(n + " ");

        System.out.println("\n");
    }
        public static void main(String[] args){
            numeros_pares();
        }
}
