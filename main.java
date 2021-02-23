import java.io.File;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class main {
	private static JFileChooser file = new JFileChooser();
	private static File arch;
	private static String ruta = null;

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		
		System.out.println("Bienvenido, primero debe de seleccionar el archivo a calcular");
		int r = file.showOpenDialog(null);
        
        if (r == JFileChooser.APPROVE_OPTION) {
            arch = file.getSelectedFile();
            ruta = arch.getAbsolutePath();
            System.out.println("\nArchivo a utilizar: " + arch.getAbsolutePath());
            
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
	            	{
	            		
	            		break;
	            	}
	            	case "2":
	            	{
	            		
	            		break;
	            	}
	            	case "3":
	            	{
	            		String opL = "";
	            		while(!opL.equals("1") || !opL.equals("2"))
	            		{
	            			System.out.println("Seleccione\n"
	            					+ "1. Lista simplemente encadenada\n"
	            					+ "2. Lista doblemente encadenada");
	            			if(opL.equals("1"))
	            			{
	            				System.out.println("1");
	            			}
	            			else if(opL.equals("2"))
	            			{
	            				System.out.println("2");
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
}
