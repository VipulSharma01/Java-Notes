package Array.String;

import java.util.Locale;
import java.util.Scanner;

public class Rep
{
    public static void main(String[] args) {
       Scanner a=new Scanner(System.in);
        System.out.println("Enter The Data");
        String c=a.nextLine();
     //  String k=c.toLowerCase();
        int sz=c.length();
        System.out.println("Enter the Char you want to replace: ");
        String  d= a.nextLine();
     //   String r=d.toLowerCase();
        String target = "d";
        System.out.println("Enter The Char which you can replcae with above Char-" );
        String f=a.nextLine();
       //  String toLowerCase=c.toLowerCase();
        String k=c.toLowerCase();
         k = k.replace(d,f );
        System.out.println(k);
        System.out.println(c);
    }
}
