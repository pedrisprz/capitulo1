package Excepciones;

public class ExcepcionDeBlanco extends Exception {
    public ExcepcionDeBlanco() {
        super("Se ha ingresado un espacio en blanco");
    }
}