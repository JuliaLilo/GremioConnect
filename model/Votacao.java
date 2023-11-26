package model;

public class Votacao {
    private long idVotacao;
    private Chapa chapa;
    private Estudante estudante;
    
    public Votacao (){
        super();
        this.idVotacao = 0;
        this.chapa = new Chapa();
        this.estudante = new Estudante();
    }

    public Votacao (long idVotacao, Estudante estudante, Chapa chapa){
        super();
        this.idVotacao = idVotacao;
        this.estudante = estudante;
        this.chapa = chapa;
    }

    public long getIdVotacao() {
        return idVotacao;
    }

    public void setIdVotacao(long idVotacao) {
        this.idVotacao = idVotacao;
    }

    public Estudante getEstudante (){
        return estudante;
    }

    public void setEstudante (Estudante estudante){
        this.estudante = estudante;
    }

    public Chapa getChapa(){
        return chapa;
    }

    public void setChapa(Chapa chapa){
        this.chapa = chapa; 
    }

    @Override
    public String toString(){
        return idVotacao+ ", " +chapa+ ", " +estudante;
    }    
}
