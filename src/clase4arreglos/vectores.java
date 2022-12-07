/*
 ingresar un vector de 10 posciones
y llenarlo con datos al azar entre 0 y 50
 */
package clase4arreglos;

public class vectores {

    public static void main(String[] args) {
        int[] vector1 = new int[10];
        int i, vector1mayor = 0, vector1menor = 51;
        System.out.println("empieza el primer vector ");
        for (i = 0; i < 10; i++) {
            vector1[i] = (int) Math.floor(Math.random() * 50);
            if (vector1[i] > vector1mayor) {
                vector1mayor = vector1[i];
            } else {

            }
            if (vector1[i] < vector1menor) {
                vector1menor = vector1[i];
            }

            System.out.println(i + 1 + ") Los datos del vector son :" + vector1[i]);
        }
System.out.println("El dato del vector 1 es :" + vector1mayor + " el menor es " + vector1menor);

    }

}
