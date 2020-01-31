package windows;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class regex {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					regex window = new regex();
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
	public regex() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JLabel l = new JLabel("New label");
		l.setBounds(204, 127, 46, 14);
		
		frame = new JFrame();
		frame.getContentPane().add(l);
		frame.setBounds(100, 100, 886, 556);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent i)
			{
				//System.out.println(i.getKeyCode());
				if(i.getKeyChar()>='0' && i.getKeyChar()<='9')
				{
					
					l.setText("ok");
					l.setForeground(Color.green);
					
					
				}
				else
				{
					
					/*if(i.getKeyCode()==KeyEvent.VK_BACK_SPACE)
					{
						return;
					}
					*/
					l.setText("error");
					l.setForeground(Color.red);
					//System.out.println(textField.getText());
					textField.setText(textField.getText().substring(0,textField.getText().length()-1));
				}
			}
		});
		textField.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
			
			}
		});
		
		textField.setBounds(204, 178, 294, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(204, 222, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
