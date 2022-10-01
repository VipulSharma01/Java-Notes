package Volume;

import java.util.Scanner;

public class Cube
{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter The Edge :");
        double ed=a.nextDouble();
       double ar=ed*ed*ed;
        System.out.println("The Volume Of Cube :" +ar);
    }
}
