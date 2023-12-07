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
    System.out.println("2 - Logar como Chapa");
    System.out.println("3 - Cadastrar Estudante");

    escolha = teclado.nextInt();
    teclado.nextLine();  


       





    switch (escolha){
        case 1:
        System.out.println("Email Institucional:");
        String email = teclado.nextLine();
        System.out.println("Senha:");
        String senha = teclado.nextLine();


        EstudanteDAO estudantedao = new EstudanteDAO();
        Estudante estudante = estudantedao.buscarPorEmailSenha(email, senha);
        System.out.println(estudante);
        

    }






    }

}
}
