package CollectionFrameworkPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSort123 implements Comparable<EmployeeSort123>{
    String  firstname;
    String lastname;
    int salary;
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public int getSalary() {
        return salary;
    }
    public EmployeeSort123(String firstname, String lastname, int salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeSort{" +
                "firstName='" + firstname + '\'' +
                ", lastName='" + lastname + '\'' +
                ", salary=" + salary +
                '}';
    }
    @Override
    public int compareTo(EmployeeSort123 o) {
        return this.getSalary() - o.getSalary();
    }
}
 class EmployeeClassSorting123{
    public static void main(String[] args) {
        EmployeeSort123 es1 = new EmployeeSort123("k","B", 15000);
        EmployeeSort123 es2 = new EmployeeSort123("Z","P", 10000);
        EmployeeSort123 es3 = new EmployeeSort123("B","L", 55000);
        EmployeeSort123 es4 = new EmployeeSort123("R","M", 5000);

        List<EmployeeSort123> list = new ArrayList<>();
        list.add(es1);
        list.add(es2);
        list.add(es3);
        list.add(es4);
        System.out.println("Before sorting "+list);
        Collections.sort(list);
        System.out.println("After sorting "+list);
    }
}
