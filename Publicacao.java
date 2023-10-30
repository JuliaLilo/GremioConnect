package model;

public class Publicacao {
    private int id_publicacao;
    private String imagem;
    private String video;
    private String documento;
    private String comentario;

    public int getId_publicacao (){
        return id_publicacao;
    }
    public void setId_publicacao (int id_publicacao){
        this.id_publicacao = id_publicacao;
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
