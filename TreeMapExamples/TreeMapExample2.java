package CollectionFrameworkPractise.TreeMapExamples;

import java.util.TreeMap;

public class TreeMapExample2 {
    public static void main(String[] args) {
        TreeMap<String,String>s=new TreeMap<>();
        s.put("awe","cdhyec");
        s.put("aok","kdsfv");
        s.put("aas","cdhjcvc");
        s.put("asa","dchdv");
        s.put("am","mkiji");
        s.put("bsd","cdwrwq");
       // System.out.println("map1:"+s);
       TreeMap<String,String>s2=new TreeMap<>();
       s2.put("fiv","cdtrdhyf");
       s2.put("fct","ugit");
        //System.out.println("map2:"+s2);
        s.putAll(s2);
        System.out.println(s);
    }
}
