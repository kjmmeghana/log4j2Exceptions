package log4j2.log4j2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HouseTest {
	House h;
	@Before
	public void init()
	{
		h=new House();
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(4500000,h.FullyHomeCost("HighStandardMaterials",2500),0);
		
	}
}
