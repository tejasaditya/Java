package aug18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class Test7 
{
    public static void main(String[] args) 
    {
        //HashMap hm = new HashMap();
        //LinkedHashMap hm = new LinkedHashMap();
        TreeMap hm = new TreeMap();
        
        hm.put(101, "A");
        hm.put(105, "B");
        hm.put(103, null);
        hm.put(105, "X");
        hm.put(104, "M");
        //hm.put(null, "P");        //key cannot be null in TreeMap 
        
        //dipslay
        Set s = hm.keySet();        //gets the set of keys
        Iterator itr = s.iterator();
        while(itr.hasNext())
        {
            Integer key = (Integer)itr.next();
            String val = (String)hm.get(key);
            System.out.println(key+" : "+val);
        }
    }
}