package windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class AddStudent extends JFrame {

	private JPanel contentPane;
	private JTextField sn;
	private JTextField sr;
	private JTextField sa;

	Connection con;
	database db= new database();
	public void insertstudents()
	{
		try {
			
		    String sql="insert into student(studentname,roll,address) values (?,?,?) ";
		    PreparedStatement stmt= con.prepareStatement(sql);
		    stmt.setString(1, sn.getText());
		    stmt.setString(2, sr.getText());
		    stmt.setString(3, sa.getText());
		     int result= stmt.executeUpdate();
		    if(result>0)
		    {
		    	JOptionPane.showMessageDialog(null, "added");
		    }
		    else
		    {
		    	JOptionPane.showMessageDialog(null, "error");
		    }
		    con.close();
		} 
		catch (SQLException e) 
		{				
			System.out.println(e.getMessage());	
		}
		
		
	
	}	public AddStudent() {
	
		setBounds(100, 100, 286, 212);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblName = new JLabel("Name");
		GridBagConstraints gbc_lblName = new GridBagConstraints();
		gbc_lblName.insets = new Insets(0, 0, 5, 5);
		gbc_lblName.anchor = GridBagConstraints.EAST;
		gbc_lblName.gridx = 1;
		gbc_lblName.gridy = 1;
		contentPane.add(lblName, gbc_lblName);
		
		sn = new JTextField();
		GridBagConstraints gbc_sn = new GridBagConstraints();
		gbc_sn.insets = new Insets(0, 0, 5, 0);
		gbc_sn.fill = GridBagConstraints.HORIZONTAL;
		gbc_sn.gridx = 2;
		gbc_sn.gridy = 1;
		contentPane.add(sn, gbc_sn);
		sn.setColumns(10);
		
		JLabel lblRoll = new JLabel("Roll");
		GridBagConstraints gbc_lblRoll = new GridBagConstraints();
		gbc_lblRoll.insets = new Insets(0, 0, 5, 5);
		gbc_lblRoll.anchor = GridBagConstraints.EAST;
		gbc_lblRoll.gridx = 1;
		gbc_lblRoll.gridy = 2;
		contentPane.add(lblRoll, gbc_lblRoll);
		
		sr = new JTextField();
		GridBagConstraints gbc_sr = new GridBagConstraints();
		gbc_sr.insets = new Insets(0, 0, 5, 0);
		gbc_sr.fill = GridBagConstraints.HORIZONTAL;
		gbc_sr.gridx = 2;
		gbc_sr.gridy = 2;
		contentPane.add(sr, gbc_sr);
		sr.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address");
		GridBagConstraints gbc_lblAddress = new GridBagConstraints();
		gbc_lblAddress.insets = new Insets(0, 0, 5, 5);
		gbc_lblAddress.anchor = GridBagConstraints.EAST;
		gbc_lblAddress.gridx = 1;
		gbc_lblAddress.gridy = 3;
		contentPane.add(lblAddress, gbc_lblAddress);
		
		sa = new JTextField();
		GridBagConstraints gbc_sa = new GridBagConstraints();
		gbc_sa.insets = new Insets(0, 0, 5, 0);
		gbc_sa.fill = GridBagConstraints.HORIZONTAL;
		gbc_sa.gridx = 2;
		gbc_sa.gridy = 3;
		contentPane.add(sa, gbc_sa);
		sa.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				insertstudents();
			}
		});
		GridBagConstraints gbc_btnAdd = new GridBagConstraints();
		gbc_btnAdd.gridx = 2;
		gbc_btnAdd.gridy = 4;
		contentPane.add(btnAdd, gbc_btnAdd);
		setVisible(true);
		con= db.getconnection();
	}

}
