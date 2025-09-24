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
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Nome: ");
        stringBuffer.append(this.nome);
        stringBuffer.append(" ,Idade: ");
        stringBuffer.append(this.idade);
        stringBuffer.append(" ,Genero: ");
        stringBuffer.append(this.genero);
        stringBuffer.append(" ,Cpf: ");
        stringBuffer.append(this.cpf);
        stringBuffer.append(" ,data de nascimento: ");
        stringBuffer.append(this.datanascimento);
        stringBuffer.append(" ,matricula: ");
        stringBuffer.append(this.matricula);
        stringBuffer.append(" ,Alergia : ");
        stringBuffer.append(this.alergico);
        stringBuffer.append(" ,Cardiopatia: ");
        stringBuffer.append(this.cardiopata);
        stringBuffer.append(" ,Cidade: ");
        stringBuffer.append(this.cidade);
        stringBuffer.append(" ,Curso: ");
        stringBuffer.append(this.curso);

        return stringBuffer.toString();
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

    public boolean equals(Estudante e) {
        if ((e instanceof  Estudante) && ((Estudante) e).getNome().equals(this.getNome())) {
            return true;
        } else
            return false;
    }
    public int hashCode() {
        return getNome().length();
    }
}
