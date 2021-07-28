package poo.model;

public class Pessoa {

    private static final int TAMANHO_CPF = 11;
    private static final int TAMANHO_CNPJ = 14;

    public  enum TipoPessoa{FISICA, JURIDICA}

    public Integer codigo;
    public String nome;
    public String documento;
    public TipoPessoa tipo;


    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        if(documento == null || documento.isEmpty())
            throw new RuntimeException("Documento nao poder nulo ou vazio");

        if(documento.length() == TAMANHO_CPF) {
            setDocumento(documento, TipoPessoa.FISICA);

        }else if (documento.length() == TAMANHO_CNPJ){
            setDocumento(documento, TipoPessoa.JURIDICA);
        }else{
            throw new RuntimeException("Documento invalido para pessoa fisica ou juridica");
        }


    }

        private void setDocumento(String documento, TipoPessoa tipo){

            this.documento = documento;
            this.tipo = tipo;
        }

        public TipoPessoa getTipo(){
           return tipo;
    }
}
