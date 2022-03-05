package rangersA;

import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//Scanner
		Scanner scan = new Scanner(System.in);
		
		//Random caller
		Random ran = new Random();
		
		
		//Gets the minimum time for arrival.
		System.out.println("What is the minimum arrival time?");
		
		int arriveMini = scan.nextInt();
		
		//Gets the maximum time for arrival.
		System.out.println("What is the maximum arrival time?");
		
		int arriveMax = scan.nextInt();
		
		
		//Gets the minimum time for service.
		System.out.println("What is the minimum service time?");
		
		int serviceMini = scan.nextInt();
		
		//Gets the maximum time for service.
		System.out.println("What is the maximum service time?");
		
		int serviceMax = scan.nextInt();
		
		
		//Generates a random number between the minimum and maximum numbers given for arrival.
		int arrival = ran.nextInt(arriveMax) + arriveMini;
		
		//Generates a random number between the minimum and maximum numbers given for service.
		int service = ran.nextInt(serviceMax - (serviceMini-1)) + serviceMini;
		
		
				
		
		//Call the time class along with the arrival and service random numbers. The 0 is the wait time, since this is the first, it is zero.
		Time time = new Time(arrival, service, 0);
		
		
		//Grabs the finished time for the previous time. To get the wait time for the next.
		int oldFinishTime = time.getFtime();
		
		
		
		//Generates a random number between the minimum and maximum numbers given for arrival. (Refresh)
		arrival = ran.nextInt(arriveMax) + arriveMini;
				
		//Generates a random number between the minimum and maximum numbers given for service. (Refresh)
		service = ran.nextInt(serviceMax - (serviceMini-1)) + serviceMini;
				
		
		
		//Call the second time class along with the arrival and service random numbers. The wait time is the old finished time subtracted by the arrival time.
		Time time2 = new Time(arrival, service, oldFinishTime - arrival);
		
		//toString methods. toStringL() prints out lines for formatting.
		System.out.println(time.toString());
		System.out.println(time.toStringL());
		System.out.println(time2.toString());
		System.out.println(time2.toStringL());
		
	}

}
