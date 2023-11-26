package model;
public class Chat {
    private long idChat;
    private Chapa chapa;
    private Estudante estudante;

    public Chat(long idChat, Chapa chapa, Estudante estudante){
    super();
    this.idChat = idChat;
    this.chapa = chapa;
    this.estudante = estudante;
}
    public Chat(){
    super();
    this.idChat = 0;
    this.chapa = new Chapa();
    this.estudante = new Estudante();
    }

    public long getIdChat() {
        return idChat;
    }

    public void setIdChat(long idChat) {
        this.idChat = idChat;
    }

    public Chapa getChapa (){
        return chapa;
    }

    public void setChapa (Chapa chapa){
        this.chapa = chapa;
    }

    public Estudante getEstudante (){
        return estudante;
    }

    public void setEstudante (Estudante estudante){
        this.estudante = estudante;
    }

    @Override
    public String toString(){
        return idChat+ ", " +chapa+ ", " +estudante;
    }
    public void setChapa(String string) {
    }
    public void setEstudante(String string) {
    }
}
