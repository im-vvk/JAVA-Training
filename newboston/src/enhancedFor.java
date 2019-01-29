public class enhancedFor {
    public static void main(String args[])
    {
        int ar[]={3,4,5,6,7};
        int sum=0;


        //enhanced for
        for(int x: ar)
        {
            sum+=x;
        }
        System.out.println(sum);
    }
}
