package zv;

import java.util.Random;

public class ZV19 {
    
    // Írjon olyan függvényt vagy metódust, amely egy karakterláncba vagy sztringbe beszúr
    // egy „a” karaktert véletlenül választott pozícióba (véletlenszám–generátor használható)!
    public static String karaktertBeszur(String s) {
        Random r = new Random();
        int index = r.nextInt(s.length() + 1); // + 1, mivel a végére is szúrhatja
        return s.substring(0, index) + 'a' + s.substring(index);
    }
    
    public static void main(String[] args) {
        System.out.println(karaktertBeszur("VISZLÁT"));
    }
}