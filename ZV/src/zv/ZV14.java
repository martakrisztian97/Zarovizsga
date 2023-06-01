package zv;

public class ZV14 {
    
    // Írjon olyan függvényt vagy metódust, amely egy, az angol ábécé betűit tartalmazó
    // karakterláncban vagy sztringben minden szó kezdőbetűjét nagybetűre alakítja!
    public static String szavakNagyKezdobetu(String mondat) {
        String[] szavak = mondat.split("\\s");
        String eredmeny = "";
        for (String s : szavak) {
            eredmeny += s.substring(0, 1).toUpperCase() + s.substring(1) + " ";
        }
        return eredmeny;
    }
    
    public static void main(String[] args) {
        System.out.println(szavakNagyKezdobetu("Melyik a világ legősibb városa?"));
    }
}