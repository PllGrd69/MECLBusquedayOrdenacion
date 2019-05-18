
package MECL.examen;

import java.util.Scanner;

public class MECLMenu{
    
public static void main(String[] args) {
        System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");
        System.out.println("       Segun el orden de los ejercicios");
        Scanner leer=new Scanner(System.in);
        int opcion =leer.nextInt();
        while (opcion!=0) {            
            switch(opcion){
            case 1: MECLAlgoritmo.PrimeralgMECL();break;
            case 2: MECLLeertec.main(args);break;
            case 3: MECLAscDesc.main(args);break;
            case 4: MECLBusqueda.IMECL(args);break;
                                  
            default: System.out.println("Opción Inválida");break;
            }  
            System.out.println("INGRESE LA OPCIÓN DEL ALGORITMO QUE DESEA PROBAR");            
            opcion =leer.nextInt();
        }
}
}
