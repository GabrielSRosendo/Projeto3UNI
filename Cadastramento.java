package Projeto.gabriel.silva;

import java.util.List;
import java.util.Scanner;

public class Cadastramento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CadastroEstudanteCarteira service = new CadastroEstudanteCarteira() {
            @Override
            public void cadastrar(Estudante estudante) {

            }

            @Override
            public Estudante buscarPorMatricula(int matricula) throws MatriculaInvalidaEception {
                return null;
            }

            @Override
            public Estudante buscarPorCpf(String cpf) throws CpfInvalidoException {
                return null;
            }

            @Override
            public boolean remover(String cpf) throws CpfInvalidoException {
                return false;
            }

            @Override
            public List<Estudante> listarTodos() {
                return List.of();
            }

            @Override
            public void salvarDados() {

            }

            @Override
            public void carregarDados() {

            }
        };
        service.carregarDados();

        int opcao;
        do {
            System.out.println("\n--- Menu do Sistema ---");
            System.out.println("Para cadastrar um Estudante aperte: 1");
            System.out.println("Para buscar por uma Matricula aperte: 2");
            System.out.println("Para buscar por um Cpf aperte: 3");
            System.out.println("Se deseja remover um estudante aperte: 4");
            System.out.println("Se deseja ver a lista dos Estudantes cadastrados aperte: 5");
            System.out.println("Se deseja sair e salvar do sistema aperte: 6");
            System.out.println("Se deseja salvar os dados manualmente aperte: 7");
            System.out.println("Se deseja carregar os dados manualmente aperte: 8");
            System.out.println("Qual deseja escolher? ");
            opcao = scanner.nextInt();

            try {
                switch (opcao) {
                    case 1:
                        Scanner.nextLine();
                        System.out.print("Digite o nome do estudante: ");
                        String nome = scanner.nextLine();

                        System.out.print("Digite a idade do Estudante: ");
                        int idade = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Digite o sexo do Estudante (M=Masculino/F=Feminino/N=Não Binario");
                        char genero = scanner.nextLine().charAt(0);

                        System.out.print("Digite o Cpf do Estudante: ");
                        String cpf = scanner.nextLine();

                        System.out.print("Digite a data de nascimento do Estudante: (ano/mês/dia");
                        int data = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Digite a Matricula do Estudante: ");
                        int matricula = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Digite se o Estudante possui alergias: ");
                        String alergico = scanner.nextLine();

                        System.out.print("Digite se o Estudante possui Cardiopatia(Prolemas ou doenças do coração): ");
                        String cardiopata = scanner.nextLine();

                        System.out.print("Digite o nome da cidade do Estudante: ");
                        String cidade = scanner.nextLine();

                        System.out.print("Digite o curso do Estudante: ");
                        String curso = scanner.nextLine();

                        Estudante estudante = new Estudante(nome, idade, genero, cpf, data, matricula, alergico, cardiopata, cidade, curso);
                        service.cadastrar(estudante);
                        break;
                    case 2:
                        System.out.print("Digite a matricula correspondente: ");
                        int mat = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println(service.buscarPorMatricula(mat));
                        break;
                    case 3:
                        System.out.print("Digite o CPF correspondente: ");
                        String cpfBusca = scanner.nextLine();
                        System.out.println(service.buscarPorCpf(cpfBusca));
                        break;
                    case 4:
                        System.out.print("Para remover o Estudante digite o CPF do mesmo: ");
                        String cpfRemover = scanner.nextLine();
                        if (service.remover(cpfRemover)) {
                            System.out.println("O Estudante foi removido");
                        }
                        break;
                    case 5:
                        service.listarTodos().forEach(System.out::println);
                        break;
                    case 6:
                        service.salvarDados();
                        System.out.println("Salvando os dados e Saindo do sistema");
                        break;
                    case 7:
                        service.salvarDados();
                        System.out.println("Os dados foram salvos manualmente");
                        break;
                    case 8:
                        service.carregarDados();
                        System.out.println("Os dados foram carregados manualmente");
                        break;
                    default:
                        System.out.println("Perdão mas o que você tentou executar foi invalido.");
                }
            } catch (Exception e) {
                System.out.println("Erro detectado: " + e.getMessage());
            }
        } while (opcao != 6);
        scanner.close();
    }
}
