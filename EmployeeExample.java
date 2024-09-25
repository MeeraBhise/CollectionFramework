package CollectionFrameworkPractise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EmployeeExample {

    @Override
    public int  hashCode()
    {
        return 101;
    }
    public static void main(String[] args) {
        EmployeeExample emp1= new EmployeeExample();
        System.out.println( emp1.hashCode());

        EmployeeExample emp2= new EmployeeExample();
        System.out.println( emp2.hashCode());

        EmployeeExample emp3= new EmployeeExample();
        System.out.println( emp3.hashCode());

        Map<EmployeeExample ,String> l1= new HashMap<>();
        l1.put(emp1,"java");
        l1.put(emp2,"c++");
        l1.put(emp3,"python");
        Set<Integer> set=new HashSet<>();
       // Set<Map.Entry<String,String> > entry =l1.entrySet();
       // for (Map.Entry<String ,String>entry2:entry){
        //}
        System.out.println(l1);
        System.out.println( l1.entrySet());
    }
}
