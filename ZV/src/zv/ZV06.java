package zv;

public class ZV06 {
    
    // Írjon függvényt vagy metódust, amely kiszámolja az n-edik Fibonacci számot!
    // A Fibonacci sorozatot az an=an-2+an-1 rekurzióval definiálja (n>2), ahol a1=a2=1.
    public static int fibonaccsi(int n) {
        if (n <= 2) return 1;
        else return fibonaccsi(n-2) + fibonaccsi(n-1);
    }
    
    public static void main(String[] args) {
        for (int i = 1;  i <= 10; i++) {
            System.out.println(i+". Fibonaccsi szám: "+fibonaccsi(i));
        }
    }
}