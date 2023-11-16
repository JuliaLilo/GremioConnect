package model;

public class Estudante {
    private int id_estudante;
    private String email;
    private String nome;
    private String senha_estudante;
    
    public int getId_estudante() {
        return id_estudante;
    }
    public void setId_estudante(int id_estudante) {
        this.id_estudante = id_estudante;
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

    public String getSenha_estudante() {
        return senha_estudante;
    }
    public void setSenha_estudante(String senha_estudante) {
        this.senha_estudante = senha_estudante;
    }
}
