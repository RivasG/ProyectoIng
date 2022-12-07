
package clase4arreglos;

public class arreglos {
    public static void main(String[] args) {
      int [] numero=new int [5];
      String [] nombre=new String [5];
      int i;
      numero[0]=29;
      numero[1]=89;
      numero[2]=67;
      numero[3]=100;
      numero[4]=56;
        for (i=0;i<5;i++){
            System.out.println("Los datos son :"+numero[i]);   
        }
        System.out.println("------------------------------");
        nombre[0]="pepe";
        nombre[1]="ana";
        nombre[2]="karla";
        nombre[3]="sofia";
        nombre[4]="maria";
                for (i=0;i<5;i++){
            System.out.println("Los datos son :"+nombre[i]);   
        }
    }
    
}
