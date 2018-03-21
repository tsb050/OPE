package huter;

import javax.swing.JFrame;
import javax.swing.JTextField;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import javax.swing.JLabel;

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
			        if(textField.getText().equals("")) {
			        	return "0";
			        }  else
		    	 return textField.getText();
		           }
             public JTextField getTextField2() {
			        return textField_1;
		       }
			 public String getText2() {
				 if(textField_1.getText().equals("")) {
			        	return "0";
			        }  else	
				 return textField_1.getText();
				}
             public JTextField getTextField3() {
					return textField_2;
				}
			 public String getText3() {
				 if(textField_2.getText().equals("")) {
			        	return "0";
			        }  else		
				 return textField_2.getText();
						}
             public JTextField getTextField4() {
					return textField_3;
			  }
		     public String getText4() {
		    	 if(textField_3.getText().equals("")) {
			        	return "0";
			        }  else		
		    	 return textField_3.getText();
								}
             public JTextField getTextField5() {
			        return textField_4;
			    }
			 public String getText5() {
				 if(textField_4.getText().equals("")) {
			        	return "0";
			        }  else	  
				 return textField_4.getText();
				}	
			 public JTextField getTextField6() {
			        return textField_5;
			    }
			 public String getText6() {
				 if(textField_5.getText().equals("")) {
			        	return "0";
			        }  else	   
				 return textField_5.getText();
				}
			 public JTextField getTextField7() {
			        return textField_6;
			    }
			 public String getText7() {
				 if(textField_6.getText().equals("")) {
			        	return "0";
			        }  else	   
				 return textField_6.getText();
				}	
			 public JTextField getTextField8() {
			        return textField_9;
			    }
			 public String getText8() {
				 if(textField_9.getText().equals("")) {
			        	return "0";
			        }  else	   
				 return textField_9.getText();
				}	
		
	public pen() {
		
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		frame.setSize(500,500);
		
		textField = new JTextField();
		textField.setBounds(100, 63, 67, 35);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(242, 63, 67, 35);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(100, 126, 67, 35);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(242, 126, 67, 35);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(100, 196, 67, 35);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(242, 196, 67, 35);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(100, 268, 67, 35);
		frame.getContentPane().add(textField_6);
		
		textField_9 = new JTextField();
		textField_9.setBounds(242, 268, 67, 35);
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
			
				  
				 PieChart demo = new PieChart("Graphical Representation", "Which operating system are you using?",tfValues);
				    demo.pack();
			        demo.setVisible(true);
			        frame.dispose();
			      
			        
			}	
		
		});
	
		btnNewButton.setBounds(76, 368, 107, 57);
		frame.getContentPane().add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("Create JPEG");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			
				final DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
			     int[] tfValues = new int[20];
			      
			     tfValues[0] = Integer.parseInt(getText1());
				 tfValues[1] = Integer.parseInt(getText2());
				 tfValues[2] = Integer.parseInt(getText3());
				 tfValues[3] = Integer.parseInt(getText4());
				 tfValues[4] = Integer.parseInt(getText5());
				 tfValues[5] = Integer.parseInt(getText6());
				 tfValues[6] = Integer.parseInt(getText7());
				 tfValues[7] = Integer.parseInt(getText8());
					 
					 
			     int a = tfValues[0];
				 int b = tfValues[1];
				 int a2 = tfValues[2];
				 int b2 = tfValues[3];
				 int a3 = tfValues[4];
				 int b3 = tfValues[5];
				 int a4 = tfValues[6];
				 int b4 = tfValues[7];
				 
				 
				 System.out.println(a);
				 dataset.addValue(a, "Impact", "Course1");
				 dataset.addValue(a2, "Impact", "Course2");
				 dataset.addValue(a3, "Impact", "Course3");
				 dataset.addValue(a4, "Impact", "Course4");
				 
				 dataset.addValue(b, "Ease", "Course1");
				 dataset.addValue(b2, "Ease", "Course2");
				 dataset.addValue(b3, "Ease", "Course3");
				 dataset.addValue(b4, "Ease", "Course4");
			     
				 
				 JFreeChart barChart = ChartFactory.createBarChart(
			         "Graphical Representation", 
			         "Category", "Score", 
			         dataset,PlotOrientation.VERTICAL, 
			         true, true, false);
			         
			      int width = 640;    /* Width of the image */
			      int height = 480;   /* Height of the image */ 
			      File BarChart = new File( "BarChart.jpeg" ); 
			      try {
					ChartUtilities.saveChartAsJPEG( BarChart , barChart , width , height );
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(227, 368, 113, 57);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel(" Chart Builder Window or JPEG");
		lblNewLabel.setBounds(129, 11, 180, 41);
		frame.getContentPane().add(lblNewLabel);
	}
	
	
	
	public static void main(String[] args) throws IOException {
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
