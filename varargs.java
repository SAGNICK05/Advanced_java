public class varargs {

    static int sum(int... arr) {
        int result = 0;
        for (int a : arr)
            result += a;

        return result;
    }

    public static void main(String[] args) {
        System.out.println("sum of 2,3,5 is : " + sum(2, 3, 5));
        System.out.println("sum of 8,2,3,5 is : " + sum(8, 2, 3, 5));
        System.out.println("sum of 2,3,5,7,1 is : " + sum(2, 3, 5, 7, 1));
        System.out.println("sum of nothing is : " + sum());
    }
}
