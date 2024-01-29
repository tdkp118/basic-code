package basic;

import java.util.List;

public class Array {

	public static void main(String[] args) {
	
	/*	int [] x = {10,20,30,40,50,60,70};
		for (int i = 0; i<x.length;i++) {
			System.out.println(x[i]);
		}
*/
		
	/*	int [] x = new int [4];
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		x[3] = 40;
		for (int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		
	}
	*/
		//  Multidimensinol arrays
		
		
	int [][]  x = {{10,20,30,40,50}, {5,15,25,35,45,55}, {52,58,56,89}};
	
		for  (int i =0;i<x.length ; i++) {
			for (int j =0; j<x[i].length; j++) {
				System.out.print(x[i][j] +  "     ");
			}
			System.out.println();
		}
	
		
	
		
		
		
	}

}
