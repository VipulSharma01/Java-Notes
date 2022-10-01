package Area;

import java.util.Scanner;

public class Circle
{
    public static void main(String[] args)
    {
        Scanner a= new Scanner(System.in);
        System.out.println("Enter The Radius :");
        double r=a.nextDouble();
        double pi=3.14;
        double ar =pi*r*r;
        System.out.println("The Area of Circle :" +ar);
    }

}
