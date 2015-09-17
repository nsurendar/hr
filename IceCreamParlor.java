import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static Scanner in;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        in = new Scanner (System.in);
        
        int z = in.nextInt();
        
        while(z-->0)
            {
            int m = in.nextInt();
            int n=in.nextInt();
            ArrayList<Integer> array = new ArrayList<Integer>();
            
            for(int i=1;i<=n;i++)
                {
                int value = in.nextInt();
                array.add(value);
            }
            Map<Integer,Integer> map = new HashMap<Integer,Integer>();
            for (int i=0; i<array.size();i++)
                {
                    if (map.containsKey(m - array.get(i)))
                    {
                        int value1 = i+1;
                        int value2 = map.get(m - array.get(i))+1;
        
                        if(value1 <value2)
                            {
                            System.out.println(value1+" "+value2);
                            }
                        else
                        {
                         System.out.println(value2+" "+value1);
                        }
                
               
            }
                 map.put(array.get(i),i);
       }
            
}
    }
}
