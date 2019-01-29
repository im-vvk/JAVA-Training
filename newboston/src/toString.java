/*
Anytime ,You pass object of any class(let's say class ='X') for string it looks in the toString method
in class 'X'
*/
public class toString {
    public static void main(String args[])
    {
        toStringTuna2 toStrObject= new toStringTuna2(10,11,2000);
        toStringTuna toStrObject2= new toStringTuna("Vivek",toStrObject);
    }
}
