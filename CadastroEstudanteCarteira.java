package Projeto.gabriel.silva;

import java.util.List;

public interface CadastroEstudanteCarteira {
    void cadastrar(Estudante estudante);
    Estudante buscarPorMatricula(int matricula) throws MatriculaInvalidaEception;
    Estudante buscarPorCpf(String cpf) throws CpfInvalidoException;
    boolean remover(String cpf) throws CpfInvalidoException;
    List<Estudante> listarTodos();
    void salvarDados();
    void carregarDados();
}
