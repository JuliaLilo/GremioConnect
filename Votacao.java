package model;

public class Votacao {
    private lema idVotacao;

    public Votacao (long idVotacao){
        super();
        this.idVotacao = 0;
    }

    public long getIdVotacao() {
        return idVotacao;
    }

    public void setIdVotacao(long idVotacao) {
        this.idVotacao = idVotacao;
    }
}
