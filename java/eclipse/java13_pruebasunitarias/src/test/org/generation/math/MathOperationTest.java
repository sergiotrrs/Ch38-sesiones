package test.org.generation.math;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.generation.math.MathOperations;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class MathOperationTest {
	
	MathOperations op;
	
	@BeforeEach
	void setUp() {
		op = new MathOperations(10);
	}
	
	@Test
	@Order(1)
	void additionTest() {
		assertEquals( 15, op.addition(5) ); // 15
		assertEquals( 35, op.addition(20) );
		assertEquals( 50, op.addition(15) );
	}
	
	@Test
	@Order(2)
	void additionFloatNumbersTest() {
		MathOperations math = new MathOperations(1);
		assertEquals( 1.01 , math.addition(0.01) );
		assertEquals( 1.02 , math.addition(0.01) );
		assertEquals( 1.03 , math.addition(0.01) );
		assertEquals( 1.04 , math.addition(0.01) );
		assertEquals( 1.05 , math.addition(0.01) );
		assertEquals( 1.06 , math.addition(0.01) );
		assertEquals( 1.07 , math.addition(0.01) );
		assertEquals( 1.08 , math.addition(0.01) );
		assertEquals( 1.09 , math.addition(0.01) );
		assertEquals( 1.10 , math.addition(0.01) );		
	}

	@Test
	@Order(3)
	void additionFloatNumbers2Test() {
		MathOperations math = new MathOperations(1);
		final double DELTA = 0.0001;
		
		assertEquals( 1.001 , math.addition(0.001), DELTA, "mensaje de esta prueba" );
		assertEquals( 1.002 , math.addition(0.001), DELTA );
		assertEquals( 1.003 , math.addition(0.001), DELTA );
		assertEquals( 1.004 , math.addition(0.001), DELTA );
		assertEquals( 1.005 , math.addition(0.001), DELTA );
		assertEquals( 1.006 , math.addition(0.001), DELTA );
		assertEquals( 1.007 , math.addition(0.001), DELTA );
		assertEquals( 1.008 , math.addition(0.001), DELTA );
		assertEquals( 1.009 , math.addition(0.001), DELTA );
		assertEquals( 1.010 , math.addition(0.001), DELTA );		
	}
	
	@Test
	@Order(3)
	void additionNegativeNumberTest() {
		assertThrows( IllegalStateException.class, ()->{ 
			op.addition(-2);
		} );
	}

	
	
	
	
}
