package model;

import java.util.Date;

public class Eleicao {
    private long idEleicao;
    private Date data;
    private Chapa chapa;

    public Eleicao (){
        super();
        this.idEleicao = 0;
        this.data = new Date();
    }

    public Eleicao (long idEleicao, Date data){
        super();
        this.idEleicao = idEleicao;
        this.data = data;
    }
    
    public long getIdEleicao() {
        return idEleicao;
    }
    public void setIdEleicao(long idEleicao) {
        this.idEleicao = idEleicao;
    }

    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
}
