public class instanceSecon {
    private String firstName;//instance variable  'firstName'

    public void setName(String name)

    {
        firstName=name;
    }

    public String calling()

    {
        return firstName;
    }
    public void write()

    {
        System.out.printf("Your first name is %s",calling());
    }
}
