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
        this.chapa = new Chapa();
    }

    public Eleicao (long idEleicao, Date data, Chapa chapa){
        super();
        this.idEleicao = idEleicao;
        this.data = data;
        this.chapa = chapa;
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

    public Chapa getChapa() {
        return chapa;
    }

    public void setChapa(Chapa chapa){
        this.chapa = chapa;
    }

    @Override
    public String toString() {
        return idEleicao+ ", " +data+ ", " +chapa; 
    }
}

