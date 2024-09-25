package CollectionFrameworkPractise.TreeMapExamples;

import java.util.TreeMap;

public class TreeMapExample3 {
    public static void main(String[] args) {
        TreeMap<String,String>s1=new TreeMap<>();
        s1.put("c1","djhcjc");
        s1.put("c2","kijcs");
        s1.put("c3","djhcjc");
        s1.put("c4","kijcs");
        s1.put("c5","djhcjc");
        s1.put("c6","kijcs");
        if(s1.containsKey("c2"))
        {
            System.out.println("treemap contains  key  c2 ");
        }
        else{
            System.out.println("treemap does not contains c2 key");
        }
        if(s1.containsKey("c5"))
        {
            System.out.println("treemap contains key c5 ");
        }else {
            System.out.println("treemap doesnot contain  key c5");
        }
        if(s1.containsKey("c9"))
        {
            System.out.println("conatins key ");
        }else{
            System.out.println("does not contains");
        }
    }
}
