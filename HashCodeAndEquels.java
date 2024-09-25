package CollectionFrameworkPractise;

public class HashCodeAndEquels {
    @Override
    public int hashCode()
    {
        return 100;
    }
    public static void main(String[] args) {
        HashCodeAndEquels s1=new HashCodeAndEquels();
        System.out.println( s1.hashCode());

        HashCodeAndEquels s2=new HashCodeAndEquels();
        System.out.println(s2.hashCode());

        HashCodeAndEquels s3=new HashCodeAndEquels();
        System.out.println(s3.hashCode());

       boolean b=s1.equals(s3);
        System.out.println(b);
    }
}
