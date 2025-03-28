
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// public class A1_awt extends Frame{
public class A1_awt {

    public A1_awt() {
        Frame frame = new Frame("first GUI");

        
        
        
        Label lable = new Label("Hello Friends");
        lable.setBounds(20,60,150,30);
        lable.setBackground(Color.RED);
        frame.add(lable);
        
        TextField textField = new TextField();
        textField.setBackground(Color.CYAN);
        textField.setBounds(20,20,200,9);

        Button button = new Button("Click me");
        button.setBackground(Color.CYAN);
        button.setBounds(20, 80, 80, 40);
        frame.add(button);

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }

        });
        // setSize(400,300);
        // setVisible(true);
    }

    public static void main(String[] args) {
        A1_awt ob = new A1_awt();

    }
}
