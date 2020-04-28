package org.bharath.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertExamples {

	@Test
	void assertEqual() {
		assertEquals(6, 6);
	}
	
	@Test
	void assertNotEqual() {
		assertNotEquals(6, 5);
	}
	
	@Test
	void assertTrueCondition() {
		assertTrue(true);
	}
	
	@Test
	void assertFalseCondition() {
		assertFalse(false);
	}

	@Test
	void assertCheckNull() {
		assertNull(null);
	}
	
	@Test
	void assertCheckNotNull() {
		assertNotNull("Hello");
	}
	
	int [] check = {1,2,3};
	int [] check1 = {1,2,3,4};
	
	@Test
	void assertCheckEqualArray() {
		assertArrayEquals(check,check);
	}

}
