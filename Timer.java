package threaddemo;
//Write a simple Timer that can periodically print a timeout message.
import java.util.Date;

public class Timer {

	public static void main(String[] args) {
		int i=1;
		
		//Run the delay method for 120 iterations
		while(i<=120)
		{
			delay(); // Call to the delay method
			System.out.println("Timer :"+new Date());// Prints the date and time
			i++;
		}
	}
	
	// This method will cause the delay of 1 second and then execute further
	static void delay() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
	}
}
