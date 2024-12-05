package CollectionFrameworkPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C1 {
    public static void main(String[] args) {
     /*   List< String>a=new ArrayList();
        a.add("meera");
        a.add("mehar");
        a.add("ranjeet");
        System.out.println(a);*/

    String [] geeks={"meera","mehar"};
    List<String>a1=new ArrayList<>();
        Collections.addAll(a1,geeks);
        System.out.println(a1);
    }
}
