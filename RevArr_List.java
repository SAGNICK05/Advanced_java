import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static List<Integer> reverseArray(List<Integer> a) {
        int n = a.size();
        ArrayList<Integer> b = new ArrayList<Integer>();
        for (int i = n - 1; i >= 0; i--)
            b.add(a.get(i));
        return b;

    }

}

public class RevArr_List {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine()
                .replaceAll("\\s+$", "")
                .split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> res = Result.reverseArray(arr);

        bufferedWriter.write(res.stream()
                .map(Object::toString)
                .collect(joining(" ")) + "\n");

        bufferedReader.close();
        bufferedWriter.close();
    }
}