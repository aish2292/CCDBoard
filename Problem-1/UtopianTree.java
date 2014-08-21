import java.io.*;
import java.util.Scanner;
class UtopianTree{
    public static int calculateHeight(int n){
       int h=1,l=n/2;
        Boolean isOdd=false;
        if(n%2!=0)isOdd=true;
        while(l!=0){
            h=2*h;
            h+=1;
            l--;
        }
        if(isOdd) h=2*h;
        return h;
    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int testcases=scanner.nextInt();
        for(int i=0;i<testcases;i++)
        {int input=scanner.nextInt();
         System.out.println(calculateHeight(input));}
    }
}
