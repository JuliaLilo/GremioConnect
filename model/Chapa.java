package model;

public class Chapa {
    private long idChapa;
    private String senhaChapa;
    private String lema;
    private String nomeChapa;

    public Chapa (long idChapa, String senhaChapa, String lema, String nomeChapa) {
        super();
        this.idChapa = idChapa;
        this.senhaChapa = senhaChapa;
        this.lema = lema;
        this.nomeChapa = nomeChapa;
    }
     public Chapa (){
        super( );
        this.idChapa = 0;
        this.senhaChapa = " ";
        this.lema = " ";
        this.nomeChapa = " ";
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

    public String getLema (){
        return lema;
    }

    public void setLema (String lema){
        this.lema = lema;
    }

    public String getNomeChapa (){
        return nomeChapa;
    }

    public void setNomeChapa (String nomeChapa){
        this.nomeChapa = nomeChapa;
    }
  
    
}