import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class GameOfThrones{

    // Complete the gameOfThrones function below.
    static String gameOfThrones(String s) {
    int[] a = new int[26];
    if(s.length()>1)
    {for(int i=0;i<s.length();i++)
     a[s.charAt(i)-'a']++;
     int c=0;
     for(int i=0;i<26;i++)
     if(a[i]%2==1)
     c++;
     if(c==1 && s.length()%2==1)
     return "YES";
     else if(c==0 && s.length()%2==0)
     return "YES";
     else
     return "NO";}
     else
     return "YES";


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = gameOfThrones(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
