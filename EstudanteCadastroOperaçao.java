package Projeto.gabriel.silva;

import java.io.*;
import  java.util.ArrayList;
import java.util.List;

public class EstudanteCadastroOperaçao implements CadastroEstudanteCarteira {
    private List<Estudante> estudantes = new ArrayList<>();
    private final String arquivo = "estudante.txt";

    @Override
    public void cadastrar(Estudante estudante) {
        estudantes.add(estudante);
    }
    @Override
    public Estudante buscarPorMatricula(int matricula) throws MatriculaInvalidaEception {
        return estudantes.stream()
                .filter(a -> a.getMatricula() == matricula)
                .findFirst()
                .orElseThrow(() -> new MatriculaInvalidaEception("Perdão mas a matricula não foi encontrada ou é invalida."));
    }
    @Override
    public Estudante buscarPorCpf(String cpf) throws CpfInvalidoException {
        return estudantes.stream()
                .filter(a -> a.getCpf().equalsIgnoreCase(cpf))
                .findFirst()
                .orElseThrow(() -> new CpfInvalidoException("Perdão mas o cpf e invalido ou não foi encontrado"));
    }
    @Override
    public boolean remover(String cpf) throws CpfInvalidoException {
        Estudante estudante = buscarPorCpf(cpf);
        return estudantes.remove(estudante);
    }
    @Override
    public List<Estudante> listarTodos() {
        return new ArrayList<>(estudantes);
    }
    @Override
    public void salvarDados() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))) {
            for (Estudante estudante : estudantes) {
                writer.write(String.join("###",
                        estudante.getNome(),
                        String.valueOf(estudante.getIdade()),
                        String.valueOf(estudante.getGenero()),
                        estudante.getCpf(),
                        String.valueOf(estudante.getDatanascimento()),
                        String.valueOf(estudante.getMatricula()),
                        estudante.getAlergico(),
                        estudante.getCardiopata(),
                        estudante.getCidade(),
                        estudante.getCurso()
                        ));
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Perdão, mas ocorreu um erro ao tentar salvar: " + e.getMessage());
        }
    }
    @Override
    public void carregarDados() {
        estudantes.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                Estudante estudante = new Estudante(
                        dados[0],
                        Integer.parseInt(dados[1]),
                        dados[2].charAt(0),
                        dados[3],
                        Integer.parseInt(dados[4]),
                        Integer.parseInt(dados[5]),
                        dados[6],
                        dados[7],
                        dados[8],
                        dados[9]
                );
                estudantes.add(estudante);
            }
        } catch (IOException e) {
            System.out.println("Perdão, mas ocorreu um erro ao tentar carregar: " + e.getMessage());
        }
    }
}
