package windows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

public class controls {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					controls window = new controls();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public controls() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 542, 365);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 255));
		panel.setBounds(10, 11, 506, 80);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTextPane txtpnFacebook = new JTextPane();
		txtpnFacebook.setBackground(new Color(0, 0, 255));
		txtpnFacebook.setForeground(Color.WHITE);
		txtpnFacebook.setFont(new Font("Sitka Text", Font.BOLD, 30));
		txtpnFacebook.setText("facebook");
		txtpnFacebook.setBounds(10, 26, 147, 43);
		panel.add(txtpnFacebook);
		
		textField = new JTextField();
		textField.setBounds(221, 34, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(317, 34, 93, 20);
		panel.add(passwordField);
		
		JTextPane txtpnEmailOrPhone = new JTextPane();
		txtpnEmailOrPhone.setEditable(false);
		txtpnEmailOrPhone.setForeground(Color.WHITE);
		txtpnEmailOrPhone.setBackground(new Color(0, 0, 255));
		txtpnEmailOrPhone.setText("Email or Phone");
		txtpnEmailOrPhone.setBounds(221, 11, 86, 20);
		panel.add(txtpnEmailOrPhone);
		
		JTextPane txtpnPassword = new JTextPane();
		txtpnPassword.setEditable(false);
		txtpnPassword.setForeground(Color.WHITE);
		txtpnPassword.setBackground(new Color(0, 0, 255));
		txtpnPassword.setText("Password");
		txtpnPassword.setBounds(330, 11, 85, 20);
		panel.add(txtpnPassword);
		
		JButton btnNewButton = new JButton("Log In");
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setBounds(420, 34, 64, 20);
		panel.add(btnNewButton);
	}
}
