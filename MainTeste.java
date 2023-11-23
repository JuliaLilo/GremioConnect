import persistencia.Conexao2;

public class MainTeste {
    public static void main (String args []){
        Conexao2 ds = new Conexao2();
        ds.closeDataSource();
    }
}
