package ejercicios_prog;

import java.util.Random;

public class ejercicio8 {
	    public static void main(String[] args) {
	        Random aleatorio = new Random();
	        char[] alfabeto = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	        char letra = alfabeto[aleatorio.nextInt(26)];
	        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
	            System.out.println(letra + " es una vocal");
	        } else {
	            System.out.println(letra + " es una consonante");
	        }
	    }
	}


