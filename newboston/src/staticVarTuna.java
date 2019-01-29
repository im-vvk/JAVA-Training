import com.sun.nio.sctp.AbstractNotificationHandler;

public class staticVarTuna {
    private String first;
    private String last;
    private static int members=0;

    public staticVarTuna(String fn,String ln)
    {
        first=fn;
        last=ln;
        members++;
        System.out.printf("Constructor for %s %s, number of members: %d\n",first,last,members);

    }


    public String getFirst()
    {return first;}
    public String getLast()
    {return last;}

    public static int getMembers()
    {return members;}

}
