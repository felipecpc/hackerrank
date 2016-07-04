package greedy;
import java.util.*;


public class GridChallenge {
    
    private static Scanner scanner;

	public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        
        for(int z=0;z<testcases;z++){
	        int inputs = scanner.nextInt();
	        
	        ArrayList<String> data = new ArrayList<String>();
	        scanner.nextLine();
	        for (int x=0;x<inputs;x++) {
	        	char[] chars = scanner.nextLine().toCharArray();
	        	Arrays.sort(chars);
	            data.add( new String(chars));
	        }
	        
	        System.out.println(checkGridChallenge(data,inputs));
	        
        }
    }

	private static String checkGridChallenge(ArrayList<String> data,int n) {
		for(int x=0;x<data.get(0).length();x++){
			for(int z=0;z<n-1;z++){
				if(!isAlphabectic(data.get(z).charAt(x),data.get(z+1).charAt(x))){
					return "NO";
				}
			}
		}
		
		return "YES";
	}
	
	private static boolean isAlphabectic(char ch1, char ch2){
		return Character.toLowerCase(ch1) <= Character.toLowerCase(ch2);
	}
	
}
