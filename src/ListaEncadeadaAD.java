public class ListaEncadeadaAD {
    private NoAD primeiro;

    public ListaEncadeadaAD() {
        this.primeiro = null;
    }

    public ListaEncadeadaAD(NoAD pPrimeiro) {
        this.primeiro = pPrimeiro;
    }

    public Boolean estaVazia() {
        if(this.primeiro.getDado() == null) {
            return true;
        }
        return false;
    }

    public boolean inserePrimeiro(int dado) {
        NoAD no = new NoAD(dado);
        boolean inserido = false;

        if (this.primeiro == null) {
            this.primeiro = no;
            inserido = true;
        }
        else {
            no.setProximo(this.primeiro);
            this.primeiro = no;
            inserido = true;
        }
        return inserido;
    }

    private NoAD irAteFinal() {
        NoAD ptrProximo = this.primeiro;
        NoAD ultimo = null;

        while(ptrProximo != null) {
            ultimo = ptrProximo;
            ptrProximo = ptrProximo.getProximo();
        }
        return ultimo;
    }

    public boolean insereDepois(NoAD pNo, int pDado){
        NoAD prox = pNo.getProximo();

        if(prox != null){
            prox.setDado(pDado);

            return true;
        }

        return false;
    }

    public boolean insereUltimo(int dado){
        NoAD ultimoElemento = irAteFinal();

        ultimoElemento.setDado(dado);

        return true;
    }

    public boolean insereOrdenado(int dado){
        NoAD ultimoElemento = irAteFinal();

        ultimoElemento.setDado(dado);

        return true;
    }
}
