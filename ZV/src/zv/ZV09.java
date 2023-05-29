package zv;

public class ZV09 {
    
    // Írjon olyan függvényt vagy metódust, amely egy természetes számról eldönti, hogy a kettes
    // számrendszerbeli felírásában a jobbról második bitje 1 vagy 0 (ne alakítsa át sztringgé/karaktertömbbé)!
    public static int jobbrolMasodikBit(int n) {
        n /= 2;
        return n % 2;
    }
    
    public static void main(String[] args) {
        for (int i = 1; i < 20; i++) {
            convertBinary(i);
            System.out.println();
            System.out.println(jobbrolMasodikBit(i));
            System.out.println("-------");
        }
    }
    
    public static void convertBinary(int num) {
        int binary[] = new int[40];
        int index = 0;
        while (num > 0) {
            binary[index++] = num % 2;
            num = num / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }
}