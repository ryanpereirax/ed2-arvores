package br.unicap.ed2.pv;

import br.unicap.ed2.base.No;

public class NoPV extends No {

    private Cor cor;

    public NoPV(int chave) {
        super(chave);
        cor = Cor.VERMELHO;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor newCor) {
        cor = newCor;
    }
    
    public static void main(String[] args) {
        NoPV no = new NoPV(10);
        NoPV outroNo = new NoPV(10);
        outroNo.setCor(Cor.PRETO);
        no.setPai(outroNo);
        NoPV pai = no.getPai();
        System.out.println(pai.getCor());
    }
}
