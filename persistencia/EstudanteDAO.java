package DAO;

 import model.Estudante;
 import persistencia.Conexao;

public class EstudanteDAO {
    
    private Conexao conexao;

    public EstudanteDAO() {
        conexao = new Conexao("192.168.1.103 ", "3306", "root", "Br@ncaraposa2006", "Projeto_integrador_JA");
    }

    public void cadastrarEstudante(Estudante estudante){
        conexao.abrirConexao();
        


   }
}
