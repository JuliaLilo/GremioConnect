package model;

import java.util.ArrayList;
import java.util.List;

public class Estudante {
    private Long idEstudante;
    private String email;
    private String nome;
    private String senhaEstudante;
    private List<Comentario> listComentario;
    private List<Chapa> listChapa;
    private List<Chat> listChat;
    private List<Votacao> listVotacao;
    private List<Participacao> listPart;

    public Estudante( Long idEstudante, String email, String nome, String senhaEstudante, 
    List<Comentario>listComentario, List<Chapa> listChapa, List<Chat> listChat, List<Votacao> listVotacao, List<Participacao> listPart){
        super();
        this.idEstudante = idEstudante;
        this.email = email;
        this.nome = nome;
        this.senhaEstudante = senhaEstudante;
        this.listComentario = listComentario;
        this.listChapa = listChapa;
        this.listChat = listChat;
        this.listVotacao = listVotacao;
        this.listPart = listPart; 
}
    public Estudante () {
        super();
        this.idEstudante = (long) 0;
        this.email = " ";
        this.nome = " ";
        this.senhaEstudante = " ";
        this.listComentario = new ArrayList<>();
        this.listChapa = new ArrayList<>();
        this.listChat = new ArrayList<>();
        this.listVotacao = new ArrayList<>();
        this.listPart = new ArrayList<>();
    }

    public Long getIdEstudante() {
        return idEstudante;
    }

    public void setIdEstudante(Long idEstudante) {
        this.idEstudante = idEstudante;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenhaEstudante() {
        return senhaEstudante;
    }
    
    public void setSenhaEstudante(String senhaEstudante) {
        this.senhaEstudante = senhaEstudante;  
    }

     public List<Comentario> getListComentario() {
        return listComentario;
    }

    public void setListComentario (List<Comentario> listComentario){
        this.listComentario= listComentario;
    }

      public List<Chapa> getListChapa() {
        return listChapa;
    }

    public void setListChapa (List<Chapa> listChapa){
        this.listChapa = listChapa;
    }

    public List<Chat> getListChat() {
        return listChat;
    }

    public void setListChat (List<Chat> listChat){
        this.listChat = listChat;
    }

    public List<Votacao> getListVotacao() {
        return listVotacao;
    }

    public void setListVotacao (List<Votacao> listVotacao){
        this.listVotacao = listVotacao;
    }

    public List<Participacao> getListPart() {
        return listPart;
    }

    public void setListPart (List<Participacao> listPart){
        this.listPart = listPart;
    }
    
    @Override
    public String toString() {
        return idEstudante+ ", " +senhaEstudante+ ", " +email+ ", " +nome+ ", " +listChat+ ", " +listPart+ 
         ", " +listVotacao+ ", " +listChapa+ ", " +listComentario;
    }
}
