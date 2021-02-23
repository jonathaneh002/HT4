import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testSingleton {

	@Test
	void test() {
		calculadora Cont = ProtCalculadora.getProtCalculadora();
		calculadora Cont2 = ProtCalculadora.getProtCalculadora();
		int c1 = Cont.hashCode();
		int c2 = Cont.hashCode();
		boolean igual=false;
		if(c1 == c2)
		{
			igual = true;
		}
		assertEquals(true,igual);
	}

}
