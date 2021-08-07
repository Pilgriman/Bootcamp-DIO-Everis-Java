package br.com.arvore.binaria;

public class ArvoreBinaria <T extends Comparable<T>>{
    private BinNo<T> raiz;

    public ArvoreBinaria(){
        this.raiz=null;
    }

    //Método inserir
    //ele será dividido em etapas(1º será inserido o nó de fato atraves de um metodo interno-private
    //depois ele será exposto como método público

    public void inserir(T conteudo){
        BinNo<T> novoNo = new BinNo<>(conteudo);
        raiz = inserir(raiz, novoNo);

    }

    private BinNo<T> inserir( BinNo<T> atual,  BinNo<T> novoNo){
        // a arvora ainda esta vazia, logo o novoNo irá setar a raiz

        if (atual == null){
            return novoNo;

        }else if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0){
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        }else{
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }
        return atual;

    }


}
