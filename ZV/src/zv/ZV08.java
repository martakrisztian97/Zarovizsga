package zv;

public class ZV08 {

    // Írjon olyan függvényt vagy metódust, amely egy természetes szám esetén kiírja,
    // hogy a 9-es számjegyből hány darabot tartalmaz (ne alakítsa át sztringgé/karaktertömbbé)!
    public static int hanyKilences(int n) {
        int db = 0;
        while (n > 0) {
            if (n % 10 == 9) db++;
            n /= 10;
        }
        return db;
    }
    
    public static void main(String[] args) {
        System.out.println(hanyKilences(0));
        System.out.println(hanyKilences(9));
        System.out.println(hanyKilences(100));
        System.out.println(hanyKilences(9999));
    }
}
