package model;

public class Publicacao {
    private long idPublicacao;
    private String imagem;
    private String video;
    private String documento;
    private String comentario;

    public Publicacao (){
        super();
        this.idPublicacao = 0;
        this.imagem = " ";
        this.video = " ";
        this.documento = " ";
        this.comentario = " ";
    }

    public Publicacao (long idPublicacao, String imagem, String video, String documento, String comentario) {
        super();
        this.idPublicacao = idPublicacao;
        this.imagem = imagem;
        this.video = video;
        this.documento = documento;
        this.comentario = comentario;
    }
    
    public long getIdPublicacao (){
        return idPublicacao;
    }
    public void setIdPublicacao (long idPublicacao){
        this.idPublicacao = idPublicacao;
    }
    public String getImagem (){
        return imagem;
    }
    public void setImagem (String imagem){
        this.imagem = imagem;
    }
    public String getVideo (){
        return video;
    }
    public void setVideo (String video){
        this.video = video;
    }
    public String getDocumento (){
        return documento;
    }
    public void setDocumento (String documento){
        this.documento = documento;
    } 
    public String getComentario (){
        return comentario;
    }
    public void setComentario (String comentario){
        this.comentario = comentario;
    }
}
