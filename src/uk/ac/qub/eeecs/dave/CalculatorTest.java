package uk.ac.qub.eeecs.dave;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		Calculator c = new Calculator();
		assertEquals(c.add(10,2), 11);
	}
	
	@Test
	void testAdd2() {
		Calculator c = new Calculator();
		assertEquals(c.add(15,2), 16);
	}
	
	@Test
	void testSub() {
		Calculator c = new Calculator();
		assertEquals(c.sub(10,2), 9);
	}
}
