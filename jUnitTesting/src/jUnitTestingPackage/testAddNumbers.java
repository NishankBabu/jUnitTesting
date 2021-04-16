package jUnitTestingPackage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunction obj1 = new jUnitFunction();
		int test1 = obj1.testAddNumbers(200,300);
		assertEquals(500,test1);
	}

}
//nishank babu pallem
//e19cse345
