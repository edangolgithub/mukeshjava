package windows;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window extends JFrame
{
	//static JFrame frame;
	static JButton btn= new JButton();
	public static void main(String[] arg)
	{
		Window w= new Window();
		
		btn.setBounds(30, 30, 100, 30);
		btn.setText("click");
		w.add(btn);
	    w.setBounds(100, 100, 500, 500);	
	    w.setVisible(true);
		
		
		//frame= new JFrame();
		//frame.setBounds(50, 50, 200, 200);
		//frame.setVisible(true);
	
	}

}
