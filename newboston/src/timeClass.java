//how to return string by a method
//Display military time
public class timeClass {
    public static void main(String args[])
    {
        timeClassTuna timeObject= new timeClassTuna();
        timeObject.setTime(19,22,3);
        System.out.println(timeObject.militaryTime());
        System.out.println(timeObject.regularTime());
    }
}
