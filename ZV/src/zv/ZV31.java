package zv;

public class ZV31 {
    
    // Írjon függvényt vagy metódust, mely a paraméterként kapott 10x10-es mátrixról eldönti,
    // hogy van-e olyan eleme, mely sorában nagyobb és oszlopában pedig kisebb a többi elemnél!
    public static boolean matrixElem(int[][] matrix) {
        for (int i = 0; i < 5; i++) {
            
        }
    }
    
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4, 5},
            {11, 12, 13, 14, 15},
            {21, 22, 23, 24, 25},
            {31, 32, 33, 34, 35},
            {41, 42, 43, 44, 45}
        };
        System.out.println(matrixElem(matrix));
    }
}