/*public class StringPoolConcept {
    public static void main(String[] args) {
        String s1 = "Aditi"; // pool
        String s2 = "aditi";// pool
        String s3 = "upadhyay";//pool
        String s4 = "Upadhyay";//pool
        String s5 = "IT";//pool
        String s6 = new String("it");//heap
        String s7 = new String("Aditi");//heap
        String s8 = new String("Upadhyay");//heap
        String s9 = new String("aditi");//heap
        String s10 = s3;//pool
        String s11 = s9;//pool
        String s12 = s7;//pool

        System.out.println(s1 == s3);
        System.out.println(s1 == s5);
        System.out.println(s2 == s7);
        System.out.println(s7 == s6);
        System.out.println(s9 == s8);
        System.out.println(s5 == s12);
        System.out.println(s4 == s11);
        System.out.println(s12 == s10);
        System.out.println(s7 == s2);
        System.out.println(s8 == s9);
        System.out.println(s11 == s12);
        System.out.println(s3== s4);
        System.out.println(s8 == s8);


        String s1 = "hello"; //pool
        String s2 = new String("Hello"); // heap
        String s3 = s2.intern();// pool(intern ki vjh se object heap me nahi banta balki pool me banta hai)
        System.out.println(s1 == s2);
        System.out.println(s3 == s1);
        System.out.println(s2 == s3);



    }
}

       */
