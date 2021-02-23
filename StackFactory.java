class StackFactory<E> {
//selecciona la implementacion a utilizar para un stack
//se utiliza el patron Factory
   public Stack<E> getStack(String entry) {
    // seleccion de la implementacion a utilizar:
	if (entry.equals("AL"))
      return new StackArrayList<E>(); //regresa ArrayList
	else if(entry.equals("V"))
      return new StackVector<E>(); //regresa Vector
	else if(entry.equals("L"))
		return new StackList<E>();
	else if(entry.equals("D"))
		return new StackDoubleLinkedList<E>();
	else
		return new StackVector<E>();
   }
}