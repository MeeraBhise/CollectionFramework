package CollectionFrameworkPractise.TreeMapExamples;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer,String>treemap=new TreeMap<>();
        treemap.put(1,"java");
        treemap.put(2,"python");
        treemap.put(3,"c++");
        for(Map.Entry<Integer,String>entry:treemap.entrySet())
        {
            System.out.println(entry.getKey()+ " ==> "+entry.getValue());
        }
    }
}
