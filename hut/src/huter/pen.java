package huter;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class pen extends JFrame {
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
public JTextField getTextField() {
	return textField;
}
		public String getText1() {
			 return textField.getText();
		}
public JTextField getTextField2() {
			return textField_1;
		}
				public String getText2() {
					 return textField_1.getText();
				}
	public pen() {
		
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		frame.setSize(500,500);
		
		textField = new JTextField();
		textField.setBounds(10, 24, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 56, 86, 20);
		frame.getContentPane().add(textField_1);
		
	/**	textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 87, 86, 20);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 118, 86, 20);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(10, 149, 86, 20);
		getContentPane().add(textField_4);
		**/
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				 int[] tfValues = new int[5];
				 tfValues[0] = Integer.parseInt(getText1());
				 tfValues[1] = Integer.parseInt(getText2());
				  
				 PieChart demo = new PieChart("Comparison", "Which operating system are you using?",tfValues);
				    demo.pack();
			        demo.setVisible(true);
			        frame.dispose();
			      
			        
			}	
		
		});
		/**btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		        PieChart demo = new PieChart("Comparison", "Which operating system are you using?");
		        demo.pack();
		        demo.setVisible(true);
			}
		});**/
		btnNewButton.setBounds(138, 195, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pen window = new pen();
				
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
