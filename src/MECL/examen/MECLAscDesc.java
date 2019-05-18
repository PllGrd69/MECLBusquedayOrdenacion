
package MECL.examen;

import java.util.Scanner;

public class MECLAscDesc{
    public int[]OrdenacionCreciente(int[] vector){
        int aux, c;
        for (int i = 1; i < vector.length; i++) {
            aux=vector[i];
            c=i;
            while(c>0 && aux<vector[c-1]){
            vector[c]=vector[c-1];
            c--;
            }
            vector[c]=aux;
        }        
    return vector;
        
    }
    
    public int[]OrdenacionDecreciente(int[] vector){
        int aux, c;
        for (int i = 1; i < vector.length; i++) {
            aux=vector[i];
            c=i;
            while(c>0 && aux>vector[c-1]){
            vector[c]=vector[c-1];
            c--;
            }
            vector[c]=aux;
        }        
    return vector;
        
    }
    public void Imprimir (int[] vector){
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Vector["+i+"]="+vector[i]);
        }
    }
    public static void PMECL(){
    double re = 0;
        int[] vector={42,57,14,40,96,19,8,68,1,4};
        Scanner leer=new Scanner(System.in);
        System.out.println("Precione :");
        System.out.println("1 :Para hacerlo ascendente  ");
        System.out.println("2 :Para hacerlo descendente  ");
        re=leer.nextInt();
        MECLAscDesc or=new MECLAscDesc();
        if(re==1){
            or.Imprimir(or.OrdenacionCreciente(vector));
        }else if (re==2){
            or.Imprimir(or.OrdenacionDecreciente(vector));
}
    }
    public static void main(String[] args) {
        PMECL();
        
     
    }
}
