package zv;

public class ZV17 {
    
    // Írjon olyan függvényt vagy metódust, amely kiírja az angol kisbetűs ábécé azon betűit, melyek ASCII kódja négyzetszám!
    public static void negyzetASCII() {
        for (int i = 'a'; i <= 'z'; i++) {
            if (Math.sqrt(i) % 1 == 0) {
                System.out.println((char) i);
            }
        }
    }
    
    public static void main(String[] args) {
        negyzetASCII();
    }
}