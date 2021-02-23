import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class main {
	private static JFileChooser file = new JFileChooser();
	private static calculadora Cont = new ProtCalculadora();
	private static File arch;
	private static String ruta = null;
	private static String posfix;
	private static String res = " ";

	public static void main(String[] args) throws IOException {
		Scanner leer = new Scanner(System.in);
		StackFactory<String> sFactory = new StackFactory<String>();
		
		
		System.out.println("Bienvenido, primero debe de seleccionar el archivo a calcular");
		int r = file.showOpenDialog(null);
        
        if (r == JFileChooser.APPROVE_OPTION) {
            arch = file.getSelectedFile();
            ruta = arch.getAbsolutePath();
            System.out.println("\nArchivo a utilizar: " + arch.getAbsolutePath());
            try{
                FileReader read = new FileReader(ruta);
                BufferedReader read1 = new BufferedReader(read);
                String data = read1.readLine();
                Change cambio = new Change();
                posfix = cambio.infixToPostfix(data);
                System.out.println("Expresion convertida a infix: " + posfix);
            }
            catch(ArithmeticException | IOException | NumberFormatException e){
            System.out.println(e.toString());
            }
        }
        FileReader read = new FileReader(ruta);
        BufferedReader read1 = new BufferedReader(read);
        String data = read1.readLine();
        Change cambio = new Change();
        posfix = Change.infixToPostfix(data);
          
            
            String opcion = "";
            while(!opcion.equals("4"))
            {
            	System.out.println("Bienvenido\nSeleccione una opcion para continuar\n"
            			+ "1. Utilizar Arraylist\n"
            			+ "2. Vector\n"
            			+ "3. Lista\n"
            			+ "4. Salir");
            	opcion=leer.next();
            	switch(opcion)
                {
	            	case "1":
	            		res = Cont.decode(posfix, "AL");
	            		System.out.println(res);
	            		break;
	            	
	            	case "2":
	            		res = Cont.decode(posfix, "V");
	            		System.out.println(res);
	            		break;
	            	case "3":
	            	{
	            		String opL = "";
	            		while(!opL.equals("3"))
	            		{
	            			System.out.println("Seleccione\n"
	            					+ "1. Lista simplemente encadenada\n"
	            					+ "2. Lista doblemente encadenada\n"
	            					+ "3. Regresar");
	            			opL= leer.next();
	            			if(opL.equals("1"))
	            			{
	            				res = Cont.decode(posfix, "L");
	            				System.out.println(res);
	            			}
	            			else if(opL.equals("2"))
	            			{
	            				res = Cont.decode(posfix, "D");
	            				System.out.println(res);
	            			}
	            			else if(opL.equals("3"))
	            			{
	            				System.out.println("Regresando...\n\n");
	            			}
	            			else
	            			{
	            				System.out.println("Ingrese un valor valido");
	            			}
	            		}
	            		break;
	            	}
	            	case "4":
	            	{
	            		
	            		break;
	            	}
	            	default:
	            	{
	            		System.out.println("Seleccione una opcion valida");
	            		break;
	            	}
                }
            	
            }
	}
}
