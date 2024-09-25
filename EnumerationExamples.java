package CollectionFrameworkPractise;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExamples {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.add("meera");
        v.add("bhise");
        v.add("bhosale");
        Enumeration e=v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
