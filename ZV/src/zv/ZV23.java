package zv;

public class ZV23 {
    
    // Adjon olyan metódust vagy függvényt, ami visszaadja, hogy a paramétereként megadott
    // (pozitív egészekből álló) nemüres tömbben melyik index az, ahol a leghosszabb
    // folyamatosan növekvő részsorozat kezdődik. Ha több ilyen index is van, az utolsót adja vissza.
    public static int resz(int[] t) {
        int hossz = 0;
        int leg = 0;
        int ind = 0;
        int i;
        for (i = 0; i < t.length-1; i++) {
            if (t[i] < t[i+1]) {
                hossz++;
            } else {
                if (leg <= hossz) {
                    leg = hossz;
                    ind = i - hossz;
                }
                hossz = 0;
            }
        }
        
        if (leg <= hossz) {
            leg = hossz;
            ind = i - hossz;
        }
        return ind;
    }
    
    public static void main(String[] args) {
        int[] szamok = {1, 2, 3}; // 0
        int[] szamok2 = {1, 2, 3, 4, 1, 2, 3, 4}; // 4
        int[] szamok3 = {1}; // 0
        int[] szamok4 = {1, 1}; // 1
        int[] szamok5 = {2, 1, 1}; // 2
        int[] szamok6 = {1, 2, 3, 1, 2}; // 0
        System.out.println(resz(szamok));
        System.out.println(resz(szamok2));
        System.out.println(resz(szamok3));
        System.out.println(resz(szamok4));
        System.out.println(resz(szamok5));
        System.out.println(resz(szamok6));
    }
}
