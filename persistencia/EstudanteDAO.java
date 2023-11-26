package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Estudante;

public class EstudanteDAO {

    private ConexaoMysql conexao;

    public EstudanteDAO() {
        this.conexao = new ConexaoMysql("localhost", "3306", "root", "alunoinfo", "Projeto_integrador_JA;");
    }

    public void adicionar(Estudante estudante){
        this.conexao.abrirConexao();
        String sql = "INSERT INTO estudante VALUES (null, ?, ?, ?);";
        try{
            PreparedStatement st = conexao.getConexao().prepareStatement(sql);
            st.setString(1, estudante.getEmail());
            st.setString(2, estudante.getNome());
            st.setString(3, estudante.getSenhaEstudante());
            st.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }finally {
            this.conexao.fecharConexao();
        }
    }

    public void editar(Estudante estudante) {
        this.conexao.abrirConexao();

        String sql = "UPDATE estudante SET email=?, nome=?, senha=? WHERE id_estudante=?;";
        try{
            PreparedStatement st = conexao.getConexao().prepareStatement(sql);
            st.setString(1, estudante.getEmail());
            st.setString(2, estudante.getNome());
            st.setString(3, estudante.getSenhaEstudante());
            st.setLong(4,estudante.getIdEstudante());
            st.executeUpdate();
        } catch(SQLException e) {
            e.printStackTrace();
        }finally {
            this.conexao.fecharConexao();
        }
    }

    public void excluir(long idEstudante) {
        this.conexao.abrirConexao();

        String sql = "DELETE FROM estudante WHERE id_estudante;";
        try{
            PreparedStatement st = conexao.getConexao().prepareStatement(sql);
            st.setLong(1, idEstudante);
            st.executeUpdate();
        } catch(SQLException e) {
            e.printStackTrace();
        }finally {
            this.conexao.fecharConexao();
        }
    }

    public Estudante buscarPorId(long idEstudante) {
        this.conexao.abrirConexao();
        Estudante estudante = null;

        String sql = "SELECT * FROM estudante WHERE id_estudante=?;";
        try{
            PreparedStatement st = conexao.getConexao().prepareStatement(sql);
            st.setLong(1,idEstudante);
            ResultSet rs = st.executeQuery();

            if(rs.next()) {
                estudante = new Estudante();
                estudante.setIdEstudante(rs.getLong("id_estudante"));
                estudante.setEmail(rs.getString("email_institucional"));
                estudante.setNome(rs.getString("nome"));
                estudante.setSenhaEstudante(rs.getString("senha_estudante0"));
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }finally {
            this.conexao.fecharConexao();
        }
        return estudante;
    }

    public List<Estudante> buscarTodos() {
        this.conexao.abrirConexao();

        List<Estudante> listEstudantes = new ArrayList();

        String sql = "SELECT * FROM estudante;";
        try {
            PreparedStatement st = conexao.getConexao().prepareStatement(sql);
            ResultSet rs = st.executeQuery();
             while (rs.next()) {
                Estudante estudante = new Estudante();
                estudante.setIdEstudante(rs.getLong("id_estudante"));
                estudante.setEmail(rs.getString("email_institucional"));
                estudante.setNome(rs.getString("nome"));
                estudante.setSenhaEstudante(rs.getString("senha_estudante0"));
                listEstudantes.add(estudante);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            this.conexao.fecharConexao();
        }
        return listEstudantes;
    }
}
