/*EVENT= Any thing that user can do like move their mouse click a button press ENTER
EVENT HANDLER= is code that responds to your mouse movement or button clicking*/
import javax.swing.JFrame;

public class eventHandling {
    public static void main(String args[])
    {
        eventHandlingTuna eventObject=new eventHandlingTuna();
        eventObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        eventObject.setSize(350,200);
        eventObject.setVisible(true);

    }
}
