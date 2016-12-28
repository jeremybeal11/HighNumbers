
public class review {
	
	public static void main(String[] args) {
	
		
		
		
		// get the max method of int
		System.out.println(" the highest number between 2.3 and 3 " + " is " + max(2.3, 9.5 ));
		
		// get the max method of double
		System.out.println(" the highest number between 2 and 3 " +  " is "+ max(2, 3));
		
		// invoke the max with three double 
		System.out.println(" the highest number between 2, 5, 8 " + " is "+ max(2,5,8));
	}
		//return the max int num
		
	public static int max(int N1, int N2){
		if (N1 > N2) 
			return N1;
		else
			return N2;
			
		}
		
		// return the max double num
		
	public static double max(double N1, double N2){
		if (N1 > N2)
			return N1;
		else
			return N2;
		}
		
		// return the max method of 3 num
		
	public static double max(double N1,double N2, double N3){
		return max(max(N1, N2), N3);
			
		}
		
		
		
		
		
		
	
	
}


