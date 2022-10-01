package Area;

import java.util.Scanner;

public class Square
{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter The Side Of Square :");
        double b=a.nextDouble();
        double c=b*b;
        System.out.println("The Area of Square is : " +c);
    }
}
