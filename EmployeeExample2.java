package CollectionFrameworkPractise;

import java.util.HashMap;
import java.util.Map;

public class EmployeeExample2 {
   private String frstname;
    private String middlename;
    private String lastname;
    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFrstname() {
        return frstname;
    }


    public void setMiddlename(String middlename){
        this.middlename = middlename;
    }

    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }

    public void setFrstname(String frstname)
    {
        this.frstname = frstname;
    }

    public static void main(String[] args) {

        EmployeeExample2 emp4=new EmployeeExample2();
        System.out.println(emp4.hashCode());

        EmployeeExample2 emp5=new EmployeeExample2();
        System.out.println(emp5.hashCode());


        Map<EmployeeExample2,String> s1=new HashMap<>();
        s1.put(emp4,"java1");
        s1.put(emp5,"c#1");
       // s1.put(emp5,"pyth1");
        System.out.println(s1.get(emp4));
        System.out.println(s1.get(emp5));

        emp4.setFrstname("java2");
        emp4.setLastname("c#2");
       // emp4.setMiddlename("pyth2");
        System.out.println(s1.get(s1));
        System.out.println(s1.get(s1));

    }
}
