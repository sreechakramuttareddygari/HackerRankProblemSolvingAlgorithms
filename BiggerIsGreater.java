import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BiggerIsGreater {

    // Complete the biggerIsGreater function below.
    static String biggerIsGreater(String w) {
    int c=0;
    for(int i=w.length()-1;i>=0;i--)
    {
       for(int j=w.length()-1;j>i;j--)
       {
           if(w.charAt(j)>w.charAt(i))
           {  String rev = "";
               w=w.substring(0,i)+w.charAt(j)+w.substring(i+1,j)+w.charAt(i)+w.substring(j+1,w.length());
               for(int k=w.length()-1;k>i;k--)
               {
                   rev=rev+w.charAt(k);
               }

               w=w.substring(0,i+1)+rev;
               return w;
           }
       }
    }
    return "no answer";

    }

    public static void main(String[] args) throws IOException {
      File file = new File("Untitled.txt");
      final Scanner scanner = new Scanner(file);
      File res = new File("result.txt");
      FileWriter fr = new FileWriter(res);
        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int TItr = 0; TItr < T; TItr++) {
            String w = scanner.nextLine();

            String result = biggerIsGreater(w);
            System.out.println(result);
            fr.write(result+'\n');
        }

        scanner.close();
    }
}
