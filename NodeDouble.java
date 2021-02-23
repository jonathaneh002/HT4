/**
 * 
 * @author Jonathan Espinoza 20022
 * @author Juan Andres Galicia 20298
 * @version 23-2-2021
 *
 * @param <E>
 */
public class NodeDouble<E> {
	public E value;
	public NodeDouble<E> next;
	public NodeDouble<E> prev;
	/**
	 * 
	 * @param element
	 */
	public NodeDouble(E element) {
		next = null;
		prev = null;
		value = element;
	}
}
