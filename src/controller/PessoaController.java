package controller;

import java.util.ArrayList;

import model.business.PessoaBo;
import model.data.business.Evento;
import model.data.business.Grupo;
import model.data.business.Pessoa;

public class PessoaController {

    private PessoaBo pessoaBo;

    public PessoaController() {
        pessoaBo = new PessoaBo();
    }

    public boolean salvarPessoa(String cpf, String nome, String enderecoRua, Integer enderecoNumero, String enderecoComplemento,
            String enderecoBairro, String enderecoCidade, String enderecoUf, String enderecoCep, String telefone, String email, String senha,
            Grupo grupo) {
        Pessoa pessoa = new Pessoa(cpf, nome, enderecoRua, enderecoNumero, enderecoComplemento, enderecoBairro, enderecoCidade, enderecoUf,
                enderecoCep, telefone, email, senha, grupo);
        return pessoaBo.realizarCadastroPessoa(pessoa);
    }

    public boolean excluirPessoaPorCpf(String cpf) {
        return pessoaBo.excluirPessoaPorCpf(cpf);
    }

    public Pessoa pesquisarPessoaPorCpf(String cpf) {
        return pessoaBo.pesquisarPessoaPorCpf(cpf);
    }

    public ArrayList<Pessoa> pesquisarPessoaPorNome(String nome) {
        return pessoaBo.pesquisarPessoaPorNome(nome);
    }

    public ArrayList<Pessoa> pesquisarPessoasPorGrupo(Grupo grupo) {
        return pessoaBo.pesquisarPessoasPorGrupo(grupo);
    }

    public ArrayList<Pessoa> pesquisarPessoasPorEvento(Evento evento) {
        return pessoaBo.pesquisarPessoasPorEvento(evento);
    }
}
