import java.util.Scanner;

public class input {
    public static void main(String args[])

    {
        Scanner var = new Scanner(System.in);

        Double fnum,snum,ans;
        System.out.print("enter your first number: ");
        fnum= var.nextDouble();

        System.out.print("enter your second number: ");
        snum= var.nextDouble();

        ans=fnum+snum;

        System.out.println(ans);

    }
}
