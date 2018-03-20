package huter;

import java.io.*;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartUtilities;

public class BarChart {
   
   public static void main( String[ ] args )throws Exception {
  
      final DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
      int[] tfValues = new int[20];
      
      
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
         "CAR USAGE STATIStICS", 
         "Category", "Score", 
         dataset,PlotOrientation.VERTICAL, 
         true, true, false);
         
      int width = 640;    /* Width of the image */
      int height = 480;   /* Height of the image */ 
      File BarChart = new File( "BarChart.jpeg" ); 
      ChartUtilities.saveChartAsJPEG( BarChart , barChart , width , height );
   }
}