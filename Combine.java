package Array.String;

import java.util.Scanner;

public class Combine
{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first Value: ");
        String a = s.next();
        System.out.println("Enter the second Value: ");
        String b = s.next();
        StringBuilder c = new StringBuilder(a);
        c.append(b);
        System.out.println(c);
    }
}
