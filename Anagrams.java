import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Anagrams {

    // Complete the anagram function below.
    static int anagram(String s) {
        int count=0;
    if(s.length()%2==0)
    { int[] count1 = new int[26];
      int[] count2 = new int[26];
      for(int i=0;i<26;i++)
      {
          count1[i]=0;
          count2[i]=0;
      }
      for(int i=0;i<s.length()/2;i++)
      {
          count1[s.charAt(i)-'a']++;
      }
      for(int i=s.length()/2;i<s.length();i++)
      {
          count2[s.charAt(i)-'a']++;
      }
      for(int i=0;i<26;i++)
      {System.out.print(count1[i]);
       System.out.print(" ");
       System.out.print(count2[i]);
       System.out.println();}
       System.out.println();
      for(int i=0;i<26;i++)
      {
          count=count+Math.abs(count1[i]-count2[i]);
      }
      return count/2;
    }
    else
    return -1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = anagram(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
