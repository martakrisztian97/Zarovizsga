package zv;

public class ZV16 {
    
    // Írjon olyan függvényt vagy metódust, amely megszámolja egy adott karakterlánc vagy
    // sztring összes előfordulását egy másik karakterláncban vagy sztringben!
    public static int sztringElofordulasa(String s, String keres) {
        int db = 0;
        int index = 0;
        while ( (index = s.indexOf(keres, index)) != -1 ) { // 2. paraméter, hogy melyik indextől kezdje a keresést
            db++;
            index += keres.length();
        }
        return db;
    }
    
    public static void main(String[] args) {
        System.out.println(sztringElofordulasa("Te tetted-e e tettetett tettet, te tettetett tettek tettese, te!", "te"));
        System.out.println(sztringElofordulasa("Te tetted-e e tettetett tettet, te tettetett tettek tettese, te!", "Te"));
        System.out.println(sztringElofordulasa("te te te!", "te"));
    }
}