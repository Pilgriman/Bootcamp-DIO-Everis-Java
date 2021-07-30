package br.com.pilha;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push (No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);

    }

    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }


    public No top (){
        return  refNoEntradaPilha;
    }

    public boolean isEmpty(){
        return  refNoEntradaPilha == null? true:false;
    }


    @Override
    public String toString() {

        String stringRetorno = "--------------------\n";
        stringRetorno += "    Pilha   \n";
        stringRetorno += "--------------------\n";

        No noauxialiar = refNoEntradaPilha;

        while (true) {
            if (noauxialiar != null) {

                stringRetorno += " [No{dado =" + noauxialiar.getDado() +"}]\n";
                noauxialiar = noauxialiar.getRefNo();

            } else {

                break;
            }

        }
        stringRetorno += "====================\n";
        return stringRetorno;
    }
}




