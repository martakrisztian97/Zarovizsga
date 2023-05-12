package zv;

import java.util.Random;

public class ZV19 {
    
    // Írjon olyan függvényt vagy metódust, amely egy karakterláncba vagy sztringbe beszúr
    // egy „a” karaktert véletlenül választott pozícióba (véletlenszám–generátor használható)!
    public static String karaktertBeszur(String s) {
        Random random = new Random();
        //int index = random.nextInt(s.length());
        return s.substring(0, 3) + 'a' + s.substring(3);
    }
    
    public static void main(String[] args) {
        System.out.println(karaktertBeszur("QWERTZ"));
    }
}