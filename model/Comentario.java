package model;

public class Comentario {
    private long idComentario;
    private Estudante estudante;
    private Publicacao publicacao;

    public Comentario (){
        super();
        this.idComentario = 0;
        this.publicacao = new Publicacao();
        this.estudante = new Estudante();
    }

    public Comentario (long idComentario, Estudante estudante, Publicacao Publicacao){
        super();
        this.idComentario = idComentario;
        this.estudante = estudante;
        this.publicacao = publicacao;
    }

    public long getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(long idComentario) {
        this.idComentario = idComentario;
    }

    public Publicacao getPublicacao() {
        return publicacao;
    }

    public void setPublicacao (Publicacao publicacao){
        this.publicacao = publicacao;
    }

    public Estudante getEstudante (){
        return estudante;
    }

    public void setestudante (Estudante estudante){
        this.estudante = estudante;
    }

    @Override
    public String toString(){
        return idComentario+ ", " +publicacao+ ", " +estudante;
    }

}

