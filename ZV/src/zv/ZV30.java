package zv;

public class ZV30 {
    
    // Írjon függvényt vagy metódust, mely pozitív egész paraméterét fordítva adja vissza, pl.
    // fordit(234) eredménye 432! (a megoldás során ne használjon sztringeket/karaktertömböket)
    public static int fordit(int n) {
        int n2 = 0;
        while (n != 0) {
            n2 = n2 * 10 + (n % 10);
            n /= 10;
        }
        return n2;
    }
    
    public static void main(String[] args) {
        System.out.println(fordit(234));
    }
}