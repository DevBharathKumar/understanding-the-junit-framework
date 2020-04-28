package org.bharath.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyMathTest {

	MyMath myMath = new MyMath();
	
	int x;
	
	@BeforeEach
	void before() {
		System.out.println("Execute before each method ");
	}
	
	@Test
	void test3Numbers() 
	{
		System.out.println("Hello 3");
		assertEquals(6, myMath.sumNumbers(new int[] {1,2,3}));
	}
	
	@Test
	void test1Numbers() 
	{
		System.out.println("Hello 1");
		assertEquals(9, myMath.sumNumbers(new int[] {9}));
	}
	
	
	
	@AfterEach
	void executeAfterEachMethod() {
		System.out.println("Execute after each method ");
	}
	
	@BeforeAll
	static void executeBeforeClassMethod() {
		System.out.println("Executed at the beginning of the class ");
	}
	
	@AfterAll
	static void executeAfterClassMethod() {
		System.out.println("Executed at the end of the class ");
	}

}
