package model;

import java.util.ArrayList;
import java.util.List;

public class Chapa {
    private long idChapa;
    private String senhaChapa;
    private String lema;
    private String nomeChapa;
    private Estudante estudante;
    private List<Publicacao> listPubli;
    private List<Chat> listChat;
    private List<Votacao> listVotacao;
    private List<Eleicao> listEleicao;
    private List<Participacao> listParticipacao;

    public Chapa (long idChapa, String senhaChapa, String lema, String nomeChapa, Estudante estudante,
    List<Publicacao> listPubli, List<Chat> listChat, List<Votacao> listVotacao, List<Eleicao> listEleicao,
    List<Participacao> listParticipacao) {
        super();
        this.idChapa = idChapa;
        this.senhaChapa = senhaChapa;
        this.lema = lema;
        this.nomeChapa = nomeChapa;
        this.estudante = estudante;
        this.listPubli = listPubli;
        this.listChat = listChat;
        this.listEleicao = listEleicao;
        this.listVotacao = listVotacao;
        this.listParticipacao = listParticipacao;
    }
     public Chapa (){
        super( );
        this.idChapa = 0;
        this.senhaChapa = " ";
        this.lema = " ";
        this.nomeChapa = " ";
        this.estudante = new Estudante();
        this.listPubli= new ArrayList();
        this.listChat = new ArrayList<>();
        this.listEleicao = new ArrayList<>();
        this.listVotacao = new ArrayList<>();
        this.listParticipacao = new ArrayList<>();
     }

    public long getIdChapa (){
        return idChapa;
    }

    public void setIdChapa (long idChapa){
        this.idChapa = idChapa;
    }

    public String getSenhaChapa (){
        return senhaChapa;
    }

    public void setSenhaChapa (String senhaChapa){
        this.senhaChapa = senhaChapa;
    }

    public String getLema(){
        return lema;
    }

    public void setLema(String lema){
        this.lema = lema;
    }

    public String getNomeChapa (){
        return nomeChapa;
    }

    public void setNomeChapa (String nomeChapa){
        this.nomeChapa = nomeChapa;
    }

      public Estudante getEstudante (){
        return estudante;
    } 

    public void setEstudante (Estudante estudante){
        this.estudante = estudante;
    }

    public List<Publicacao> getListPublicacao (){
        return listPubli;
    }

    public void setListPublicacao (List<Publicacao> listPubli){
        this.listPubli = listPubli;
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

    public List<Eleicao> getListEleicao() {
        return listEleicao;
    }

    public void setListEleicao (List<Eleicao> listEleicao){
        this.listEleicao = listEleicao;
    }

    public List<Participacao> getListParticipacao() {
        return listParticipacao;
    }

    public void setListParticipacao (List<Participacao> listParticipacao){
        this.listParticipacao = listParticipacao;
    }

    @Override
    public String toString() {
        return idChapa+ ", " +senhaChapa+ ", " +lema+ ", " +nomeChapa+ ", " +listChat+ ", " +listEleicao+ 
        ", " +estudante+ ", " +listVotacao+ ", "  +listPubli+ ", " +listParticipacao;
    }
}
