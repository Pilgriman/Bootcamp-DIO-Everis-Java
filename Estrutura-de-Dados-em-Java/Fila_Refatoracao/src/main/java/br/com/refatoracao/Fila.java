package br.com.refatoracao;

public class Fila {
    private No refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }


    //No embutido (tecnica de encapsulamento)
    public void enqueue(Object obj){
        No novoNo = new No(obj);

        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    //retornara o objeto e nao o No
    public Object first(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while (true){
                if (primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();

                }else{
                    break;
                }

            }
            return primeiroNo.getObject();
        }
        return null;
    }

    //retornara o objeto e nao o No
    public Object dequeue(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while (true){
                if (primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();

                }else{
                    noAuxiliar.setRefNo(null);
                    break;
                }

            }
            return primeiroNo.getObject();

        }
        return null;
    }

    public boolean isEmpty(){
        return  refNoEntradaFila == null? true:false;
    }

    @Override
    public String toString() {
        String stringRetorno = "--------------------\n";
        stringRetorno += "    Fila   \n";
        stringRetorno += "--------------------\n";

        No noAuxiliar = refNoEntradaFila;
        if (refNoEntradaFila != null){
            while (true){
                stringRetorno += "[No{objeto " + noAuxiliar.getObject() + "}]--->";
                if (noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    stringRetorno += "null";
                    break;
                }
            }

        }else{
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
