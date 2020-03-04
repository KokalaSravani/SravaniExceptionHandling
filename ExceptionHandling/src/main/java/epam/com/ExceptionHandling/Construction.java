package epam.com.ExceptionHandling;

import java.util.Scanner;
import java.util.logging.Logger;
public class Construction {
	static Logger log = Logger.getLogger(Construction.class.getName());
	public static void costPrediction() {
		Scanner s = new Scanner(System.in);
		log.info("Construction cost prediction :\n Select any level from (1-4)");
		log.info("1. Standard");
		log.info("2. Above standard");
		log.info("3. High standard");
		log.info("4. High standard and fully automated");
		try {
			int opt = s.nextInt();
			log.info("Enter Area");
			switch(opt) {
			case 1:
				log.info("price = "+s.nextDouble() * 1600 +" INR");
				break;
			case 2:
				log.info("price = "+s.nextDouble() * 1800 +" INR");
				break;
			case 3:
				log.info("price = "+s.nextDouble() * 2000 +" INR");
				break;
			case 4:
				log.info("price = "+s.nextDouble() * 2200 +" INR");
				break;
			default:
				log.info("It is an Invalid input");
			}
		} catch (Exception e) {
			log.info("It is an Invalid input");
		}
	}
}
