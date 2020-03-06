package random;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCase {

	@Test
	public void testNekaMetodaIspisa() {
		randomKlasa k = new  randomKlasa("string12");
		assertEquals("string12", k.nekaMetodaIspisa());
	}

}
