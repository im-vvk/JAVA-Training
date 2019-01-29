import  java.util.Random;

public class random {
    public static void main(String args[])
    {
        Random dice = new Random();

        for(int i=1;i<4;i++)
        {
            int num = 1 + dice.nextInt(6);
            System.out.println(num);
        }
    }

}