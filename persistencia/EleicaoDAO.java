package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Chat;
import model.Eleicao;
import java.sql.Date;

public class EleicaoDAO {
    
    private ConexaoMysql conexao;

    public EleicaoDAO() {
        this.conexao = new ConexaoMysql("localhost", "3306", "root", "alunoinfo", "Projeto_integrador_JA;");
    }

    public void adicionar(Eleicao eleicao){
        this.conexao.abrirConexao();
        String sql = "INSERT INTO estudante VALUES (null, ?, ?);";
        try{
            PreparedStatement st = conexao.getConexao().prepareStatement(sql);
            st.setDate(1, (Date) eleicao.getData());
            st.setLong(2, eleicao.getChapa().getIdChapa());
            st.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }finally {
            this.conexao.fecharConexao();
        }
    }

    public void excluir(long idEleicao) {
        this.conexao.abrirConexao();

        String sql = "DELETE FROM estudante WHERE id_estudante;";
        try{
            PreparedStatement st = conexao.getConexao().prepareStatement(sql);
            st.setLong(1, idEleicao);
            st.executeUpdate();
        } catch(SQLException e) {
            e.printStackTrace();
        }finally {
            this.conexao.fecharConexao();
        }
    }

    public Eleicao buscarPorId(long idEleicao) {
        this.conexao.abrirConexao();
        Eleicao eleicao = null;

        String sql = "SELECT * FROM estudante WHERE id_estudante=?;";
        try{
            PreparedStatement st = conexao.getConexao().prepareStatement(sql);
            st.setLong(1,idEleicao);
            ResultSet rs = st.executeQuery();

            if(rs.next()) {
                eleicao = new Eleicao();
                eleicao.setIdEleicao(rs.getLong("id_chat"));
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }finally {
            this.conexao.fecharConexao();
        }
        return eleicao;
    }

    public List<Eleicao> buscarTodos() {
        this.conexao.abrirConexao();

        List<Eleicao> listEleicoes = new ArrayList();

        String sql = "SELECT * FROM estudante;";
        try {
            PreparedStatement st = conexao.getConexao().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
             while (rs.next()) {
                Eleicao eleicao = new Eleicao();
                eleicao.setIdEleicao(rs.getLong("id_eleicao"));
                eleicao.setData(rs.getDate("data"));
                listEleicoes.add(eleicao);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            this.conexao.fecharConexao();
        }
        return listEleicoes;
    }
}
