package poo.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{

    public String numCartao;
    private List<Endereco> enderecos;
    public void adicionarEndereco( Endereco endereco){
        if(endereco == null){
            throw new NullPointerException("Endereco nao pode ser nulo");
        }

        if(endereco.cep == null) {
            throw new NullPointerException("CEP nao pode ser nulo");
        }

        if(endereco.numero == null) {
            throw new NullPointerException("numero nao pode ser nulo");
        }

        if(endereco.bairro == null) {
            throw new NullPointerException("bairro nao pode ser nulo");
        }

        if(endereco.cidade == null) {
            throw new NullPointerException("cidade nao pode ser nulo");
        }

        if(endereco.estado == null) {
            throw new NullPointerException("estado nao pode ser nulo");
        }

        getEnderecos().add(endereco);
    }

    private List<Endereco> getEnderecos() {
        if (enderecos == null) {
            enderecos = new ArrayList<Endereco>();
        }
        return enderecos;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return documento;
    }

    public void setCpf(String cpf) {
        this.documento = cpf;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
}
