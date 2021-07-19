import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Ques6 extends JFrame implements ActionListener {
   JPanel panel;
   JLabel user_label, password_label, message;
   JTextField userName_text;
   JPasswordField password_text;
   JButton submit, cancel;
   Ques6() {
      // Username Label
      user_label = new JLabel();
      user_label.setText("User Name :");
      userName_text = new JTextField();
      // Password Label
      password_label = new JLabel();
      password_label.setText("Password :");
      password_text = new JPasswordField();
      // Submit
      submit = new JButton("SUBMIT");
      panel = new JPanel(new GridLayout(3, 1));
      panel.add(user_label);
      panel.add(userName_text);
      panel.add(password_label);
      panel.add(password_text);
      message = new JLabel();
      panel.add(message);
      panel.add(submit);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // Adding the listeners to components..
      submit.addActionListener(this);
      add(panel, BorderLayout.CENTER);
      setTitle("Please Login Here !");
      setSize(450,350);
      setVisible(true);
   }
   public static void main(String[] args) {
      new Ques6();
   }
   @Override
   public void actionPerformed(ActionEvent ae) {
	   int count =1;
	 
	   
	   String userName = userName_text.getText();
	   String password = password_text.getText();
	   if (userName.trim().equals("admin") && password.trim().equals("admin")) {
		   message.setText(" Hello " + userName + "");
	   } else {
		   count++;
		   message.setText(" Invalid user.. ");
		   message.setText("Enter again");
	   }
	   }
	   
}
