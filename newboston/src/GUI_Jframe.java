import javax.swing.JFrame;

public class GUI_Jframe {
    public static void main(String args[]) {
        GUI_JframeTuna GUIObject = new GUI_JframeTuna();
        GUIObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //How we want to close our program
        GUIObject.setSize(275,180); //Set size
        GUIObject.setVisible(true);

    }
}
