import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LarrysArray {

    // Complete the larrysArray function below.
    static String larrysArray(int[] A) {
    int c=0;
        for(int j=0;j<A.length;j++)
        {
            for(int k=j+1;k<A.length;k++)
            {
                if(A[j]>A[k])
                c++;
            }
        }
        if(c%2==0)
        return "YES";
        else
        return "NO";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      File file = new File("Untitled.txt");
      final Scanner scanner = new Scanner(file);
      File res = new File("result.txt");
      FileWriter fr = new FileWriter(res);
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] A = new int[n];

            String[] AItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int AItem = Integer.parseInt(AItems[i]);
                A[i] = AItem;
            }

            String result = larrysArray(A);
            System.out.println(result);
            fr.write(result+'\n');
        }

        scanner.close();
    }
}
