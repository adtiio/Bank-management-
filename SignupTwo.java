package BankManagement;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
//import com.toedter.calendar.JDateChooser;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;



public class SignupTwo extends JFrame implements ActionListener{
    long random;
    JTextField nameTF,fnameTF,emailTF,adressTextField,cityTF,stateTF,pinTF,PanTextField,AdharTF;
    JButton next;
    JRadioButton male, female, other ,syes, sno,married,unmarried,Eyes,Eno;
    JComboBox religion, category, occupation, Education,income;
    String formno;
    
    SignupTwo(String form){
        this.formno = formno;
        setLayout(null);
        
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
      

        JLabel additionalDetail = new JLabel("Page 2: additional Details");
        additionalDetail.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetail.setBounds(290, 80, 400, 30);
        add(additionalDetail);

        

        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        String valReligion[] = {"Hindu", "Muslim", "Sikh","Christian","Other"};
        religion = new JComboBox(valReligion);
        religion.setFont(new Font("Raleway", Font.BOLD, 14));
        religion.setBackground(Color.WHITE);
        religion.setBounds(300,140,400,30);
        add(religion);

        

        JLabel fname = new JLabel("Catagory:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);


        String valcategory[] = {"General","OBC","SC","ST","Other"};
        category = new JComboBox(valcategory);
        category.setFont(new Font("Raleway", Font.BOLD, 14));
        category.setBackground(Color.white);
        category.setBounds(300,190,400,30);
        add(category);

        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        String valincome[] = {"null","< 1,50,000","< 2,50,000","< 5,00,000","Upto 10,00,000"};
        income= new JComboBox(valincome);
        income.setFont(new Font("Raleway", Font.BOLD, 14));
        income.setBackground(Color.white);
        income.setBounds(300,240,400,30);
        add(income);

        JLabel gender = new JLabel("Educational:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

        String valeducation[] = {"Non Graduate", "Graduate","Post Gratuation","Doctrate","Other"};
        Education= new JComboBox(valeducation);
        Education.setFont(new Font("Raleway", Font.BOLD, 14));
        Education.setBackground(Color.white);
        Education.setBounds(300,315,400,30);
        add(Education);


        JLabel email = new JLabel("Qualification:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 315, 200, 30);
        add(email);

        

        JLabel maritalStatus = new JLabel("occupation:");
        maritalStatus.setFont(new Font("Raleway", Font.BOLD, 20));
        maritalStatus.setBounds(100, 390, 200, 30);
        add(maritalStatus);

        String valoccupation[] = {"Salaried","Self Employed","Bussiness","Student","Retired","Other"};
        occupation= new JComboBox(valoccupation);
        occupation.setFont(new Font("Raleway", Font.BOLD, 14));
        occupation.setBackground(Color.white);
        occupation.setBounds(300,390,400,30);
        add(occupation);

        JLabel address = new JLabel("PAN Number:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);

        PanTextField = new JTextField();
        PanTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        PanTextField.setBounds(300,440,400,30);
        add(PanTextField);

        JLabel city = new JLabel("Adhar Number:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);

        AdharTF = new JTextField();
        AdharTF.setFont(new Font("Raleway", Font.BOLD, 14));
        AdharTF.setBounds(300,490,400,30);
        add(AdharTF);

        JLabel State = new JLabel("Senior Citizen:");
        State.setFont(new Font("Raleway", Font.BOLD, 20));
        State.setBounds(100, 540, 200, 30);
        add(State);

        syes = new JRadioButton("Yes");
        sno = new JRadioButton("No");
        syes.setBounds(300,540,100,20);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);

        

        ButtonGroup marrtalGroup = new ButtonGroup();
        marrtalGroup.add(syes);
        marrtalGroup.add(sno);
        

        

        JLabel pinCode = new JLabel("Existing Account:");
        pinCode.setFont(new Font("Raleway", Font.BOLD, 20));
        pinCode.setBounds(100, 590, 200, 30);
        add(pinCode);

        Eyes = new JRadioButton("YES");
        Eno = new JRadioButton("NO");
        Eyes.setBounds(300,590,100,20);
        Eyes.setBackground(Color.WHITE);
        add(Eyes);
        
        Eno.setBounds(450,590,100,30);
        Eno.setBackground(Color.WHITE);
        add(Eno);

        

        ButtonGroup existingBG = new ButtonGroup();
        existingBG.add(Eyes);
        existingBG.add(Eno);

        

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
        String  Sreligion = ""+ religion.getSelectedItem();
        String Scatagery = ""+category.getSelectedItem();
        String Sincome = ""+ income.getSelectedItem();
        String education = ""+ Education.getSelectedItem();
        String Soccupation = ""+occupation.getSelectedItem();
        String seniorcitizen = null;
        if(syes.isSelected()){
            seniorcitizen = "Yes";
        }else if(sno.isSelected()){
            seniorcitizen = "No";
        }

        String existingacc = null;
        if(Eyes.isSelected()){
            existingacc = "Yes";
        }else if(Eno.isSelected()){
            existingacc = "No";
        }

       String sPan = PanTextField.getText();
       String sAdhar = AdharTF.getText();

        try{
            
                conn c = new conn();
                String query = "insert into signuptwo values('" + formno+ "','" + Sreligion+ "','" + Scatagery+ "','" + Sincome+ "','" + education+ "','" + Soccupation+ "','" + sPan+ "','" + sAdhar+ "','" + seniorcitizen+ "','" + existingacc+ "')";
                c.s.executeUpdate(query);

                //signup3 Object
            
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        new SignupTwo("");
    }
}