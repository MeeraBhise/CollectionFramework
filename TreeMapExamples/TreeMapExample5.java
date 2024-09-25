package CollectionFrameworkPractise.TreeMapExamples;

import java.util.TreeMap;

public class TreeMapExample5 {
    public static void main(String[] args) {
        TreeMap<Integer,String>s1=new TreeMap<>();
        s1.put(10,"mnb");
        s1.put(20,"xcv");
        s1.put(30,"umc");
        s1.put(40,"irjg");
        s1.put(50,"fbv");
        s1.put(60,"bng");
        System.out.println("original tree Map is :"+s1);
        System.out.println("the value is greater than or equal to :"+s1.ceilingEntry(20));
        System.out.println("the value is greater than or qual to :"+s1.containsKey(10));
        System.out.println("the value is greater than or qual to :"+s1.ceilingKey(30));
        System.out.println("the value is greater than or qual to :"+s1.containsValue("bndg"));
    }
}
