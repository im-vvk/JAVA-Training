public class constructorSecon {
    private String firstName;

    public constructorSecon(String name) {
        firstName = name;
    }

    public void setName(String name) {
        firstName = name;
    }

    public String calling() {
        return firstName;
    }

    public void write() {
        System.out.printf("Your first name is %s\n", calling());
    }
}