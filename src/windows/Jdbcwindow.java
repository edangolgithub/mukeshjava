package windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Jdbcwindow extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton btnDelete;
	Connection con=null;
	database db= new database();
	private JButton btnEdit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jdbcwindow frame = new Jdbcwindow();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public void getstudents()
	{
		try {
			String sql="select * from student";
		    PreparedStatement stmt= con.prepareStatement(sql);
		    ResultSet rs=   stmt.executeQuery();
		    table.setModel(DbUtils.resultSetToTableModel(rs));
		    
		} 
		catch (SQLException e) 
		{				
			System.out.println(e.getMessage());	
		}
		
	}
	
	public void deletestudent(int id)
	{
		try {
			 String sql="delete from student where studentid=?";
		    PreparedStatement stmt= con.prepareStatement(sql);
		    stmt.setInt(1, id);
		    int result= stmt.executeUpdate();
		    if(result>0)
		    {
		    	JOptionPane.showMessageDialog(null, "deleted");
		    }
		    else
		    {
		    	JOptionPane.showMessageDialog(null, "error");
		    }
		    
		} 
		catch (SQLException e) 
		{				
			System.out.println(e.getMessage());	
		}
		
	}
	public Jdbcwindow() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent arg0)
			{
				getstudents();
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 11, 364, 276);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				AddStudent s= new AddStudent();
				
			}
		});
		btnAdd.setBounds(395, 8, 89, 23);
		contentPane.add(btnAdd);
		
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				int row=table.getSelectedRow();
				int colval=(int) table.getValueAt(row, 0);
				deletestudent(colval);
			}
		});
		btnDelete.setBounds(395, 38, 89, 23);
		contentPane.add(btnDelete);
		
		btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				int row=table.getSelectedRow();
				int colval=(int) table.getValueAt(row, 0);
				EditStudent es= new EditStudent(colval);
			}
		});
		btnEdit.setBounds(395, 66, 89, 23);
		contentPane.add(btnEdit);
		con=db.getconnection();
		
	}
}
