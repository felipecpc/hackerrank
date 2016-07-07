package greedy;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoArrays {

    private static Scanner scanner;

	public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        
        for(int z=0;z<testcases;z++){
	        int N = scanner.nextInt();
	        int K = scanner.nextInt();
	        ArrayList<Integer> A = new ArrayList<Integer>();
	        ArrayList<Integer> B = new ArrayList<Integer>();
	        for (int x=0;x<N;x++) {
	        	A.add(scanner.nextInt());
	        }
	        for (int x=0;x<N;x++) {
	        	B.add(scanner.nextInt());
	        }
	        	        
	        
	        System.out.println(checkTwoArrays(N,K,A,B));    
        }
        
        
    }

	private static String checkTwoArrays(int n, int k, ArrayList a, ArrayList b) {
        //Iterate all elements for array a
        for(int x=0;x<n;x++){
        	//Get min number from b to reach K and add in the new vector
        	if(!getMin(b,(int) a.get(x),k))
        		return "NO";
        }
        
		return "YES";
	}

	private static boolean getMin(ArrayList b, int a, int k) {
		// TODO Auto-generated method stub
		int min =999999999;
		for(int x=0;x<b.size();x++){
			int z=(int)b.get(x);
			if((z<min) && (z+a>=k)){
				min = z;
				if(z+a==k){
					b.remove(x);
					break;
				}
			}
		}
		
		if(min<999999999)return true;
		return false;
	}

}
