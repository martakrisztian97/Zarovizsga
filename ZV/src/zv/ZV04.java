package zv;

public class ZV04 {
    
    // A következő közelítő formulát használva írjon függvényt vagy metódust, amely egy valós
    // szám négyzetgyökét adja vissza! Használja az xk+1=1/2*(xk+a/xk) sorozatot, amely a
    // négyzetgyökéhez konvergál, ha x1=1.
    public static double negyzetgyok(double a) {
        double x = 1;
        for (int i = 0; i < 10; i++) {
            x = 0.5 * (x + a / x);
        }
        return x;
    }
    
    public static void main(String[] args) {
        System.out.println("4 négyzetgyöke: "+negyzetgyok(4.0));
        System.out.println("4.41 négyzetgyöke: "+negyzetgyok(4.41));
        System.out.println("9 négyzetgyöke: "+negyzetgyok(9.0));
        System.out.println("16 négyzetgyöke: "+negyzetgyok(16.0));
        System.out.println("25 négyzetgyöke: "+negyzetgyok(25.0));
        System.out.println("36 négyzetgyöke: "+negyzetgyok(36.0));
        System.out.println("81 négyzetgyöke: "+negyzetgyok(81.0));
        System.out.println("2500 négyzetgyöke: "+negyzetgyok(2500.0));
    }
}