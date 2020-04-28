package org.bharath.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	MyMath myMath = new MyMath();
	
	@Test
	void test3Numbers() 
	{
		assertEquals(6, myMath.sumNumbers(new int[] {1,2,3}));
	}
	
	@Test
	void test1Numbers() 
	{
		assertEquals(9, myMath.sumNumbers(new int[] {9}));
	}

}
