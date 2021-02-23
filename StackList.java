
import java.util.LinkedList;

/**
 * @author moise
 *
 */
public class StackList<E> extends AbstractStack<E> {

	protected LinkedList<E> core;
	
	public StackList() {
		core = new LinkedList<E>();
	}
	
	
	public boolean push2 (E element) {
		return core.add(element);
	}

	@Override
	public E peek() {
		return core.get(core.size() - 1);
	}

	@Override
	public E pop() {
		return core.removeLast();
	}

	
	public int count() {
		return core.size();
	}

	
	public boolean isEmpty() {
		return core.isEmpty();
	}

	

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public void push(E element) {
		core.add(element);
	}
	

}
