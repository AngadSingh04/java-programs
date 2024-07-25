import javax.swing.*;
import java.awt.event.*;
public class EventDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Example");
        JButton button = new JButton("Click Me");
        button.setSize(100,50);

        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,"Button clicked");
            }
        });
        frame.add(button);
        frame.setSize(300,200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
