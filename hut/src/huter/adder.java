package huter;

public class adder {
/**
	public static void adder(int n) {
	
		int total = 0;
	for(int i = n; i<=1; i--) {
		int ad = 1;
		for(int j =i; j <= 1; j--) {
			ad+= j/2;
		}
		total+=ad;
	}
	System.out.println(total);
	}
	**/
	public static void main(String[]args) {
		 int n = 5;
		 int ad;
		 int total = 0;
		for(int i = n; i >= 0; i--) {
			ad = 1;
			for(int j = i; j >= 0; j--) {
				ad += j/2;
			}
			total+=ad;
		} 
			
	  System.out.println(total);    
	}
	
	   }
	

