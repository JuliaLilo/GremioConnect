package persistencia;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao2 {
    
    private String hostname;
    private int porta;
    private String database;
    private String username;
    private String senha;

    private Connection connection;

    public Conexao2 (){
        try{
            hostname = "localhost";
            porta = 3306;
            database = "Projeto_integrador_JA";
            username = "root";
            senha = "Br@ncaraposa2006";

            String url = "jdbc:mysql://"+hostname+":"+porta+"/"+database;

            DriverManager.registerDriver((new com.mysql.jdbc.Driver()));
            connection = DriverManager.getConnection(url, username, senha);
              System.out.println("Deu");
        }
        catch (SQLException ex){
            System.err.println("erro "+ex.getMessage()); 
        }
        catch (Exception ex){
            System.err.println("erro geral "+ex.getMessage()); 
        }
    }

    public Connection getConnection (){
        return this.connection;
    }

    public void closeDataSource (){
        try {
            connection.close();
        }
        catch (Exception ex){
            System.err.println("Erro ao desconectar" +ex.getMessage());
        }
    }
}
