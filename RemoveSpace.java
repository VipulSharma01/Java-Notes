package Array.String;

import java.util.Scanner;

public class RemoveSpace
{
    public static void main(String[] args) {
        Scanner b=new Scanner(System.in);
        System.out.println("Enter The Data:");
      //  String a= b.nextLine();
        String a="Vipul Sharma is a nube programmer";
        String c= a.replaceAll("\\s","");
        System.out.println(c);

    }
}
