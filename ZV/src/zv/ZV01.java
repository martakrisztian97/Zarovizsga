package zv;

public class ZV01 {
    
    // Írjon olyan függvényt vagy metódust, amely egy természetes számról eldönti, hogy prímszám-e, vagy sem!
    public static boolean primE(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        if (primE(1)) System.out.println("A(z) "+1+" prímszám.");
        else  System.out.println("A(z) "+1+" nem prímszám.");
        
        if (primE(2)) System.out.println("A(z) "+2+" prímszám.");
        else  System.out.println("A(z) "+2+" nem prímszám.");
        
        if (primE(4)) System.out.println("A(z) "+4+" prímszám.");
        else  System.out.println("A(z) "+4+" nem prímszám.");
    }
}