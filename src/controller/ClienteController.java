package controller;

import model.business.PessoaBo;
import model.data.business.Grupo;
import model.data.business.Pessoa;

public class ClienteController {

    private PessoaBo pessoaBo;

    public ClienteController() {
        pessoaBo = new PessoaBo();
    }

    public void cadastrarCliente(String cpf, String nome, String enderecoRua, Integer enderecoNumero, String enderecoComplemento,
            String enderecoBairro, String enderecoCidade, String enderecoUf, String enderecoCep, String telefone, String email, String senha,
            Grupo grupo) {
        Pessoa pessoa = new Pessoa(cpf, nome, enderecoRua, enderecoNumero, enderecoComplemento, enderecoBairro, enderecoCidade, enderecoUf,
                enderecoCep, telefone, email, senha, grupo);
        pessoaBo.realizarCadastroCliente(pessoa);
    }

    public void excluirCliente(String cpf) {
        pessoaBo.excluirPessoaPorCpf(cpf);
    }
}
