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
    public void remover(){ 
           if(this.primeiro() != null){ 
                return this.primeiro
                NoAD pNo = ultimoElemento.setDado(this.primeiro); 
                ultimo = NoAD pNo; 
                prox.setDado(null); 
           } 
           else { 
                primeiro = ultimo = null; 
           } 
    }
    
    public NoAD remove(NoAD pno) {
        NoAD noad;
        do {
            noad = primeiro;
            //se isso for true significa que o NoAD do parametro é igual ao que estamos lendo
            if(noad.getDado() == pno.getDado() && noad.getProximo() == pno.getProximo()) {
                return noad;
            }
            //se for false, ele vai ler o proximo elemento da lista
            else {
                noad = noad.getProximo();
            }
        }
        //se o próximo for igual a null significa que não tem mais nenhum
        //elemento depois dele, então não existe mais ninguém para ser lido
        while(noad.getProximo() != null);

        return noad;
    }
}
