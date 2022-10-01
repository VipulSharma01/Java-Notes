package Datatype.Float;

import java.util.Scanner;

public class Add
{
    public static void main(String[] args)
    {
        Scanner a= new Scanner(System.in); //This Is Used To Declare The Value At Runtime
        System.out.println("Enter The Value Num1 :");
        float b= a.nextInt();//This is the Syntax for inserting the value At run time
        System.out.println("Enter The Value Num2 :");
        float c=a.nextInt();
        float d= b+c;
        System.out.println("The Result Is :" +d);
    }

}
