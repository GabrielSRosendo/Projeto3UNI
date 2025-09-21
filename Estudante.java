package Projeto.gabriel.silva;

public class Estudante {
    private String nome;
    private int idade;
    private char genero;
    private String cpf;
    private int datanascimento;
    private long matricula;
    private String alergico;
    private String cardiopata;
    private String cidade;
    private String curso;

    public Estudante(String nome, int idade, char genero, String cpf, int datanascimento, long matricula,
                     String alergico, String cardiopata, String cidade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.cpf = cpf;
        this.datanascimento = datanascimento;
        this.matricula = matricula;
        this.alergico = alergico;
        this.cardiopata = cardiopata;
        this.cidade = cidade;
        this.curso = curso;
    }
    @Override
    public String toString() {
        return "Estudante{" + "nome= ' " + nome + " ', idade=" + idade + ", genero=" + genero +
                ", cpf=" + cpf + ", datanascimento=" + datanascimento + ", matricula=" + matricula +
                ", alergico=' " + alergico + "', cardiopata='" + cardiopata + "', cidade='" + cidade +
                "', curso='" + curso + "'}";
    }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) {this.idade = idade; }
    public char getGenero() {return genero; }
    public void setGenero(char genero) { this.genero = genero; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf;}
    public int getDatanascimento() { return datanascimento;}
    public void setDatanascimento(int datanascimento) { this.datanascimento = datanascimento; }
    public long getMatricula() { return matricula; }
    public void setMatricula(long matricula) { this.matricula = matricula; }
    public String getAlergico() { return alergico;}
    public void setAlergico(String alergico) { this.alergico = alergico; }
    public String getCardiopata() { return cardiopata; }
    public void setCardiopata(String cardiopata) { this.cardiopata = cardiopata; }
    public String getCidade() { return cidade;}
    public void setCidade(String cidade) { this.cidade = cidade;}
    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }
}

