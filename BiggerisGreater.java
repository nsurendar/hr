import java.io.*;
import java.util.*;

public class Solution {

    static Scanner in;
    static void permutation(String prefix, String str, Set<String> set) {
    int n = str.length();
    if (n == 0) set.add(prefix);
    else {
        for (int i = 0; i < n; i++)
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n),set);
    }
    }
    
    static void getLeast(Set<String> set,String s)
        {
        if( set.size()==1)
            {
            System.out.println("no answer");
        }
        boolean found =false;
        for(String str: set)
            {
            if(found)
                {
                System.out.println(str);
                return;
            }
            if(str.equals(s))
                {
                found = true;
            }
        }
        
    }
        
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        in = new Scanner(System.in);
        int count = in.nextInt();
        in.nextLine();
        for(int i=0;i<count;i++ )
           {
            Set<String> set = new TreeSet<String>();
            String str = in.nextLine();
            permutation("",str,set);
           // System.out.println(set.size());
            
            getLeast(set,str);
        }
    }
}
