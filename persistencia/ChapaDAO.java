package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Chapa;

public class ChapaDAO {
    
    private ConexaoMysql conexao;

    public ChapaDAO() {
        this.conexao = new ConexaoMysql("localhost", "3306", "root", "alunoinfo", "Projeto_integrador_JA;");
    }

    public void adicionar(Chapa chapa){
        this.conexao.abrirConexao();
        String sql = "INSERT INTO chapa VALUES (null, ?, ?, ?, ?);";
        try{
            PreparedStatement st = conexao.getConexao().prepareStatement(sql);
            st.setString(1, chapa.getSenhaChapa());
            st.setString(2, chapa.getLema());
            st.setString(3, chapa.getNomeChapa());
            st.setLong(4, (chapa.getEstudante()).getIdEstudante());
            st.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }finally {
            this.conexao.fecharConexao();
        }
    }

    public void excluir(long idChapa) {
        this.conexao.abrirConexao();

        String sql = "DELETE FROM chapa WHERE id_chapa;";
        try{
            PreparedStatement st = conexao.getConexao().prepareStatement(sql);
            st.setLong(1, idChapa);
            st.executeUpdate();
        } catch(SQLException e) {
            e.printStackTrace();
        }finally {
            this.conexao.fecharConexao();
        }
    }

    public Chapa buscarPorId(long idChapa) {
        this.conexao.abrirConexao();
        Chapa chapa = null;

        String sql = "SELECT * FROM chapa WHERE id_chapa=?;";
        try{
            PreparedStatement st = conexao.getConexao().prepareStatement(sql);
            st.setLong(1,idChapa);
            ResultSet rs = st.executeQuery();

            if(rs.next()) {
                chapa = new Chapa();
                chapa.setIdChapa(rs.getLong("id_chapa"));
                chapa.setSenhaChapa(rs.getString("senha_chapa"));
                chapa.setLema(rs.getString("lema"));
                chapa.setNomeChapa(rs.getString("nome_chapa"));
                
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }finally {
            this.conexao.fecharConexao();
        }
        return chapa;
    }

    public List<Chapa> buscarTodos() {
        this.conexao.abrirConexao();

        List<Chapa> listChapas = new ArrayList();

        String sql = "SELECT * FROM estudante;";
        try {
            PreparedStatement st = conexao.getConexao().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
             while (rs.next()) {
                Chapa chapa = new Chapa();
                chapa.setIdChapa(rs.getLong("id_chapa"));
                chapa.setSenhaChapa(rs.getString("senha_chapa"));
                chapa.setLema(rs.getString("lema"));
                chapa.setNomeChapa(rs.getString("nome_chapa"));
                listChapas.add(chapa);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            this.conexao.fecharConexao();
        }
        return listChapas;
    }
}
