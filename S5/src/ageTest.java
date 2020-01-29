import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ageTest {
	age age;
	@Before
	public void inti() {
		age=new age();
	}

	@Test
	  public void test() {
		
		assertEquals("eligible to vote",age.election(23));
	}
	
	@Test
	  public void test1() {
		
		assertEquals("eligible to vote",age.election(22));
	}

}
