package First;


public class exceptionHandling {
	 public static void main(String[] args) {
		 try {
				System.out.println("Hello Madhav");
				int i = 1/1;
				System.out.println("Bye Madhav");			 
		 }
		 
		 catch(Exception exp) {
			 System.out.println("Hi, Madhav, you are in catch block now");
			 String message = exp.getMessage();
			 System.out.println("The message is: " +message);
			 System.out.println("The cause is: " +exp.getCause());
			 exp.printStackTrace();
		 }
		 
		 finally {
			 System.out.println("Hi Madhav, you are in finally block now");
		 }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static void main(String[] args) {

		try {
			System.out.println("Hello World");
			int i = 1/0;
			System.out.println("Completed");		
		}

		catch(Exception exp){
			System.out.println("I am inside catch block");
			System.out.println("Message is: " +exp.getMessage());
			System.out.println("Cause is: " +exp.getCause());
			exp.getStackTrace();
			} 
		
		// will always be executed irrespective of any exception or not
		finally {
			System.out.println("I am inside finally block");
		}
	} */
}
