package zv;

public class ZV22 {

    // Adjon olyan metódust vagy függvényt, ami eldönti, hogy a paramétereként megadott
    // (pozitív egészekből álló) nemüres tömbben van-e olyan szám, ami az összes többinél többször fordul elő.
    public static void tobbszorMintATobbi(int[] szamok) {
        int maxIndex = 0;
        for (int i = 1; i < szamok.length; i++) {
            if (szamok[i] > szamok[maxIndex]) {
                maxIndex = i;
            }
        }
        
        int[] gyakorisagok  = new int[szamok[maxIndex]+1];
        
        for (int i = 0; i < szamok.length; i++) {
            gyakorisagok[szamok[i]]++;
        }
        
        for (int i = 0; i < szamok.length; i++) {
            System.out.println(szamok[i]+" "+gyakorisagok[szamok[i]]);
        }
    }
    
    public static void main(String[] args) {
        int[] szamok = {1, 1, 2, 2, 3, 4};
        //System.out.println(tobbszorMintATobbi(szamok));
        tobbszorMintATobbi(szamok);
    }
}
