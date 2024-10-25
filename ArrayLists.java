import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        // add elements to the list
        list.add(5);
        list.add(8);
        list.add(3);
        System.out.println("the list is :" + list);// prints [5, 8, 3]

        // get an element at a particular index
        int a = list.get(0);
        System.out.println("element at 0th index is : " + a);

        // add elements in between
        list.add(1, 2);// adds elements at the 1st index
        System.out.println("after adding 2 at 1st index" + list);// displpays [5, 2, 8, 3]

        // set elements at a particular index
        System.out.println("the list before change : " + list);
        list.set(3, 10);
        System.out.println("the list after change : " + list);

        // delete elements at a particukar index
        System.out.println("the list before delete : " + list);
        list.remove(2);
        System.out.println("the list after delete: " + list);

        // display size of list
        System.out.println("size of list is: " + list.size());

        // display all elements of the list
        System.out.println("the elemenst of the arrayList are : ");
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
        // we can also do this by System.out.println("the list is :" + list)

        // sorting the list
        list.sort(null);
        System.out.println("after sorting: " + list);
    }
}
