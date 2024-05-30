package ejemplo.pkg1;
import java.util.Scanner;
/**
 *
 * @author gabyl
 */
public class Ejemplo1 {

    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     
     //en este espacio los objetos van a interactuar con el main 
        System.out.println("Cuantos elementos tiene el arreglo A? ");
        int tamanoA = leer.nextInt();
        Metodo A = new Metodo(tamanoA);
        
        System.out.print("¿Cuántos elementos tiene el conjunto B? ");
        int tamanoB = leer.nextInt();
        Metodo B = new Metodo(tamanoB);
        // Lleemos el conjunto a
        A.leerConjunto("A");

        // leemos el conjunto b
        B.leerConjunto("B");

        // diferencia de a -b
        Metodo C = Metodo.diferenciaConjuntos(A, B);

        // resultado conjunto c 
        C.mostrarConjunto("C (A - B)");
    }
        
    }
  
    

