package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Chat;


public class ChatDAO {

    private ConexaoMysql conexao;

    public ChatDAO() {
        this.conexao = new ConexaoMysql("localhost", "3306", "root", "alunoinfo", "Projeto_integrador_JA;");
    }

    public void adicionar(Chat chat){
        this.conexao.abrirConexao();
        String sql = "INSERT INTO estudante VALUES (null, ?, ?);";
        try{
            PreparedStatement st = conexao.getConexao().prepareStatement(sql);
            st.setLong(1, chat.getChapa().getIdChapa());
            st.setLong(2, chat.getEstudante().getIdEstudante());
            st.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }finally {
            this.conexao.fecharConexao();
        }
    }

    public void excluir(long idChat) {
        this.conexao.abrirConexao();

        String sql = "DELETE FROM estudante WHERE id_estudante;";
        try{
            PreparedStatement st = conexao.getConexao().prepareStatement(sql);
            st.setLong(1, idChat);
            st.executeUpdate();
        } catch(SQLException e) {
            e.printStackTrace();
        }finally {
            this.conexao.fecharConexao();
        }
    }

    public Chat buscarPorId(long idChat) {
        this.conexao.abrirConexao();
        Chat chat = null;

        String sql = "SELECT * FROM estudante WHERE id_estudante=?;";
        try{
            PreparedStatement st = conexao.getConexao().prepareStatement(sql);
            st.setLong(1,idChat);
            ResultSet rs = st.executeQuery();

            if(rs.next()) {
                chat = new Chat();
                chat.setIdChat(rs.getLong("id_chat"));
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }finally {
            this.conexao.fecharConexao();
        }
        return chat;
    }

    public List<Chat> buscarTodos() {
        this.conexao.abrirConexao();

        List<Chat> listChats = new ArrayList();

        String sql = "SELECT * FROM estudante;";
        try {
            PreparedStatement st = conexao.getConexao().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
             while (rs.next()) {
                Chat chat = new Chat();
                chat.setIdChat(rs.getLong("id_chat"));
                chat.setChapa(rs.getString("id_chapa"));
                chat.setEstudante(rs.getString("estudante"));
                listChats.add(chat);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            this.conexao.fecharConexao();
        }
        return listChats;
    }
  
}
