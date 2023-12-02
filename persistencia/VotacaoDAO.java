package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Votacao;

public class VotacaoDAO {
    
    private ConexaoMysql conexao;

    public VotacaoDAO() {
        this.conexao = new ConexaoMysql("localhost", "3306", "root", "alunoinfo", "Projeto_integrador_JA;");
    }

    public void adicionar(Votacao votacao){
        this.conexao.abrirConexao();
        String sql = "INSERT INTO estudante VALUES (null, ?);";
        try{
            PreparedStatement st = conexao.getConexao().prepareStatement(sql);
            st.setLong(1, (votacao.getEstudante()).getIdEstudante());
            st.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }finally {
            this.conexao.fecharConexao();
        }
    }

    public void excluir(long idVotacao) {
        this.conexao.abrirConexao();

        String sql = "DELETE FROM estudante WHERE id_estudante;";
        try{
            PreparedStatement st = conexao.getConexao().prepareStatement(sql);
            st.setLong(1, idVotacao);
            st.executeUpdate();
        } catch(SQLException e) {
            e.printStackTrace();
        }finally {
            this.conexao.fecharConexao();
        }
    }

    public Chapa buscarPorId(long idVotacao) {
        this.conexao.abrirConexao();
        Votacao votacao = null;

        String sql = "SELECT * FROM estudante WHERE id_estudante=?;";
        try{
            PreparedStatement st = conexao.getConexao().prepareStatement(sql);
            st.setLong(1,idVotacao);
            ResultSet rs = st.executeQuery();

            if(rs.next()) {
                votacao = new Votacao();
                votacao.setIdVotacao(rs.getLong("id_votacao"));
                
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }finally {
            this.conexao.fecharConexao();
        }
        return votacao;
    }

    public List<Votacao> buscarTodos() {
        this.conexao.abrirConexao();

        List<Votacao> listVotacoes = new ArrayList();

        String sql = "SELECT * FROM estudante;";
        try {
            PreparedStatement st = conexao.getConexao().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
             while (rs.next()) {
                Votacao votacao = new Votacao();
                votacao.setIdVotacao(rs.getLong("id_votacao"));
                listVotacoes.add(votacao);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            this.conexao.fecharConexao();
        }
        return listVotacoes;
    }
}
