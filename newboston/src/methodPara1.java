import java.util.Scanner;

public class methodPara1 {
    public static void main(String args[])
    {
        Scanner input= new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1=input.nextInt();
        System.out.print("Enter second number: ");
        int n2=input.nextInt();

        methodParaSecon1 mpsObject= new methodParaSecon1();
        mpsObject.func1(n1,n2);
    }
}
