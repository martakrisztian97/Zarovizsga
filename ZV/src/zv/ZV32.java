package zv;

public class ZV32 {
    
    // Írjon függvényt vagy metódust, mely visszaadja, hogy k-tól m-ig hány olyan szám van,
    // melyeknek n db valódi osztója van! (n, k és m paraméter).
    public static int valodiOsztok(int n, int k, int m) {
        int db = 0;
        int osztok;
        for (int i = k; i <= m; i++) {
            osztok = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) osztok++;
            }
            if (osztok == n) db++;
        }
        return db;
    }
    
    public static void main(String[] args) {
        System.out.println(valodiOsztok(4, 2, 45));
        System.out.println(valodiOsztok(1, 2, 100));
    }
}