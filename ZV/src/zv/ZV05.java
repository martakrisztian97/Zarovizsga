package zv;

public class ZV05 {
    
    // Írjon függvényt vagy metódust, amely egy valós szám köbgyökét adja vissza!
    // Használja az xk+1=1/3*(2*xk+a/xk2) sorozatot, amely 'a' köbgyökéhez konvergál, ha x1=1.
    public static double kobgyok(double a) {
        double x = 1;
        for (int i = 0; i < 100; i++) {
            x = (2 * x + a / (x * x) ) / 3;
        }
        return x;
    }
    
    public static void main(String[] args) {
        System.out.println("8 köbgyöke: "+kobgyok(8.0));
        System.out.println("27 köbgyöke: "+kobgyok(27.0));
        System.out.println("64 köbgyöke: "+kobgyok(64.0));
        System.out.println("125 köbgyöke: "+kobgyok(125.0));
        System.out.println("166.4 köbgyöke: "+kobgyok(166.4));
        System.out.println("512 köbgyöke: "+kobgyok(512.0));
        System.out.println("1000 köbgyöke: "+kobgyok(1000.0));
    }
}