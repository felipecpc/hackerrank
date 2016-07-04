package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LuckBalance {
	
	private static Scanner scanner;

	public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int contests = scanner.nextInt();
        int maximumK = scanner.nextInt();
        
        int [][] inputs =new int[contests][2];
        
        for(int z=0;z<contests;z++){
        	
        	inputs[z][0]= scanner.nextInt();
        	inputs[z][1]= scanner.nextInt();
	        	        
        }
        
        System.out.println(checkLuckSaving(inputs,maximumK));

        
    }

	private static int checkLuckSaving(int[][] inputs, int maximumK) {
		// TODO Auto-generated method stub
		//Get all important contests
		ArrayList<Integer> importantContest = new ArrayList<Integer>();
		int luckValue=0;
		for(int x=0;x<inputs.length;x++){
			if(inputs[x][1]==1)importantContest.add(inputs[x][0]);
			luckValue = luckValue + inputs[x][0];
		}
		
        if(maximumK>importantContest.size())maximumK=importantContest.size();
		//Exclude the maximumK contests with higher values
		Collections.sort(importantContest);
		if(importantContest.size()>0)
			for(int x=0;x<maximumK;x++){
				//System.out.println("removed - " + importantContest.get(importantContest.size()-1));
				importantContest.remove(importantContest.size()-1);
			}
		
		for(int x=0;x<importantContest.size();x++)
			luckValue = luckValue - (importantContest.get(x)*2);		
		//sum all all
		return luckValue;
	}


}
