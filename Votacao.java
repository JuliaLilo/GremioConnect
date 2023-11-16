package model;

public class Votacao {
    private long idVotacao;

    
    public Votacao (){
        super();
        this.idVotacao = 0;
    }

    public Votacao (long idVotacao){
        super();
        this.idVotacao = idVotacao;
    }


    public long getIdVotacao() {
        return idVotacao;
    }

    public void setIdVotacao(long idVotacao) {
        this.idVotacao = idVotacao;
    }
}
