//when variable is initialised with 'final' keyword that means value of that variable can not be changed
//after the once variable get initialised
public class finalKey {
    public static void main(String args[])
    {
        finalKeyTuna tunaObject=new finalKeyTuna(10);

        for(int i=1;i<=5;i++)
        {
            tunaObject.add();
            System.out.println(tunaObject);
        }
    }
}
