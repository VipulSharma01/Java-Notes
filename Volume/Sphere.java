package Volume;

import java.util.Scanner;

public class Sphere
{
    public static void main(String[] args)
    {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter The Radius :");
        double r=a.nextDouble();
        double pi=3.14;
        double ar=(4*pi*r*r*r)/3;
        System.out.println("The Volume Of Sphere : "+ar);
    }
}
