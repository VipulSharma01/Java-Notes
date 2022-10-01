package Datatype.Long;

import java.util.Scanner;

public class Subtraction
{
    public static void main(String[] args)
    {
        Scanner a= new Scanner(System.in); //This Is Used To Declare The Value At Runtime
        System.out.println("Enter The Value Num1 :");
        long b= a.nextInt();//This is the Syntax for inserting the value At run time
        System.out.println("Enter The Value Num2 :");
        long c=a.nextInt();
        long d= b-c;
        System.out.println("The Result Is :" +d);
    }
}
