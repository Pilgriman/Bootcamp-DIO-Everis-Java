package br.com.arvore.binaria;

public class ArvoreBinaria <T extends Comparable<T>> {
    private BinNo<T> raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    //Método inserir
    //ele será dividido em etapas(1º será inserido o nó de fato atraves de um metodo interno-private
    //depois ele será exposto como método público

    public void inserir(T conteudo) {
        BinNo<T> novoNo = new BinNo<>(conteudo);
        raiz = inserir(raiz, novoNo);

    }

    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo) {
        // a arvore ainda esta vazia, logo o novoNo irá setar a raiz

        if (atual == null) {
            return novoNo;

        } else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0) {
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        } else {
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }
        return atual;

    }

    //MetodoExibir obs: terá também um metodo publico para exibição dos dados

    //1 metodo inOrdem ( ele seta os nós da arvore em ordem crescente a partir da raiz

    public void exibirInOrdem() {
        System.out.println("\n Exibindo InOrdem");
        exibirInOrdem(this.raiz);

    }

    private void exibirInOrdem(BinNo<T> atual) {
        //a primeira coisa é verificar se o nó esta nulo , pois isso significa que já está no final da exibição

        if (atual != null) {
            exibirInOrdem(atual.getNoEsq());
            System.out.print(atual.getConteudo() + ",");
            exibirInOrdem(atual.getNoDir());
        }

    }

    //2 pos-ordem(ele visita os lados da arvore e depois exibe a raiz)

    public void exibirPosOrdem() {
        System.out.println("\n Exibindo pos-Ordem");
        exibirPosOrdem(this.raiz);

    }


    private void exibirPosOrdem(BinNo<T> atual) {
        //a primeira coisa é verificar se o nó esta nulo , pois isso significa que já está no final da exibição

        if (atual != null) {
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.print(atual.getConteudo() + ",");

        }


    }

    //3 pre-ordem(exibe primeiro a raiz e depois visita os nós da arvore)

    public void exibirPreOrdem() {
        System.out.println("\n Exibindo Pre-Ordem");
        exibirPreOrdem(this.raiz);

    }


    private void exibirPreOrdem(BinNo<T> atual) {
        //a primeira coisa é verificar se o nó esta nulo , pois isso significa que já está no final da exibição

        if (atual != null) {
            System.out.print(atual.getConteudo() + ",");
            exibirPreOrdem(atual.getNoEsq());
            exibirPreOrdem(atual.getNoDir());
        }

    }

    //Metodo Remove

    public void Remove(T conteudo){
        try{
            BinNo<T> atual= this.raiz;
            BinNo<T> pai= null;
            BinNo<T> filho= null;
            BinNo<T> temporario = null;

            //devemos encontrar onde está o conteudo que foi passado como parametro
            while (atual != null && !atual.getConteudo().equals(conteudo)){
                pai = atual;

                //atraves desse if , percorro minha arvore para encontrar o conteudo
                if (conteudo.compareTo(atual.getConteudo()) < 0) {
                    atual = atual.getNoEsq();
                }else{
                       atual = atual.getNoDir();
                    }

                }

            // isso ocorrera quando a minha raiz for nula ou eu chegar numa folha
            if (atual == null){
                System.out.println("Conteudo nao encontrado. Bloco Try");
            }

            //varios blocos de IF que irão tratar varios casos:
            //1º caso: raiz não ser nula
            //2ºcaso: ter encontrado o nó atual

            if (pai == null){
                if (atual.getNoDir() == null){
                    this.raiz = atual.getNoEsq();
                }else if (atual.getNoEsq() == null){
                    this.raiz = atual.getNoDir();
                }else {
                    for (temporario = atual, filho = atual.getNoEsq();
                         filho.getNoDir() != null;
                         temporario = filho, filho.getNoEsq()
                    ) {
                        if (filho != atual.getNoEsq()) {
                            temporario.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(raiz.getNoEsq());

                        }
                    }
                    filho.setNoDir(raiz.getNoDir());
                    raiz = filho;
                }

            }else if(atual.getNoDir() == null){
                if (pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoEsq());
                }else {
                    pai.setNoDir(atual.getNoEsq());
                }

                }else if (atual.getNoEsq() == null){
                if (pai.getNoEsq() == atual){
                    pai.setNoEsq(atual.getNoDir());
                }else{
                    pai.setNoDir(atual.getNoDir());
                }
            }else {
                for (temporario = atual, filho = atual.getNoEsq();
                     filho.getNoDir() != null;
                     temporario = filho, filho = filho.getNoDir()
                ) {
                    if (filho != atual.getNoEsq()) {
                        temporario.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(atual.getNoEsq());

                    }
                    filho.setNoDir(atual.getNoDir());
                    if (pai.getNoEsq() == atual){
                        pai.setNoEsq(filho);
                    }else {
                        pai.setNoDir(filho);
                    }
                }
            }

            //isso será quando não encontrarmos o conteudo
        }catch (NullPointerException erro){
            System.out.println("Conteudo nao encontrado. Bloco Catch");

        }
    }
}
