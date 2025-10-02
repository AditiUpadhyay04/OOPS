import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();


        list.add(2);
        list.add(12);
        list1.add(28);
        list1.add(32);
        list.add(21);
        list1.add(20);
        list.add(23);
        System.out.println("list is " +list);
        System.out.println("list1 is " +list1);

        // list.get() is used to get the number
        //System.out.println(list.get(5));

        // list.remove is used to remove the number
        //list.remove(3);
        System.out.println(list);
        System.out.println(list.contains(20));

        list.add(54);
        System.out.println(list);

        //list.set(4,638);
        System.out.println(list);

        if(list.equals(list1))
        {
            System.out.println(true);

        }
        else{
            System.out.println(false);
        }


    }
}
