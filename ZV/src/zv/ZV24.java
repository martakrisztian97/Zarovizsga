package zv;

public class ZV24 {
    
    // Adjon olyan metódust vagy függvényt, ami visszaadja, hogy a paramétereként megadott
    // (pozitív egészekből álló) nemüres tömbben melyik az a legkisebb index, amire az index
    // előtti elemek összege meghaladja a tömb első két elemének szorzatát. Ha nincs ilyen, 0-t adjon vissza.
    public static int zv24(int[] szamok) {
        if (szamok.length < 3) return 0;
        int osszeg = szamok[0] + szamok[1];
        int szorzat = szamok[0] * szamok[1];
        for (int i = 2; i < szamok.length; i++) {
            if (osszeg > szorzat) return i;
            osszeg += szamok[i];
        }
        return 0;
    }
    
    public static void main(String[] args) {
        int[] szamok = {1, 1, 2}; // 2
        int[] szamok2 = {5, 2, 2}; // 0 
        int[] szamok3 = {1, 2}; // 0
        int[] szamok4 = {5, 1, 2}; // 2
        int[] szamok5 = {2, 10, 8, 1}; // 0 
        int[] szamok6 = {2, 10, 9, 1}; // 3 
        int[] szamok7 = {2, 10, 8, 1, 1}; // 4 
        System.out.println(zv24(szamok));
        System.out.println(zv24(szamok2));
        System.out.println(zv24(szamok3));
        System.out.println(zv24(szamok4));
        System.out.println(zv24(szamok5));
        System.out.println(zv24(szamok6));
        System.out.println(zv24(szamok7));
    }
}