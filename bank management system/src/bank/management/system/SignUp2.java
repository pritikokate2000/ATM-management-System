
package bank.management.system;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SignUp2 extends JFrame implements ActionListener {
    
   
    JTextField  pan, aadhar;
    JButton next;
    JRadioButton syes, sno,eyes, eno;
    JComboBox religion, category, occupation, income, education;
    String formNo;
    
    SignUp2(String formNo){
        this.formNo = formNo;
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        getContentPane().setBackground(Color.WHITE);
     
        
        JLabel additionalDetails = new JLabel("Page 2 : Additional details");
        additionalDetails.setFont(new Font("Arial", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);
        
        JLabel religionLabel = new JLabel("Religion : ");
        religionLabel.setFont(new Font("Arial", Font.BOLD, 20));
        religionLabel.setBounds(100, 140, 100, 30);
        add(religionLabel);
        
        
        
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        religion = new JComboBox(valReligion);
        religion.setBackground(Color.WHITE);
        religion.setBounds(300, 140, 400, 30);
        add(religion);
        
        
       
        JLabel categoryLabel = new JLabel("Category : ");
        categoryLabel.setFont(new Font("Arial", Font.BOLD, 20));
        categoryLabel.setBounds(100, 190, 200, 30);
        add(categoryLabel);
        
        String valCategory [] = {"general", "OBC", "SC", "ST", "Other"};
        category = new JComboBox(valCategory);
        category.setBackground(Color.WHITE);
        category.setBounds(300, 190, 400, 30);
        add(category);
        
        JLabel incomeLabel = new JLabel("Income : ");
        incomeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        incomeLabel.setBounds(100, 240, 200, 30);
        add(incomeLabel);
        
        String incomeCategory [] = {"null", "<1,50,000", "<2,50,000", "<5,00,000", "upto 10,00,000"};
        income = new JComboBox(incomeCategory);
        income.setBackground(Color.WHITE);
        income.setBounds(300, 240, 400, 30);
        add(income);
        
        
        
        JLabel eduLabel = new JLabel("Educational : ");
        eduLabel.setFont(new Font("Arial", Font.BOLD, 20));
        eduLabel.setBounds(100, 290, 200, 30);
        add(eduLabel);
        
        
        JLabel qua = new JLabel("Qualification : ");
        qua.setFont(new Font("Arial", Font.BOLD, 20));
        qua.setBounds(100, 315, 200, 30);
        add(qua);
        
        String educationValues [] = {"non-graduate", "graduate", "post-graduation", "Phd", "other"};
        education = new JComboBox(educationValues);
        education.setBackground(Color.WHITE);
        education.setBounds(300, 315, 400, 30);
        add(education);
        
       
        JLabel occupationLabel = new JLabel("Occupation : ");
        occupationLabel.setFont(new Font("Arial", Font.BOLD, 20));
        occupationLabel.setBounds(100, 390, 200, 30);
        add(occupationLabel);
        
        String occupationValues [] = {"salaried", "self-employed", "business", "student", "Retired", "Other"};
        occupation = new JComboBox(occupationValues);
        occupation.setBackground(Color.WHITE);
        occupation.setBounds(300, 390, 400, 30);
        add(occupation);
        
        
        
        JLabel panLabel = new JLabel("PAN No : ");
        panLabel.setFont(new Font("Arial", Font.BOLD, 20));
        panLabel.setBounds(100, 440, 200, 30);
        add(panLabel);
        
        pan = new JTextField();
        pan.setFont(new Font("Arial", Font.BOLD, 14));
        pan.setBounds(300, 440, 400, 30);
        add(pan);
        
        
        JLabel aadharLabel = new JLabel("Aadhar No : ");
        aadharLabel.setFont(new Font("Arial", Font.BOLD, 20));
        aadharLabel.setBounds(100, 490, 200, 30);
        add(aadharLabel);
        
        
        aadhar = new JTextField();
        aadhar.setFont(new Font("Arial", Font.BOLD, 14));
        aadhar.setBounds(300, 490, 400, 30);
        add(aadhar);
        
        
        JLabel citizen = new JLabel("Senior citizen : ");
        citizen.setFont(new Font("Arial", Font.BOLD, 20));
        citizen.setBounds(100, 540, 200, 30);
        add(citizen);
        
        syes = new JRadioButton("yes");
        syes.setBounds(300, 540, 120, 30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 120,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        
        ButtonGroup seniorCitizen = new ButtonGroup();
        seniorCitizen.add(syes);
        seniorCitizen.add(sno);
        
       
        
        JLabel exist = new JLabel("Existing account : ");
        exist.setFont(new Font("Arial", Font.BOLD, 20));
        exist.setBounds(100, 590, 200, 30);
        add(exist);
        
        eyes = new JRadioButton("yes");
        eyes.setBounds(300, 590, 120, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 120,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        
        ButtonGroup existinfAccount = new ButtonGroup();
        existinfAccount.add(eyes);
        existinfAccount.add(eno);
        
        
        
       next = new JButton("Next");
       next.setBackground(Color.BLACK);
       next.setForeground(Color.WHITE);
       next.setFont(new Font("Arial", Font.BOLD, 14));
       next.setBounds(620,660,80,30);
       next.addActionListener(this);
       add(next);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
       
        String sreligion = (String)religion.getSelectedItem();
        String scategory = (String)category.getSelectedItem();
        String sincome = (String)income.getSelectedItem();
        String seducation = (String)education.getSelectedItem();
        String soccupation = (String)occupation.getSelectedItem();
        
        String sseniorCitizen =null;
        if(syes.isSelected()){
            sseniorCitizen = "Yes";
        }else if(sno.isSelected()){
            sseniorCitizen = "No";
        }
        
        
        String sexistingAccount = null;
        if(eyes.isSelected()){
            sexistingAccount = "Yes";
        }else if(eno.isSelected()){
            sexistingAccount = "No";
        }
        
        
        String span = pan.getText();
        
        String saadhar = aadhar.getText();
        
        
        try{
    
                Conn c = new Conn();
                String query = "insert into signUp2 values('"+formNo+"', '"+sreligion+"', '"+scategory+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"', '"+sseniorCitizen+"', '"+sexistingAccount+"','"+sincome+"')"; 
                c.s.executeUpdate(query);
            
                setVisible(false);
                new SignUp3(formNo).setVisible(true);
        }catch (Exception ae){
            System.out.println(ae);
        }
        
        
    }
    
    public static void main(String args[]) {
       new SignUp2("");
    }
}


