package org.tektutor;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.experimental.categories.Category;

public class TestCaseTwo {

	@Category({UnitTest.class})
	@Test
	public void testCase1() {
		assertFalse ( false );
		System.out.println ( "Test Module 2 - Test Case1" );
	}

	@Test
	public void testCase2() {
		assertFalse ( false );
		System.out.println ( "Test Module 2 - Test Case2" );
	}

	@Test
	public void testCase3() {
		assertFalse ( false );
		System.out.println ( "Test Module 2 - Test Case3" );
	}

}
