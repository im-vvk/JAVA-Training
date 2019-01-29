public class finalKeyTuna {
    private int sum=0;
    private final int NUMBER;

    public finalKeyTuna(int num)
    {NUMBER=num;}

    public void add()
    {sum+=NUMBER;}

    public String toString()
    {return String.format("sum=%d",sum);}

}
