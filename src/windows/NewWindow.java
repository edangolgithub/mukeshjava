package windows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JRadioButton;

public class NewWindow {

	private JFrame frame;
	private JTextField txtHelloHowAre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewWindow window = new NewWindow();
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
	public NewWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 255, 0));
		frame.setBounds(100, 100, 546, 433);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(210, 11, 163, 102);
		frame.getContentPane().add(panel);
		
		txtHelloHowAre = new JTextField();
		txtHelloHowAre.setToolTipText("this is text box");
		txtHelloHowAre.setFont(new Font("Engravers MT", Font.PLAIN, 28));
		txtHelloHowAre.setForeground(new Color(255, 0, 0));
		txtHelloHowAre.setText("hello how are you");
		txtHelloHowAre.setBounds(10, 164, 414, 66);
		frame.getContentPane().add(txtHelloHowAre);
		txtHelloHowAre.setColumns(5);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(39, 46, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_1.setBounds(39, 85, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
	}
}
