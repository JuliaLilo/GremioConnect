package model;
public class Chat {
    private long idChat;

    public Chat(long idChat){
    super();
    this.idChat = idChat;
}
    public Chat(){
    super();
    this.idChat = 0;
    }

    public long getIdChat() {
        return idChat;
    }

    public void setIdChat(long idChat) {
        this.idChat = idChat;
    }
}
