package org.tektutor;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.experimental.categories.Category;

public class TestCaseOne {

	@Category({UnitTest.class})
	@Test
	public void testCase1() {
		assertTrue ( true );
		System.out.println ( "Test Module 1 - Test Case1" );
	}

	@Test
	public void testCase2() {
		assertTrue ( true );
		System.out.println ( "Test Module 1 - Test Case2" );
	}

	@Test
	public void testCase3() {
		assertTrue ( true );
		System.out.println ( "Test Module 1 - Test Case3" );
	}


}

