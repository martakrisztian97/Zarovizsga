package zv;

public class ZV29 {
    
    // Írjon függvényt vagy metódust, mely valós típusú paraméterének azt a számjegyét adja
    // vissza, amelyik a tizedes pont után áll! (a megoldás során ne használjon sztringeket/karaktertömböket)
    public static int tized(double d) {
        d = Math.abs(d);
        return (int) (d * 10) % 10;
    }
    
    public static void main(String[] args) {
        System.out.println(tized(-12.345));
    }
}