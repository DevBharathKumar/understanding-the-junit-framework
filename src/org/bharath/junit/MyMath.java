package org.bharath.junit;

public class MyMath {
	
	public int sumNumbers(int [] numbers)
	{
		int sum = 0;
		
		for(int n : numbers) {
			sum += n;
		}
		
		return sum;
	}

}
