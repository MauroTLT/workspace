package ejemplo15;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class MyButtonListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton) e.getSource();
		JOptionPane.showMessageDialog(source, source.getText() + " button has been pressed");
	}
}

public class LoginEjemplo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Demo application");
		frame.setSize(300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		placeComponents(frame);
		frame.setVisible(true);
	}

	private static void placeComponents(JFrame frame) {
		frame.setLayout(null);
		JLabel userLabel = new JLabel("Usuario");
		userLabel.setBounds(10, 10, 80, 25);
		frame.add(userLabel);
		JTextField userText = new JTextField(20);
		userText.setBounds(100, 10, 160, 25);
		frame.add(userText);
		JLabel passwordLabel = new JLabel("Contraseña");
		passwordLabel.setBounds(10, 40, 100, 25);
		frame.add(passwordLabel);
		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 40, 160, 25);
		frame.add(passwordText);
		JButton loginButton = new JButton("login");
		loginButton.setBounds(10, 80, 80, 25);
		frame.add(loginButton);
		JButton registerButton = new JButton("register");
		registerButton.setBounds(160, 80, 100, 25);
		frame.add(registerButton);
		ActionListener myButtonListener = new MyButtonListener();
		loginButton.addActionListener(myButtonListener);
		registerButton.addActionListener(myButtonListener);
	}
}
