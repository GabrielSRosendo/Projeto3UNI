package Projeto.gabriel.silva;

public class MatriculaInvalidaEception extends Exception {
    public MatriculaInvalidaEception(String message) {
        super(message);
    }
    public MatriculaInvalidaEception(){this("Perdão, mas a matricula aparenta ser inválida");}
}
