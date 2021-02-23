import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testStackCreation {

	@Test
	void testStackV() {
		StackFactory<Integer> sFactory = new StackFactory<Integer>();
        Stack<Integer> Stack =  sFactory.getStack("V");
        Stack.push(1);
        Stack.push(5);
        Stack.push(8);
        Stack.pop();
        int n = Stack.peek();
        assertEquals(5,n);
	}
	
	@Test
	void testStackA() {
		StackFactory<Integer> sFactory = new StackFactory<Integer>();
        Stack<Integer> Stack =  sFactory.getStack("AL");
        Stack.push(1);
        Stack.push(5);
        Stack.push(8);
        Stack.pop();
        int n = Stack.peek();
        assertEquals(5,n);
	}
	
	@Test
	void testStackL() {
		StackFactory<Integer> sFactory = new StackFactory<Integer>();
        Stack<Integer> Stack =  sFactory.getStack("L");
        Stack.push(1);
        Stack.push(5);
        Stack.push(8);
        Stack.pop();
        int n = Stack.pop();
        assertEquals(5,n);
	}
	
	@Test
	void testStackD() {
		StackFactory<Integer> sFactory = new StackFactory<Integer>();
        Stack<Integer> Stack =  sFactory.getStack("D");
        Stack.push(1);
        Stack.push(5);
        Stack.push(8);
        Stack.pop();
        int n = Stack.peek();
        assertEquals(5,n);
	}

}
