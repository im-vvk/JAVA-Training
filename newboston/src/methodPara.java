//passing parameter in method
//methodParaSecon
import java.util.Scanner;

public class methodPara {
    public static void main(String args[])
    {
        Scanner input= new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name= input.nextLine();

        methodParaSecon methodObject = new methodParaSecon();
        methodObject.func1(name);


    }
}
