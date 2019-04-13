

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

import java.sql.*;

public class Start extends JFrame implements ActionListener,KeyListener

 {
   JLabel title,title1,title2,line,image;

   JButton admin,exit;

   JPanel p;

   int key;

   String b;

   public Start()

    {

      setLayout(new BorderLayout());

      setTitle("Start");

      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      title=new JLabel("WELCOME TO Health Care Management System");

      title.setFont(new Font("arial",Font.BOLD,20));

      title.setForeground(Color.red);

      title.setBounds(250,50,1000,50);

      title1=new JLabel("M.K.C.G Medical College");

      title1.setFont(new Font("arial",Font.BOLD,30));

      title1.setForeground(Color.pink);

      title1.setBounds(300,100,500,70);

      title2=new JLabel("Berhampur");

      title2.setFont(new Font("arial",Font.BOLD,50));

      title2.setForeground(Color.red);

      title2.setBounds(340,150,500,60);

      line=new JLabel("--------------");

      line.setFont(new Font("arial",Font.BOLD,45));

      line.setForeground(Color.blue);

      line.setBounds(350,200,1000,30);

      getContentPane().add(title);

      getContentPane().add(title1);

      getContentPane().add(title2);

      getContentPane().add(line);

      p=new JPanel();

      p.setLayout(new GridLayout(1,3));

      p.setBounds(330,650,350,30);

      admin=new JButton("Admin");

      admin.setMnemonic(KeyEvent.VK_A);

      admin.setToolTipText("Press it and Enter Password to become Administrator");

      admin.setFont(new Font("arial",Font.BOLD,20));

      admin.addActionListener(this);

     /* stud=new JButton("Student");

      stud.setToolTipText("Press it and Enter CD-Number to View the Balance Details");

      stud.setMnemonic(KeyEvent.VK_S);

      stud.setFont(new Font("arial",Font.BOLD,20));

      stud.addActionListener(this);      */

      exit=new JButton("Exit");

      exit.setMnemonic(KeyEvent.VK_E);

      exit.setFont(new Font("arial",Font.BOLD,20));

      exit.setToolTipText("Press it to go to Back");

      exit.addActionListener(this);

      p.add(admin);

//      p.add(stud);

      p.add(exit);

      getContentPane().add(p);

     // stud.addKeyListener(this);

      admin.addKeyListener(this);

      exit.addKeyListener(this);
      //image for background
      
      

      
      
      
      //
      image=new JLabel(new ImageIcon("Images/mkcg.jpg"));

      image.setBounds(100,230,800,400);

      getContentPane().add(image);

      setSize(1020,1000);

      setVisible(true);
    }

   public void actionPerformed(ActionEvent ae)

    {

      if(ae.getActionCommand().equals("Admin"))

       {

         AdminPwd ap=new AdminPwd(this);

       }

  /*
      else if(ae.getActionCommand().equals("Student"))

       {

           StudPwd ap=new StudPwd(this);

           String cdn=ap.pwd.getText();

         if(ap.test.equals("OK"))

          {

            if(cdn.length()!=0)

               studDet(cdn);

          }   

         else if(ap.test.equals("CANCEL"))

          ap.dispose();
        
         
       } */

      else if(ae.getActionCommand().equals("Exit"))

       {

         dispose();

       }
    }

   public void keyPressed(KeyEvent ke)

    {

      key=ke.getKeyCode();

       if(key==KeyEvent.VK_A)

        {

          AdminPwd ap=new AdminPwd(this);

        }

       /* else if(key==KeyEvent.VK_S)

         {

           StudPwd ap=new StudPwd(this);

           String cdn=ap.pwd.getText();

          if(ap.test.equals("OK"))

           {

             if(cdn.length()!=0)

                studDet(cdn);

           }

         else if(ap.test.equals("CANCEL"))

          ap.dispose();
        
       }        */

      else if(key==KeyEvent.VK_E)

       {

          dispose();

       }

    }

   public void keyTyped(KeyEvent ke){}

   public void keyReleased(KeyEvent ke){}

 /*  public void studDet(String cdn)

    {


      try

       {
         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

         Connection con=DriverManager.getConnection("jdbc:odbc:Hsv");

         PreparedStatement ps=con.prepareStatement("select *from  where cdnum=?");

         ps.setString(1,cdn);

         ResultSet rs=ps.executeQuery();

         if(rs.next())

          {

             StudentDia pd=new StudentDia();

             pd.sno1.setText(rs.getString(1));

             pd.sno1.setEditable(false);

             pd.name1.setText(rs.getString(2));

             pd.name1.setEditable(false);

             pd.course1.setText(rs.getString(3));

             pd.course1.setEditable(false);

             pd.cdNumber1.setText(rs.getString(4));

             pd.cdNumber1.setEditable(false);

             pd.balance1.setText(rs.getString(5));

             pd.balance1.setEditable(false);

             pd.excess1.setText(rs.getString(6));

             pd.excess1.setEditable(false);

          }

         else

           JOptionPane.showMessageDialog(null,"Not Found","Not Found",JOptionPane.ERROR_MESSAGE,null); 

        con.close();

       }

       catch(Exception ex){}
    } */


   public static void main(String args[])throws Exception
   

    {
	  /* String url="jdbc:mysql://localhost:3306/hospital";
		String uname="rohit";
		String pass="rohit";
		
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con= DriverManager.getConnection(url,uname,pass);**/

      Start sf=new Start();

    }

  }








  


