import java.util.Scanner;
class HalloweenParty{
    static long getValue(long n){
        if(n%2==0)return (n/2)*(n/2);
        else return (n/2)*(n/2+1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        for(int i=0;i<tc;i++){
            System.out.println(getValue(sc.nextLong()));
        }
    }
}
