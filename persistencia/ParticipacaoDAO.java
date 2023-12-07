package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Participacao;

public class ParticipacaoDAO {
    
    private ConexaoMysql conexao;

    public ParticipacaoDAO() {
        this.conexao = new ConexaoMysql("localhost", "3306", "root", "alunoinfo", "Projeto_integrador_JA;");
    }

    public void adicionar(Participacao participacao){
        this.conexao.abrirConexao();
        String sql = "INSERT INTO participacao VALUES (null, ?);";
        try{
            PreparedStatement st = conexao.getConexao().prepareStatement(sql);
            st.setLong(1, (participacao.getEstudante()).getIdEstudante());
            st.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }finally {
            this.conexao.fecharConexao();
        }
    }

    public void excluir(long idParticipacao) {
        this.conexao.abrirConexao();

        String sql = "DELETE FROM participacao WHERE id_participacao;";
        try{
            PreparedStatement st = conexao.getConexao().prepareStatement(sql);
            st.setLong(1, idParticipacao);
            st.executeUpdate();
        } catch(SQLException e) {
            e.printStackTrace();
        }finally {
            this.conexao.fecharConexao();
        }
    }

    public Participacao buscarPorId(long idParticipacao) {
        this.conexao.abrirConexao();
        Participacao participacao = null;

        String sql = "SELECT * FROM participacao WHERE id_participacao=?;";
        try{
            PreparedStatement st = conexao.getConexao().prepareStatement(sql);
            st.setLong(1,idParticipacao);
            ResultSet rs = st.executeQuery();

            if(rs.next()) {
                participacao = new Participacao();
                participacao.setIdParticipacao(rs.getLong("id_participacao"));
                
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }finally {
            this.conexao.fecharConexao();
        }
        return participacao;
    }

    public List<Participacao> buscarTodos() {
        this.conexao.abrirConexao();

        List<Participacao> listParticipacoes = new ArrayList();

        String sql = "SELECT * FROM participacao;";
        try {
            PreparedStatement st = conexao.getConexao().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
             while (rs.next()) {
                Participacao participacao = new Participacao();
                participacao.setIdParticipacao(rs.getLong("id_participacao"));
                listParticipacoes.add(participacao);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            this.conexao.fecharConexao();
        }
        return listParticipacoes;
    }
}
