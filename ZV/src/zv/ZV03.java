package zv;

import java.util.Random;

public class ZV03 {
    
    // Írjon olyan függvényt vagy metódust, amely egy karakterláncban vagy sztringben
    // véletlenszerűen összekeveri a karaktereket (véletlenszám–generátor használható)!
    public static String kever(String s) {
        char[] betuk = s.toCharArray();
        Random random = new Random();
        char temp;
        
        for (int i = 0; i < betuk.length; i++) {
            int j = random.nextInt(betuk.length);
            temp = betuk[i];
            betuk[i] = betuk[j];
            betuk[j] = temp;
        }
        
        return new String(betuk);
    }
    
    public static void main(String[] args) {
        String s = "Szia";
        System.out.println(s+" -> "+kever(s));
    }
}