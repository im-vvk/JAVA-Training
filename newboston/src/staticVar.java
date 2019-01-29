//static variable means it is shared among all the object hence it is 'object independent'
public class staticVar {
    public static void main(String args[])
    {
        staticVarTuna member1= new staticVarTuna("Vivek","Kumar");
        staticVarTuna member2= new staticVarTuna("Avanish","Kumar");
        staticVarTuna member3= new staticVarTuna("Sahitya","Kumar");
        //
        /*for member 1*/
        System.out.println();
        System.out.println();
        System.out.println(member1.getFirst());
        System.out.println(member1.getLast());
        System.out.println(member1.getMembers());
        /*for member 2*/
        System.out.println(member2.getMembers());
        /*for member 3*/
        System.out.println(member3.getMembers());
        //all would have same value because static var shared among all object
        //member1.getMembers()==member2.getMembers()==member3.getMembers()\

        /*another way to get static var from Tuna without creating an object*/

        System.out.println(staticVarTuna.getMembers());
        //this is because all objects have same value for it
    }
}
