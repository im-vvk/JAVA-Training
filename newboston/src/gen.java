import java.util.Scanner;

public class gen {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of terms of fibonacci series: ");
        int num= input.nextInt();

        genTuna tunaObject= new genTuna();

        for (int i=1;i<=num;i++)
            System.out.printf("%d ",tunaObject.fibo(i));

    }
}
