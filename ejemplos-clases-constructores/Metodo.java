package ejemplo.pkg1;
 import java.util.Scanner;
/**
 *
 * @author gabyl
 */
//inciamos con la declaracion de la clase Metodo
public class Metodo {
  /**una vez declarada la clase llenamos el cuerpo de acuerdo a lo requerido 
   * para el programa  */
    Scanner leer;
    private int tam;
    private int[] elementos;
    
    
    // aqui vamos a poner el constructor para inicializar los objetos
    
    public Metodo(int tam){
        this.leer = new Scanner(System.in);
        this.tam = tam;
        this.elementos = new int [tam];
    }
    //aqui creamos el objeto leerConjunto() con el que va a interactuar la matriz
      public void leerConjunto(String nombre) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce los elementos del conjunto " + nombre + ":");
        for (int i = 0; i < tam; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            elementos[i] = entrada.nextInt();
        }
      }
        public int[] getElementos() {
        return elementos;
    }
        public int getTamano() {
        return tam;
    }
        public static Metodo diferenciaConjuntos(Metodo A, Metodo B) {
        int[] elementosA = A.getElementos();
        int[] elementosB = B.getElementos();
        int[] elementosC = new int[A.getTamano()];
        int indexC = 0;

        for (int i = 0; i < A.getTamano(); i++) {
            boolean encontrado = false;
            for (int j = 0; j < B.getTamano(); j++) {
                if (elementosA[i] == elementosB[j]) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                elementosC[indexC++] = elementosA[i];
            }
        }

        Metodo C = new Metodo(indexC);
        for (int i = 0; i < indexC; i++) {
            C.getElementos()[i] = elementosC[i];
        }

        return C;
    }

    public void mostrarConjunto(String nombre) {
        System.out.print("El conjunto " + nombre + " es: ");
        for (int i = 0; i < tam; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }
    
    
    
      }

