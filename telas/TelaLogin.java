package telas;

import java.util.Scanner;
import model.Chapa;
import model.Estudante;
import persistencia.ChapaDAO;
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

        if (estudante != null) {
            System.out.println("Login realizado com sucesso!");
            System.out.println(estudante);

            int opcaoLogado = 0;
        while (opcaoLogado == 0) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Criar Chapa");
            System.out.println("2 - Olhar Publicações");
            System.out.println("3 - Conversar com a Chapa");
            System.out.println("4 - Deletar Conta");
            System.out.println("5 - Sair");

            opcaoLogado = teclado.nextInt();
            teclado.nextLine();

            switch (opcaoLogado) {
                case 1:
                System.out.println("Nome da Chapa:");
                String nomeChapa = teclado.nextLine();
                System.out.println("Senha:");
                String senhaChapa = teclado.nextLine();
                System.out.println("Lema:");
                String lemaChapa = teclado.nextLine();

                Chapa novaChapa = new Chapa(null,senhaChapa, lemaChapa, nomeChapa, null, 
                null, null, null, null, null);
                ChapaDAO chapaDAO = new ChapaDAO();
                chapaDAO.adicionar(novaChapa);

                System.out.println("Chapa criada com sucesso!");
                   
                int opcaoChapaCriada = 0;
                while (opcaoChapaCriada == 0) {
                   System.out.println("Escolha uma opção:");
                   System.out.println("1- Sair e logar como Chapa");
                   System.out.println("2- Continuar como Estudante");

                   opcaoChapaCriada = teclado.nextInt();
                   teclado.nextLine();

                   switch (opcaoChapaCriada) {
                    case 1: {
                        System.out.println("Saindo e logando como Chapa...");

                        System.out.println("Nome da Chapa:");
                        nomeChapa = teclado.nextLine();
                        System.out.println("Senha:");
                        senhaChapa = teclado.nextLine();

                        ChapaDAO chapadao = new ChapaDAO();
                        Chapa chapa = chapadao.buscarPorNomeSenha(nomeChapa, senhaChapa);
                        System.out.println(chapa);
                        opcaoChapaCriada = 1;
                        break;
                    }

                    case 2: {
                        System.out.println("Continuando como Estudante...");
                        }

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                         opcaoChapaCriada = 0;
                    }
                }
            }
        }

        } else {
            System.out.println("Credenciais inválidas. Tente novamente.");
        }
                }
                    break;
    
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

        System.out.println("Estudante cadastrado com sucesso!");

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