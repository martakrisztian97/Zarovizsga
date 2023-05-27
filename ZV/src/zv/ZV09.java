package zv;

public class ZV09 {
    
    // Írjon olyan függvényt vagy metódust, amely egy természetes számról eldönti, hogy a kettes
    // számrendszerbeli felírásában a jobbról második bitje 1 vagy 0 (ne alakítsa át sztringgé/karaktertömbbé)!
    public static int jobbrolMasodikBit(int n) {
        n /= 2;
        return n % 2;
    }
    
    public static void main(String[] args) {
        for (int i = 1; i < 20; i++) {
            System.out.println(i+"/2 = "+i/2);
            System.out.println(jobbrolMasodikBit(i));
        }
    }
}