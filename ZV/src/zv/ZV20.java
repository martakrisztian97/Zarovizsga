package zv;

public class ZV20 {
    
    // Adjon olyan függvényt vagy metódust, ami adott két pozitív egész paramétere esetén
    // megadja (n alatt a k)=n!/k!(n-k)! értékét. Használjon rekurziót!
    public static int kombinacio(int n, int k) {
        if (k > n) return 0;
        if (k == 0 || k == n) return 1;
        return kombinacio(n-1, k-1) + kombinacio(n-1, k);
    }
    
    public static void main(String[] args) {
        System.out.println(kombinacio(10, 4));
        System.out.println(kombinacio(5, 2));
        System.out.println(kombinacio(5, 3));
    }
}