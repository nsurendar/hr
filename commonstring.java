import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//simple sol by qingchun
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int n = a.length();
        int[][] dp = new int[n+1][n+1];
        for(int i=0;i<=n;i++)
        {
            dp[0][i] = 0;
            dp[i][0] = 0;
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(a.charAt(i-1)!=b.charAt(j-1))
                {
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
                else
                {
                    dp[i][j] = dp[i-1][j-1]+1;
                }
            }
        }
        System.out.println(dp[n][n]);
    }
}
