package CollectionFrameworkPractise.HashMapExamples;

import java.util.HashMap;

public class HashCodeExample6 {
    public static void main(String[] args) {
        HashMap<Integer,String> s1=new HashMap<>();
        s1.put(1,"fdv");
        s1.put(2,"gfn");
        s1.put(3,"bvb");
         HashMap<Integer,String>s2=new HashMap<>();
        s2=(HashMap)s1.clone();
        System.out.println("cloned hashmap:"+s2);
    }
}
