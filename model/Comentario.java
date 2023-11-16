package model;

public class Comentario {
    private long idComentario;

    public Comentario (){
        super();
        this.idComentario = " ";
    }

    public Comentario (long idComentario){
        super();
        this.idComentario = idComentario;
    }

    public long getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(long idComentario) {
        this.idComentario = idComentario;
    }
    
}
