
package MECL.examen;

public class MECLOrdRec1{
     public static void main(String[] args) {
        
        MECLOrdRec2 o = new MECLOrdRec2();
		int vector[]={56,-7,0,65,12,20,6,33};
		o.ordenamiento(vector, 0 ,vector.length-1);
		
		for(int i =0; i<vector.length; i++){
			System.out.print(vector[i]+ " ");
		}
	}
}
