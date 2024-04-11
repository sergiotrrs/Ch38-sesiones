package test.org.generation.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.generation.math.MathOperations;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MathOperationTest {
	
	MathOperations op;
	
	@BeforeEach
	void setUp() {
		op = new MathOperations(10);
	}
	
	@Test
	void additionTest() {
		assertEquals( 15, op.addition(5) ); // 15
		assertEquals( 35, op.addition(20) );
		assertEquals( 50, op.addition(15) );
	}

}
