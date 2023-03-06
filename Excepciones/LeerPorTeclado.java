package Excepciones;

public class LeerPorTeclado {
    private char caracter;

    public char getChar() {
        return caracter;
    }

    public void setChar(char caracter) {
        this.caracter = caracter;
    }

    public void procesarCaracter() throws ExcepcionDeVocal, ExcepcionDeNumero, ExcepcionDeBlanco, ExcepcionDeSalida {
        if (Character.isWhitespace(caracter)) {
            throw new ExcepcionDeBlanco();
        } else if (Character.isDigit(caracter)) {
            throw new ExcepcionDeNumero();
        } else if (Character.toLowerCase(caracter) == 'a' || Character.toLowerCase(caracter) == 'e' ||
                Character.toLowerCase(caracter) == 'i' || Character.toLowerCase(caracter) == 'o' ||
                Character.toLowerCase(caracter) == 'u') {
            throw new ExcepcionDeVocal();
        } else if (caracter == 'x') {
            throw new ExcepcionDeSalida();
        }
    }
}