import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testList {

	@Test
	void testDouble() {
		StackFactory<Integer> sFactory = new StackFactory<Integer>();
        Stack<Integer> Stack =  sFactory.getStack("D");
        Stack.push(2);
        Stack.push(3);
        Stack.push(4);
        Stack.push(5);
        Stack.pop();
        int n = Stack.pop();
        assertEquals(4,n);
	}
	
	@Test
	void testListDouble()
	{
		StackFactory<Integer> sFactory = new StackFactory<Integer>();
        Stack<Integer> Stack =  sFactory.getStack("D");
        ListDoubleLinkedList<Integer> core = new ListDoubleLinkedList<>();
        core.insert(5);
        Stack.push(5);
        int n1=Stack.pop();
        int n2=core.removeAtEnd();
        assertEquals(n1,n2);
	}

	
	@Test
	void testList()
	{
		StackList<String> Stack = new StackList<>();
        Stack.push("1");
        Stack.push("2");
        Stack.push("3");
        int n = Stack.count();
        assertEquals(3,n);
	}
}
