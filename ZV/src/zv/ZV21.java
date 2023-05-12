package zv;

public class ZV21 {
    
    // Adjon olyan metódust vagy függvényt, ami eldönti, hogy a paramétereként megadott
    // (pozitív egészekből álló) nemüres tömbben van-e olyan szám, ami az összes többit osztja.
    // (Maradékszámító függvény használható).
    public static boolean vanEMindentOszto(int[] szamok) {
        int db;
        for (int i = 0; i < szamok.length; i++) {
            db = 0;
            for (int j = 0; j < szamok.length; j++) {
                if (szamok[j] % szamok[i] == 0) db++;
                if (db == szamok.length) return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] szamok = new int[]{1, 2, 5};
        if (vanEMindentOszto(szamok)) System.out.println("A tömbben van olyan szám, ami az összes többi osztója.");
        else System.out.println("A tömbben nincs olyan szám, ami az összes többi osztója.");
    }
}