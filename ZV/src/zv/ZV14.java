package zv;

public class ZV14 {
    
    // Írjon olyan függvényt vagy metódust, amely egy, az angol ábécé betűit tartalmazó
    // karakterláncban vagy sztringben minden szó kezdőbetűjét nagybetűre alakítja!
    public static String szavakNagyKezdobetu(String mondat) {
        String eredmeny = "";
        String[] szavak = mondat.split("\\s");
        for (String s : szavak) {
            //eredmeny += s.substring(0, 1).toUpperCase() + s.substring(1) + ' ';
            if (s.charAt(0) >= 'a' && s.charAt(0) <= 'z')
            eredmeny += (char)(s.charAt(0)-32) + s.substring(1) + ' ';
            else eredmeny += s + ' ';
        }
        return eredmeny.trim();
    }
    
    public static void main(String[] args) {
        System.out.println(szavakNagyKezdobetu("Melyik a világ legősibb városa?"));
    }
}