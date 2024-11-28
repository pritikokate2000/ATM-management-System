package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class Fastcash extends JFrame implements ActionListener{

    JButton b1, b2, b3, b4, b6, b5, exit;
    String pinNumber;
    Fastcash(String pinNumber){
        
       
        this.pinNumber = pinNumber;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0, 900, 900);
        add(image);
        
        
        JLabel text = new JLabel("Select withdrawl amount : ");
        text.setBounds(210,270,700,35);
        //add(text);   this will add on frame but not on image
        //to add on image
        image.add(text);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Arial", Font.BOLD, 16));
        
        
        b1 = new JButton("Rs 100");
        b1.setBounds(150, 388, 130, 30);
        b1.addActionListener(this);
        image.add(b1);
        
        b6 = new JButton("Rs 500");
        b6.setBounds(378, 388, 130, 30);
        b6.addActionListener(this);
        image.add(b6);
        
        b2 = new JButton("Rs 1000");
        b2.setBounds(150, 422, 130, 30);
        b2.addActionListener(this);
        image.add(b2);
        
        b3 = new JButton("Rs 2000");
        b3.setBounds(378, 422, 130, 30);
        b3.addActionListener(this);
        image.add(b3);
        
        
        b4 = new JButton("Rs 5000");
        b4.setBounds(150, 456, 130, 30);
        b4.addActionListener(this);
        image.add(b4);
        
        b5 = new JButton("Rs 10000");
        b5.setBounds(378, 456, 130, 30);
        b5.addActionListener(this);
        image.add(b5);
        
        
        exit = new JButton("Back");
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
            setVisible(false);
            new Transactions(pinNumber).setVisible(true);
        }else {
            String amount = ((JButton)e.getSource()).getText().substring(3); //first 3 letters RS & space will be removed
            Conn c = new Conn();
            
            try{
                ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinNumber+"'");
                int balance = 0;
                while(rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                    balance+=Integer.parseInt(rs.getString("amount"));
                }else{
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                
                if(e.getSource() != exit && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insufficient balance");
                    return;
                }
                
                Date date = new Date();
                String query = "insert into bank values('"+pinNumber+"', '"+date+"','withdrawl', '"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs "+amount + " debited sucessfully!!");
                
                setVisible(false);
                new Transactions(pinNumber).setVisible(true);
            }catch(Exception ae){
                System.out.println(ae);
            }
        }
    }
   
    public static void main(String args[]) {
       
        new Fastcash("");
    }
}