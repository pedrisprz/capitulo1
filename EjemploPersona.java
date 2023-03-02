package proyectosMaven;

public class EjemploPersona {
	
	public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 25, 'H', 70, 1.8);
        System.out.println(persona1.toString());

        Persona persona2 = new Persona("Ana", 30, 'M');
        persona2.setPeso(65);
        persona2.setAltura(1.65);
        System.out.println(persona2.toString());

        int imcPersona2 = persona2.calcularIMC();
        if (imcPersona2 == Persona.INFRAPESO) {
            System.out.println("La persona 2 tiene infrapeso");
        } else if (imcPersona2 == Persona.PESO_IDEAL) {
            System.out.println("La persona 2 tiene peso ideal");
        } else {
            System.out.println("La persona 2 tiene sobrepeso");
        }

        boolean esMayorDeEdad = persona1.esMayorDeEdad();
        if (esMayorDeEdad) {
            System.out.println("La persona 1 es mayor de edad");
        } else {
            System.out.println("La persona 1 no es mayor de edad");
        }
    }
}


