import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
        }
    }
    
    private static long Solve(int n, int a, int b){
        long s=n/a,q=0,r=0;
       if(s<b)return s;
        else{
            q=s/b;
            r=s%b;
            s+=q;
         while(r>0 && r+q>=b){
            long x=(r+q)/b;
             s+=x;
             r=(r+q)%b;
             q=x;
         }
            return s;
        }
         //Write code to solve each of the test over here
    }
}
