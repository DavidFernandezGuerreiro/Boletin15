
package boletin15;
import java.util.Scanner;
/**
 *
 * @author David
 */
public class NotasEvaluacion {
    Scanner sc=new Scanner(System.in);
    private float probaEscrita1;
    private float probaEscrita2;
    private float probaPractica;
    private float boletins;
    float totalProEscritas;
    float totalProPractica;
    float totalBoletins;
    
    public void calcularProbasEscritas(){
        System.out.println("Introduzca a nota da primeira proba : ");
        probaEscrita1=sc.nextFloat();
        System.out.println("Introduzca a nota da segunda proba : ");
        probaEscrita2=sc.nextFloat();
        totalProEscritas=(probaEscrita1+probaEscrita2)/2;
        totalProEscritas=(totalProEscritas*40)/100;
    }
    
    public void calcularProbaPractica(){
        System.out.println("Introduzca a nota da proba práctica : ");
        probaPractica=sc.nextFloat();
        totalProPractica=(probaPractica*40)/100;
    }
    
    public void calcularBoletins(){
        System.out.println("Introduzca porcentaxe dos boletíns entregados : ");
        boletins=sc.nextFloat();
        float puntuacionBoletins;
        if(boletins>90){
            puntuacionBoletins=2;
        }
        else if(boletins>=70 && boletins<=90){
            puntuacionBoletins=1;
        }else{
            puntuacionBoletins=0;
        }
        totalBoletins=(puntuacionBoletins*20)/100;
    }
    
    public void mostrar(){
        System.out.println("NOTAS EVALUACIÓN"+
                "\nProbas teóricas : "+totalProEscritas+
                "\nProba práctica : "+totalProPractica+
                "\nBoletíns : "+totalBoletins+
                "\nNota total : "+(totalProEscritas+totalProPractica+totalBoletins));
    }
}
