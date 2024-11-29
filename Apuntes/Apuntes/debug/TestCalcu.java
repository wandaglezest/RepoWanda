package Apuntes.debug;

import org.junit.jupiter.api.Test;

class TestCalcu {

	@Test
	void test() {
		Calculadora calcu = new Calculadora();
		assertEquals(5, calcu.suma(2, 3));
	}

}
