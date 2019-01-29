/*pass array in method*/

public class arrrayMethod {
    public static void main(String args[])
    {
        int ar[]={3,4,5,6,7};
        change(ar);

        for(int y: ar)
            System.out.println(y);
    }

    //method- named change
    public static void change(int x[])
    {
        for(int i=0;i<x.length;i++)
            x[i]+=5;
    }
}
