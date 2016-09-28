package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class findMajorityElement {
	
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = br.readLine();
			Integer n = Integer.parseInt(line);
			Integer[] array = new Integer[n];
			line = br.readLine();
			StringTokenizer token = new StringTokenizer(line, " ");
			while(token.hasMoreTokens()){
				array[n-token.countTokens()] = Integer.parseInt(token.nextToken());
			}
			Integer count = 1;
			int majority = array[0];
			for(int i = 1;i < array.length;i++){
				if(count < 0){
					majority = array[i];
					count=1;
				}
				if(majority == array[i]){
					count++;
				} else{
					count--;
				}
			}
			if(count > 0){
				count = 0;
				for(int i = 0;i < array.length;i++){
					if(majority == array[i])
						count++;
				}
				if(count >= n/2){
					System.out.println(majority);
				} else{
					System.out.println(-1);
				}
			} else{
				System.out.println(-1);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
