import java.lang.String;


public class Stringsss {
    public static void main(String[] args) {
      //  StringBuilder sb = new StringBuilder("aditi");
        //System.out.println(sb);

        //StringBuffer sf = new StringBuffer("Aditi");
        //System.out.println(sf);

        String s1 = "ADITI";
        String s2 = "aditi";

        int n = s1.length();
        System.out.println(n);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s1.trim());
        System.out.println(s1.charAt(3));
        System.out.println(s2.indexOf("i"));

        String name = "Aditi Upadhyay";
        String name1 = "Anubhav";
        System.out.println(name.indexOf("U"));
        System.out.println(name);
        System.out.println(name.trim());
        String name2 = "aditi";
        String name3 = "Anubhav";

        System.out.println(name.compareTo(name1));
        System.out.println(name1.compareTo(name));
        System.out.println(name2.compareTo(name3));
        System.out.println(name1.compareTo(name3));
        System.out.println(name + " " + name2);
        System.out.println(name2.concat(name2));
    }
}
