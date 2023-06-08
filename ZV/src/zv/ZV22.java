package zv;

public class ZV22 {

    // Adjon olyan metódust vagy függvényt, ami eldönti, hogy a paramétereként megadott
    // (pozitív egészekből álló) nemüres tömbben van-e olyan szám, ami az összes többinél többször fordul elő.
    public static boolean tobbszorMintATobbi(int[] szamok) {
        int max = 0;
        for (int i = 0; i < szamok.length; i++) {
            if (szamok[i] > szamok[max]) {
                max = i;
            }
        }
        
        int[] gyak = new int[szamok[max]];
        for (int i = 0; i < szamok.length; i++) {
            gyak[szamok[i]-1]++;
        }
        
        for (int i = 0; i < gyak.length-1; i++) {
            for (int j = 0; j < gyak.length-i-1; j++) {
                if (gyak[j] < gyak[j+1]) {
                    int temp = gyak[j];
                    gyak[j] = gyak[j+1];
                    gyak[j+1] = temp;
                }
            }
        }
        
        if (gyak.length > 1 && gyak[0] > gyak[1] && gyak[0] != 0) return true;
        
        return false;
    }
    
    public static void main(String[] args) {
        int[] szamok = {1, 1, 1, 2, 2, 3, 3, 4, 5, 6, 7};
        int[] szamok2 = {0};
        int[] szamok3 = {2, 2};
        int[] szamok4 = {1, 1, 1, 1, 1, 1};
        System.out.println(tobbszorMintATobbi(szamok2));
    }
   
}