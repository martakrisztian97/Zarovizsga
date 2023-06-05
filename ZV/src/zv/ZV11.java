package zv;

public class ZV11 {
    
    // Írjon olyan függvényt vagy metódust, amely a paraméterében megadott természetes szám
    // pozitív osztóinak számával tér vissza!
    public static int osztokSzama(int n) {
        int db = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                db++;
            }
        }
        return db;
    }
    
    public static void main(String[] args) {
        System.out.println(osztokSzama(25));
        System.out.println(osztokSzama(32));
        System.out.println(osztokSzama(100));
    }
}