package huter;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class opee extends JFrame {
	public opee() {
		getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(64, 50, 44, 22);
		getContentPane().add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(64, 83, 44, 22);
		getContentPane().add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(64, 116, 44, 22);
		getContentPane().add(textArea_2);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(64, 152, 44, 22);
		getContentPane().add(textArea_3);
		
		JTextArea textArea_4 = new JTextArea();
		textArea_4.setBounds(64, 186, 44, 22);
		getContentPane().add(textArea_4);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(150, 227, 89, 23);
		getContentPane().add(btnNewButton);
	}
}
