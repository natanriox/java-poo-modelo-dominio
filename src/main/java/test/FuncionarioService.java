package test;

import domain.Endereco;
import domain.Funcionario;

public class FuncionarioService {
    public static void main(String[] args) {
        Endereco address = new Endereco("Rua da caralhada do que se foda", "01-22345");
        Funcionario worker = new Funcionario("Atlas", "999.888.777-36", "Atlas@empresa.com", address, 54321, 2000);

        System.out.println("----------------------------");
        System.out.println(worker);
        System.out.println("----------------------------");

    }
}
