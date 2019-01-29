import java.util.Random;

public class array1 {
    public static void main(String args[])
    {
        //array length by 'arrayName.length'

        int ar[] = new int[7];

        Random rand =new Random();

        for(int i=0;i<1000;i++)
        {
            ar[rand.nextInt(6)+1]++;
        }
        System.out.println("face\tfreq");
        for(int i=1;i<ar.length;i++)
        {
            System.out.println(i+"\t\t"+ar[i]);
        }


    }
}
