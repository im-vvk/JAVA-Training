public class polmorpArray {
    public static void main(String args[])
    {
        polymorpArrayTuna[] polyObject=new polymorpArrayTuna[2];

        polyObject[0]=new polymorpArrayTuna1();
        polyObject[1]=new polymorpArrayTuna2();

        for(int i=0;i<2;i++)
            polyObject[i].food();

    }
}
