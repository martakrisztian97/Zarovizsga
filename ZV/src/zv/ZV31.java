package zv;

public class ZV31 {
    
    // Írjon függvényt vagy metódust, mely a paraméterként kapott 10x10-es mátrixról eldönti,
    // hogy van-e olyan eleme, mely sorában nagyobb és oszlopában pedig kisebb a többi elemnél!
    public static boolean matrixElem(int[][] matrix) {
        int max;
        int min;
        int[] maxok = new int[5];
        int[] minek = new int[5];
        for (int i = 0; i < 5; i++) {
            max = matrix[i][0];
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            maxok[i] = max;
        }
        
        for (int i = 0; i < 5; i++) {
            min = matrix[0][i];
            for (int j = 0; j < 5; j++) {
                if (matrix[j][i] < min) {
                    min = matrix[j][i];
                }
            }
            minek[i] = min;
        }
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (maxok[i] == minek[j] && maxok[i] == matrix[i][j]) return true;
            }
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 7, 3, 4, 5},
            {1, 6, 2, 3, 10},
            {1, 5, 2, 3, 4},
            {1, 8, 3, 4, 10},
            {1, 9, 2, 5, 10}
        };
        System.out.println(matrixElem(matrix));
    }
}