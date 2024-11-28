
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PinChange extends JFrame implements ActionListener{

    JPasswordField pin, rPin;
    JButton change, back;
    String pinNumber;
    PinChange(String pinNumber){
        
        setLayout(null);
        
        this.pinNumber = pinNumber;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900 , 900);
        add(image);
        
        JLabel text = new JLabel("Change Your PIN");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Arial", Font.BOLD, 16));
        text.setBounds(250, 280,500, 35);
        image.add(text);
        
        
        JLabel pintext = new JLabel("New PIN : ");
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("Arial", Font.BOLD, 16));
        pintext.setBounds(165, 320,180, 25);
        image.add(pintext);
        
        pin = new JPasswordField();
        pin.setFont(new Font("Arial", Font.BOLD, 25));
        pin.setBounds(330, 320, 180, 25);
        image.add(pin);
        
        
        JLabel rePin = new JLabel("Re-enter new PIN : ");
        rePin.setForeground(Color.WHITE);
        rePin.setFont(new Font("Arial", Font.BOLD, 16));
        rePin.setBounds(165, 360,180, 25);
        image.add(rePin);
        
        rPin = new JPasswordField();
        rPin.setFont(new Font("Arial", Font.BOLD, 25));
        rPin.setBounds(330, 360, 180, 25);
        image.add(rPin);
        
        
        change = new JButton("Change");
        change.setBounds(355, 485, 150, 30);
        change.addActionListener(this);
        image.add(change);
        
        back = new JButton("Back");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);
        
        setUndecorated(true);
        setVisible(true);
        setSize(900,900);
        setLocation(300,0);
    }
    
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource()==change){
        try{
            String newPin = pin.getText();
            String rePin = rPin.getText();
            
            if(!(newPin).equals(rePin)){
                JOptionPane.showMessageDialog(null, "Entered PIN doesnt match");
                return;
            }
            
            if(newPin.equals("")){
                JOptionPane.showMessageDialog(null,"Please Enter new PIN");
            }
            
            if(rePin.equals("")){
                JOptionPane.showMessageDialog(null,"Please re-Enter new PIN");
            }
            
            
            Conn c = new Conn();
            //pin will be change for three tables
            
            String query1 = "update bank set pin = '"+rePin+"' where pin = '"+pinNumber+"'";
            String query2 = "update login set pin = '"+rePin+"' where pin = '"+pinNumber+"'";
            String query3 = "update signUp3 set pin = '"+rePin+"' where pin = '"+pinNumber+"'";
            
            c.s.executeUpdate(query1);
            c.s.executeUpdate(query2);
            c.s.executeUpdate(query3);
            
            
            JOptionPane.showMessageDialog(null,"PIN changed successfully!!");
            
            setVisible(false);
            new Transactions(rePin).setVisible(true);
        }catch(Exception ae){
            System.out.println(ae);
        }
        
        }else{
            setVisible(false);
            new Transactions(pinNumber).setVisible(true);
        }
    }
    public static void main(String args[]) {
       new PinChange("").setVisible(true);
    }
}
