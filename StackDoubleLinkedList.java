
public class StackDoubleLinkedList<E> extends AbstractStack<E> {

	ListDoubleLinkedList<E> core;
	
	public StackDoubleLinkedList() {
		core = new ListDoubleLinkedList<E>();
	}
	
	public boolean push2 (E element) {
		return core.insert(element);
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E pop() {
		return core.removeAtEnd();
	}

	public int count() {
		// TODO Auto-generated method stub
		return core.count();
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return core.isEmpty();
	}

	@Override
	public void push (E item) {
		push2(item);
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
