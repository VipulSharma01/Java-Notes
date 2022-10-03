package Array.String;

import javax.swing.*;
import java.util.Scanner;

public class Reverse {

        public static void main (String[]args)
        {
            Scanner a=new Scanner(System.in);
            System.out.println("Enter The Name:");
            String n=a.nextLine();
         int l=n.length();
         String res="";
         for (int i=l-1;i>=0;i--)
         {
             res=res+n.charAt(i);
         }
            System.out.println(res);
        }
}

