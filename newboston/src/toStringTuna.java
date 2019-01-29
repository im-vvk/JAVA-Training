public class toStringTuna{
    private String name;
    private toStringTuna2 birthday;

    public toStringTuna(String theName,toStringTuna2 theBirthday)
    {
        name= theName;
        birthday= theBirthday;

        System.out.printf("My name is %s and My birthday is %s",name,birthday);
    }

}