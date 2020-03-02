import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class QueensAttack {

    // Complete the queensAttack function below.
    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
    //straight
    int sT=0,x,y;
    x=r_q;
    y=c_q;
    int ele=n+1;
    for(int i=0;i<k;i++)
    { if(y==obstacles[i][1]&&obstacles[i][0]>x)
      {ele = Math.min(ele,obstacles[i][0]);
       System.out.println(" "+obstacles[i][0]);
       }
    }
     sT=ele-x;
     System.out.println(sT);
    //back
    int sB=0;
    x=r_q;
    y=c_q;
   ele=0;
    for(int i=0;i<k;i++)
    { if(y==obstacles[i][1]&&obstacles[i][0]<x)
      {ele = Math.max(ele,obstacles[i][0]);
       System.out.println(" "+obstacles[i][0]);}
    }
    sB=x-ele;
    //right
    int rT=0;
    x=r_q;
    y=c_q;
    ele=n+1;
    for(int i=0;i<k;i++)
    { if(x==obstacles[i][0]&&y<obstacles[i][1])
      {ele = Math.min(ele,obstacles[i][1]);
       System.out.println(" "+obstacles[i][1]);}
    }
    rT=ele-y;
    //lT
    int lT=0;
    x=r_q;
    y=c_q;
    ele=0;
    for(int i=0;i<k;i++)
    { if(x==obstacles[i][0]&&y>obstacles[i][1])
      {ele = Math.max(ele,obstacles[i][1]);
       System.out.println(" "+obstacles[i][1]);}
    }
    lT=y-ele;
    //rightUpDiagional

    int rUD=0;
    x=r_q;
    y=c_q;
    ele=Math.min(n+1-x,n+1-y);
    for(int i=0;i<k;i++)
    {if(obstacles[i][0]-x==obstacles[i][1]-y&&(obstacles[i][0]-x>0))
      {ele = Math.min(ele,obstacles[i][1]-y);
       System.out.println(" "+(obstacles[i][1]-y));}
    }
    rUD=ele;

    //rightDownDiagional

    int rDD=0;
    x=r_q;
    y=c_q;
    while(y!=n+1&&x!=0)
    {int count=0;
    for(int i=0;i<k;i++)
    { if(x==obstacles[i][0]&&y==obstacles[i][1])
      {count++;
       break;}
    }
    if(count==0)
    {rDD++;
     y++;
     x--;}
     else
     break;
    }
   System.out.println(rDD);
   //leftUpDiagional

    int lUD=0;
    x=r_q;
    y=c_q;
    while(y!=0&&x!=n+1)
    {int count=0;
    for(int i=0;i<k;i++)
    { if(x==obstacles[i][0]&&y==obstacles[i][1])
      {count++;
       break;}
    }
    if(count==0)
    {lUD++;
     y--;
     x++;}
     else
     break;
    }
   System.out.println(lUD);
   //leftDownDiagional

    int lDD=0;
    x=r_q;
    y=c_q;
    while(y!=0&&x!=0)
    {int count=0;
    for(int i=0;i<k;i++)
    { if(x==obstacles[i][0]&&y==obstacles[i][1])
      {count++;
       break;}
    }
    if(count==0)
    {lDD++;
     y--;
     x--;}
     else
     break;
    }
   System.out.println(lDD);

   return sT+sB+rT+lT+rUD+rDD+lUD+lDD-8;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        String[] r_qC_q = scanner.nextLine().split(" ");

        int r_q = Integer.parseInt(r_qC_q[0]);

        int c_q = Integer.parseInt(r_qC_q[1]);

        int[][] obstacles = new int[k][2];

        for (int i = 0; i < k; i++) {
            String[] obstaclesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int obstaclesItem = Integer.parseInt(obstaclesRowItems[j]);
                obstacles[i][j] = obstaclesItem;
            }
        }

        int result = queensAttack(n, k, r_q, c_q, obstacles);

        scanner.close();
    }
}
