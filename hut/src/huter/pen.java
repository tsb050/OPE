package huter;

import javax.swing.JFrame;
import javax.swing.JTextField;

import org.jfree.chart.ChartUtilities;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class pen extends JFrame {
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_9;
	
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
             public JTextField getTextField3() {
					return textField_2;
				}
			 public String getText3() {
					return textField_2.getText();
						}
             public JTextField getTextField4() {
					return textField_3;
			  }
		     public String getText4() {
					return textField_3.getText();
								}
             public JTextField getTextField5() {
			        return textField_4;
			    }
			 public String getText5() {
				    return textField_4.getText();
				}	
			 public JTextField getTextField6() {
			        return textField_5;
			    }
			 public String getText6() {
				    return textField_5.getText();
				}
			 public JTextField getTextField7() {
			        return textField_6;
			    }
			 public String getText7() {
				    return textField_6.getText();
				}	
			 public JTextField getTextField8() {
			        return textField_9;
			    }
			 public String getText8() {
				    return textField_9.getText();
				}	
		
	public pen() {
		
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		frame.setSize(500,500);
		
		textField = new JTextField();
		textField.setBounds(77, 35, 67, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(227, 35, 67, 35);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(77, 87, 67, 35);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(227, 91, 67, 35);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(77, 137, 67, 35);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(227, 137, 67, 35);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(77, 196, 67, 35);
		frame.getContentPane().add(textField_6);
		
		textField_9 = new JTextField();
		textField_9.setBounds(227, 196, 67, 35);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Create Window");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				 int[] tfValues = new int[20];
				 tfValues[0] = Integer.parseInt(getText1());
				 tfValues[1] = Integer.parseInt(getText2());
				 tfValues[2] = Integer.parseInt(getText3());
				 tfValues[3] = Integer.parseInt(getText4());
				 tfValues[4] = Integer.parseInt(getText5());
				 tfValues[5] = Integer.parseInt(getText6());
				 tfValues[6] = Integer.parseInt(getText7());
				 tfValues[7] = Integer.parseInt(getText8());
			
				  
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
		btnNewButton.setBounds(61, 276, 107, 57);
		frame.getContentPane().add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("Create JPEG");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			
				int[] tfValues = new int[20];
				
				 tfValues[0] = Integer.parseInt(getText1());
				 tfValues[1] = Integer.parseInt(getText2());
				 tfValues[2] = Integer.parseInt(getText3());
				 tfValues[3] = Integer.parseInt(getText4());
				 tfValues[4] = Integer.parseInt(getText5());
				 tfValues[5] = Integer.parseInt(getText6());
				 tfValues[6] = Integer.parseInt(getText7());
				 tfValues[7] = Integer.parseInt(getText8());
			
				  
			
			        frame.dispose();
			      
			}
		});
		btnNewButton_1.setBounds(224, 276, 113, 57);
		frame.getContentPane().add(btnNewButton_1);
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
