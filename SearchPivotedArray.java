package Array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SearchPivotedArray {
	
	public Integer findPivot(Integer[] array, int lb, int ub) {
		if(lb > ub)
			return -1;
		int mid = (ub+lb)/2;
		if(mid-1 >=0 && array[mid] < array[mid-1])
			return mid;
		if(mid+1 <= ub && array[mid] > array[mid+1])
			return mid+1;
		if(array[mid] < array[lb])
			return findPivot(array,lb,mid-1);
		else
			return findPivot(array,mid+1,ub);
	}
	
	public Integer binarySearch(Integer[] array, int lb, int ub, int key) {
		if(lb > ub)
			return -1;
		int mid = (ub+lb)/2;
		if(array[mid] == key)
			return mid;
		else if(array[mid] > key)
			return binarySearch(array, lb, mid-1,key);
		else
			return binarySearch(array, mid+1, ub,key);
	}
	
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
			Integer key = Integer.parseInt(readLine);
			int pivot;
			SearchPivotedArray src = new SearchPivotedArray();
			if(array[0] > array[array.length-1]){
				pivot = src.findPivot(array,0,array.length-1);
			} else{
				pivot = 0;
			}
			if(key > array[array.length-1])
				System.out.println(src.binarySearch(array, 0, pivot-1, key));
			else
				System.out.println(src.binarySearch(array, pivot, array.length-1, key));
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
