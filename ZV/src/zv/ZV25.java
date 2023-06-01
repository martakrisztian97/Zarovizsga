package zv;

public class ZV25 {
    
    // Adjon egy metódust vagy függvényt, ami paraméterként adott s sztring/karaktertömb, c
    // karakter és n pozitív egész szám esetén megadja, hogy a c karakter n-edik előfordulása
    // hányadik pozíción van az „s” sztringben.
    public static int pozicio(String s, char c, int n) {
        int db = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                db++;
                if (n == db) return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        System.out.println(pozicio("LeBron Raymone James amerikai profi kosárlabdázó", 'e', 0)); // -1
        System.out.println(pozicio("LeBron Raymone James amerikai profi kosárlabdázó", 'e', 1)); // 1
        System.out.println(pozicio("LeBron Raymone James amerikai profi kosárlabdázó", 'e', 2)); // 13
        System.out.println(pozicio("LeBron Raymone James amerikai profi kosárlabdázó", 'e', 3)); // 18
        System.out.println(pozicio("LeBron Raymone James amerikai profi kosárlabdázó", 'e', 4)); // 23
        System.out.println(pozicio("LeBron Raymone James amerikai profi kosárlabdázó", 'e', 5)); // -1
    }
}