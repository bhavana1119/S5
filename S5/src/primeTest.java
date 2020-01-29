import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class primeTest {
    primeTest primeTest;
	@Test
	@Before
	public void inti() {
		primeTest=new primeTest();
	}

	@Test
	  public void test() {
		
		assertEquals("true",primeTest.primeTest(22));
	}
	
	@Test
	  public void test1() {
		
		assertEquals("true",primeTest.primeTest(20));
	}

}
	

}
