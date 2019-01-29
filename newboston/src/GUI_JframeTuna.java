import java.awt.FlowLayout; //gives 'Default Layout'
import javax.swing.JFrame;  //JFrame gives the all window feature like minimize,maximize,close etc.
import javax.swing.JLabel;  //JLabel allows u to output text and images on the screen

public class GUI_JframeTuna extends JFrame{
    public JLabel item1;

    public GUI_JframeTuna()
    {
        super("The Title Bar");  //THE TITLE OF THE WINDOW
        setLayout(new FlowLayout()); //DEFAULT LAYOUT
        item1= new JLabel("This is a sentence."); //Text on screen
        item1.setToolTipText("This is gonna show up on hover");
        add(item1); //add item to the window
    }

}
