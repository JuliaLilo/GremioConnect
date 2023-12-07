package telas;

import java.util.Scanner;
import model.Estudante;
import persistencia.EstudanteDAO;

public class TelaLogin {
    public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);

    System.out.println("Grêmio Connect");

    int escolha = 0;
    while (escolha == 0 ){
    System.out.println("1 - Logar como Estudante");
    System.out.println("2 - Cadastrar Estudante");
    System.out.println("3 - Logar como Chapa");

    escolha = teclado.nextInt();
    teclado.nextLine();  

    switch (escolha){
        case 1:{
        System.out.println("Email Institucional:");
        String email = teclado.nextLine();
        System.out.println("Senha:");
        String senha = teclado.nextLine();

        EstudanteDAO estudantedao = new EstudanteDAO();
        Estudante estudante = estudantedao.buscarPorEmailSenha(email, senha);
        System.out.println(estudante);
        break;
        }
        case 2:{

        System.out.println("Nome:");
        String nome = teclado.nextLine();
        System.out.println("Email Institucional:");
        String email = teclado.nextLine();
        System.out.println("Senha:");
        String senha = teclado.nextLine();

         Estudante estudante= new Estudante(null, email, nome, senha,null, null, null,null,null);
                EstudanteDAO estudanteDAO = new EstudanteDAO();
                estudanteDAO.adicionar(estudante);

break;
    }

        default: {
                System.out.println("Erro! Valor não valido");
            }
            escolha = 0;


    }

}
    }
}