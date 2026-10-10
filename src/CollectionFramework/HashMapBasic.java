package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasic {
    static void main() {
        Map<String,String> mp=new HashMap<>();

        //insertion
        mp.put("in","India");
        mp.put("eg","Englend");
        mp.put("us","Uniated State" );

        System.out.println(mp);

        Map<String,String> table=new HashMap<>();
        table.put("br","Brazil");

        System.out.println("befor:" + table);
        table.putAll(mp);
        System.out.println("After:"+ table);

        //delection

        table.remove("en");
        System.out.println(table);
    }
}
