package br.com.arvore.binaria;

public class BinNo<T extends Comparable<T>>{
    private T conteudo;
    private BinNo<T> noDir;
    private BinNo<T> noEsq;

    public BinNo(T conteudo) {
        this.conteudo = conteudo;
        this.noEsq = null;
        this.noDir = null;
    }

    public BinNo() {
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public BinNo<T> getNoDir() {
        return noDir;
    }

    public void setNoDir(BinNo<T> noDir) {
        this.noDir = noDir;
    }

    public BinNo<T> getNoEsq() {
        return noEsq;
    }

    public void setNoEsq(BinNo<T> noEsq) {
        this.noEsq = noEsq;
    }

    @Override
    public String toString() {
        return "BinNo{" +
                "conteudo=" + conteudo +
                '}';
    }
}
