package zv;

public class ZV09 {
    
    // Írjon olyan függvényt vagy metódust, amely egy természetes számról eldönti, hogy a kettes
    // számrendszerbeli felírásában a jobbról második bitje 1 vagy 0 (ne alakítsa át sztringgé/karaktertömbbé)!
    public static int jobbrolMasodik(int n) {
        n /= 2;
        System.out.println(n);
        return n % 2;
    }
    
    public static boolean isSecondBitOne(int num) {
        // Shift the number two bits to the right, then & with 1
        return (num >> 1 & 1) == 1;
    }
    
    public static void main(String[] args) {
        //System.out.println(jobbrolMasodik(2));
        System.out.println(10 >> 1);
        System.out.println(10 >> 2);
        System.out.println(10 >> 3);
    }
}