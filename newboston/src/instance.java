import java.util.Scanner;

public class instance {

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("enter your first name: ");
        String temp = input.nextLine();

        instanceSecon instObject = new instanceSecon();
        instObject.setName(temp);
        instObject.write();
    }
}
