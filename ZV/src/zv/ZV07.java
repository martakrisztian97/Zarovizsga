package zv;

public class ZV07 {
    
    // Írjon olyan függvényt vagy metódust, amely egy természetes számhoz visszaadja azt a
    // legnagyobb egész kitevős hatványát, amely még éppen kisebb, mint 567!
    public static int hatvany(int n) {
        if (n == 1) return 1;
        int szam = n;
        while (szam * n < 567) {
            szam = szam * n;
        }
        return szam;
    }
    
    public static void main(String[] args) {
        for (int i = 1; i <= 25; i++) {
            System.out.println(i+" -> "+hatvany(i));
        }
    }
}