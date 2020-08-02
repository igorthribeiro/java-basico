package br.com.kasolution.dominio;

public abstract class Funcionario implements Pagavel {
    private String nome;
    private String sobrenome;
    private String cpf;
    
    public Funcionario(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void imprime() {
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("CPF: " + cpf);
    }
    
    @Override
    public String toString() {
        return new StringBuilder("Nome: ").append(nome)
                .append(" / Sobrenome: ").append(sobrenome)
                .append(" / CPF: ").append(cpf)
                .toString();
    }    
    
    public abstract double calculaValorPagamento();
   
}






