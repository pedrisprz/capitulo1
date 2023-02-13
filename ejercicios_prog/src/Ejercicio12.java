package ejercicios_java;
import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
	    int[] billetes = {500, 200, 100, 50, 20, 10, 5};
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Introduce el importe: ");
	    int importe = scanner.nextInt();
	    if (importe <= 4) {
	        System.out.println("No se pueden utilizar billetes");
	        System.out.println("Sobrante: " + importe + " €");
	      } else {
	        System.out.println("Con " + importe + " euros se puede obtener: ");
	        for (int billete : billetes) {
	          int numBilletes = importe / billete;
	          if (numBilletes > 0) {
	            System.out.println(numBilletes + " billete(s) de " + billete + " euros");
	            importe = importe % billete;
	          }
	    }
	    if (importe > 1)
	    System.out.println("Sobran " + importe + " euros");
	    else if (importe == 1)
	    System.out.println("Sobra " + importe + " euro");
	    else
	    System.out.println("Sobran " + importe + " euros");
	  }
	}
}

