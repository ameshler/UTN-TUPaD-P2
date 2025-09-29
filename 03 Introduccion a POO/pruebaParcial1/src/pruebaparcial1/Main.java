package pruebaparcial1;

//import java.util.*;

/**
 *
 * @author Andres Meshler
 */
public class Main {
    static int f(String s, int i) {
        return i==s.length()?0:(s.charAt(i) == 'a'?1:0)+f(s,i+1);
    }
public class PruebaParcial1 {

    public static void main(String[] args) {
        
        System.out.println(f("banana",0));  // 'println' corregido
    
}
    }}