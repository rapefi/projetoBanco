package teste;

import teste.user.CadastroUsuario;
import teste.user.Usuario;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean utlizar = true;

        while (utlizar) {


            int opcao = menu();

            if (opcao == 1) {
                CadastroUsuario.cadastarUsuario();
            }

            if (opcao==2){
                CadastroUsuario.listarUsuario();
            }

            if (opcao == 0) {
                utlizar = false;
                System.out.println("Programa encerrado");
            }
        }
    }



    public static int menu(){
        System.out.println("Escolha sua opçao");
        System.out.println("1 - Cadastrar Cliente");
        System.out.println("2 - Listar Cliente");
        System.out.println("3 - Cadastrar Conta Corrente");
        System.out.println("4 - Cadastrar Conta Poupanca");
        System.out.println("5 - Cadastrar Conta Investimento");
        System.out.println("6 - Listar Conta Corrente");
        System.out.println("7 - Listar Conta Poupanca");
        System.out.println("8 - Listar Conta Investimento");
        System.out.println("0 - Sair");
        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        return opcao;
    }

}