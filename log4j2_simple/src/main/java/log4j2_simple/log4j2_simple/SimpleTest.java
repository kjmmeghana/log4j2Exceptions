package log4j2_simple.log4j2_simple;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class SimpleTest {
	Simple s;
	@Before
	public void init()
	{
		s=new Simple();
	}

	@Test
	public void testInterest() {
		
		assertEquals(24,s.interest(1200,1,2),0);
	}

}