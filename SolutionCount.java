package com.datstructure.question;

public class SolutionCount {

		public static int count(int n){
			if(n == 0){
				return 1;
			}
			int smallAns = count(n / 10);
			return smallAns - 1;
		}
	


public static void main(String[] args) {
	int n=156;
	
	int ans=count(n);
	System.out.println(ans);
	
}
}
