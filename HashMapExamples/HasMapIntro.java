package CollectionFrameworkPractise.HashMapExamples;

import java.util.HashMap;
import java.util.Map;

public class HasMapIntro {
    public static void main(String[] args) {
        Map<String , Integer> m=new HashMap<>();
        m.put("java",100);
        m.put("java1",200);
        m.put("java2",300);
        m.put("java3",400);//2065951873
       m.put("java4",500);//1791741888
        m.put("java5",600);//1595428806
       m.put("java6",700);
        System.out.println("before :"+m);
        System.out.println(m.get("java5"));
        System.out.println("after:"+m);
    }
}
