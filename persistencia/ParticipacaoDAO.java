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
        String sql = "INSERT INTO estudante VALUES (null, ?);";
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

        String sql = "DELETE FROM estudante WHERE id_estudante;";
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

    public Chapa buscarPorId(long idParticipacao) {
        this.conexao.abrirConexao();
        Chapa chapa = null;

        String sql = "SELECT * FROM estudante WHERE id_estudante=?;";
        try{
            PreparedStatement st = conexao.getConexao().prepareStatement(sql);
            st.setLong(1,idParticipacao);
            ResultSet rs = st.executeQuery();

            if(rs.next()) {
                partcipacao = new Participacao();
                partcipacao.setIdParticipacao(rs.getLong("id_participacao"));
                
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }finally {
            this.conexao.fecharConexao();
        }
        return partcipacao;
    }

    public List<Participacao> buscarTodos() {
        this.conexao.abrirConexao();

        List<Partcipacao> listPartcipacoes = new ArrayList();

        String sql = "SELECT * FROM estudante;";
        try {
            PreparedStatement st = conexao.getConexao().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
             while (rs.next()) {
                Partcipacao participacao = new Participacao();
                participacao.setIdParticipacao(rs.getLong("id_participacao"));
                listPartcipacoes.add(partcipacao);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            this.conexao.fecharConexao();
        }
        return listParticipacoes;
    }
}
