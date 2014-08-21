import java.util.Scanner;
class GemStones{
    static int gemElementsCount(String s[]){
        int c[]=new int[26];
        for(int i=0;i<26;i++){
            c[i]=0;
        }
        for(int l=0;l<s.length;l++){
        char w[]=s[l].toCharArray();
        for(int i=0;i<s[l].length();i++){
            //System.out.println(w[i]);
            if(w[i]!=',')
            {
            int index=w[i]-97;
            c[index]+=1;    
             s[l]= s[l].replace(w[i],',');
             w=s[l].toCharArray();
             //System.out.println(s[l]+ " index "+ c[index]);
            }
        }
        }
        int count=0;
        for(int i=0;i<26;i++){
            if (c[i]==s.length){count++;}
        }
    return count;
    }
    
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        s.nextLine();
        String[] str=new String[t];
        for(int i=0;i<t;i++){
            str[i]=s.nextLine();
        }
        System.out.println(gemElementsCount(str));
    }
