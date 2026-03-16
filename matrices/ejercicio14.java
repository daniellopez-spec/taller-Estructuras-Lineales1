package scr.matrices;

public class ejercicio14 {
    
//Ejercicio #14
    public static void transpuesta(){
        int[][] m = {{1,2,3},{4,5,6}};
        int[][] t = new int [3][2];

        for(int i=0;i<m.length;i++)
            for(int j=0;j<m[0].length;j++)
                t[j][i] = m[i][j];

        System.out.println("Transpuesta: ");

        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++)
                System.out.print(t[i][j]+" ");

            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args){
        transpuesta();
    }


}
