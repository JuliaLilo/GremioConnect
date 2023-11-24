package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Estudante;

public class EstudanteDAO {

    private DataSource dataSource;
    
    public EstudanteDAO (DataSource dataSource){
        this.dataSource = dataSource;
    }

   public ArrayList <Estudante> readAll (){
        try{
            this.dataSource.getConnection();
            String SQL = "SELECT * FROM estudante";
            PreparedStatement ps = this.dataSource.getConnection().prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();

            ArrayList <Estudante> lista = new ArrayList <Estudante>();

            while(rs.next()){
                Estudante est = new Estudante();
                est.setIdEstudante(rs.getLong("id"));
                est.setEmail(rs.getString("email"));
                est.setNome(rs.getString("nome"));
                est.setSenhaEstudante(rs.getString("senha"));
                lista.add(est);
            }
            ps.close();
            return lista;
        }
        catch(SQLException ex){
            System.err.println("Erro ao recuperar " +ex.getMessage());
        }
        catch (Exception ex){
            System.err.println("Erro geral " +ex.getMessage());
        }
        return null;
   } 
    
}
