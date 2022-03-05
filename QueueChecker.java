package rangersA;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class QueueChecker {


	public int getFastestQueue(LinkedList a, LinkedList b, LinkedList c) {
		int queueNum = 0;
		while(queueNum == 0){
			//checks if first queue is shorter than second queue
			if(a.size() < b.size()) {
				//checks if first queue is shorter than third queue
				if(a.size() < c.size())
					queueNum = 1;
				//checks if first queue is larger than third queue
				else if(a.size() > c.size())
					queueNum = 3;
				else
					continue;
			}
			//checks if first queue is larger than second queue
			else if(a.size() > b.size()) {
				//checks if second is shorter than third
				if(b.size() < c.size())
					queueNum = 2;
				//checks if second is larger then third
				else if(b.size() > c.size())
					queueNum = 3;
				else
					continue;
			}
			//checks if first is larger than third
			else if(a.size() > c.size()) {
				//checks if third is smaller than second
				if(c.size() < b.size())
					queueNum = 3;
				//checks if third is larger than second
				else if(c.size() > b.size())
					queueNum = 2;
				else
					continue;
			}	
		}
		return queueNum;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Queue<Customer> A = new LinkedList<Customer>();
			Queue<Customer> B = new LinkedList<Customer>();
			Queue<Customer> C = new LinkedList<Customer>();
		
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
