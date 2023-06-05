package zv;

public class ZV32 {
    
    // Írjon függvényt vagy metódust, mely visszaadja, hogy k-tól m-ig hány olyan szám van,
    // melyeknek n db valódi osztója van! (n, k és m paraméter).
    public static int valodiOsztok(int k, int m, int n) {
        int db = 0;
        int osztok = 0;
        for (int i = k; i <= m; i++) {
            
            for (int j = 2; j < i; j++) {
                if (i % j == 0) osztok++;
            }
            if (osztok == n) db++;
            osztok = 0;
        }
        return db;
    }
    
    public static void main(String[] args) {
        System.out.println(valodiOsztok(2, 45, 4));
        System.out.println(valodiOsztok(2, 100, 1));
    }
}