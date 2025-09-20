package Projeto.gabriel.silva;

public class CpfInvalidoException extends Exception {
    public CpfInvalidoException(String message) {
        super(message);};

    public CpfInvalidoException(){this("Perdão, mas o Cpf foi inválido");}
}
