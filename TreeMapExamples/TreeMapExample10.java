package CollectionFrameworkPractise.TreeMapExamples;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapExample10 {
    public static void main(String[] args) {
        TreeMap<String ,String>s1=new TreeMap<String,String>(new Sort_key());
        s1.put("b","bharat");
        s1.put("a","ashwini");
        s1.put("d","digambar");
        s1.put("c","chetan");
        System.out.println(s1);
    }
}
class Sort_key implements Comparator<String>
{
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}