package br.com.kasolution.dominio;

public class Funcionario {
    public static final double SALARIO_MINIMO = 1200.00;
    private static int ultimoCodigo = 0;
    
    private int codigo;
    private String nome;
    private String cpf;
    private double salario;
    
    public Funcionario(String nome) {
        this(nome, SALARIO_MINIMO);
    }
    
    public Funcionario(String nome, double salario) {
        this.codigo = ++ultimoCodigo;
        this.nome = nome;
        this.cpf = "(não informado)";
        if (salario < SALARIO_MINIMO) {
            System.out.println("O salário não pode ser"
                    + " inferior ao mínimo.");
            this.salario = SALARIO_MINIMO;
        } else {
            this.salario = salario;
        } //fim if
    }//fim construtor
    
    public void imprime() {
        System.out.println("Funcionario: #" + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Salário: " + salario + "\n");
    }
    
    public void aumentaSalario(double valor) {
        if (valor > 0) {
            this.salario += valor;
        } else {
            System.out.println("Valor não pode ser"
                    + " inferior a R$1 (zero).");
        }//fim if
    }//fim aumenta
    
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}//fim classe










