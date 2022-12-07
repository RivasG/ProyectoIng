/*
 ingresar 6 nombre de alumnos con 
respectivas notas
obtendremos el estudiante con la nota mayor
y el estudiante con la menor
 */
package clase4arreglos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class promedios {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("##.00");
        String[] nombre = new String[6];
        double[] notas = new double[6];
        String respuesta="s";
        while(respuesta.equals("S") || respuesta.equals("s")){
        int i, maximo = 0, minimo = 101;
        String nombremaximo = "", nombreminimo = "";
        float promedio = 0;
        for (i = 0; i < 6; i++) {
            System.out.println("Digite el nombre y la nota corresponde");
            nombre[i] = entrada.next();
            notas[i] = entrada.nextDouble();
            promedio = (float) (promedio + notas[i] / 6);
            if (notas[i] > maximo) {
                maximo = (int) notas[i];
                nombremaximo = nombre[i];
            }
             if (notas[i]< minimo) {
                minimo = (int) notas[i];
                nombreminimo= nombre[i];
            }      
        }
        for (i = 0; i < 6; i++) {
            System.out.println(nombre[i]+" Tiene una nota de :"+ notas[i]);
        }
        System.out.println("El promedio global es :"+df.format(promedio));
        System.out.println(nombremaximo+" Tiene la nota mayor con :"+maximo);
        System.out.println(nombreminimo+" Tiene la nota mayor con :"+minimo);
         System.out.println("Desea continuar s/n");
        respuesta=entrada.next();
    }
       
    }    
}
