import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.io.*;
import java.net.*;
import javax.swing.JOptionPane;
import java.sql.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.Random;

public class child_enrollment  extends JFrame implements ActionListener,ItemListener{

  JCheckBox c1;
  JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20;
  JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27;
  ImageIcon i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15;
  JRadioButton jb1,jb2,jb3;
  JFileChooser jf;
  JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20;
  String nm,address,dob,mobile;
  int aadhar_no;

  Random rand = new Random();


  int rand_int3 = rand.nextInt(100000);
  int eid;


  Frame f1=new Frame();
  Frame f2=new Frame();
  Frame f3=new Frame();
  Frame f4=new Frame();
  Frame f5=new Frame();
  Frame f6=new Frame();
  Frame f7=new Frame();
  public child_enrollment(){

    f1.setVisible(true);  
    f1.setSize(1950,1050);
    Image icon = Toolkit.getDefaultToolkit().getImage("adhar.jpg");    
    f1.setIconImage(icon);   
    f1.setLayout(null);


    f2.setVisible(false);
    f2.setSize(1950,1050);
    f2.setLayout(null);

    f3.setVisible(false);
    f3.setSize(1950,1050);
    f3.setLayout(null);

    f4.setVisible(false);
    f4.setSize(780,1050);
    f4.setLocation(500,1);
    f4.setLayout(null);

    f5.setVisible(false);
    f5.setSize(1950,1050);
    f5.setLayout(null);

    f6.setVisible(false);
    f6.setSize(1950,1050);
    f6.setLayout(null);

    f7.setVisible(false);
    f7.setSize(1950,1050);
    f7.setLayout(null);

    f1.setBackground( Color.decode("#71DFE7") );
    l1=new JLabel("CHILD ENROLLMENT CLIENT");
    l1.setFont(new Font("Times New Roman",Font.BOLD,60));
    l1.setForeground(Color.blue);
    l1.setBounds(580,40,900,100);
    f1.add(l1);

    i1=new ImageIcon(new ImageIcon("operator.jpg").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
    l2=new JLabel();
    l2.setBounds(130,170,300,300);
    f1.add(l2);
    l2.setIcon(i1);

    i2=new ImageIcon(new ImageIcon("user.jpg").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
    l3=new JLabel();
    l3.setBounds(830,600,300,300);
    f1.add(l3);
    l3.setIcon(i2);


    i3=new ImageIcon(new ImageIcon("find.png").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
    l4=new JLabel();
    l4.setBounds(1510,170,300,300);
    f1.add(l4);
    l4.setIcon(i3);

    i4=new ImageIcon(new ImageIcon("mobileupdate.png").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
    l5=new JLabel();
    l5.setBounds(130,600,300,300);
    f1.add(l5);
    l5.setIcon(i4);

    i5=new ImageIcon(new ImageIcon("aadhar.jpg").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
    l6=new JLabel();
    l6.setBounds(830,170,300,300);
    f1.add(l6);
    l6.setIcon(i5);


    i6=new ImageIcon(new ImageIcon("child.png").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
    l7=new JLabel();
    l7.setBounds(1510,600,300,300);
    f1.add(l7);
    l7.setIcon(i6);

    b1=new JButton("Add Operator");
    b1.setFont(new Font("Times New Roman",Font.BOLD,25));
    b1.setBounds(130,500,300,50);
    b1.setForeground(Color.blue);
    f1.add(b1);

    b2=new JButton("User Info");
    b2.setFont(new Font("Times New Roman",Font.BOLD,25));
    b2.setBounds(830,930,300,50);
    b2.setForeground(Color.blue);
    f1.add(b2);

    b3=new JButton("Find Aadhaar");
    b3.setFont(new Font("Times New Roman",Font.BOLD,25));
    b3.setBounds(1510,500,300,50);
    b3.setForeground(Color.blue);
    f1.add(b3);

    b4=new JButton("Aadhaar Mobile Link");
    b4.setFont(new Font("Times New Roman",Font.BOLD,25));
    b4.setBounds(130,930,300,50);
    b4.setForeground(Color.blue);
    f1.add(b4);

    b5=new JButton("Create New Aadhaar");
    b5.setFont(new Font("Times New Roman",Font.BOLD,25));
    b5.setBounds(830,500,300,50);
    b5.setForeground(Color.blue);
    f1.add(b5);

    b6=new JButton("About CEC");
    b6.setFont(new Font("Times New Roman",Font.BOLD,25));
    b6.setBounds(1510,930,300,50);
    b6.setForeground(Color.blue);

    f1.add(b6);

    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);

    i7=new ImageIcon(new ImageIcon("").getImage().getScaledInstance(1950,1050, Image.SCALE_DEFAULT));
    l8=new JLabel();
    l8.setBounds(0,0,1950,1050);
    f1.add(l8);
    l8.setIcon(i7);

    /*Add operator */


    l1=new JLabel("ADD OPERATOR");
    l1.setFont(new Font("Times New Roman",Font.BOLD,60));
    l1.setForeground(Color.blue);
    l1.setBounds(750,100,900,100);
    f2.add(l1);

    l2=new JLabel("Enter Name");
    l2.setFont(new Font("Times New Roman",Font.BOLD,36));
    l2.setForeground(Color.white);
    l2.setBounds(150,300,300,100);
    f2.add(l2);

    l3=new JLabel("Enter Aadhaar No.");
    l3.setFont(new Font("Times New Roman",Font.BOLD,36));
    l3.setForeground(Color.white);
    l3.setBounds(150,500,300,100);
    f2.add(l3);

    l4=new JLabel("Enter Mobile No.");
    l4.setFont(new Font("Times New Roman",Font.BOLD,36));
    l4.setForeground(Color.white);
    l4.setBounds(150,700,300,100);
    f2.add(l4);



    t1=new JTextField();
    t2=new JTextField();
    t3=new JTextField();

    t1.setBounds(500,330,350,50);
    t1.setFont(new Font("Times New Roman",Font.BOLD,30));
    f2.add(t1);

    t2.setBounds(500,530,350,50);
    t2.setFont(new Font("Times New Roman",Font.BOLD,30));
    f2.add(t2);

    t3.setBounds(500,730,350,50);
    t3.setFont(new Font("Times New Roman",Font.BOLD,30));
    f2.add(t3);


    b7=new JButton("Upload Your Photo");
    b7.setFont(new Font("Times New Roman",Font.BOLD,25));
    b7.setBounds(1050,530,290,50);
    b7.setForeground(Color.blue);
    f2.add(b7);

    b8=new JButton("Submit");
    b8.setFont(new Font("Times New Roman",Font.BOLD,25));
    b8.setBounds(1550,330,150,50);
    b8.setBackground(Color.green);
    b8.setForeground(Color.blue);
    f2.add(b8);

    b9=new JButton("Reset");
    b9.setFont(new Font("Times New Roman",Font.BOLD,25));
    b9.setBounds(1550,530,150,50);
    b9.setForeground(Color.blue);
    f2.add(b9);

    b14=new JButton("Cancel");
    b14.setFont(new Font("Times New Roman",Font.BOLD,25));
    b14.setBounds(1550,730,150,50);
    b14.setBackground(Color.red);
    b14.setForeground(Color.black);
    f2.add(b14);

    i9=new ImageIcon(new ImageIcon("").getImage().getScaledInstance(500,500, Image.SCALE_DEFAULT));
    l9=new JLabel();
    l9.setBounds(1000,400,500,500);
    f2.add(l9);


    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
    b14.addActionListener(this);

    jf=new JFileChooser();
    jf.setCurrentDirectory(new File("."));


    // i7=new ImageIcon(new ImageIcon("color.jpg").getImage().getScaledInstance(1950,1050, Image.SCALE_DEFAULT));
    // l8=new JLabel();
    // l8.setBounds(0,0,1950,1050);
    // f2.add(l8);
    // l8.setIcon(i7);

    f2.setBackground( Color.decode("#009DAE") );


    /*Add operator*/

    /*Create New Aadhaar*/

    l1=new JLabel("CREATE AADHAAR CARD");
    l1.setFont(new Font("Times New Roman",Font.BOLD,60));
    l1.setForeground(Color.blue);
    l1.setBounds(600,100,900,100);
    f3.add(l1);

    l2=new JLabel("Enter Name");
    l2.setFont(new Font("Times New Roman",Font.BOLD,36));
    l2.setForeground(Color.white);
    l2.setBounds(150,250,300,100);
    f3.add(l2);

    l3=new JLabel("Enter Mobile No.");
    l3.setFont(new Font("Times New Roman",Font.BOLD,36));
    l3.setForeground(Color.white);
    l3.setBounds(150,400,300,100);
    f3.add(l3);

    l4=new JLabel("Enter Address");
    l4.setFont(new Font("Times New Roman",Font.BOLD,36));
    l4.setForeground(Color.white);
    l4.setBounds(1100,250,300,100);
    f3.add(l4);

    l5=new JLabel("Enter DOB");
    l5.setFont(new Font("Times New Roman",Font.BOLD,36));
    l5.setForeground(Color.white);
    l5.setBounds(1100,400,300,100);
    f3.add(l5);

    l6=new JLabel("Choose Gender");
    l6.setFont(new Font("Times New Roman",Font.BOLD,36));
    l6.setForeground(Color.white);
    l6.setBounds(150,600,300,100);
    f3.add(l6);


    jb1=new JRadioButton("Male");
    jb1.setFont(new Font("Times New Roman",Font.BOLD,36));
    jb1.setBackground(Color.cyan);
    jb1.setBounds(500,630,130,40);
    jb2=new JRadioButton("Female");
    jb2.setBackground(Color.cyan);
    jb2.setFont(new Font("Times New Roman",Font.BOLD,36));
    jb2.setBounds(700,630,150,40);

    ButtonGroup bg=new ButtonGroup();
    bg.add(jb1);bg.add(jb2);

    f3.add(jb1);
    f3.add(jb2);

    t4=new JTextField();
    t5=new JTextField();
    t6=new JTextField();
    t7=new JTextField();

    t4.setBounds(500,275,350,50);
    t4.setFont(new Font("Times New Roman",Font.BOLD,30));
    f3.add(t4);

    t5.setBounds(500,435,350,50);
    t5.setFont(new Font("Times New Roman",Font.BOLD,30));
    f3.add(t5);

    t6.setBounds(1500,275,350,50);
    t6.setFont(new Font("Times New Roman",Font.BOLD,30));
    f3.add(t6);

    t7.setBounds(1500,435,350,50);
    t7.setFont(new Font("Times New Roman",Font.BOLD,30));
    f3.add(t7);

    b10=new JButton("Upload Your Photo");
    b10.setFont(new Font("Times New Roman",Font.BOLD,25));
    b10.setBounds(1100,620,290,50);
    b10.setForeground(Color.blue);
    f3.add(b10);

    b11=new JButton("Create");
    b11.setFont(new Font("Times New Roman",Font.BOLD,25));
    b11.setBackground(Color.green);
    b11.setBounds(500,850,150,50);
    b11.setForeground(Color.blue);
    f3.add(b11);

    b12=new JButton("Reset");
    b12.setFont(new Font("Times New Roman",Font.BOLD,25));
    b12.setBounds(900,850,150,50);
    b12.setForeground(Color.blue);
    f3.add(b12);

    b13=new JButton("Cancel");
    b13.setFont(new Font("Times New Roman",Font.BOLD,25));
    b13.setBounds(1300,850,150,50);
    b13.setBackground(Color.red);
    b13.setForeground(Color.black);
    f3.add(b13);

    b10.addActionListener(this);
    b11.addActionListener(this);
    b12.addActionListener(this);
    b13.addActionListener(this);


    i7=new ImageIcon(new ImageIcon("createadhar.jpg").getImage().getScaledInstance(1950,1050, Image.SCALE_DEFAULT));
    l8=new JLabel();
    l8.setBounds(0,0,1950,1050);
    f3.add(l8);
    l8.setIcon(i7);
    /*Create New Aadhaar*/



    /*Find Aadhaar*/
    l19=new JLabel("GOVERNMENT OF INDIA");
    l19.setFont(new Font("Times New Roman",Font.BOLD,45));
    l19.setForeground(Color.blue);
    l19.setBounds(700,100,900,50);
    f5.add(l19);

    l20=new JLabel("Enter EID No.");
    l20.setFont(new Font("Times New Roman",Font.BOLD,40));
    l20.setForeground(Color.cyan);
    l20.setBounds(600,400,300,50);
    f5.add(l20);

    t8=new JTextField();

    t8.setBounds(900,400,350,50);
    t8.setFont(new Font("Times New Roman",Font.BOLD,30));
    f5.add(t8);

    b12=new JButton("Find");
    b12.setFont(new Font("Times New Roman",Font.BOLD,25));
    b12.setBackground(Color.green);
    b12.setBounds(500,850,150,50);
    b12.setForeground(Color.blue);
    f5.add(b12);

    b13=new JButton("Reset");
    b13.setFont(new Font("Times New Roman",Font.BOLD,25));
    b13.setBounds(900,850,150,50);
    b13.setForeground(Color.blue);
    f5.add(b13);

    b14=new JButton("Cancel");
    b14.setFont(new Font("Times New Roman",Font.BOLD,25));
    b14.setBounds(1300,850,150,50);
    b14.setBackground(Color.red);
    b14.setForeground(Color.black);
    f5.add(b14);

    b12.addActionListener(this);
    b13.addActionListener(this);
    b14.addActionListener(this);

    i10=new ImageIcon(new ImageIcon("color.jpg").getImage().getScaledInstance(1950,1050, Image.SCALE_DEFAULT));
    l18=new JLabel();
    l18.setBounds(0,0,1950,1050);
    f5.add(l18);
    l18.setIcon(i10);


    i8=new ImageIcon(new ImageIcon("bharatsarkar.jpeg").getImage().getScaledInstance(100,120, Image.SCALE_DEFAULT));
    l8=new JLabel();
    l8.setBounds(40,80,100,120);
    f4.add(l8);
    l8.setIcon(i8);

    i9=new ImageIcon(new ImageIcon("adhar.jpg").getImage().getScaledInstance(150,120, Image.SCALE_DEFAULT));
    l9=new JLabel();
    l9.setBounds(560,80,150,120);
    f4.add(l9);
    l9.setIcon(i9);


    // nm=t4.getText();
    // mobile=Integer.parseInt(t5.getText());
    // address=t6.getText();
    // dob=t7.getText();



    l1=new JLabel("GOVERNMENT OF INDIA");
    l1.setFont(new Font("Times New Roman",Font.BOLD,45));
    l1.setForeground(Color.blue);
    l1.setBounds(100,200,900,50);
    f4.add(l1);

    l2=new JLabel("Name");
    l2.setFont(new Font("Times New Roman",Font.BOLD,30));
    l2.setBounds(90,330,300,100);
    f4.add(l2);

    l10=new JLabel();
    l10.setFont(new Font("Times New Roman",Font.BOLD,30));
    l10.setBounds(350,330,500,100);
    f4.add(l10);

    l3=new JLabel("Mobile No.");
    l3.setFont(new Font("Times New Roman",Font.BOLD,30));
    l3.setBounds(90,400,300,100);
    f4.add(l3);

    l16=new JLabel();
    l16.setFont(new Font("Times New Roman",Font.BOLD,30));
    l16.setBounds(350,400,700,100);
    f4.add(l16);

    l4=new JLabel("Address");
    l4.setFont(new Font("Times New Roman",Font.BOLD,30));
    l4.setBounds(90,470,300,100);
    f4.add(l4);

    l11=new JLabel();

    l11.setFont(new Font("Times New Roman",Font.BOLD,30));
    l11.setBounds(350,470,300,100);
    f4.add(l11);

    l5=new JLabel("DOB");
    l5.setFont(new Font("Times New Roman",Font.BOLD,30));
    l5.setBounds(90,530,150,100);
    f4.add(l5);

    l12=new JLabel();

    l12.setFont(new Font("Times New Roman",Font.BOLD,30));
    l12.setBounds(350,530,300,100);
    f4.add(l12);

    l6=new JLabel("Your Aadhaar No.");
    l6.setFont(new Font("Times New Roman",Font.BOLD,40));
    l6.setForeground(Color.red);
    l6.setBounds(90,640,400,100);
    f4.add(l6);

    l7=new JLabel("EID NO. :");
    l7.setFont(new Font("Times New Roman",Font.BOLD,23));
    l7.setForeground(Color.gray);
    l7.setBounds(260,230,300,100);
    f4.add(l7);

    i9=new ImageIcon(new ImageIcon("qrcode.png").getImage().getScaledInstance(150,150, Image.SCALE_DEFAULT));
    l9=new JLabel();
    l9.setBounds(500,620,150,150);
    f4.add(l9);
    l9.setIcon(i9);

    l13=new JLabel("------------------------------------------------------------------------------------------------------------");
    l13.setFont(new Font("Times New Roman",Font.BOLD,23));
    l13.setForeground(Color.gray);
    l13.setBounds(0,790,800,30);
    f4.add(l13);

    l14=new JLabel();

    l14.setFont(new Font("Times New Roman",Font.BOLD,50));
    l14.setBounds(230,850,300,60);
    f4.add(l14);

    l15=new JLabel("My Aadhaar is My Identity");
    l15.setFont(new Font("Times New Roman",Font.BOLD,40));
    l15.setForeground(Color.blue);
    l15.setBounds(160,930,500,80);
    f4.add(l15);

    l17=new JLabel();
    l17.setFont(new Font("Times New Roman",Font.BOLD,23));
    l17.setForeground(Color.gray);
    l17.setBounds(380,240,500,80);
    f4.add(l17);


    /*Find Aadhaar*/


    /*Aadhaar Mobile Number*/

    l1=new JLabel("MOBILE LINK TO AADHAAR");
    l1.setFont(new Font("Times New Roman",Font.BOLD,45));
    l1.setForeground(Color.white);
    l1.setBounds(650,100,900,100);
    f6.add(l1);

    l2=new JLabel("Enter Mobile No.");
    l2.setFont(new Font("Times New Roman",Font.BOLD,35));
    l2.setForeground(Color.white);
    l2.setBounds(250,300,300,100);
    f6.add(l2);

    l3=new JLabel("Enter Captcha Code");
    l3.setFont(new Font("Times New Roman",Font.BOLD,35));
    l3.setForeground(Color.white);
    l3.setBounds(250,450,400,100);
    f6.add(l3);

    l3=new JLabel("Captcha Code");
    l3.setFont(new Font("Times New Roman",Font.BOLD,35));
    l3.setForeground(Color.white);
    l3.setBounds(1300,300,300,100);
    f6.add(l3);

    l4=new JLabel();
    l4.setText(""+rand_int3);
    l4.setFont(new Font("Times New Roman",Font.BOLD,35));
    l4.setForeground(Color.white);
    l4.setBounds(1350,450,300,100);
    f6.add(l4);

    t9=new JTextField();
    t10=new JTextField();


    t9.setBounds(700,330,350,50);
    t9.setFont(new Font("Times New Roman",Font.BOLD,30));
    f6.add(t9);

    t10.setBounds(700,470,350,50);
    t10.setFont(new Font("Times New Roman",Font.BOLD,30));
    f6.add(t10);




    b15=new JButton("Continue");
    b15.setFont(new Font("Times New Roman",Font.BOLD,25));
    b15.setBackground(Color.green);
    b15.setBounds(500,850,150,50);
    b15.setForeground(Color.blue);
    f6.add(b15);

    b16=new JButton("Reset");
    b16.setFont(new Font("Times New Roman",Font.BOLD,25));
    b16.setBounds(900,850,150,50);
    b16.setForeground(Color.blue);
    f6.add(b16);

    b17=new JButton("Cancel");
    b17.setFont(new Font("Times New Roman",Font.BOLD,25));
    b17.setBounds(1300,850,150,50);
    b17.setBackground(Color.red);
    b17.setForeground(Color.black);
    f6.add(b17);

    b15.addActionListener(this);
    b16.addActionListener(this);
    b17.addActionListener(this);

    i11=new ImageIcon(new ImageIcon("link.jpg").getImage().getScaledInstance(1950,1050, Image.SCALE_DEFAULT));
    l19=new JLabel();
    l19.setBounds(0,0,1950,1050);
    f6.add(l19);
    l19.setIcon(i11);


    l1=new JLabel("MOBILE LINK TO AADHAAR");
    l1.setFont(new Font("Times New Roman",Font.BOLD,45));
    l1.setForeground(Color.blue);
    l1.setBounds(650,50,900,100);
    f7.add(l1);

    l2=new JLabel("Resident Aadhaar");
    l2.setFont(new Font("Times New Roman",Font.BOLD,36));
    l2.setForeground(Color.white);
    l2.setBounds(200,200,500,100);
    f7.add(l2);

    l3=new JLabel("Operator Aadhaar");
    l3.setFont(new Font("Times New Roman",Font.BOLD,36));
    l3.setForeground(Color.white);
    l3.setBounds(800,200,500,100);
    f7.add(l3);

    l4=new JLabel("EID No.");
    l4.setFont(new Font("Times New Roman",Font.BOLD,36));
    l4.setForeground(Color.white);
    l4.setBounds(1400,200,500,100);
    f7.add(l4);

    l5=new JLabel("Resident Photo");
    l5.setFont(new Font("Times New Roman",Font.BOLD,36));
    l5.setForeground(Color.white);
    l5.setBounds(200,450,500,100);
    f7.add(l5);

    l5=new JLabel("Operator Photo");
    l5.setFont(new Font("Times New Roman",Font.BOLD,36));
    l5.setForeground(Color.white);
    l5.setBounds(800,450,500,100);
    f7.add(l5);

    l6=new JLabel("New Email");
    l6.setFont(new Font("Times New Roman",Font.BOLD,36));
    l6.setForeground(Color.white);
    l6.setBounds(1400,450,500,100);
    f7.add(l6);

    l7=new JLabel("New Mobile");
    l7.setFont(new Font("Times New Roman",Font.BOLD,36));
    l7.setForeground(Color.white);
    l7.setBounds(1400,650,500,100);
    f7.add(l7);

    t11=new JTextField();
    t12=new JTextField();
    t13=new JTextField();
    t14=new JTextField();
    t15=new JTextField();


    t11.setBounds(200,320,290,50);
    t11.setFont(new Font("Times New Roman",Font.BOLD,30));
    f7.add(t11);

    t12.setBounds(800,320,290,50);
    t12.setFont(new Font("Times New Roman",Font.BOLD,30));
    f7.add(t12);

    t13.setBounds(1400,320,290,50);
    t13.setFont(new Font("Times New Roman",Font.BOLD,30));
    f7.add(t13);

    t14.setBounds(1400,570,290,50);
    t14.setFont(new Font("Times New Roman",Font.BOLD,30));
    f7.add(t14);

    t15.setBounds(1400,750,290,50);
    t15.setFont(new Font("Times New Roman",Font.BOLD,30));
    f7.add(t15);

    b18=new JButton("Upload Resident Photo");
    b18.setFont(new Font("Times New Roman",Font.BOLD,22));
    b18.setBounds(200,570,250,50);
    f7.add(b18);
    b18.addActionListener(this);

    b19=new JButton("Upload Operator Photo");
    b19.setFont(new Font("Times New Roman",Font.BOLD,22));
    b19.setBounds(800,570,270,50);
    f7.add(b19);
    b19.addActionListener(this);

    b20=new JButton("Update");
    b20.setVisible(false);
    b20.setFont(new Font("Times New Roman",Font.BOLD,25));
    b20.setBackground(Color.green);
    b20.setBounds(200,800,150,50);
    b20.setForeground(Color.blue);
    f7.add(b20);

    b21=new JButton("Reset");
    b21.setFont(new Font("Times New Roman",Font.BOLD,25));
    b21.setBounds(500,800,150,50);
    b21.setForeground(Color.blue);
    f7.add(b21);

    b22=new JButton("Cancel");
    b22.setFont(new Font("Times New Roman",Font.BOLD,25));
    b22.setBounds(800,800,150,50);
    b22.setBackground(Color.red);
    b22.setForeground(Color.black);
    f7.add(b22);

    b20.addActionListener(this);
    b21.addActionListener(this);
    b22.addActionListener(this);

    c1=new JCheckBox("Resident Disclosure");
    f7.add(c1);
    c1.setFont(new Font("Times New Roman",Font.BOLD,30));
    c1.setBounds(1400,850,300,50);
    c1.addItemListener(this);


    i12=new ImageIcon(new ImageIcon("link2.jpg").getImage().getScaledInstance(1950,1050, Image.SCALE_DEFAULT));
    l20=new JLabel();
    l20.setBounds(0,0,1950,1050);
    f7.add(l20);
    l20.setIcon(i12);
    /*Aadhaar Mobile Number*/


  }


  public void actionPerformed(ActionEvent ae){
    String s=ae.getActionCommand();


    if (s.equals("Add Operator")) {
      f2.setVisible(true);
      f1.setVisible(false);
    }
    if (s.equals("Update")) {
            try{
              Class.forName("com.mysql.jdbc.Driver");
							

							Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/child_enrollment","root","root");
              Connection co1=DriverManager.getConnection("jdbc:mysql://localhost:3306/child_enrollment","root","root");
              Connection co2=DriverManager.getConnection("jdbc:mysql://localhost:3306/child_enrollment","root","root");
							

              int res_ad=Integer.parseInt(t11.getText());
              String op_ad=t12.getText();
              int eid=Integer.parseInt(t13.getText());
              String mail=t14.getText();
              int a1=0,a2=0;
              String a="";
              int eid1=Integer.parseInt(t13.getText());
							PreparedStatement ps=co.prepareStatement("select eid,aadhar_no from createaadhar where eid="+eid1); 
							ResultSet rs=ps.executeQuery();
							while(rs.next())
							{
									a1=rs.getInt(1);
									a2=rs.getInt(2);
                  System.out.println(a1);
                  System.out.println(a2);
							}
							co.close();
              String op_ad1=t12.getText();
              PreparedStatement ps1=co1.prepareStatement("select aadhar_no from add_operator where aadhar_no="+op_ad1); 
							ResultSet rs1=ps1.executeQuery();
							while(rs1.next())
							{
									a=rs1.getString(1);
                  System.out.println(a);
							}
							co1.close();
              if(op_ad1.equals(a)){
                if(res_ad == a2){
                  if(eid== a1 ){  
                String mob=t9.getText();
                PreparedStatement ps2=co2.prepareStatement("update createaadhar set mobile=? where aadhar_no="+res_ad);
                ps2.setString(1,mob);
								ps2.executeUpdate();
                JOptionPane.showMessageDialog(this,"Mobile Number Linked to Aadhar Card... :)");
                co2.close();
                f7.setVisible(false);
                f4.setVisible(false);
                f1.setVisible(true);
                t11.setText("");
                t12.setText("");
                t13.setText("");
                t14.setText("");
              }
              else{
                JOptionPane.showMessageDialog(this,"EID Number not found");
              }
            }
            else{
              JOptionPane.showMessageDialog(this,"Aadhar Number not found");
            }
          }
          else{
            JOptionPane.showMessageDialog(this,"Operator not found");
          }
              co.close();
              
          }catch(Exception e){
            JOptionPane.showMessageDialog(this,""+e);
          }  
    }
    if (s.equals("Continue")) {
   //   String captcha1=t10.getText();
        int captcha=Integer.parseInt(t10.getText());
        String mob=t9.getText();
        if(captcha>4){
          if(mob.length()==10){
            t15.setText(""+mob);
            t15.setEditable(false);
            if (captcha==rand_int3) {
              try{
                  Class.forName("com.mysql.jdbc.Driver");
    
                  Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/child_enrollment","root","root");
    
                  PreparedStatement ps=co.prepareStatement("insert into link_mob values(?,?)");
                  ps.setInt(1,captcha);
                  ps.setString(2,mob);
                  ps.executeUpdate();
                  co.close();
                  f7.setVisible(true);
                  f6.setVisible(false);
    
              }catch(Exception e){
                JOptionPane.showMessageDialog(this,""+e);
              }
            }
            else{
              JOptionPane.showMessageDialog(this,"Please provide valid captcha code");
            }
          }
          else{
            JOptionPane.showMessageDialog(this,"Please provide 10 digit mobile number");
          }
        }
        else{
          JOptionPane.showMessageDialog(this,"Please provide valid captcha code");
        }


      

    }
    if (s.equals("Find")) {  
      
          try{
            Class.forName("com.mysql.jdbc.Driver");
       

            Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/child_enrollment","root","root");
          

            int a1=Integer.parseInt(t8.getText());
            PreparedStatement ps=co.prepareStatement("select name,mobile,address,dob,eid, aadhar_no from createaadhar where eid="+a1);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
              String nm=rs.getString(1);
              String mob=rs.getString(2);
              String add=rs.getString(3);
              String dob=rs.getString(4);
              int eid=rs.getInt(5);
              int aadhar_no=rs.getInt(6);
              l10.setText(""+nm);
              l16.setText(""+mob);
              l11.setText(""+add);
              l12.setText(""+dob);	
              l17.setText(""+eid);
              l14.setText(""+aadhar_no);
            }
            ps.close();
            f4.setVisible(true);

          }catch(Exception e){
            JOptionPane.showMessageDialog(this,""+e);
          }

    }

    if (s.equals("Aadhaar Mobile Link")) {
      f6.setVisible(true);
      f1.setVisible(false);
    }
    if (s.equals("Find Aadhaar")) {
      f5.setVisible(true);
      f1.setVisible(false);
    }
    if (s.equals("Cancel")) {
      f1.setVisible(true);
      f2.setVisible(false);
      f3.setVisible(false);
      f5.setVisible(false);
      f6.setVisible(false);
      f7.setVisible(false);

    }
    if (s.equals("Create New Aadhaar")) {
      f3.setVisible(true);
      f2.setVisible(false);
      f1.setVisible(false);
    }

    if (s.equals("Upload Your Photo")) {
      try {
        int result=jf.showOpenDialog(null);
      if(result==JFileChooser.APPROVE_OPTION){
          String nm=jf.getSelectedFile().getPath();
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/child_enrollment","root","root");
          PreparedStatement pstmt = con.prepareStatement("INSERT INTO img VALUES(?,?)");
          pstmt.setString(1, "sample image");
          //Inserting Blob type
          InputStream in = new FileInputStream(nm);
          pstmt.setBlob(2, in);
          //Executing the statement
          pstmt.execute();
          System.out.print("img stored");
      } 
      
      }catch (Exception e) {}
    }
    if (s.equals("Upload Resident Photo")) {
      try {
        int result=jf.showOpenDialog(null);
      if(result==JFileChooser.APPROVE_OPTION){
          String nm=jf.getSelectedFile().getPath();
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/child_enrollment","root","root");
          PreparedStatement pstmt = con.prepareStatement("INSERT INTO img VALUES(?,?)");
          pstmt.setString(1, "sample image");
          //Inserting Blob type
          InputStream in = new FileInputStream(nm);
          pstmt.setBlob(2, in);
          //Executing the statement
          pstmt.execute();
          System.out.print("img stored");
      } 
      
      }catch (Exception e) {}
    }
    if (s.equals("Upload Operator Photo")) {
      try {
        int result=jf.showOpenDialog(null);
      if(result==JFileChooser.APPROVE_OPTION){
          String nm=jf.getSelectedFile().getPath();
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/child_enrollment","root","root");
          PreparedStatement pstmt = con.prepareStatement("INSERT INTO img VALUES(?,?)");
          pstmt.setString(1, "sample image");
          //Inserting Blob type
          InputStream in = new FileInputStream(nm);
          pstmt.setBlob(2, in);
          //Executing the statement
          pstmt.execute();
          System.out.print("img stored");
      } 
      
      }catch (Exception e) {}
    }
    if (s.equals("Reset")) {

        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
        t5.setText("");
        t6.setText("");
        t7.setText("");
        t8.setText("");
        t9.setText("");
        t10.setText("");
        t11.setText("");
        t12.setText("");
        t13.setText("");
        t14.setText("");
        t15.setText("");
        b10.setVisible(true);
        b7.setVisible(true);
        b18.setVisible(true);
        b19.setVisible(true);
        b20.setVisible(false);
        c1=new JCheckBox("",false);
    }

    if (s.equals("Create")) {
        String nm1=t4.getText();
        String mobile1=t5.getText();
        String address1=t6.getText();
        String dob1=t7.getText();

        String mob="";
        try{
          Class.forName("com.mysql.jdbc.Driver");
          

          Connection co1=DriverManager.getConnection("jdbc:mysql://localhost:3306/child_enrollment","root","root");
         

          String mobile2=t5.getText();
          PreparedStatement ps1=co1.prepareStatement("select name,mobile,address,dob,eid, aadhar_no from createaadhar where mobile="+mobile2);
          ResultSet rs1=ps1.executeQuery();
          while(rs1.next())
          {
            String nm=rs1.getString(1);
            mob=rs1.getString(2);
            String add=rs1.getString(3);
            String dob=rs1.getString(4);
            int eid=rs1.getInt(5);
            int aadhar_no=rs1.getInt(6);
          }
          ps1.close();
          
          if(mobile2.equals(mob)){
            JOptionPane.showMessageDialog(this,"Data is already Exists");
          }
          else{
            if(nm1.length()>5){
              if(mobile1.length()==10){
                if(address1.length()>2){
                  if(dob1.length()>5){
                    try{
                      Class.forName("com.mysql.jdbc.Driver");
                   
                      Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/child_enrollment","root","root");
                     
                      nm=t4.getText();
                      mobile=t5.getText();
                      address=t6.getText();
                      dob=t7.getText();
                      int rand_int2 = rand.nextInt(2000000000);
                      int rand_int1 = rand.nextInt(100000);
                      aadhar_no=rand_int2;
                      eid=rand_int1;
                      System.out.println("Eid : "+eid);
                      System.out.println("Eid : "+aadhar_no);
                      PreparedStatement ps=co.prepareStatement("insert into createaadhar values(?,?,?,?,?,?)");
                      ps.setString(1,nm);
                      ps.setString(2,mobile);
                      ps.setString(3,address);
                      ps.setString(4,dob);
                      ps.setInt(5,eid);
                      ps.setInt(6,aadhar_no);
                      
                      l10.setText(""+nm);
                      l16.setText(""+address);
                      l11.setText(""+mobile);
                      l12.setText(""+dob);
            
                      ps.executeUpdate();
            
                      JOptionPane.showMessageDialog(this,"Please Wait While Processing Your Data...");
                      JOptionPane.showMessageDialog(this,"Your Aadhaar Card is Created ");
                      JOptionPane.showMessageDialog(this,"Here is Your EID NO. : " +rand_int1);
                      co.close();
                      f1.setVisible(true);
                      f3.setVisible(false);
            
            
                  }catch(Exception e){
                    JOptionPane.showMessageDialog(this,""+e);
                  }
                  }
                  else{
                    JOptionPane.showMessageDialog(this,"Please provide Valid Date of Birth");
                  }
                }
                else{
                  JOptionPane.showMessageDialog(this,"Please provide Valid Address");
                }
              }
              else{
                JOptionPane.showMessageDialog(this,"Please provide 10 digit Mobile Number");
              }
            }
            else{
              JOptionPane.showMessageDialog(this,"Please provide Valid Name");
            }
          }

        }catch(Exception e){
          JOptionPane.showMessageDialog(this,""+e);
        }
        



    }

    if (s.equals("Submit")) {

      String n=t1.getText();
      String a=t2.getText();
      String m=t3.getText();

      String nm=t1.getText();
      String aadhar=t2.getText();
      String mobile=t3.getText();

      if(nm.length()>5){
        if(aadhar.length()==12){
          if(mobile.length()==10){
        try{
          Class.forName("com.mysql.jdbc.Driver");
     
          Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/child_enrollment","root","root");
         
          PreparedStatement ps=co.prepareStatement("insert into add_operator values(?,?,?)");
          ps.setString(1,nm);
          ps.setString(2,aadhar);
          ps.setString(3,mobile);
          ps.executeUpdate();
          JOptionPane.showMessageDialog(this,"Operator Added successfully...");
          co.close();
          f1.setVisible(true);
          f2.setVisible(false);

      }catch(Exception e){
        JOptionPane.showMessageDialog(this,"Operator is Already Added");
      }

    }
    else{
      JOptionPane.showMessageDialog(this,"Please provide 10 digit Mobile Number");
    }
      }
      else{
        JOptionPane.showMessageDialog(this,"Please provide 12 digit Aadhar Number");
      }
      }
      else{
        JOptionPane.showMessageDialog(this,"Please provide Name");
      }

    }


    if (s.equals("About CEC")) {
      try{
        File file=new File("About CEC.pdf");
        if(file.exists()){
          if(Desktop.isDesktopSupported()){
            Desktop.getDesktop().open(file);
          }
          else{
            JOptionPane.showMessageDialog(this,"Not Supported");
          }
        }
        else{
            JOptionPane.showMessageDialog(this,"Not Found");
        }
      }catch(Exception e){
        e.printStackTrace();
      }
    }

    if(s.equals("User Info")){
     
      user_login ur=new user_login();
    }


  }
  public void itemStateChanged(ItemEvent ie){
    Object s1=ie.getItem();
    int a=0;
    if(c1.isSelected())
    {
        a=JOptionPane.showConfirmDialog(this,"I confirm that I have been residing in India for at least 182 days in the preceding 12 months and \n information (including biometrics) provided by me to the UIDAI is my own and is true, \n correct and accurate. I am aware that my information including biometrics will be used for \n update of Aadhaar and authentication. I understand that my identity information (except core \n biometric) may be provided to an agency only with my consent during authentication or as per \n the provisions of the Aadhaar Act. I have a right to access my identity information (except core \n biometrics) following the procedure laid down by UIDAI");
    }
    if(a==JOptionPane.YES_OPTION){
      b20.setVisible(true);
    }
    if(a==JOptionPane.NO_OPTION){
      f1.setVisible(true);
      f7.setVisible(false);
    }
  }
  public static void main(String[] args) {
    child_enrollment ce=new child_enrollment();
  }
}
