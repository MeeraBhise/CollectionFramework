package CollectionFrameworkPractise.HashMapExamples;

import java.util.HashMap;
import java.util.Set;

public class HashMapExample5 {
    public static void main(String[] args) {
        HashMap<Integer,String>s1=new HashMap<>();
        s1.put(1,"ngf");
        s1.put(2,"nvn");
        Set keyset=s1.keySet();
        System.out.println(keyset);

    }
}
