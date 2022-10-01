package Area;

import java.util.Scanner;

public class Rectangle
{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the Length : ");
        double l=a.nextDouble();
        System.out.println("Enter the Height : ");
        double h=a.nextDouble();
        double ar=l*h;
        System.out.println("The Area of Rectangle: " +ar);
    }
}
