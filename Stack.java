/**
 * 
 * @author Jonathan Espinoza 20022
 * @author Juan Andres Galicia 20298
 * @version 23-2-2021
 *
 * @param <E>
 */
public interface Stack<E>
{
	/**
	 * 
	 * @param item
	 */
   public void push(E item);
   // post: el item es agregado al stack. Sera
   //       el proximo en salir
   /**
    * 
    * @return
    */
   public E pop();
   // pre: stack no esta vacio
   // post: el elemento ingresado mas recientemente
   //       es retirado.
   /**
    * 
    * @return
    */
   public E peek();
   //pre: stack no esta vacio
   //post: el valor mas reciente es retornado
   //      pero no es sacado del stack.
   /**
    * 
    * @return
    */
   public boolean empty();
   //post: regresa true si el stack esta vacio
   /**
    * 
    * @return
    */
   public int size();
   //post: regresa la cantidad de elementos
   //      en el stack
}