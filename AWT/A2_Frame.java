
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class A2_Frame extends Frame {

    public A2_Frame() {

        Button button = new Button("Click me");
        button.setBounds(20, 30, 50, 50);
        add(button);

        setLayout(null);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
              
                dispose();
            }
        
        });


        setSize(500, 500);
        setVisible(true);

    }

    public static void main(String[] args) {
        A2_Frame ob = new A2_Frame();
    }
}
