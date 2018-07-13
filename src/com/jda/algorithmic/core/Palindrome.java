package com.jda.algorithmic.core;

public class Palindrome {
	
	
	public static boolean ispalindrome(int num)
	{
		  int r,sum=0,temp;    
		  int n = num;//It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   return true; 
		  else    
		   return false;    
	}
	
	public static void main(String[] args) {
		
		

		
	}

	
	
}
