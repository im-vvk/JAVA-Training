public enum EnumerationTuna {
    vivek("elder","18"),
    avanish("younger","15"),
    sahitya("younger","9"),
    ritik("youngest","5"),
    pulkit("cute","3"),
    adtiya("funny","10");


    private String desc;
    private String yr;

    EnumerationTuna(String description,String year)
    {
        desc = description;
        yr = year;
    }

    public String getDesc()
    {return String.format(desc);}
    public String getyr()
    {return String.format(yr);}

}
