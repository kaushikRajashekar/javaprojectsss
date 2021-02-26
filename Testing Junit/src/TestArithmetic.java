import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junittesting.Arithmetic;

class TestArithmetic {
	Arithmetic ath=new Arithmetic();

	@Test
	void test() {
		assertEquals(15, ath.muliply(5, 3));
	}

}
