package zv;

public class ZV26 {
    
    // Adjon metódust vagy függvényt, ami a paraméterként kapott, egészekből álló rendezett
    // tömbben a tömb hosszának logaritmusával arányos lépésszám alatt megkeresi a
    // paraméterként kapott egész első előfordulásának indexét, illetve ha nincs ilyen, akkor -1-et ad vissza. (pl. a bináris keresés)
    public static int binaris(int[] tomb, int n) {
        int also = 0;
        int felso = tomb.length - 1;
        
        while (also <= felso) {
            int kozepso = (also+felso)/2;
            if (tomb[kozepso] == n) return kozepso;
            else if (n < tomb[kozepso]) felso = kozepso-1;
            else also = kozepso+1;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] szamok = {1, 2, 3, 4, 4, 5};
        System.out.println(binaris(szamok, 4));
    }
}