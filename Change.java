import java.util.Stack;

public class Change {
public static int Prec(char ch) 
    { 
        switch (ch) 
        { 
        case '+': 
        case '-': 
            return 1; 
       
        case '*': 
        case '/': 
            return 2; 
       
        case '^': 
            return 3; 
        } 
        return -1; 
    } 
       
    // Covierte de infix a postfix
    public static String infixToPostfix(String exp) 
    { 
        String result = new String(""); 
        Stack<Character> chars = new Stack<>(); 
          
        for (int i = 0; i<exp.length(); ++i) 
        { 
            char c = exp.charAt(i); 
              
            // Si es un operando, agregarlo al resultado
            if (Character.isLetterOrDigit(c)) 
                result += c; 
               
            // Si en un parentesis, agregarlo al stack
            else if (c == '(') 
                chars.push(c); 
              
            // Si es el parentesis cerrando, hacer pop al stack hasta encontrar el 1er parentesis
            else if (c == ')') 
            { 
                while (!chars.isEmpty() &&  
                        chars.peek() != '(') 
                    result += chars.pop(); 
                  
                    chars.pop(); 
            } 
            else //Si es un operador
            { 
                while (!chars.isEmpty() && Prec(c)  
                         <= Prec(chars.peek())){ 
                    
                    result += chars.pop(); 
             } 
                chars.push(c); 
            } 
       
        } 
        // Sacar todos los operadores del stack
        while (!chars.isEmpty()){ 
            if(chars.peek() == '(') 
                return "Expresion invalida"; 
            result += chars.pop(); 
         } 
        return result; 
    } 
}
