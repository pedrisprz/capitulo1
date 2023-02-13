package ejercicios_java;

public class Ejercicio11 {
	public static void main(String[] args) {
	    int t = 86399;
	    int horas = t / 3600;
	    int minutos = (t % 3600) / 60;
	    int segundos = (t % 3600) % 60;
	    System.out.println("Tiempo en segundos: " + t);
	    System.out.println(horas + " horas " + minutos + " minutos " + segundos + " segundos");
	  }
}
