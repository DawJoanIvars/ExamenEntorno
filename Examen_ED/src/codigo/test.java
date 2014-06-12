package codigo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class test {
	
	Menor numero=new Menor();
	
	@Before
	public void setUp() throws Exception {
		numero.setA(1);
		numero.setB(3);
	}

	@Test
	public void test() {
		
		assertEquals(2,numero.menor());
	}

}
