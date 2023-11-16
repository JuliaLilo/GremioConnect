package model;

public class Participacao {
    private long idParticipacao;

    public Participacao (){
        super();
        this.idParticipacao = 0;
    }

    public Participacao (long idParticipacao){
        super();
        this.idParticipacao = idParticipacao
    }

    public long getIdParticipacao() {
        return idParticipacao;
    }

    public void setIdParticipacao(long idParticipacao) {
        this.idParticipacao = idParticipacao;
    }
}
