
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener{

    JButton deposit, withdrawl, miniStatement, pinChange, fastCash, balance, exit;
    String pinNumber;
    Transactions(String pinNumber){
        
       
        this.pinNumber = pinNumber;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0, 900, 900);
        add(image);
        
        
        JLabel text = new JLabel("Please select your transaction");
        text.setBounds(210,270,700,35);
        //add(text);   this will add on frame but not on image
        //to add on image
        image.add(text);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Arial", Font.BOLD, 16));
        
        
        deposit = new JButton("Deposit");
        deposit.setBounds(150, 388, 130, 30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        fastCash = new JButton("Fast Cash");
        fastCash.setBounds(378, 388, 130, 30);
        fastCash.addActionListener(this);
        image.add(fastCash);
        
        withdrawl = new JButton("Cash Withdrawl");
        withdrawl.setBounds(150, 422, 130, 30);
        withdrawl.addActionListener(this);
        image.add(withdrawl);
        
        miniStatement = new JButton("Mini Statement");
        miniStatement.setBounds(378, 422, 130, 30);
        miniStatement.addActionListener(this);
        image.add(miniStatement);
        
        
        pinChange = new JButton("PIN change");
        pinChange.setBounds(150, 456, 130, 30);
        pinChange.addActionListener(this);
        image.add(pinChange);
        
        balance = new JButton("Balance Enquiry");
        balance.setBounds(378, 456, 130, 30);
        balance.addActionListener(this);
        image.add(balance);
        
        
        exit = new JButton("Exit");
        exit.setBounds(378, 490, 130, 30);
        exit.addActionListener(this);
        image.add(exit);
        
        
        
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
        setUndecorated(true); //will remove topmost line of cross and etc
        setLayout(null);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==exit){
            System.exit(0);
        }else if(e.getSource()==deposit){
            setVisible(false);
            new Deposit(pinNumber).setVisible(true);
        }else if(e.getSource() == withdrawl){
            setVisible(false);
            new Withdrawl(pinNumber).setVisible(true);
        }else if(e.getSource()==fastCash){
            setVisible(false);
            new Fastcash(pinNumber).setVisible(true);
        }else if(e.getSource()== pinChange){
            setVisible(false);
            new PinChange(pinNumber).setVisible(true);
        }else if(e.getSource()==balance){
            setVisible(false);
            new BalanceEnquiry(pinNumber).setVisible(true);
        }else if(e.getSource() == miniStatement){
            
            new MiniStatement(pinNumber).setVisible(true);
        }
    }
   
    public static void main(String args[]) {
       
        new Transactions("");
    }
}
