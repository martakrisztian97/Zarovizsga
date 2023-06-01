package zv;

public class ZV15 {
    
    // Írjon olyan függvényt vagy metódust, amely egy karakterláncból vagy sztringből eltávolítja
    // egy megadott karakter összes előfordulását!
    public static String karatkerekEltavolit(String s, char c) {
        String eredmeny = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != c) {
                eredmeny += s.charAt(i);
            }
        }
        return eredmeny;
    }
    
    public static void main(String[] args) {
        String mondat = karatkerekEltavolit("EzXXX aXXX mondat Xtele volt Xikszekkel.", 'X');
        System.out.println(mondat);
    }
}