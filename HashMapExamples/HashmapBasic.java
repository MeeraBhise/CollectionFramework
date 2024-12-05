package CollectionFrameworkPractise.HashMapExamples;

import java.util.HashMap;
import java.util.Map;

public class HashmapBasic {
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public int hashCode()
    {
        return age;
    }

    public static void main(String[] args) {
        HashMap<HashmapBasic, String> s = new HashMap<>();
        HashmapBasic o1 = new HashmapBasic();
        o1.setAge(203);
        s.put(o1, "one");
        for (Map.Entry<HashmapBasic, String> s1 : s.entrySet())
        {
            System.out.println(s1.getKey());
            System.out.println(s1.getValue());
        }
        o1.setAge(10983);
        System.out.println(s.get(o1));
    }
}
