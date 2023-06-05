package zv;

public class ZV13 {
    
    // Írjon olyan függvényt vagy metódust, amely egy karakterláncról vagy sztringről eldönti,
    // hogy palindróma-e! (Balról olvasva ugyanaz, mint jobbról olvasva.)
    public static boolean palindroma(String s) {
        for (int i = 0; i <= s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(palindroma("a"));
        System.out.println(palindroma("mm"));
        System.out.println(palindroma("kék"));
        System.out.println(palindroma("abba"));
        System.out.println(palindroma("kerek"));
        System.out.println(palindroma("tata"));
        System.out.println(palindroma("Abba"));
    }
}
