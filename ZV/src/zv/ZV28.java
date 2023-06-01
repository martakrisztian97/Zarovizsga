package zv;

public class ZV28 {
    
    // Írjon függvényt vagy metódust, mely eldönti, hogy a paraméterként kapott 5x5-ös
    // karakterekből álló tömbben a főátlóban van-e olyan elem, mely a főátlón kívül is megjelenik a tömbben!
    public static boolean atloban(char[][] c) {
        char[] foatlo = new char[5];
        for (int i = 0; i < 5; i++) {
            foatlo[i] = c[i][i];
        }
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    if (i != j && c[i][j] == foatlo[k]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public static boolean atloban2(char[][] c) {
        for (int i = 0; i < 5; i++) {
            for ( int j = 0; j < 5; j++) {
                for ( int k = 0; k < 5; k++) {
                    if ( c[j][k] == c[i][i] && j!=k ) return true;
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        char[][] tomb = {
            {'a', 'b', 'c', 'd', 'e'},
            {'f', 'g', 'h', 'i', 'j'},
            {'k', 'l', 'm', 'n', 'o'},
            {'p', 'q', 'r', 's', 't'},
            {'u', 'v', 'w', 'x', 'y'}
        };
        System.out.println(atloban2(tomb));
    }
}