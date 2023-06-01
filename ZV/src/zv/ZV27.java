package zv;

public class ZV27 {
    
    // Írjon függvényt vagy metódust, mely visszaadja két egész paramétere szorzatának balról
    // második számjegyét! (a megoldás során ne használjon sztringeket/karaktertömböket)
    public static int balrolMasodik(int a, int b) {
        int szorzat = Math.abs(a*b);
        while (szorzat > 100) {
            szorzat /= 10;
        }
        return szorzat % 10;
    }
    
    public static void main(String[] args) {
        int szam1 = 123;
        int szam2 = 456;
        System.out.println(szam1*szam2);
        System.out.println(balrolMasodik(szam1, szam2));
    }
}
