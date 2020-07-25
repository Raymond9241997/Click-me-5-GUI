import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class GUI implements ActionListener {
	
	private int count = 0;
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	private JButton button;
	
	
        
	public GUI() {
		
		frame = new JFrame();
		panel = new JPanel();
		
		button = new JButton("Click ME!");
		button.addActionListener((ActionListener) this);
		
		 label = new JLabel("Number of Clicks: 0");
		
		
		panel.setBorder(BorderFactory.createEmptyBorder(30 , 30 , 10 ,30));
		panel.setLayout(new GridLayout(10,100));
		panel.add(button);
		panel.add(label);
		frame.add(panel , BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Our GUI");
		frame.pack();
		frame.setVisible(true);
		
		
	}
	
	public static void main(String[]args) {
		new GUI();
        
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		count+=5;
		label.setText("Number of Clicks:" + count);
		
	}

}
