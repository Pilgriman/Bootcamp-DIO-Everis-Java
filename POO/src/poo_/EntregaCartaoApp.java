package poo_;

import poo.model.Cliente;
import poo.model.Endereco;

import java.util.ArrayList;

public class EntregaCartaoApp {
    public static void main(String[] args) {
        //Dados do endereco

        Endereco endereco = new Endereco();
        endereco.cep = "00000";
        endereco.numero = "0000";
        endereco.cidade = "Recife";
        endereco.bairro = "Espinheiro";
        endereco.estado = "PE";


        Cliente cliente = new Cliente();

        //Dados do cliente

        try {
              cliente.adicionarEndereco(endereco);
              System.out.println("Endereco adicionado com sucesso!");

        } catch (Exception e){
            //TODO: bandle exception
            System.err.println("Houve um erro ao adicionar endereco: " + e.getMessage());
        }

    }
}
