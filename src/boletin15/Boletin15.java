
package boletin15;

/**
 *
 * @author David
 */
public class Boletin15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NotasEvaluacion alum1=new NotasEvaluacion();
        alum1.calcularProbasEscritas();
        alum1.calcularProbaPractica();
        alum1.calcularBoletins();
        alum1.mostrar();
    }
    
}
