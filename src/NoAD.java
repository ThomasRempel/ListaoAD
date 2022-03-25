public class NoAD {
    private Integer dado;
    private NoAD proximo;

    public NoAD(Integer dado, NoAD proximo) {
        this.dado = null;
        this.proximo = null;
    }

    public NoAD(Integer pDado) {
        this.dado = pDado;
        this.proximo = null;
    }

    public Integer getDado() {
        return dado;
    }

    public void setDado(Integer dado) {
        this.dado = dado;
    }

    public NoAD getProximo() {
        return proximo;
    }

    public void setProximo(NoAD proximo) {
        this.proximo = proximo;
    }
}
