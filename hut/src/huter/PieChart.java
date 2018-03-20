package huter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

public class PieChart extends JFrame {

    private static final long serialVersionUID = 1L;

    public PieChart(String applicationTitle, String chartTitle, int[] tfValues) {
        super(applicationTitle);
        // This will create the dataset
        CategoryDataset dataset =  createDataset(tfValues);
       
        // based on the dataset we create the chart
        JFreeChart chart = ChartFactory.createBarChart("Comparison between Salesman",
        		 "Salesman", "Profit", dataset, PlotOrientation.VERTICAL,
        		 false, true, false);
        // we put the chart into a panel
        ChartPanel chartPanel = new ChartPanel(chart);
        // default size
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        // add it to our application
        setContentPane(chartPanel);

    }

    /**
     * Creates a sample dataset
     */
    private  CategoryDataset createDataset(int[] tfValues) {
    	 DefaultCategoryDataset dataset = new  DefaultCategoryDataset();
    	// pen d = new pen();
        // JTextField tf = d.getTextField();
        // System.out.println("HERE: " + tf.getText());
    /*     tf.addActionListener(new ActionListener() {
        	 public void actionPerformed(ActionEvent e) {
        		 int a = Integer.parseInt(tf.getText());
        		System.out.println(a);
        		
        	 }
         });	
       
      **/
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
    	 
        return dataset;

    }

    /**
     * Creates a chart
     */
    private JFreeChart createChart(CategoryDataset dataset, String title) {

        JFreeChart chart = ChartFactory.createBarChart3D(
            title,                  // chart title
            title, title, dataset,                // data
            null, true,                   // include legend
            true,
            false
        );
        return chart;

    }
    
   public static void main(String[] args) {
	   int[] tfValues = new int[5];
	   PieChart demo = new PieChart("Comparison", "Which operating system are you using?", tfValues);
        demo.pack();
        demo.setVisible(true);
   
    }
}
