/**
 * 
 * @author Jonathan Espinoza 20022
 * @author Juan Andres Galicia 20298
 * @version 23-2-2021
 *
 * @param <E>
 */
abstract public class AbstractStack<E> 
implements Stack<E>
{
      public boolean empty()
   // post: regresa true si el stack esta vacio
   {
      return size() == 0;
   }
}