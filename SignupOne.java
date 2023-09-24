package BankManagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;



public class SignupOne extends JFrame implements ActionListener{
    long random;
    JTextField nameTF,fnameTF,emailTF,adressTextField,cityTF,stateTF,pinTF;
    JButton next;
    JRadioButton male, female, other ,married, unmarried;
    JDateChooser dateChooser;

    
    SignupOne(){
        setLayout(null);
        Random ran = new Random();
        random =Math.abs(ran.nextLong()%9000L +1000L);
        

        JLabel formNo = new JLabel("APPLECATION FORM NO. " + random );
        formNo.setFont(new Font("Raleway", Font.BOLD, 38));
        formNo.setBounds(140, 20, 600, 40);
        add(formNo);

        JLabel personalDetail = new JLabel("Page 1: Personal Details");
        personalDetail.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetail.setBounds(290, 80, 400, 30);
        add(personalDetail);

        

        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);

        nameTF = new JTextField();
        nameTF.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTF.setBounds(300,140,400,30);
        add(nameTF);

        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);

        fnameTF = new JTextField();
        fnameTF.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameTF.setBounds(300,190,400,30);
        add(fnameTF);

        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);

         dateChooser = new JDateChooser();
         dateChooser.setBounds(300,240,400,30);
         dateChooser.setForeground(new Color(105,105,105));
         add(dateChooser);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        male.setBounds(300,290,60,20);
        male.setBackground(Color.WHITE);
        add(male);
        female.setBounds(450,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);


        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);

        emailTF = new JTextField();
        emailTF.setFont(new Font("Raleway", Font.BOLD, 14));
        emailTF.setBounds(300,340,400,30);
        add(emailTF);

        JLabel maritalStatus = new JLabel("Marital Status:");
        maritalStatus.setFont(new Font("Raleway", Font.BOLD, 20));
        maritalStatus.setBounds(100, 390, 200, 30);
        add(maritalStatus);

        married = new JRadioButton("Married");
        unmarried = new JRadioButton("Unmarried");
        married.setBounds(300,390,100,20);
        married.setBackground(Color.WHITE);
        add(married);

        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

        other = new JRadioButton("other");
        other.setBounds(630,390,100,30);
        other.setBackground(Color.WHITE);
        add(other);


        ButtonGroup marrtalGroup = new ButtonGroup();
        marrtalGroup.add(married);
        marrtalGroup.add(unmarried);
        marrtalGroup.add(other);

        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);

        adressTextField = new JTextField();
        adressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        adressTextField.setBounds(300,440,400,30);
        add(adressTextField);

        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);

        cityTF = new JTextField();
        cityTF.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTF.setBounds(300,490,400,30);
        add(cityTF);

        JLabel State = new JLabel("State:");
        State.setFont(new Font("Raleway", Font.BOLD, 20));
        State.setBounds(100, 540, 200, 30);
        add(State);

        stateTF = new JTextField();
        stateTF.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTF.setBounds(300,540,400,30);
        add(stateTF);

        JLabel pinCode = new JLabel("Pin Code:");
        pinCode.setFont(new Font("Raleway", Font.BOLD, 20));
        pinCode.setBounds(100, 590, 200, 30);
        add(pinCode);

        pinTF = new JTextField();
        pinTF.setFont(new Font("Raleway", Font.BOLD, 14));
        pinTF.setBounds(300,590,400,30);
        add(pinTF);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);


    }

    public void actionPerformed(ActionEvent ae){
        String formno = random+"";
        String name = nameTF.getText();
        String fname = fnameTF.getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }else if(female.isSelected()){
            gender = "Female";
        }

        String email = emailTF.getText();
        String marital = null;
        if(married.isSelected()){
            marital = "Married";
        }else if(unmarried.isSelected()){
            marital = "Unmarried";
        }else if(other.isSelected()){
            marital = "other";
        }

        String adress = adressTextField.getText();
        String city = cityTF.getText();
        String state = stateTF.getText();
        String pin = pinTF.getText();

        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is Requred");
            }else{
                conn c = new conn();
                String query = "insert into signup values('" + formno+ "','" + name+ "','" + fname+ "','" + gender+ "','" + email+ "','" + marital+ "','" + adress+ "','" + city+ "','" + state+ "','" + pin+ "')";
                c.s.executeUpdate(query);

                setVisible(false);
                new SignupTwo(formno).setVisible(true);
                
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        new SignupOne();
    }
}