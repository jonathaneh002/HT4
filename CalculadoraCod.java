

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Stack;


/**
*
* @author Juan Andres Galicia Reyes 20298 UVG 2021
* @version 06/02/21
*/
public class CalculadoraCod implements calculadora{
	private int resultado;
	
/**
 * @param x primer numero
 * @implSpec y segundo numero
 * @return la suma de ambos
 */
	public int suma(int x, int y) {
        resultado = x + y;
        return resultado;
    }
/**
 * 
 * @param x primer numero
 * @param y segundo numero
 * @return  la resta de ambos de forma y-x
 */
    @Override
    public int resta(int x, int y) {
        resultado = y - x;
        return resultado;
    }
    /**
     * 
     * @param x primer numero
     * @param y segundo numero
     * @return la multiplicacion de ambos
     */
    @Override
    public int multiplicacion(int x, int y) {
        resultado = x * y;
        return resultado;
    }
    /**
     * 
     * @param x primer numero
     * @param y segundo numero
     * @return  la division de ambos de forma y/x
     */
    @Override
    public int division(int x, int y) {
        resultado = y/x;
        return resultado;
    }

	@Override
	public int operar(Stack x) {
		Stack<Integer> pila2 = new Stack<>();
		Iterator value = x.iterator(); 
		while (value.hasNext()) {
            if(x.peek().equals("+"))
            {
            	
            	System.out.println(pila2);
            	int y = (int) pila2.pop();
            	int z = (int) pila2.pop();
            	int resultado = suma(y,z);
            	System.out.println(z+" + "+y+"="+resultado);
            	pila2.push(resultado);
            	x.pop();
            }
            else if(x.peek().equals("-"))
            {
            	System.out.println(pila2);
            	
            	int y = (int) pila2.pop();
            	int z = (int) pila2.pop();
            	int resultado = resta(y,z);
            	System.out.println(z+" - "+y+"="+resultado);
            	pila2.push(resultado);
            	x.pop();
            }
            else if(x.peek().equals("*"))
            {
            	System.out.println(pila2);
            	
            	int y = (int) pila2.pop();
            	int z = (int) pila2.pop();
            	int resultado = multiplicacion(y,z);
            	System.out.println(z+" * "+y+"="+resultado);
            	pila2.push(resultado);
            	x.pop();
            }
            else if(x.peek().equals("/"))
            {
            	System.out.println(pila2);
            	
            	int y = (int) pila2.pop();
            	int z = (int) pila2.pop();
            	int resultado = division(y,z);
            	System.out.println(z+" / "+y+"="+resultado);
            	pila2.push(resultado);
            	x.pop();
            }
            else
            {
            	int y = Integer.parseInt((String) x.pop());
        		pila2.push(y);
        		System.out.println(pila2.peek());
            }
        }
        System.out.println(pila2);
		return pila2.pop();
	}

	@Override
	/**
	 * metodo que forma la primera pila leyendo el archivo de texto
	 * @param cadena de texto del archivo
	 * @return cadena de texto con el resultado
	 */
	public String decode(String a) {
		Stack<String> aux = new Stack<>();
		Stack<String> pila = new Stack<>();
		int total=0;
		String res = "";
		try
		{
			FileReader read = new FileReader(a);
            BufferedReader read1 = new BufferedReader(read);
            String data = read1.readLine();
            while(data != null)
            {
            	String sep[] = data.split(" ");
                
                for (int i=0; i < sep.length; i++){
                	aux.push(sep[i]);
                }
                
                data = read1.readLine();
                Iterator<String> it = aux.iterator();
                while (it.hasNext()) {
                    pila.push(aux.pop());
                }
                System.out.println(pila);
                total = operar(pila);
            }
		}
		catch(ArithmeticException | IOException | NumberFormatException e){
            return e.toString();
		}
		return Integer.toString(total);
	}
}
