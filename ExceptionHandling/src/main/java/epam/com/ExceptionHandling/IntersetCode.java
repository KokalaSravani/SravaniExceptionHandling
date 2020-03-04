package epam.com.ExceptionHandling;

import java.util.Scanner;
import java.util.logging.Logger;
public class IntersetCode {
	static Logger log = Logger.getLogger(IntersetCode.class.getName());
	public static void Interest() {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		log.info("Enter Principal Amount");
		try {
			double principalamt=sc.nextDouble();
			log.info("Enter Time");
			double time = sc.nextDouble();
			log.info("Enter rate_of_Interset");
			double rateofinterest=sc.nextDouble();
			log.info("Simple Interest ="+(principalamt*time*rateofinterest)/100);
			log.info("Compound Interest ="+ principalamt* (Math.pow((1+rateofinterest/100),time)));
		}
		catch (Exception e) {
			log.info("It is not a valid input");
		}
		
	}
}
