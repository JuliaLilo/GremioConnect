import entity.Estudante;

public class EstudanteDAO {

    private Conexao conexao;

    public EstudanteDAO() {
        conexao = new Conexao(" ", "3306", "localhost", "alunoinfo", "Projeto_integrador_JA");
    }

   public void cadastrarEStudante(Estudante estudante){
    conexao.abrirConexao();

   }
}
