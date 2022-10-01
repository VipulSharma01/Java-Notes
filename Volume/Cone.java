package Volume;

import java.util.Scanner;

public class Cone
{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter The Radius: ");
        double r=a.nextDouble();
        System.out.println("Enter The Height :");
        double h= a.nextDouble();
        double pi=3.14;
        double ar=(pi*r*r*h)/3;
        System.out.println("The Volume Of Cone :"+ar);
    }
}
