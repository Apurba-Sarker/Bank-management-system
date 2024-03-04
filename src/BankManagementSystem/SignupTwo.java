package BankManagementSystem;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.awt.event.ActionListener;

public class SignupTwo extends JFrame implements ActionListener{

    long random;
    JTextField panTextField, NID;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    JDateChooser dateChooser;
    JComboBox religion,category,incategory,edu,occ;
    String formno;
    SignupTwo(String formno) {
        this.formno=formno;
        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM -PAGE 2");
        JLabel additionalDetails = new JLabel("APPLICATION FROM NO: ");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,38));
        additionalDetails.setBounds(140,20,600,40);
        add(additionalDetails);

        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);

        String valReligion[] = {"Islam","Hinduism","Christianity","Buddhism"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);

        JLabel fname = new JLabel("Catagory:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);

        String valcategory[] = {"General","OBC", "SC","ST","Other"};
        category  = new JComboBox(valcategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);

//        fnameTextField = new JTextField();
//        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
//        fnameTextField.setBounds(300,190,400,30);
//        add(fnameTextField);

        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);

        String incomecategory[] = {"Null","< 1,50,000", "< 2,50,000","< 5,00,000","Upto 10,00,000"};
        incategory  = new JComboBox(incomecategory);
        incategory.setBounds(300,240,400,30);
        incategory.setBackground(Color.WHITE);
        add(incategory);

//        JTextField dobTextField = new JTextField();
//        dobTextField.setFont(new Font("Raleway",Font.BOLD,14));
//        dobTextField.setBounds(300,240,400,30);
//        add(dobTextField);

//        dateChooser = new JDateChooser();
//        dateChooser.setBounds(300,240,400,30);
//        dateChooser.setForeground(new Color(105,105,105));
//        add(dateChooser);

        JLabel gender = new JLabel("Educational:");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);

//        JTextField genderTextField = new JTextField();
//        genderTextField.setFont(new Font("Raleway",Font.BOLD,14));
//        genderTextField.setBounds(300,290,400,30);
//        add(genderTextField);

//        male = new JRadioButton("Male");
//        male.setBounds(300,290,60,30);
//        male.setBackground(Color.WHITE);
//        add(male);
//
//        female = new JRadioButton("Female");
//        female.setBounds(450,290,120,30);
//        female.setBackground(Color.WHITE);
//        add(female);

//        ButtonGroup gendergroup = new ButtonGroup();
//        gendergroup.add(male);
//        gendergroup.add(female);

        JLabel email = new JLabel("Qualification:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,315,200,30);
        add(email);

        String educationValues[] = {"Non-Graduate","Graduate","Post Graduate","Doctorate","Others"};
        edu = new JComboBox(educationValues);
        edu.setBounds(300,315,400,30);
        edu.setBackground(Color.WHITE);
        add(edu);

//        emailTextField = new JTextField();
//        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
//        emailTextField.setBounds(300,340,400,30);
//        add(emailTextField);

        JLabel marital = new JLabel("Occupation:");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);

        String occupationValues[] = {"Salaried","Self-Employed","Business","Student","Retired","Others"};
        occ = new JComboBox(occupationValues);
        occ.setBounds(300,390,400,30);
        occ.setBackground(Color.WHITE);
        add(occ);

//        JTextField maritalTextField = new JTextField();
//        maritalTextField.setFont(new Font("Raleway",Font.BOLD,14));
//        maritalTextField.setBounds(300,390,400,30);
//        add(maritalTextField);

//        married = new JRadioButton("Married");
//        married.setBounds(300,390,120,30);
//        married.setBackground(Color.WHITE);
//        add(married);
//
//        unmarried = new JRadioButton("Unmarried");
//        unmarried.setBounds(450,390,120,30);
//        unmarried.setBackground(Color.WHITE);
//        add(unmarried);
//
//        ButtonGroup maritalgroup = new ButtonGroup();
//        maritalgroup.add(married);
//        maritalgroup.add(unmarried);

        JLabel address = new JLabel("PAN Number.:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);

        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway",Font.BOLD,14));
        panTextField.setBounds(300,440,400,30);
        add(panTextField);

        JLabel city = new JLabel("National ID:");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);

        NID = new JTextField();
        NID.setFont(new Font("Raleway",Font.BOLD,14));
        NID.setBounds(300,490,400,30);
        add(NID);

        JLabel state = new JLabel("Senior Citizen:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);

//        stateTextField = new JTextField();
//        stateTextField.setFont(new Font("Raleway",Font.BOLD,14));
//        stateTextField.setBounds(300,540,400,30);
//        add(stateTextField);


        syes = new JRadioButton("Yes");
        syes.setBounds(300,540,120,30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(450,540,120,30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);



        JLabel pincode = new JLabel("Existing Account:");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);

//        pincodeTextField = new JTextField();
//        pincodeTextField.setFont(new Font("Raleway",Font.BOLD,14));
//        pincodeTextField.setBounds(300,590,400,30);
//        add(pincodeTextField);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,590,120,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(450,590,120,30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup existinggroup = new ButtonGroup();
        existinggroup.add(eyes);
        existinggroup.add(eno);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        //String formno = ""+random;
       // String name = nameTextField.getText();
        //String fname  = fnameTextField.getText();
        //String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String sexisting = null;
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) incategory.getSelectedItem();
        String seducation = (String) edu.getSelectedItem();
        String soccupation = (String) occ.getSelectedItem();
        String span = panTextField.getText();
        String snid = NID.getText();
        if(eyes.isSelected()) {
            sexisting = "Yes";
        }else{
            sexisting = "No";
        }
        // String email = emailTextField.getText();
        String ssenior = null;
        if(syes.isSelected()) {
            ssenior = "Yes";
        }else{
            ssenior = "No";
        }
        String address = panTextField.getText();
        String city = NID.getText();
        // String state  = stateTextField.getText();
        // String pin = pincodeTextField.getText();
        try{
                Conn c = new Conn();
                String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+snid+"','"+ssenior+"','"+sexisting+"')";
                c.s.executeUpdate(query);
        } catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String args[]){
        System.setProperty("java.awt.headless", "true");
        new SignupTwo("");
    }
}
