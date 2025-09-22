package Projeto.gabriel.silva;

public class AlunoInvalidoException extends Exception {
    public AlunoInvalidoException(String message) { super(message); }

    public AlunoInvalidoException(){this("Perdão, mas o Aluno foi Invalido, ou não econtrado");}
}
