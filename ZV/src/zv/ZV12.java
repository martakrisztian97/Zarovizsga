package zv;

public class ZV12 {
    
    // Írjon olyan függvényt vagy metódust, amely egy karakterláncból vagy sztringből a
    // számjegyek kivételével minden karaktert eltávolít!
   public static String eltavolit(String s) {
       String eredmeny = "";
       char c;
       for (int i = 0; i < s.length(); i++) {
           c = s.charAt(i);
           if (c >= '0' && c <= '9' ) {
               eredmeny += c;
           }
       }
       return eredmeny;
   }
   
    public static void main(String[] args) {
        System.out.println(eltavolit("INTEL CORE i5 8th Gen"));
    }
}