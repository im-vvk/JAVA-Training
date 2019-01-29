import java.awt.*;
import java.awt.event.ActionListener; //waits for the user to do something like press ENTER
import java.awt.event.ActionEvent;
import javax.swing.JFrame;// JFrame let us to work on window
import javax.swing.JTextField; //type text
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;


public class eventHandlingTuna extends JFrame{ //JFrame let us to work on window
    private TextField item1;
    private TextField item2;
    private TextField item3;
    private JPasswordField passwordField;

    public eventHandlingTuna()
    {
        super("EVENT HANDLING");
        setLayout(new FlowLayout());

        item1= new TextField(10);
        add(item1);
        item2= new TextField("Enter text here");
        add(item2);
        item3=new TextField("Uneditable",20);
        item3.setEditable(false);
        add(item3);

        passwordField=new JPasswordField("mypass");
        add(passwordField);

        thehandler handler = new thehandler();
        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        passwordField.addActionListener(handler);
    }

    private class thehandler implements ActionListener{
        public void actionPerformed(ActionEvent event)
        {
            String string ="";

            if(event.getSource()==item1)
                string=String.format("field 1=%s",event.getActionCommand());
            else if(event.getSource()==item2)
                string=String.format("field 2=%s",event.getActionCommand());
            else if(event.getSource()==item3)
                string=String.format("field 3=%s",event.getActionCommand());
            else if(event.getSource()==passwordField)
                string=String.format("Password field is %s",event.getActionCommand());

            JOptionPane.showMessageDialog(null,string);

        }
    }


}
