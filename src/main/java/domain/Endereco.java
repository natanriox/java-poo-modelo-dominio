package domain;

public class Endereco {
    private String rua;
    private String cep;

    public Endereco(String rua, String cep) {
        if (rua == null || rua.isBlank()) {
            throw new IllegalArgumentException("O campo 'Rua' não pode estar vazio.");
        }

        if (cep == null || cep.isBlank()) {
            throw new IllegalArgumentException("O campo 'Cep' não pode estar vazio.");
        }

        this.rua = rua;
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "\nRua: " + this.getRua() +
                "\nCep: " + this.getCep();
    }

    public String getRua() {
        return rua;
    }

    public String getCep() {
        return cep;
    }
}
