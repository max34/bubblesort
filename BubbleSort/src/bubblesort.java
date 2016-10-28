import java.util.Scanner;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class bubblesort{
	public static void main(String []args) throws IOException{
		Scanner elements = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int n = elements.nextInt();
		Random rand = new Random();
		int [] sorted = new int[n];
		FileWriter out = null;
		out = new FileWriter("bubbleSort2.txt");
	
		/*random number generation */
		for(int i = 0; i < n; i++ ){
			sorted[i] = rand.nextInt(100);
			System.out.print( "\t"  + sorted[i]);
			sorted[i] = sorted[i];
		}
		
		/* system print out on console */
	    System.out.print("\nSorted Numbers:"+Arrays.toString(bubbleSort(sorted)));
	    
	    /* system print out on external file */
	    try{
			out.write(" bubble sort version 2 "+ Arrays.toString(bubbleSort(sorted)));
			out.close();
		}
		catch (Exception e){
			System.out.println(e);
		}
	}
	
	/* bubble sort method decalration */
	public static int [] bubbleSort(int [] x){
		int swap;
		for (int i = 1; i < x.length - 1 ; i ++){
			for(int j = i; j < (x.length - i);  j++){
				if( x[j - 1] > x[j]){
					swap = x[j-1];
					x[j - 1] = x[j];
					x[j] = swap;
				}
			}
		}
		return x;
		
	}

}
