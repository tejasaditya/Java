
package August24;

import java.util.Locale;

public class I18N {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale lc = Locale.getDefault();
        System.out.println(""+lc.getDisplayCountry());
         System.out.println(""+lc.getCountry());
          System.out.println(""+lc.getDisplayLanguage());
           System.out.println(""+lc.getLanguage());
           
           Locale loc[] = Locale.getAvailableLocales();
           
           for(int i=0;i<loc.length;i++)
           {
               System.out.println(loc[i].getDisplayCountry()+
                       " : "+loc[i].getCountry()+
                       " : "+loc[i].getDisplayLanguage()+
                               " : "+loc[i].getLanguage());
           }
    }
}
