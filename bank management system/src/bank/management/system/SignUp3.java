
package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;


public class SignUp3 extends JFrame implements ActionListener {

    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit, cancel;
    String formNo;
    
    SignUp3(String formNo){
        
        this.formNo = formNo;
        setSize(850, 820);
        setLocation(350, 0);
        setVisible(true);
        setLayout(null);
        
        getContentPane().setBackground(Color.WHITE);
        
        
        
        JLabel l1 = new JLabel("Page 3 : Account details");
        l1.setFont(new Font("Arial", Font.BOLD, 22));
        l1.setBounds(280, 40, 400, 40);
        add(l1);
        
        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Arial", Font.BOLD, 22));
        type.setBounds(100, 140, 280, 30);
        add(type);
        
        r1 = new JRadioButton("Saving account");
        r1.setFont(new Font("Arial", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100, 180, 150, 20);
        add(r1);
        
        r2 = new JRadioButton("Fixed Deposit account");
        r2.setFont(new Font("Arial", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350, 180, 250, 20);
        add(r2);
        
        r3 = new JRadioButton("Current account");
        r3.setFont(new Font("Arial", Font.BOLD, 16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100, 220, 250, 20);
        add(r3);
        
        r4 = new JRadioButton("Recurring Deposit account");
        r4.setFont(new Font("Arial", Font.BOLD, 16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350, 220, 250, 20);
        add(r4);
        
        
        ButtonGroup groupAccount = new ButtonGroup();
        groupAccount.add(r1);
        groupAccount.add(r2);
        groupAccount.add(r3);
        groupAccount.add(r4);
        
        
        JLabel cardNo = new JLabel("Card Number ");
        cardNo.setFont(new Font("Arial", Font.BOLD, 22));
        cardNo.setBounds(100, 300, 200, 30);
        add(cardNo);
        
        JLabel number = new JLabel("XXXX-XXXX-XXXX -4184");
        number.setFont(new Font("Arial", Font.BOLD, 18));
        number.setBounds(330, 300, 300, 30);
        add(number);
        
        JLabel info = new JLabel("(This is your 16-digit card number)");
        info.setFont(new Font("Arial", Font.BOLD, 12));
        info.setBounds(100, 330, 300, 20);
        add(info);
        
        JLabel pin = new JLabel("PIN :");
        pin.setFont(new Font("Arial", Font.BOLD, 22));
        pin.setBounds(100, 370, 200, 30);
        add(pin);
        
        JLabel pinNo = new JLabel("XXXX");
        pinNo.setFont(new Font("Arial", Font.BOLD, 18));
        pinNo.setBounds(330, 370, 300, 30);
        add(pinNo);
        
        JLabel pininfo = new JLabel("(This is your 4-digit PIN)");
        pininfo.setFont(new Font("Arial", Font.BOLD, 12));
        pininfo.setBounds(100, 400, 300, 20);
        add(pininfo);
        
        JLabel services = new JLabel("Services required :");
        services.setFont(new Font("Arial", Font.BOLD, 22));
        services.setBounds(100, 450, 250, 30);
        add(services);
        
        c1 = new JCheckBox("ATM card");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Arial",Font.BOLD,16));
        c1.setBounds(100,500, 200, 30);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Arial",Font.BOLD,16));
        c2.setBounds(350,500, 200, 30);
        add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Arial",Font.BOLD,16));
        c3.setBounds(100,550, 200, 30);
        add(c3);
        
        c4 = new JCheckBox("email & SMS alert");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Arial",Font.BOLD,16));
        c4.setBounds(350,550, 200, 30);
        add(c4);
        
        
        c5 = new JCheckBox("Checkbook");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Arial",Font.BOLD,16));
        c5.setBounds(100,600, 200, 30);
        add(c5);
        
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Arial",Font.BOLD,16));
        c6.setBounds(350,600, 200, 30);
        add(c6);
        
        
         c7 = new JCheckBox("I hereby declares that the above enteed details are correct.");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Arial",Font.BOLD,12));
        c7.setBounds(100,680, 600, 30);
        add(c7);
        
        submit = new JButton("submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Arial", Font.BOLD,14));
        submit.addActionListener(this);
        submit.setBounds(250,720,100,30);
        add(submit);
        
        
        cancel = new JButton("cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Arial", Font.BOLD,14));
        cancel.addActionListener(this);
        cancel.setBounds(420,720,100,30);
        add(cancel);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit){
            String accountType = null;
            if(r1.isSelected()){
                accountType = "Saving Account";
            }else if(r2.isSelected()){
                accountType = "Fixed Deposit Account";
            }else if(r3.isSelected()){
                accountType = "Current account";
            }else if(r4.isSelected()){
                accountType = "Recurring Deposit Account";
            }
            
            Random ran = new Random();
            String cardNumber ="" + Math.abs((ran.nextLong() % 90000000L)+ 504093600000000L);
            
            String pinNumber = "" + Math.abs((ran.nextLong()% 9000L) + 1000L);
            
            String facility = "";
            if(c1.isSelected()){
                facility = facility+ " ATM card";
            }
            if(c2.isSelected()){
                facility = facility+ " Internet Banking";
            }
            if(c3.isSelected()){
                facility = facility+ " Mobile banking";
            }
            if(c4.isSelected()){
                facility = facility+ " email and SMS alert";
            }
            if(c5.isSelected()){
                facility = facility+ " Checkbook";
            }
            if(c6.isSelected()){
                facility = facility+ " e-statement";
            }
            if (facility.endsWith(", ")) {
                facility = facility.substring(0, facility.length() - 2);
            }
            
            try{
                
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null, "Account type is requied");
                }else{
                    
                    Conn conn = new Conn();
                    String query1 = "insert into signUp3 values('"+formNo+"','"+accountType+"', '"+cardNumber+"', '"+pinNumber+"','"+facility+"')";
                    String query2 = "insert into login values('"+formNo+"', '"+cardNumber+"', '"+pinNumber+"')";
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);
                    
                    JOptionPane.showMessageDialog(null, "Card Number : "+cardNumber+"\n Pin : "+pinNumber);
                }
                
                setVisible(false);
                new Deposit(pinNumber).setVisible(false);
            }catch(Exception e){
                System.out.println(e);
            }
            
            
        }else if(ae.getSource()==cancel){
            setVisible(false);
            new Login1().setVisible(true);
        }
    }
    
    public static void main(String args[]) {
        new SignUp3("");
    }
}