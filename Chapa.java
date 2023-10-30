package model;

public class Chapa {
    private int id_chapa;
    private String senha_chapa;
    private String lema;
    private String nome_chapa;

    public int getId_chapa (){
        return id_chapa;
    }

    public void setId_chapa (int id_chapa){
        this.id_chapa = id_chapa;
    }

    public String getSenha_chapa (){
        return senha_chapa;
    }

    public void setSenha_chapa (String senha_chapa){
        this.senha_chapa = senha_chapa;
    }

    public String getLema (){
        return lema;
    }

    public void setLema (String lema){
        this.lema = lema;
    }

    public String getNome_chapa (){
        return nome_chapa;
    }

    public void setNome_chapa (String nome_chapa){
        this.nome_chapa = nome_chapa;
    }
  
    
}
