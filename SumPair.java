package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SumPair {
	public static void main(String[] args){
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try{
			String readLine = reader.readLine();
			Integer arraySize = Integer.parseInt(readLine);
			readLine = reader.readLine();
			Integer[] array = new Integer[arraySize];
			StringTokenizer str = new StringTokenizer(readLine," ");
			Integer index = 0;
			while(str.hasMoreTokens()){
				array[index++] = Integer.parseInt(str.nextToken());
			}
			readLine = reader.readLine();
			Integer sum = Integer.parseInt(readLine);
			Arrays.sort(array);
			for(Integer i: array){
				System.out.print(i+" ");
			}
			System.out.println();
			Integer l = 0, r = array.length - 1;
			while(l < r){
				Integer currDiff = sum - (array[l] + array[r]);
				System.out.println("current diff "+currDiff);
				if(currDiff == 0){
					System.out.println(array[l]+" "+array[r]);
					break;
				}
				else if(currDiff < 0)
					l++;
				else{
					r--;
				}
			}
		} catch(Exception e){
			
		}
	}
}
