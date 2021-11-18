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
		
		userLabel = new JLabel("Kullan�c� ad�");
		userLabel.setBounds(10, 20, 80, 25);                  //Kullan�c� ad�n�n yaz�s�n� g�ster
		panel.add(userLabel);
		
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);               // Kullan�c�n�n kullan�c� ad�n�n girece�i b�l�m
		panel.add(userText);
		
		
		
		passwordLabel = new JLabel("�ifre");
		passwordLabel.setBounds(10, 50, 80, 25);     	//�ifre yaz�s�n� g�sterir.
		panel.add(passwordLabel);
		
		
		passwordText = new JPasswordField();
		passwordText.setBounds(100,50,165,25);                // Burada gizli bir �ekilde �ifrenin yaz�laca�� b�l�m� g�sterir.
		panel.add(passwordText);
		
		button = new JButton("Giri� yap!!");
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
		success.setText("'"+user+"'"+", "+ "'"+password+"'"+" Girdiniz maalesef ba�ar�s�z giri�!");
		
		if(user.equals("")&&password.equals("")) {
			success.setText("Hi�bir �ey girmediniz!");
		}
		else if(user.equals("")||user.equals(" ")) {
			success.setText("Kullan�c� ad� bo�!");
		}
		else if(password.equals("")||password.equals(" ")) {
			success.setText("�ifre bo�");
		}
		else if(user.equals("Safa") && password.equals("Al�c�")) {
			success.setText("Ba�ar�l� giri�!");
		}
		
	}

}
