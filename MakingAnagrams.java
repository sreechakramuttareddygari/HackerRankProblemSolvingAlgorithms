import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MakingAnagrams {

    // Complete the makingAnagrams function below.
    static int makingAnagrams(String s1, String s2) {
     int[] a =new int[26];
     int[] b =new int[26];
     int count=0;
     for(int i=0;i<26;i++)
     {a[i]=0;
      b[i]=0;}
     for(int i =0;i<s1.length();i++)
     a[s1.charAt(i)-'a']++;
     for(int i=0;i<s2.length();i++)
     b[s2.charAt(i)-'a']++;
     for(int i=0;i<26;i++)
     {count += Math.abs(a[i]-b[i]);
      System.out.println(a[i]+" "+b[i]);}
     return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = scanner.nextLine();

        String s2 = scanner.nextLine();

        int result = makingAnagrams(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
