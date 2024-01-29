import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static int bananasYum = 0;
    public static void addBananas(int b){bananasYum += b;}
    public static int getBananas(){return bananasYum;}
    public static void main(String[] args) {
        //1 create a frame
        JFrame frame = new JFrame();
        frame.setSize(500,300);
        // 2 create a panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2,2));
        JPanel panelTop = new JPanel();
        //3 create components
        JLabel label = new JLabel("Your bananas: 0");
        JButton button = new JButton("Submit");
        JTextField textField = new JTextField(5);
        // adding listener
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try {
                    int thing = Integer.parseInt(textField.getText());
                    addBananas(thing);
                    label.setText("Your bananas: " + getBananas());
                } catch (Exception pony) {
                    JOptionPane.showMessageDialog(null, "not valid, try again");
                }
            }
        });
        //4 add components to the panel
        panel.add(label);
        panel.add(button);
        panel.add(textField);
        // add image
        ImageIcon icon = new ImageIcon("Images/banana.jpeg");
        icon.setImage(icon.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT));
        JLabel picLabel = new JLabel(icon);
        panel.add(picLabel);


//        // adding choice
//        Choice chooseSomething = new Choice();
//        chooseSomething.add("Banana");
//        chooseSomething.add("Potato");
//        JComboBox chooseSomething = new JComboBox();
//        chooseSomething.addItem("Banana");
////        chooseSomething.addItem("Potato");
//        panel.add(chooseSomething);
        //5 add the panel to the frame
        frame.add(panel);
        //6 make frame visible
        frame.setVisible(true);
    }
}