import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class testCalcu {

	private calculadora p = ProtCalculadora.getProtCalculadora();
	@Test
	void test1() {
		
		int r1 = p.division(1, 6);
		assertEquals(6,r1);
	}
	
	@Test
	void test2() {
		int r2 = p.multiplicacion(1, 2);
		assertEquals(2,r2);
	}
	
	@Test
	void test5() {
		int r1 = p.division(2, 4);
		assertEquals(2,r1);
	}
	
	@Test
	void test3() {
		int r1 = p.suma(5, 2);
		assertEquals(7,r1);
	}
	
	@Test
	void test4() {
		int r1 = p.resta(2, 5);
		assertEquals(3,r1);
	}
	
	@Test
	void test6() {
		int r1 = p.resta(4, 1);
		assertEquals(-3,r1);
	}
	
	@Test
	void testDecode()
	{
		String operar = "1 5 +";
		String result = p.decode(operar, "V");
		assertEquals("RESULTADO: 6\n" + 
				"ENTRADA	 OPERACION		 PILA\n" + 
				"  \n" + 
				"1	Push operando	1\n" + 
				"5	Push operando	1, 5\n" + 
				"+	Sumar: pop, pop y push del resultado 	6",result);
	}
	
	@Test
	void testDecode2()
	{
		String operar = "1 5 +";
		String result = p.decode(operar, "AL");
		assertEquals("RESULTADO: 6\n" + 
				"ENTRADA	 OPERACION		 PILA\n" + 
				"  \n" + 
				"1	Push operando	1\n" + 
				"5	Push operando	1, 5\n" + 
				"+	Sumar: pop, pop y push del resultado 	6",result);
	}
	@Test
	void testDecode3()
	{
		String operar = "1 5 +";
		String result = p.decode(operar, "L");
		assertEquals("RESULTADO: 6\n" + 
				"ENTRADA	 OPERACION		 PILA\n" + 
				"  \n" + 
				"1	Push operando	1\n" + 
				"5	Push operando	5\n" + 
				"+	Sumar: pop, pop y push del resultado 	6",result);
	}
	@Test
	void testDecode4()
	{
		String operar = "1 5 +";
		String result = p.decode(operar, "D");
		assertEquals("RESULTADO: 6\n" + 
				"ENTRADA	 OPERACION		 PILA\n" + 
				"  \n" + 
				"1	Push operando	1\n" + 
				"5	Push operando	5\n" + 
				"+	Sumar: pop, pop y push del resultado 	6",result);
	}

}
