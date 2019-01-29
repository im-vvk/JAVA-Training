import java.awt.desktop.SystemEventListener;

//multidimensional array
public class arrayMultidimen {
    public static void main(String args[])
    {
        int firstAr[][]={{1,2,3},{4,5,6}};
        int secondAr[][]={{1,2,3,4},{31},{50,51,52}};

        System.out.println("Here is the first Array");
        display(firstAr);

        System.out.println("Here is the second Array");
        display(secondAr);


    }
    //to Display the Array
    public static void display(int x[][])
    {
        for(int i=0;i<x.length;i++)
        {
            for(int j=0;j<x[i].length;j++)
            {
                System.out.print(x[i][j] +"\t");
            }
            System.out.println();
        }

    }

}

