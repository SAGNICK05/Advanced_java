import java.io.*;

class reverseArr {
    // int[] reverseArray(int a[]) {
    // int n = a.length;
    // int b[] = new int[n];
    // for (int i = 0; i < n; i++)
    // b[i] = a[n - 1 - i];
    // return b;
    // }

    int[] reverseArray1(int a[]) {
        int temp;
        int n = a.length;
        int low = a[0];
        int high = a[n - 1];
        int mid = low + (high - low) / 2;

        for (int i = 0; i < mid; i++) {
            temp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = temp;
        }

        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        reverseArr r = new reverseArr();
        System.out.println("enter the length of array");
        int n = Integer.parseInt(obj.readLine());
        int arr[] = new int[n];
        System.out.println("enter the elements of the array");
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(obj.readLine());
        int b[] = r.reverseArray1(arr);
        System.out.println("the reversed array is: ");
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i] + " ");

    }
}
