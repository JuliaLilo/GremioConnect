package model;

public class Estudante {
    private long idEstudante;
    private String email;
    private String nome;
    private String senhaEstudante;

public Estudante( long idEstudante, String email, String nome, String senhaEstudante ){
    super();
    this.idEstudante = idEstudante;
    this.email = email;
    this.nome = nome;
    this.senhaEstudante = senhaEstudante;
}
 public Estudante {
    super();
    this.idEstudante = 0;
    this.email = " ";
    this.nome = " ";
    this.senhaEstudante = " ";
 }

    
    public long getIdEstudante() {
        return idEstudante;
    }
    public void setIdEstudante(long idEstudante) {
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
}
