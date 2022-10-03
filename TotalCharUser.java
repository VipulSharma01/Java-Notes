package Array.String;

import java.util.Scanner;

public class TotalCharUser
{
    public static void main(String[] args)
    {
        Scanner a= new Scanner(System.in);
        System.out.println("Entr the Value:");
        String s=a.nextLine();
        int b=0;
        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)!= ' ')
            {
                b++;
            }
        }
        System.out.println("Sum Is"+b);
    }
}
