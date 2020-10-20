package com.pages;

import org.testng.annotations.Test;

public class JavaBasic {
	@Test
	public void NativeAPpAndroid()
	{
		System.out.println("NativeAPpAndroid");
	}
	
	@Test
	public void IOSApps()
	{
		System.out.println("IOSApps");	
	}
	
	@Test
	public  void pal()
	{
		int counter = 0 ;
		for(int i =1; i<=100 ; i++)
		{
			counter = 0 ;
			for(int j=i ; j>=1 ; j--)
			{
				if(i%j==0)
				{
					counter =  counter + 1 ;
					
				}
			}
				
		    if(counter == 2)
		    {
		    	//System.out.println("the prime number is");
		    	System.out.print(i +" ");
		    	
		    	
		    }
				
			
		}
		
		
		
		
	}
}
