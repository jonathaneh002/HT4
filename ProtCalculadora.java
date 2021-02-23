/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
* @author Jonathan Espinoza 20022
 * @author Juan Andres Galicia 20298
 * @version 23-2-2021
 */
public class ProtCalculadora implements calculadora {
	
	private static ProtCalculadora calcu;
	/**
	 * 
	 */
    private ProtCalculadora()
    {

    }

    public static ProtCalculadora getProtCalculadora()
    {
        if(calcu == null)
        {
            calcu = new ProtCalculadora();
        }
        return calcu;
    }
    
    int resultado;
    /**
     * 
     * @param x
     * @param y
     * @return 
     */
    @Override
    public int suma(int x, int y) {
        //Suma 2 valores
        resultado = x + y;
        return resultado;
    }
/**
 * 
 * @param x
 * @param y
 * @return 
 */
    @Override
    public int resta(int x, int y) {
        //Resta 2 valores
        resultado = y - x;
        return resultado;
    }
    /**
     * 
     * @param x
     * @param y
     * @return 
     */
    @Override
    public int multiplicacion(int x, int y) {
        //Multiplica 2 valores
        resultado = x * y;
        return resultado;
    }
    /**
     * 
     * @param x
     * @param y
     * @return 
     */
    @Override
    public int division(int x, int y) {
        //Divide 2 valores
        resultado = y/x;
        return resultado;
    }
    /**
     * 
     * @param x
     * @return 
     */
    @Override
    public int operar(Stack x) {
        //No implementado
        return 0; 
    }
    /**
     * 
     * @param a, e
     * @return 
     */
    @Override
    public String decode(String a, String E) {
        //Crear pila y calculadora
        calculadora cal;
        StackFactory<Integer> sFactory = new StackFactory<Integer>();
        Stack<Integer> Stack =  sFactory.getStack(E);
        
        cal = new ProtCalculadora();

        String res = null;
        String pros = " ";
        String datos;
        
            
        datos = a;
        //Verificar que no este vacio el archivo
        while (datos!=null){
               
               String partes[] = datos.split(" ");
               for (int i = 0; i < partes.length; i++) {
                   System.out.println(partes[i]);
            }
               //Leer cada linea del archivo
               for (int i=0; i < partes.length; i++){
                   //Si operador = +
                   if ((partes[i].equals("+"))){
                       int resultado;
                       int x = Stack.pop();
                       int y = Stack.pop();
                       resultado = cal.suma(x, y);
                       Stack.push(resultado); 
                       pros = pros + ("\n" + partes[i] +"\tSumar: pop, pop y push del resultado " + "\t" + resultado);
                    }
                   //Si operador = -
                   else if((partes[i].equals("-"))){
                       int resultado;
                       int x = Stack.pop();
                       int y = Stack.pop();
                       resultado = cal.resta(x, y);
                       Stack.push(resultado);  
                       pros = pros + ("\n" + partes[i] + "\tResta: pop, pop y push del resultado " + "\t" + resultado);
                   }
                   //Si operador = *
                   else if((partes[i].equals("*"))){
                       int resultado;
                       int x = Stack.pop();
                       int y = Stack.pop();
                       resultado = cal.multiplicacion(x, y);
                       Stack.push(resultado); 
                       //String resultante
                       pros = pros + ( "\n" +  partes[i] + "\tMultiplicar: pop, pop y push del resultado "  + "\t" + resultado);
                   }
                   //Si operador = /
                   else if((partes[i].equals("/"))){
                       int resultado;
                       int x = Stack.pop();
                       int y = Stack.pop();
                       resultado = cal.division(x, y);
                       Stack.push(resultado); 
                       pros = pros + ("\n" + partes[i] + "\tDividir: pop, pop y push del resultado " + "\t" + resultado);
                   }
                  
                   else{
                       //En caso que la entrada sea un numero
                       if(Stack.size() < 1){
                        pros = pros + ("\n" + partes[i] + "\tPush operando" + "\t" + partes[i] );
                       }
                       else if(Stack.size() >= 1){
                        pros = pros + ("\n" + partes[i] + "\tPush operando" + "\t" + Stack.peek() + ", " + partes[i] );
                       }
                       
                       Stack.push(Integer.parseInt(partes[i]));
                       
                       
                  }
               }
               //String resultante completo
               res = ("RESULTADO: " + Stack.pop() + "\n" + "ENTRADA" + "\t OPERACION" + "\t\t PILA");
               res = res + "\n "+ pros;
               datos = null;
               
            }
        return res;
    }
    
}
