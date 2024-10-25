/*accept a number and form a new number by arranging its digits in deescending order
 * ex: number is : 51463
 *     output is : 65431
 */

import java.io.*;

public class number_des {
    int n;

    void accept() throws IOException {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number");
        n = Integer.parseInt(obj.readLine());
    }

    int maxDigit(int a) {
        int b = a, max = 0, r, i = 0, imax = 0;
        while (b > 0) {
            r = b % 10;
            if (r > max) {
                max = r;
                imax = i;
            }
            b /= 10;
            i++;
        }
        imax = countdigits(a) - imax;
        return imax;
    }

    int countdigits(int n) {
        int cdig = 0;
        while (n > 0) {
            cdig++;
            n /= 10;
        }
        return cdig;
    }

    void desc() {
        int n2 = 0, b = n, first, last, Gdig, imax;
        while (b > 0) {
            imax = maxDigit(b);
            first = b / (int) Math.pow(10, (countdigits(b) - imax));
            last = b % (int) Math.pow(10, (countdigits(b) - imax));
            Gdig = first % 10;
            n2 = n2 * 10 + Gdig;
            b = ((first) / 10) * (int) Math.pow(10, countdigits(last)) + last;
        }
        System.out.println("the new number is : " + n2);
    }

    public static void main(String[] args) throws IOException {
        number_des nd = new number_des();
        nd.accept();
        nd.desc();
    }
}
