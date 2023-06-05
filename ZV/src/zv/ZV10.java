package zv;

public class ZV10 {
    
    // Írjon olyan függvényt vagy metódust, amelynek paramétere egy 1 < x < 10 természetes szám,
    // és kiírja az 1,3,4,6,7,9,10,12,... sorozat első öt x-szel osztható elemét, azaz a sorozat
    // i+1-edik tagja 2-vel nagyobb az i-ediknél, ha i páratlan, s eggyel nagyobb az i-ediknél, ha i páros!
    public static void sorozat(int x) {
        int db = 0;
        int i = 1;
        int sorozatN = 1;
        while (db < 5) {
            if (sorozatN % x == 0) {
                System.out.println(sorozatN);
                db++;
            }
            
            if (i % 2 == 1) {
                sorozatN += 2;
            } else {
                sorozatN++;
            }
            i++;
        }
    }
    
    public static void main(String[] args) {
        sorozat(2); System.out.println();
        sorozat(3); System.out.println();
        sorozat(7); System.out.println();
        sorozat(9); System.out.println();
    }
}