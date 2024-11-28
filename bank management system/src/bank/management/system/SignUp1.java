
package bank.management.system;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;


public class SignUp1 extends JFrame implements ActionListener {
    
    long random;
    JTextField nameText, fatherText, emailText, addressText, cityText, stateText, pincodeText, phoneText;
    JButton next;
    JRadioButton male, female, married, unmarried, other;
    JDateChooser dateChooser;
    SignUp1(){
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
        setLayout(null);
        
        getContentPane().setBackground(Color.WHITE);
        
        Random ran = new Random();
        random = Math.abs(ran.nextLong()%9000L + 1000L);
        
        JLabel formNo = new JLabel("APPLICATION FORM NUMBER : " + random);
        formNo.setFont(new Font("Arial", Font.BOLD, 28));
        formNo.setBounds(200, 20, 700, 30);
        add(formNo);
        
        JLabel personalDetails = new JLabel("Page 1 : Personal details");
        personalDetails.setFont(new Font("Arial", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);
        
        JLabel name = new JLabel("Name : ");
        name.setFont(new Font("Arial", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
        nameText = new JTextField();
        nameText.setFont(new Font("Arial", Font.BOLD, 14));
        nameText.setBounds(300, 140, 400, 30);
        add(nameText);
        
        JLabel father = new JLabel(" Father's Name : ");
        father.setFont(new Font("Arial", Font.BOLD, 20));
        father.setBounds(100, 190, 200, 30);
        add(father);
        
        
        fatherText = new JTextField();
        fatherText.setFont(new Font("Arial", Font.BOLD, 14));
        fatherText.setBounds(300, 190, 400, 30);
        add(fatherText);
        
        JLabel dob = new JLabel("Date of Birth : ");
        dob.setFont(new Font("Arial", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setForeground(Color.RED);
        add(dateChooser);
        
        JLabel gender = new JLabel("Gender : ");
        gender.setFont(new Font("Arial", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(450, 290, 120,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        
        JLabel email = new JLabel("e-mail : ");
        email.setFont(new Font("Arial", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);
        
        
        emailText = new JTextField();
        emailText.setFont(new Font("Arial", Font.BOLD, 14));
        emailText.setBounds(300, 340, 400, 30);
        add(emailText);
        
        
        JLabel phone = new JLabel("Phone Number : ");
        phone.setFont(new Font("Arial", Font.BOLD, 20));
        phone.setBounds(100, 390, 200, 30);
        add(phone);
        
        phoneText = new JTextField();
        phoneText.setFont(new Font("Arial", Font.BOLD, 14));
        phoneText.setBounds(300, 390, 400, 30);
        add(phoneText);
        
        JLabel maritalStatus = new JLabel("Marital Status : ");
        maritalStatus.setFont(new Font("Arial", Font.BOLD, 20));
        maritalStatus.setBounds(100, 440, 200, 30);
        add(maritalStatus);
        
        married = new JRadioButton("Married");
        married.setBounds(300, 440, 120, 30);
        married.setBackground(Color.WHITE);
        add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 440, 120,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        
        other = new JRadioButton("Other");
        other.setBounds(600, 440, 120,30);
        other.setBackground(Color.WHITE);
        add(other);
        
        ButtonGroup marriatalGroup = new ButtonGroup();
        marriatalGroup.add(married);
        marriatalGroup.add(unmarried);
        marriatalGroup.add(other);
        
        
        JLabel address = new JLabel("Address : ");
        address.setFont(new Font("Arial", Font.BOLD, 20));
        address.setBounds(100, 490, 200, 30);
        add(address);
        
        addressText = new JTextField();
        addressText.setFont(new Font("Arial", Font.BOLD, 14));
        addressText.setBounds(300, 490, 400, 30);
        add(addressText);
        
        
        JLabel city = new JLabel("City : ");
        city.setFont(new Font("Arial", Font.BOLD, 20));
        city.setBounds(100, 540, 200, 30);
        add(city);
        
        
        cityText = new JTextField();
        cityText.setFont(new Font("Arial", Font.BOLD, 14));
        cityText.setBounds(300, 540, 400, 30);
        add(cityText);
        
        
        JLabel state = new JLabel("state : ");
        state.setFont(new Font("Arial", Font.BOLD, 20));
        state.setBounds(100, 590, 200, 30);
        add(state);
        
        
        stateText = new JTextField();
        stateText.setFont(new Font("Arial", Font.BOLD, 14));
        stateText.setBounds(300, 590, 400, 30);
        add(stateText);
        
        JLabel pincode = new JLabel("Pin Code : ");
        pincode.setFont(new Font("Arial", Font.BOLD, 20));
        pincode.setBounds(100, 640, 200, 30);
        add(pincode);
        
        
        pincodeText = new JTextField();
        pincodeText.setFont(new Font("Arial", Font.BOLD, 14));
        pincodeText.setBounds(300, 640, 400, 30);
        add(pincodeText);
        
        
       next = new JButton("Next");
       next.setBackground(Color.BLACK);
       next.setForeground(Color.WHITE);
       next.setFont(new Font("Arial", Font.BOLD, 14));
       next.setBounds(620,700,80,30);
       next.addActionListener(this);
       add(next);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        String formNo = ""+random;//long value therefore concerting long value to string using ""
        String name = nameText.getText();
        String father = fatherText.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }else if(female.isSelected()){
            gender = "Female";
        }
        
        String email = emailText.getText();
        
        String phone = phoneText.getText();
        String mariatalStatus = null;
        if(married.isSelected()){
            mariatalStatus = "Married";
        }else if(unmarried.isSelected()){
            mariatalStatus = "Unmarried";
        }else if(other.isSelected()){
            mariatalStatus = "other";
        }
        
        
        String address = addressText.getText();
        
        String city = cityText.getText();
        
        String state = stateText.getText();
        
        String pincode = pincodeText.getText();
        
        
        try{
            if(phone.equals("")){
                JOptionPane.showMessageDialog(null,"Please enter mobile");
            }else{
                Conn c = new Conn();
                String query = "insert into signUp1 values('"+formNo+"', '"+name+"', '"+father+"', '"+dob+"', '"+gender+"', '"+email+"','"+phone+"', '"+mariatalStatus+"', '"+address+"', '"+city+"','"+state+"','"+pincode+"')"; 
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignUp2(formNo).setVisible(true);
            }
        }catch (Exception ae){
            System.out.println(ae);
        }
        
        
    }
    
    public static void main(String args[]) {
       new SignUp1();
    }
}
