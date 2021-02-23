/**
 * 
 * @author Jonathan Espinoza 20022
 * @author Juan Andres Galicia 20298
 * @version 23-2-2021
 *
 * @param <E>
 */
class StackFactory<E> {
//selecciona la implementacion a utilizar para un stack
//se utiliza el patron Factory
	/**
	 * 
	 * @param entry
	 * @return
	 */
   public Stack<E> getStack(String entry) {
    // seleccion de la implementacion a utilizar:
	if (entry.equals("AL"))
      return new StackArrayList<E>(); //regresa ArrayList
	else if(entry.equals("V"))
      return new StackVector<E>(); //regresa Vector
	else if(entry.equals("L"))
		return new StackList<E>(); //regresa lista simple
	else if(entry.equals("D"))
		return new StackDoubleLinkedList<E>(); //regresa lista doble
	else
		return new StackVector<E>();
   }
}
