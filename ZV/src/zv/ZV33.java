package zv;

public class ZV33 {

    // Írjon függvényt vagy metódust, mely visszaadja, hogy két pozitív egész paraméterének
    // legkisebb közös többszöröse hány számjegyből áll kettes számrendszerben.
    public static int lkktHanyBinarisSzamjegy(int a, int b) {
        int max = Math.max(a, b);
        int lkkt = max;
        while (lkkt % a != 0 || lkkt % b != 0) {
            lkkt += max;
        }
        
        int szamjegy = 0;
        while (lkkt > 0) {
            lkkt /= 2;
            szamjegy++;
        }
        return szamjegy;
    }
    
    public static void main(String[] args) {
        System.out.println(lkktHanyBinarisSzamjegy(5, 7));
        System.out.println(lkktHanyBinarisSzamjegy(1, 1));
        System.out.println(lkktHanyBinarisSzamjegy(1, 2));
        System.out.println(lkktHanyBinarisSzamjegy(2, 4));
    }
}
