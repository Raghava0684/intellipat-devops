package com.datstructure.question;

public class Solution {


		//public static int power(int x, int n) {
			/* Your class should be named Solution
			 * Don't write main().
			 * Don't read input, it is passed as function argument.
			 * Return output and don't print it.
			 * Taking input and printing output is handled automatically.
			 */
	      
	      //int power =1;
	      //for(int i=0;i<n;i++)
	        //power*=x;
	        //return power;
	      
			
		//}
	

	public static void print(int n){
		if(n == 1){
			System.out.print(n + " ");
			return;
		}
		
		
		print(n-1);
		
		System.out.print(n+" ");
	}



	




	public static void main(String[] args) {
		
		//int x=3;
		//int n=4;
		//int power1=power(3,4);
		//System.out.println(power1);
		print(6);

	}

}
