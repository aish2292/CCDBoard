import java.util.Scanner;
class LoveLetterMystery{
    static int reduceChar(char x,char y){
        char c1=x,c2=y;
        int count=0;
        if(y>x){
            c1=y;
            c2=x;
        }
        while(c1>c2){
            //System.out.println("Reducing "+c1);
            c1--;
            count++;
        }
        return count;
    }
    static int calculateOps(String s){
       StringBuffer sb=new StringBuffer(s);
        String r=sb.reverse().toString();
       if(r.equals(s))
        {//System.out.println(r + "and"+ s+"its palindrom already");
            return 0;}
        else{
            int p=0;
            char[] c=s.toCharArray();
            int l=s.length();
            int i=0,j=l-1;
            while(i<l/2){
                if(c[i]!=c[j])p=p+reduceChar(c[i],c[j]);
                i++;j--;
            }
            return p;
        }
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        String empty=s.nextLine();
       for(int i=0;i<t;i++){
           String s1=s.nextLine();
           System.out.println(calculateOps(s1));
       }
    }
}
