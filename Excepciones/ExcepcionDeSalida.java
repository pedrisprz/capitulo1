package Excepciones;

public class ExcepcionDeSalida extends Exception {
    public ExcepcionDeSalida() {
        super("Se ha ingresado el carácter 'x' para salir");
    }
}