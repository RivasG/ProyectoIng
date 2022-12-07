
package clase4arreglos;

import java.util.Scanner;

public class vectorporteclado {
    public static void main(String[] args) { 
 Scanner entrada=new Scanner(System.in);
 float[] numero=new float[5] ;
 int i;
 char y;
        System.out.println("Numeros   del arreglo ");
        for(i=0;i<5;i++){
            System.out.println("Digite los numeros");
            numero[i]=entrada.nextFloat();
        }
        for(i=0;i<5;i++){
            System.out.println(i+1+") Los numero son :"+numero[i]);
        }
        System.out.println("datos al contario");
       for(i=numero.length-1;i>=0;i--){
            System.out.println(i+1+") Los numero son :"+numero[i]);
        }
        System.out.println("abecedeario en mayuscula"); 
        for(y='A';y<='Z';y++){
            
            System.out.println("El abecedario es :"+y);
        }
 
  }
}
