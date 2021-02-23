/**
 * 
 * @author Jonathan Espinoza 20022
 * @author Juan Andres Galicia 20298
 * @version 23-2-2021
 *
 * @param <E>
 */
public interface IList<E> {
	/**
	 * 
	 * @param element
	 * @return
	 */
	public boolean insert(E element);
	/**
	 * 
	 * @param element
	 * @param index
	 * @return
	 */
	public boolean insertAt(E element, int index);
	/**
	 * 
	 * @param element
	 * @return
	 */
	public boolean insertAtStart(E element);
	/**
	 * 
	 * @param element
	 * @return
	 */
	public boolean insertAtEnd(E element);
	/**
	 * 
	 * @param index
	 * @return
	 */
	public E removeAt(int index);
	/**
	 * 
	 * @return
	 */
	public E removeAtStart();
	/**
	 * 
	 * @return
	 */
	public E removeAtEnd();
	/**
	 * 
	 * @return
	 */
	public int count();
	/**
	 * 
	 * @return
	 */
	public boolean isEmpty();
}
