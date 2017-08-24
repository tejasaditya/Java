
package August18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test5 {

    public static void main(String[] args) 
    {
        HashMap hm = new HashMap();
        
        hm.put(101, "A");
        hm.put(105, "X");
        hm.put(103, null);
        hm.put(105, "X");
        hm.put(104, "M");
        hm.put(null, "P");
        
        //display
        Set s = hm.keySet();
        Iterator itr = s.iterator();
        
        
                
                
    }
    
}
