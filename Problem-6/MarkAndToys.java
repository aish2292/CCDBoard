import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MarkAndToys {
    static int[] merge(int[] a,int lo,int mid,int hi){
      int n=a.length;
        int aux[]=new int[n];
        for (int k = lo; k <= hi; k++)
    aux[k] = a[k];
int i = lo, j = mid+1;
for (int k = lo; k <= hi; k++)
{
if (i > mid) a[k] = aux[j++];
else if (j > hi) a[k] = aux[i++];
else if (aux[j]< aux[i]) a[k] = aux[j++];
else a[k] = aux[i++];
}
        return a;
    }
    static int[] mergeSort(int[] p,int l,int h){
        if (h<=l) return p;
        int m=l+(h-l)/2;
        p=mergeSort(p,l,m);
        p=mergeSort(p,m+1,h);
        p=merge(p,l,m,h);
        return p;
    }
    static int compute(int x,int[] p){
        int n=p.length;
        p=mergeSort(p,0,n-1);
       
        /*for(int i=0;i<n;i++){
            System.out.print(p[i]+" ");
        }*/
        int count=0;
        long sum=0;
        for(int i=0;i<p.length&&sum<x&&p[i]<=x;i++,count++){
            sum+=p[i];
           //System.out.println("with "+p[i]+" sum is "+sum);
        }
        if(sum>x)return count-1;
        else
            return count;
    }
    public static void main(String[] args) {
        Scanner stdin=new Scanner(System.in);
        int n=stdin.nextInt(),k=stdin.nextInt();
        int prices[]=new int[n];
        for(int i=0;i<n;i++) prices[i]=stdin.nextInt();
        
        int answer = compute(k,prices);
        // Compute the final answer from n,k,prices 
        System.out.println(answer);
    }
}
