package Projeto.gabriel.silva;

import java.util.List;

public interface CadastroEstudanteCarteira {
    void cadastrar(Estudante estudante);
    Estudante buscarPorMatricula(int matricula) throws MatriculaInvalidaEception, AlunoInvalidoException;
    Estudante buscarPorCpf(String cpf) throws CpfInvalidoException, AlunoInvalidoException;
    boolean remover(String cpf) throws CpfInvalidoException, AlunoInvalidoException;
    List<Estudante> listarTodos();
    void salvarDados();
    void carregarDados();
}
