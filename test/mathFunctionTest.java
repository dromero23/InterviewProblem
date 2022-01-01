import static org.junit.Assert.*;

import org.junit.Test;

public class mathFunctionTest {

	@Test
	public void test() {
		System.out.print("Executing Junit Test Cases");
		MIProgram testcases = new MIProgram();
		assertEquals("+",testcases.mathFunction(1,2,3));
		assertEquals("+*",testcases.mathFunction(2,2,4));
		assertEquals("*",testcases.mathFunction(3,-3,-9));
		assertEquals("-",testcases.mathFunction(1,2,-1));
		assertEquals("/",testcases.mathFunction(3,3,1));
		assertEquals("None",testcases.mathFunction(7,1,11));
		assertEquals("*/",testcases.mathFunction(0,1,0));
	}

}
