package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LargestSumSubArray {
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
			for(Integer i: array){
				System.out.print(i+" ");
			}
			System.out.println();
			int locSum = 0, sum = 0;
			for(Integer i: array){
				locSum +=i;
				if(locSum > sum)
					sum = locSum;
				if(locSum < 0)
					locSum = 0;
			}
			if(sum == 0){//find max negative number
				sum = array[0];
				for(Integer i: array){
					if(i > sum)
						sum = i;
				}
			}
			System.out.println(sum);
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
