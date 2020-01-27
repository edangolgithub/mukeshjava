package windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class EditStudent extends JFrame {

	private JPanel contentPane;
	private JTextField sn;
	private JTextField ser;
	private JTextField sa;
  database db= new database();
  Connection con=null;
  int id;
	
	/**
	 * Create the frame.
	 */
	public EditStudent(int id) {
		this.id=id;
	    
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 1;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel label = new JLabel("Name");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.EAST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 1;
		panel.add(label, gbc_label);
		
		sn = new JTextField();
		sn.setColumns(10);
		GridBagConstraints gbc_sn = new GridBagConstraints();
		gbc_sn.fill = GridBagConstraints.HORIZONTAL;
		gbc_sn.insets = new Insets(0, 0, 5, 0);
		gbc_sn.gridx = 2;
		gbc_sn.gridy = 1;
		panel.add(sn, gbc_sn);
		
		JLabel label_1 = new JLabel("Roll");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.anchor = GridBagConstraints.EAST;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 2;
		panel.add(label_1, gbc_label_1);
		
		ser = new JTextField();
		ser.setColumns(10);
		GridBagConstraints gbc_ser = new GridBagConstraints();
		gbc_ser.fill = GridBagConstraints.HORIZONTAL;
		gbc_ser.insets = new Insets(0, 0, 5, 0);
		gbc_ser.gridx = 2;
		gbc_ser.gridy = 2;
		panel.add(ser, gbc_ser);
		
		JLabel label_2 = new JLabel("Address");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.EAST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 1;
		gbc_label_2.gridy = 3;
		panel.add(label_2, gbc_label_2);
		
		sa = new JTextField();
		sa.setColumns(10);
		GridBagConstraints gbc_sa = new GridBagConstraints();
		gbc_sa.fill = GridBagConstraints.HORIZONTAL;
		gbc_sa.insets = new Insets(0, 0, 5, 0);
		gbc_sa.gridx = 2;
		gbc_sa.gridy = 3;
		panel.add(sa, gbc_sa);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				updatestudent();
				
				
			}
		});
		GridBagConstraints gbc_btnUpdate = new GridBagConstraints();
		gbc_btnUpdate.gridx = 2;
		gbc_btnUpdate.gridy = 4;
		panel.add(btnUpdate, gbc_btnUpdate);
		setVisible(true);
		con=db.getconnection();
		getstudentbyid();
	}
	public void getstudentbyid()
	{
		try {
			String sql="select * from student where studentid=?";
		    PreparedStatement stmt= con.prepareStatement(sql);
		    stmt.setInt(1, id);
		    ResultSet rs=   stmt.executeQuery();
		    rs.next();
		    sn.setText(rs.getString("studentname"));
		    ser.setText(rs.getString("roll"));
		    sa.setText(rs.getString("address"));
		    
		} 
		catch (SQLException e) 
		{				
			System.out.println(e.getMessage());	
		}
		
	}
	
	public void updatestudent()
	{
		String sql= "update student set studentname=?,roll=?,address=? where studentid=?";
		try {
			PreparedStatement stmt= con.prepareStatement(sql);
			stmt.setString(1, sn.getText());
			stmt.setString(2, ser.getText());
			stmt.setString(3, sa.getText());
			stmt.setInt(4, id);
			int result= stmt.executeUpdate();
		    if(result>0)
		    {
		    	JOptionPane.showMessageDialog(null, "updated");
		    }
		    else
		    {
		    	JOptionPane.showMessageDialog(null, "error");
		    }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
