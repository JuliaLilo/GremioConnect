package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Chat;
import model.Comentario;

public class ComentarioDAO {
    
    private ConexaoMysql conexao;

    public ComentarioDAO() {
        this.conexao = new ConexaoMysql("localhost", "3306", "root", "alunoinfo", "Projeto_integrador_JA;");
    }

    public void adicionar(Comentario comentario){
        this.conexao.abrirConexao();
        String sql = "INSERT INTO estudante VALUES (null, ?, ?);";
        try{
            PreparedStatement st = conexao.getConexao().prepareStatement(sql);
            st.setLong(1, comentario.getEstudante().getIdEstudante());
            st.setLong(2, comentario.getPublicacao().getIdPublicacao());
            st.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }finally {
            this.conexao.fecharConexao();
        }
    }

    public void excluir(long idComentario) {
        this.conexao.abrirConexao();

        String sql = "DELETE FROM estudante WHERE id_estudante;";
        try{
            PreparedStatement st = conexao.getConexao().prepareStatement(sql);
            st.setLong(1, idComentario);
            st.executeUpdate();
        } catch(SQLException e) {
            e.printStackTrace();
        }finally {
            this.conexao.fecharConexao();
        }
    }

    public Comentario buscarPorId(long idComentario) {
        this.conexao.abrirConexao();
        Comentario comentario = null;

        String sql = "SELECT * FROM estudante WHERE id_estudante=?;";
        try{
            PreparedStatement st = conexao.getConexao().prepareStatement(sql);
            st.setLong(1,idComentario);
            ResultSet rs = st.executeQuery();

            if(rs.next()) {
                comentario = new Comentario();
                comentario.setIdComentario(rs.getLong("id_comentario"));
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }finally {
            this.conexao.fecharConexao();
        }
        return comentario;
    }

    public List<Comentario> buscarTodos() {
        this.conexao.abrirConexao();

        List<Comentario> listComentarios = new ArrayList();

        String sql = "SELECT * FROM estudante;";
        try {
            PreparedStatement st = conexao.getConexao().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
             while (rs.next()) {
                Comentario comentario = new Comentario();
                comentario.setIdComentario(rs.getLong("id_comentario"));
                listComentarios.add(comentario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            this.conexao.fecharConexao();
        }
        return listComentarios;
    }
}
