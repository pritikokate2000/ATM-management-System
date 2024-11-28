
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login1 extends JFrame implements ActionListener {

    JButton login, clear, signUp;
    JTextField card;
    JPasswordField pin;
     Login1(){
        
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
        setTitle("Automated Teller Machine");
        setLayout(null);
        
        getContentPane().setBackground(Color.WHITE);
        
        
        //Image icon
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3); //label accepts image icon only and not image
        label.setBounds(70,10,100,100);
        add(label);
        
        
        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200,40, 400, 40);
        add(text);
        
        JLabel cardNo = new JLabel("Card No : ");
        cardNo.setFont(new Font("Raleway", Font.BOLD, 28));
        cardNo.setBounds(120,150, 150, 30);
        add(cardNo);
        
        
        card = new JTextField();
        card.setBounds(300,150, 230, 30);
        card.setFont(new Font("Arial", Font.BOLD, 14));
        add(card);
        
        JLabel pinText = new JLabel("Your PIN");
        pinText.setFont(new Font("Raleway", Font.BOLD, 28));
        pinText.setBounds(120,220, 150, 30);
        add(pinText);
        
        pin = new JPasswordField();
        pin.setBounds(300,220, 230, 30);
        pin.setFont(new Font("Arial", Font.BOLD, 14));
        add(pin);
        
        
        login = new JButton("SIGN IN");
        login.setBounds(300, 300, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);
        
        clear = new JButton("CLEAR");
        clear.setBounds(430, 300, 100, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
        
        signUp = new JButton("SIGN UP");
        signUp.setBounds(300, 350, 230, 30);
        signUp.setBackground(Color.BLACK);
        signUp.setForeground(Color.WHITE);
        signUp.addActionListener(this);
        add(signUp);
        
    }
     
     public void actionPerformed(ActionEvent e){
         
         if(e.getSource() == login){
             
             Conn con = new Conn();
             String cardNumber = card.getText();
             String pinNumber = pin.getText();
             String query = "select * from login where cardNumber = '"+cardNumber+"' and pin = '"+pinNumber+"'";
             
             try{
                 ResultSet rs = con.s.executeQuery(query);
                 if(rs.next()){
                     setVisible(false); //closing current frame
                     new Transactions(pinNumber).setVisible(true);
                 }else{
                     JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                 }
             }catch(Exception ae){
                 System.out.println(ae);
             }
             
         }else if(e.getSource() == clear){
             card.setText("");
             pin.setText("");
             
         }else if(e.getSource() == signUp){
             setVisible(false);
             new SignUp1().setVisible(true);
         }
     }
     
     
    public static void main(String args[]) {
        new Login1();
    }
}
