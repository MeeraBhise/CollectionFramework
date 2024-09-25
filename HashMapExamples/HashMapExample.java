package CollectionFrameworkPractise.HashMapExamples;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String ,Integer> map=new HashMap<>();
        map.put("java1",10);
        map.put("java2",20);
        map.put("java3",30);
        map.put("java4",40);
        map.remove("java4",40);
       for( Map.Entry<String,Integer> entry:map.entrySet())
       {
           String key= entry.getKey();
           Integer value= entry.getValue();
           System.out.println("object:"+key  +"values:"+value);
       }
    }
}
