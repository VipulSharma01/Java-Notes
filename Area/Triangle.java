package Area;

import java.util.Scanner;

public class Triangle
{
    public static void main(String[] args)
    {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the height :");
        double h=a.nextDouble();
        System.out.println("Enter the Base :");
        double bs=a.nextDouble();
        double ar = (bs*h)/2;
        System.out.println("The Area Of Triangle :"+ar);

    }
}
