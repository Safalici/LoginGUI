package Login;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginGUI implements ActionListener {
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;
	
	
	public static void main(String[] args) {
		Panel panel = new Panel();
		
		JFrame frame = new JFrame();
		frame.setSize(350,200);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		userLabel = new JLabel("Kullanýcý adý");
		userLabel.setBounds(10, 20, 80, 25);                  //Kullanýcý adýnýn yazýsýný göster
		panel.add(userLabel);
		
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);               // Kullanýcýnýn kullanýcý adýnýn gireceði bölüm
		panel.add(userText);
		
		
		
		passwordLabel = new JLabel("Þifre");
		passwordLabel.setBounds(10, 50, 80, 25);     	//Þifre yazýsýný gösterir.
		panel.add(passwordLabel);
		
		
		passwordText = new JPasswordField();
		passwordText.setBounds(100,50,165,25);                // Burada gizli bir þekilde þifrenin yazýlacaðý bölümü gösterir.
		panel.add(passwordText);
		
		button = new JButton("Giriþ yap!!");
		button.setBounds(10,80,150,25);
		button.addActionListener(new LoginGUI());
		panel.add(button);
		
		success = new JLabel("");
		success.setBounds(10,110,300,25);
		panel.add(success);
		
		
		
		
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		String password = passwordText.getText();
		success.setText("'"+user+"'"+", "+ "'"+password+"'"+" Girdiniz maalesef baþarýsýz giriþ!");
		
		if(user.equals("")&&password.equals("")) {
			success.setText("Hiçbir þey girmediniz!");
		}
		else if(user.equals("")||user.equals(" ")) {
			success.setText("Kullanýcý adý boþ!");
		}
		else if(password.equals("")||password.equals(" ")) {
			success.setText("Þifre boþ");
		}
		else if(user.equals("Safa") && password.equals("Alýcý")) {
			success.setText("Baþarýlý giriþ!");
		}
		
	}

}
