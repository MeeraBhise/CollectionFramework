package CollectionFrameworkPractise;

import java.util.HashSet;
import java.util.Set;

public class C2
{
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        for (int i=0;i<=10;i++){
            s.add(i);
        }
        s.stream().forEach(System.out::print);
        s.remove(s);
       // System.out.println(s);
        s.stream().forEach(System.out::print);
    }
}




