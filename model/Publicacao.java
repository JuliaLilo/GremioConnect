package model;

import java.util.ArrayList;
import java.util.List;

public class Publicacao {
    private long idPublicacao;
    private String imagem;
    private String video;
    private String documento;
    private List<Comentario> listComentario;
    private List<Chapa> listChapa;

    public Publicacao (){
        super();
        this.idPublicacao = 0;
        this.imagem = " ";
        this.video = " ";
        this.documento = " ";
        this.listComentario = new ArrayList<>();
        this.listChapa = new ArrayList<>();
        }

    public Publicacao (long idPublicacao, String imagem, String video, String documento, List<Comentario> 
    listComentario, List<Chapa> listChapa) {
        super();
        this.idPublicacao = idPublicacao;
        this.imagem = imagem;
        this.video = video;
        this.documento = documento;
        this.listComentario = listComentario;
        this.listChapa = listChapa;
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

    public String getVideo(){
        return video;
    }

    public void setVideo(String video){
        this.video = video;
    }

    public String getDocumento(){
        return documento;
    }

    public void setDocumento(String documento){
        this.documento = documento;
    } 

    public List<Comentario> getListComentario() {
        return listComentario;
    }

    public void setListComentario(List<Comentario> listComentario){
        this.listComentario = listComentario;
    }

    public List<Chapa> getListChapa(){
        return listChapa;
    }

    public void setListChapa (List<Chapa> listChapa){
        this.listChapa = listChapa;
    }

    @Override
    public String toString(){
        return idPublicacao+ ", " +imagem+ ", " +video+ ", " +documento+ ", " +listComentario+ ", " +listChapa;
    }
}
