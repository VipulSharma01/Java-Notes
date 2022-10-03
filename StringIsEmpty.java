package Array.String;

import java.util.Scanner;

public class StringIsEmpty
{
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        System.out.println("enter The Value");
        String myStr1 = a.next();
        String myStr2 = a.next();
        System.out.println(myStr1.isEmpty());
        System.out.println(myStr2.isEmpty());
    }
}
