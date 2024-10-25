//accept a string and arrange the words in ascending order of lengths

import java.util.*;

class String_des {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentence");
        String s = sc.nextLine();
        String regex = "[ \\,\\.]";
        String arr[] = s.split(regex);

        String str = Arrays.toString(arr);
        System.out.println("the elements of arrays are : " + str);

        // ArrayList<String> sarr = new ArrayList<String>();
        // for (int i = 0; i < arr.length; i++)
        // sarr.add(arr[i]);

        Arrays.sort(arr, Comparator.comparing(String::length));
        System.out.println("the sorted array is : " + Arrays.toString(arr));
        sc.close();
    }
}
