package persistencia;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoMysql {
   
    private String ip;
    private String porta;
    private String login;
    private String senha;
    private String nomeBd;
    private Connection conexao;

    public ConexaoMysql(String ip, String porta, String login, String senha, String nomeBd) {
        super();
        this.ip = ip;
        this.porta = porta;
        this.login = login;
        this.senha = senha;
        this.nomeBd = nomeBd;
    }

    public Connection getConexao() {
        return conexao;
    }

    public void setConexao(Connection conexao) {
        this.conexao = conexao;
    }

    public void abrirConexao() {
        String url = "jdbc:mysql://" + ip + ":" + porta + "/" +nomeBd;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conexao = DriverManager.getConnection(url, login, senha);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void fecharConexao() {
        try {
            if(this.conexao!=null && !this.conexao.isClosed()) {
                this.conexao.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
