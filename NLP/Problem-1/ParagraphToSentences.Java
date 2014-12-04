import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ParagraphToSentences {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        String words[]=input.split("(?<=\\.)|(?<=\\?)|(?<=!)");
        for(int i=0;i<words.length;)
        {
         String output=words[i];
            if(i+1!=words.length && output.charAt(output.length()-1)=='?' && words[i+1].charAt(0)=='"' && words[i+1].charAt(1)==' '){System.out.print(output); }
            else if(output.length()<4 && output.charAt(output.length()-1)=='.'){System.out.print(output);}
            else if(output.charAt(0)=='"' &&output.charAt(output.length()-1)=='?'){System.out.print(output); }
            else if(i+1!=words.length&&output.charAt(output.length()-1)=='!'&&words[i+1].charAt(0)=='"' && words[i+1].charAt(1)==' ')
                    {System.out.print(output);}
            else
            System.out.println(output);
            i++;
        }
    }
}
