package zv;

public class ZV24 {
    
    // Adjon olyan metódust vagy függvényt, ami visszaadja, hogy a paramétereként megadott
    // (pozitív egészekből álló) nemüres tömbben melyik az a legkisebb index, amire az index
    // előtti elemek összege meghaladja a tömb első két elemének szorzatát. Ha nincs ilyen, 0-t adjon vissza.
    public static int zv24(int[] szamok) {
        int szorzat = 0;
        int osszeg = 0;
        if (szamok.length > 1) szorzat = szamok[0]*szamok[1];
        for (int i = 0; i < szamok.length; i++) {
            if (szorzat < osszeg) return i;
            osszeg += szamok[i];
        }
        return 0;
    }
    
    public static void main(String[] args) {
        int[] szamok = {1, 1, 2};
        System.out.println(zv24(szamok));
    }
}