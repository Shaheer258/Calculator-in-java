import javax.swing.*;

public class calc {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(0, 0, 330, 460);
        frame.setTitle("1st Calculator");

        JLabel label1 = new JLabel("STANDARD");
        label1.setBounds(15, 8, 150, 30);
        JTextField field1 = new JTextField("0");
        field1.setBounds(15, 30, 285, 90); 
     
        JButton button1 = new JButton("CE");
        button1.setBounds(15, 148, 70, 50);
        JButton button3 = new JButton("C");
        button3.setBounds(85, 148, 70, 50);     
        JButton button4 = new JButton(">");
        button4.setBounds(155, 148, 70, 50);
        JButton button5 = new JButton("/");
        button5.setBounds(225, 148, 75, 50);
       
        JButton button6 = new JButton("7");
        button6.setBounds(15, 198, 70, 50);
        JButton button7 = new JButton("8");
        button7.setBounds(85, 198, 70, 50);     
        JButton button8 = new JButton("9");
        button8.setBounds(155, 198, 70, 50);
        JButton button9= new JButton("*");
        button9.setBounds(225, 198, 75, 50);
       
        JButton button10 = new JButton("4");
        button10.setBounds(15, 248, 70, 50);
        JButton button11 = new JButton("5");
        button11.setBounds(85, 248, 70, 50);     
        JButton button13 = new JButton("6");
        button13.setBounds(155, 248, 70, 50);
        JButton button14= new JButton("-");
        button14.setBounds(225, 248, 75, 50);

        JButton button15 = new JButton("1");
        button15.setBounds(15, 298, 70, 50);
        JButton button16 = new JButton("2");
        button16.setBounds(85, 298, 70, 50);     
        JButton button17 = new JButton("3");
        button17.setBounds(155, 298, 70, 50);
        JButton button18= new JButton("+");
        button18.setBounds(225, 298, 75, 50);

        JButton button20 = new JButton("0");
        button20.setBounds(15, 348, 70, 50);
        JButton button21 = new JButton(".");
        button21.setBounds(85, 348, 70, 50);     
        JButton button22 = new JButton("=");
        button22.setBounds(155, 348, 70, 50);
        JButton button23= new JButton(")");
        button23.setBounds(225, 348, 75, 50);

        frame.setLocation(100, 100);
        frame.setResizable(false);
        frame.setLayout(null);

        frame.add(label1);
        frame.add(field1);
        frame.add(button1);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);

        frame.add(button10);
        frame.add(button11);
        frame.add(button13);
        frame.add(button14);

        frame.add(button15);
        frame.add(button16);
        frame.add(button17);
        frame.add(button18);
        frame.add(button20);
        frame.add(button21);
        frame.add(button22);
        frame.add(button23);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
