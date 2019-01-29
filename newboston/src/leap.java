import java.util.Scanner;

public class leap {
    public static void main(String args[])
    {
        Scanner var= new Scanner(System.in);

        int year;

        System.out.print("enter your year: ");
        year= var.nextInt();

        if(year%400==0||(year%100!=0 && year%4==0))
        {System.out.println("leap year");}

        else
        {System.out.println("not a leap year");}



    }
}
