package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaxMin {

	  public static void main(String[] args) throws NumberFormatException, IOException {

	      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	      int N = Integer.parseInt(in.readLine());
	      int K = Integer.parseInt(in.readLine());
	      int[] list = new int[N];

	      for(int i = 0; i < N; i ++)
	         list[i] = Integer.parseInt(in.readLine());
	      
	      int unfairness = Integer.MAX_VALUE;
	      
	      Arrays.sort(list);

	      for(int x=0;x<N-K+1;x++){
	    	  
	    	  if(list[x+K-1]-list[x]<unfairness)
	    			  unfairness = list[x+K-1]-list[x];
	    	  
	    	  
	      }
	      
	      /*
	       * Write your code here, to process numPackets N, numKids K, and the packets of candies
	       * Compute the ideal value for unfairness over here
	      */
	      
	      System.out.println(unfairness);
	   }

}
