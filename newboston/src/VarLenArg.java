//variable length arguments pass through method

public class VarLenArg {
    public static void main(String args[])
    {
        System.out.println(average(1,2,3,4,5,6,7,8,9,10));

    }
    //variable length argument method

    public static double average(int...num)
    {
        double total=0;
        for(int x: num)
            total+=x;
        return total/num.length;
    }
}
