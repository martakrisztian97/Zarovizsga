package zv;

public class ZV02 {
    
    // Írjon olyan függvényt vagy metódust, amely egy természetes számról eldönti,
    // hogy tökéletes szám-e, vagy sem! (pozitív osztóinak összege a szám kétszerese)
    public static boolean tokeletesSzamE(int n) {
        if (n < 0) {
            System.out.println("A(z) "+n+" nem természetes szám!");
            return false;
        }
        
        int osszeg = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) osszeg += i;
        }
        return osszeg == (n*2);
    }
    
    public static void main(String[] args) {
        if (tokeletesSzamE(-1)) System.out.println("A(z) "+-1+" tökéletes szám.");
        else System.out.println("A(z) "+-1+" nem tökéletes szám.");
        
        if (tokeletesSzamE(1)) System.out.println("A(z) "+1+" tökéletes szám.");
        else System.out.println("A(z) "+1+" nem tökéletes szám.");
        
        if (tokeletesSzamE(6)) System.out.println("A(z) "+6+" tökéletes szám.");
        else System.out.println("A(z) "+6+" nem tökéletes szám.");
        
        if (tokeletesSzamE(28)) System.out.println("A(z) "+28+" tökéletes szám.");
        else System.out.println("A(z) "+28+" nem tökéletes szám.");
        
        if (tokeletesSzamE(100)) System.out.println("A(z) "+100+" tökéletes szám.");
        else System.out.println("A(z) "+100+" nem tökéletes szám.");
        
        if (tokeletesSzamE(496)) System.out.println("A(z) "+496+" tökéletes szám.");
        else System.out.println("A(z) "+496+" nem tökéletes szám.");
        
        if (tokeletesSzamE(8128)) System.out.println("A(z) "+8128+" tökéletes szám.");
        else System.out.println("A(z) "+8128+" nem tökéletes szám.");
        
        if (tokeletesSzamE(33550336)) System.out.println("A(z) "+33550336+" tökéletes szám.");
    }
}