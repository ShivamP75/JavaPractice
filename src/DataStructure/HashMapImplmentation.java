package DataStructure;

public class HashMapImplmentation {
    public static void main(String[] args) {
        String s2 = "Hello";
        String s1 = new String("Hello");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
