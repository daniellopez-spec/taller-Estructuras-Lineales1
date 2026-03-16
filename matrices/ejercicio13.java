package scr.matrices;

public class ejercicio13 {
        //Ejercicio #13
    public static void matriz_simetrica(){
        int[][] m = {{1,2,3},{2,4,5},{3,5,6}};

        boolean simetrica=true;

        for(int i=0;i<m.length;i++)
            for(int j=0;j<m.length;j++)
                if(m[i][j]!=m[j][i])
                    simetrica=false;

        System.out.println("¿Es simetrica?: "+simetrica);

        System.out.println("Esquinas: ");
        System.out.println(m[0][0]+" "+m[0][2]);
        System.out.println(m[2][0]+" "+m[2][2]);

        System.out.println();
    }
    public static void main(String[] args){
        matriz_simetrica();
    }

}
