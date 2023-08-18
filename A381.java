import java.util.*;
import java.lang.*;
import java.io.*;

public class A381 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// as the cards are distinct we can sort them and the players can pick alternatively
		
		int arr[] = new int[n]; // creating array
		
		Deque<Integer> deque = new LinkedList<>();

		for ( int i = 0 ; i < n ; i ++ ) {
			int num = sc.nextInt();
			deque.addLast(num);

			//int num = sc.nextInt();
			//arr[i] = num;
		}
		
		// selection sort
		
		/*		
		// descending order
		for ( int i = 0 ; i < n ; i++) {
			for ( int j = 0 ; j < n-1 ; j++) {
				if( arr[j] < arr[j+1] ) {
					int dummy = arr[j+1];
					arr[j+1] = arr [j];
					arr[j] = dummy;
				}
			}
		}
		*/

		// Sereja picks first then Dima and this order continues
                int serejaScore = 0 ;
                int dimaScore = 0;
		
		/*
		int count = 0;
		while(arr.length()>0) {
			int add = 0;
			if ( count%2==0 ){
				if( arr.slice(0) > arr.slice(-1) ) {
					add = arr[0];
					arr.remove(arr[0]);
				}
				else {
					add = arr[1];
					arr.remove(arr[1]);
				}
				serejaScore = serejaScore + add;
			}
			else {
				if( arr.slice(0) > arr.slice(-1) ) {
					add = arr[0];
				}
				else {
					add = arr[1];
				}
				dimaScore = dimaScore + add;
			}
			count++ ; 
		}
		*/
		
		int count = 0 ;
		while ( deque.size() > 0 ) {
			int f = deque.peekFirst();
			int l = deque.peekLast();
			
			// System.out.println(f);
			// System.out.println(l);
			// System.out.println("--");

			int add = 0;
			if( count%2==0 ) {
				if ( f>l ) {
					add = deque.removeFirst();
				}
				else {
					add = deque.removeLast();
				}
				
				serejaScore = serejaScore + add;
			}
			else {
				if ( f>l ) {
					add = deque.removeFirst();
				}
				else {
					add = deque.removeLast();
				}
				dimaScore = dimaScore + add;	
			}
			count++;
		}
		// get sorted array
		
		// for( int i = 0 ; i < n ; i++ ) {
		// 	System.out.print(arr[i] + " ");
		// }
		
		
		// Sereja picks first then Dima and this order continues
		/*
		int serejaScore = 0 ;
		int dimaScore = 0;

		for( int i = 0 ; i < n ; i++ ) {
			if(i%2==0) {
				serejaScore = serejaScore + arr[i];
			}	
			else {
				dimaScore = dimaScore + arr[i];
			}
		}
		*/
	
		// printing score

		System.out.println(serejaScore);
		System.out.println(dimaScore);		
		
		sc.close();
	}
}
