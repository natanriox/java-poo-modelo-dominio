package domain;

public class Funcionario extends Pessoa {
    private int id;
    private double salario;


    public Funcionario(String nome, String cpf, String email, Endereco endereco, int id, double salario) {
        super(nome, cpf, email, endereco);
        this.id = id;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSalário: " + this.getSalario() +
                "\nID: " + this.getId();
    }

    public int getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }
}