package zv;

import java.util.Random;

public class ZV03 {
    
    // Írjon olyan függvényt vagy metódust, amely egy karakterláncban vagy sztringben
    // véletlenszerűen összekeveri a karaktereket (véletlenszám–generátor használható)!
    public static char[] kever(char[] c) {
        Random r = new Random();
        char temp;
        
        for (int i = 0; i < c.length; i++) {
            int j = r.nextInt(c.length);
            temp = c[i];
            c[i] = c[j];
            c[j] = temp;
        }
        return c;
    }
    
    public static void main(String[] args) {
        char[] c = {'S', 'z', 'i', 'a', '!'};
        System.out.println(kever(c));
    }
}