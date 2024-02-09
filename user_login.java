import java.awt.*;
import javax.swing.*;
import java.applet.*;
import java.io.*;
import javax.swing.JOptionPane;
import java.sql.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.util.Random; 
public class user_login extends JFrame implements ActionListener{

    JFrame f1=new JFrame();
    JTextField t1,t2,t3,t4,t5,t6;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JButton b1,b2,b3;
    ImageIcon i1;
    public user_login(){

        f1.setVisible(true);
        f1.setSize(1000,900);
        f1.setLayout(null);



        f1.setBackground( Color.decode("#C2FFF9") );
        l2=new JLabel("USER INFO");
        l2.setFont(new Font("Times New Roman",Font.BOLD,50));
        l2.setForeground(Color.blue);
        l2.setBounds(300,50,900,100);
        f1.add(l2);

        l3=new JLabel("Enter EID No");
        l3.setFont(new Font("Times New Roman",Font.BOLD,30));
        l3.setForeground(Color.black);
        l3.setBounds(120,200,200,100);
        f1.add(l3);

        l4=new JLabel("Your Name");
        l4.setFont(new Font("Times New Roman",Font.BOLD,30));
        l4.setForeground(Color.black);
        l4.setBounds(120,300,200,100);
        f1.add(l4);

        l5=new JLabel("Your Address");
        l5.setFont(new Font("Times New Roman",Font.BOLD,30));
        l5.setForeground(Color.black);
        l5.setBounds(120,400,200,100);
        f1.add(l5);

        l6=new JLabel("Your Mobile");
        l6.setFont(new Font("Times New Roman",Font.BOLD,30));
        l6.setForeground(Color.black);
        l6.setBounds(120,500,200,100);
        f1.add(l6);

        l7=new JLabel("Your Aadhar No");
        l7.setFont(new Font("Times New Roman",Font.BOLD,30));
        l7.setForeground(Color.black);
        l7.setBounds(120,600,230,100);
        f1.add(l7);

        l8=new JLabel("Your DOB");
        l8.setFont(new Font("Times New Roman",Font.BOLD,30));
        l8.setForeground(Color.black);
        l8.setBounds(120,700,230,100);
        f1.add(l8);

        t1=new JTextField();
        t1.setBounds(400,230,350,40);
        t1.setFont(new Font("Times New Roman",Font.BOLD,26));
        f1.add(t1);

        t2=new JTextField();
        t2.setBounds(400,330,350,40);
        t2.setFont(new Font("Times New Roman",Font.BOLD,26));
        f1.add(t2);


        t3=new JTextField();
        t3.setBounds(400,430,350,40);
        t3.setFont(new Font("Times New Roman",Font.BOLD,26));
        f1.add(t3);

        t4=new JTextField();
        t4.setBounds(400,530,350,40);
        t4.setFont(new Font("Times New Roman",Font.BOLD,26));
        f1.add(t4);

        t5=new JTextField();
        t5.setBounds(400,630,350,40);
        t5.setFont(new Font("Times New Roman",Font.BOLD,26));
        f1.add(t5);

        t6=new JTextField();
        t6.setBounds(400,730,350,40);
        t6.setFont(new Font("Times New Roman",Font.BOLD,26));
        f1.add(t6);

        b1=new JButton("Back");
        b1.setBounds(50,70,100,50);
      //  f1.add(b1);
        b1.setFont(new Font("Times New Roman",Font.BOLD,26));
        b1.addActionListener(this);

        b2=new JButton("OK");
        b2.setBounds(800,230,100,40);
        f1.add(b2);
        b2.setFont(new Font("Times New Roman",Font.BOLD,26));
        b2.addActionListener(this);

        b3=new JButton("Clear");
        b3.setBounds(800,330,100,40);
        f1.add(b3);
        b3.setFont(new Font("Times New Roman",Font.BOLD,26));
        b3.addActionListener(this);

        i1=new ImageIcon(new ImageIcon("user.jpg").getImage().getScaledInstance(1000,900, Image.SCALE_DEFAULT));
    l8=new JLabel();
    l8.setBounds(0,0,1000,900);
    f1.add(l8);
    l8.setIcon(i1);

    }
    public void actionPerformed(ActionEvent ae){
        String s=ae.getActionCommand();
        if(s.equals("OK")){
            try{
                Class.forName("com.mysql.jdbc.Driver");

    
                Connection co=DriverManager.getConnection("jdbc:mysql://localhost:3306/child_enrollment","root","root");
              
    
                int a1=Integer.parseInt(t1.getText());
                PreparedStatement ps=co.prepareStatement("select name,mobile,address,dob,aadhar_no from createaadhar where eid="+a1);
                JOptionPane.showMessageDialog(this,"Data Fetched Successfully ");
                ResultSet rs=ps.executeQuery();
                while(rs.next())
                {
                  String nm=rs.getString(1);
                  String mob=rs.getString(2);
                  String add=rs.getString(3);
                  String dob=rs.getString(4);
                  int aadhar_no=rs.getInt(5);
                  t2.setText(""+nm);
                  t4.setText(""+mob);
                  t3.setText(""+add);
                  t6.setText(""+dob);	
                  t5.setText(""+aadhar_no);
                }
                ps.close();
    
              }catch(Exception e){
                JOptionPane.showMessageDialog(this,"Enter EID NUMBER");
              }
        }
        if(s.equals("Clear")){
          t1.setText("");
          t2.setText("");
          t3.setText("");
          t4.setText("");
          t5.setText("");
          t6.setText("");
        }
    }

    public static void main(String[] args) {
        user_login ur=new user_login();
    }
}