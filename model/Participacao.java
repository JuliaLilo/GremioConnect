package model;

public class Participacao {
    private long idParticipacao;
    private Estudante estudante;
    private Chapa chapa;

    public Participacao (){
        super();
        this.idParticipacao = 0;
        this.estudante = new Estudante();
    }

    public Participacao (long idParticipacao, Estudante estudante){
        super();
        this.idParticipacao = idParticipacao;
        this.estudante = estudante;
    }

    public long getIdParticipacao() {
        return idParticipacao;
    }

    public void setIdParticipacao(long idParticipacao) {
        this.idParticipacao = idParticipacao;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante){
        this.estudante = estudante;
    }

    @Override
    public String toString() {
        return idParticipacao+ ", " +estudante;
    }
}

