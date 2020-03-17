package frame;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class First_unit {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("This is Before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("THis sis after class ");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("This is before method");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("This is after method");
	}

	@Test
	public void test() {
		System.out.println("This is test method");
	}
	@Test
	public void test2() {
		System.out.println("THis is test 2 method");
	}

}
