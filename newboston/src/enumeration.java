/*Enumeration intro =>Enumeration in range*/
import java.util.EnumSet;

public class enumeration {
    public static void main(String argd[])
    {
        for(EnumerationTuna boys: EnumerationTuna.values())
        System.out.printf("%s\t%s\t%s\n",boys,boys.getDesc(),boys.getyr());

       //This is for specific range
        System.out.println("\n\n\nAnd this is for a specific range!!!!\n");

        for(EnumerationTuna boys: EnumSet.range(EnumerationTuna.avanish,EnumerationTuna.ritik))
            System.out.printf("%s\t%s\t%s\n",boys,boys.getDesc(),boys.getyr());

    }
}
