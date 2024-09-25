package CollectionFrameworkPractise.HashMapExamples;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {
    public static void main(String[] args) {
        HashMap<Integer,String>s=new HashMap<>();
        s.put(1,"cv");
        s.put(2,"ds");
        s.put(3,"df");
        for(Map.Entry c:s.entrySet())
        {
            System.out.println(c.getKey()+ "   "+c.getValue());
        }

    }
}
