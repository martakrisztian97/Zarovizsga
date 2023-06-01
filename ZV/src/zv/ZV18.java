package zv;

import java.util.Random;

public class ZV18 {
    
    // Írjon olyan függvényt vagy metódust, amely előállít egy 5 karakterből (angol kisbetűs ábécé
    // karaktereit használva) álló véletlen karakterláncot vagy sztringet! Biztosítsa, hogy minden 5
    // hosszú különböző betűkből álló sztring egyenlő valószínűséggel kerüljön kiválasztásra,
    // feltéve, hogy a választott programozási nyelv véletlenszám-generátora egyenletes eloszlást biztosít!
    public static String randomString() {
        Random r = new Random();
        String s = "";
        char c;
        int i;
        while (s.length() < 5) {
            c = (char)(r.nextInt('z' - 'a' + 1) + 'a');
            for (i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) break;
            }
            if (i == s.length()) s += c;
        }
        return s;
    }
    
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(randomString());
        }
    }
}
