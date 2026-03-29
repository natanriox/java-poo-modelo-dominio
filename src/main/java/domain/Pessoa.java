package domain;

public class Pessoa {
    private String nome;
    private String cpf;
    private String email;
    private Endereco endereco;

    public Pessoa(String nome, String cpf, String email, Endereco endereco) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O campo 'Nome' não pode estar vazio.");
        }

        if (cpf == null || cpf.isBlank()) {
            throw new IllegalArgumentException("O campo 'Cpf' não pode estar vazio.");
        }

        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("O campo 'Email' não pode estar vazio.");
        }

        if (endereco == null) {
            throw new IllegalArgumentException("O campo 'Endereço' não pode estar vazio.");
        }

        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() +
                "\nCpf: " + this.getCpf() +
                "\nEmail: " + this.getEmail() +
                endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }
}
