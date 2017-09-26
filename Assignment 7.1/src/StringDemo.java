
public class StringDemo {     				//main class StringDemo	

	public static void main(String[] args) {		//main method of the program
		
		int number = 35623, number2 = -23623;	//initialization of variables in integer data type and assigning values to it
		String snum, snum2;						//initialization of variables in string data type
		
		snum = Integer.toString(number);			//converting integer to string type using toString method 
		System.out.println("The value stored in snum is: " +snum);	//displaying the value stored on string variable on console
		
		snum2 = String.valueOf(number2);				//converting integer to string type using valueOf method
		System.out.println("The value stored in snum2 is: " +snum2);		//displaying the value stored on string variable on console
	}

}
