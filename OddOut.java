package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OddOut {
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
			Integer exor = 0;
			for(Integer i: array){
				exor ^= i;
			}
			System.out.println(exor);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
