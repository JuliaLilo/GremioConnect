package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Publicacao;

public class PublicacaoDAO {
    
    private ConexaoMysql conexao;

    public PublicacaoDAO() {
        this.conexao = new ConexaoMysql("localhost", "3306", "root", "alunoinfo", "Projeto_integrador_JA;");
    }

    public void adicionar(Publicacao publicacao){
        this.conexao.abrirConexao();
        String sql = "INSERT INTO publicacao VALUES (null, ?, ?, ?, ?);";
        try{
            PreparedStatement st = conexao.getConexao().prepareStatement(sql);
            st.setString(1, publicacao.getImagem());
            st.setString(2, publicacao.getVideo());
            st.setString(3, publicacao.getDocumento());
            st.setLong(4, (publicacao.getChapa()).getIdChapa());
            st.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }finally {
            this.conexao.fecharConexao();
        }
    }

    public void excluir(long idPublicacao) {
        this.conexao.abrirConexao();

        String sql = "DELETE FROM publicacao WHERE id_publicacao;";
        try{
            PreparedStatement st = conexao.getConexao().prepareStatement(sql);
            st.setLong(1, idPublicacao);
            st.executeUpdate();
        } catch(SQLException e) {
            e.printStackTrace();
        }finally {
            this.conexao.fecharConexao();
        }
    }

    public Publicacao buscarPorId(long idPublicacao) {
        this.conexao.abrirConexao();
        Publicacao publicacao = null;

        String sql = "SELECT * FROM publicacao WHERE id_publicacao=?;";
        try{
            PreparedStatement st = conexao.getConexao().prepareStatement(sql);
            st.setLong(1,idPublicacao);
            ResultSet rs = st.executeQuery();

            if(rs.next()) {
                publicacao = new Publicacao();
                publicacao.setIdPublicacao(rs.getLong("id_publicacao"));
                publicacao.setImagem(rs.getString("imagem"));
                publicacao.setVideo(rs.getString("video"));
                publicacao.setDocumento(rs.getString("documento"));
                
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }finally {
            this.conexao.fecharConexao();
        }
        return publicacao;
    }

    public List<Publicacao> buscarTodos() {
        this.conexao.abrirConexao();

        List<Publicacao> listPublicacoes = new ArrayList();

        String sql = "SELECT * FROM publicacao;";
        try {
            PreparedStatement st = conexao.getConexao().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
             while (rs.next()) {
                Publicacao publicacao = new Publicacao();
                publicacao.setIdPublicacao(rs.getLong("id_publicacao"));
                publicacao.setImagem(rs.getString("imagem"));
                publicacao.setVideo(rs.getString("video"));
                publicacao.setDocumento(rs.getString("documento"));
                listPublicacoes.add(publicacao);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            this.conexao.fecharConexao();
        }
        return listPublicacoes;
    }
}
