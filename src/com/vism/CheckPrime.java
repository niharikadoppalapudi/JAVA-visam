package com.vism;


public class CheckPrime {

	public boolean isPrime(int i){
		
		boolean prime = true;
		
		for(int j=2; j<i-1; j++){
			if(i%j==0){
				prime = false;
				break;
			}
		}
		
		return prime;
	}
	
	public static void main(String args[]){
		
		CheckPrime cp = new CheckPrime();
		
		System.out.println("is it prime :"+cp.isPrime(11));
	}
	
}


