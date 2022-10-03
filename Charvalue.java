package Array.String;

import java.util.Scanner;

public class Charvalue
{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter The Name:");
        String b=a.next();
        char ch = b.charAt(0);
        System.out.println(ch);
    }
}
