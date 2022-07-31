package projectSkyscraper.services;

import java.util.*;

public class Floors {
	
	PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
	
	int [] days;
	
	public void sizeOfFloor(int floors) {
		int size;
		Scanner sc = new Scanner(System.in);
		days = new int[floors];
		
		for(int i = 0 ; i < floors; i++) {
			System.out.println("Enter the floor size given on the Day : " + (i+1));
			size = sc.nextInt();
			days[i] = size;
			queue.offer(size);
		}
		sc.close();
	}
	
	public void orderOfFloors() {
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("The order of construction is as follows :- ");
		
		for(int i = 0 ; i < days.length ; i++) {
			System.out.println("Day : " + (i + 1));
			list.add(days[i]);
			
			while(list.contains(queue.peek())) {
				System.out.print(queue.poll() + " ");
			}
			System.out.println();
		}
	}
	
	

}


