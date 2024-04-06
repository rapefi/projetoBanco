package teste.user;

import teste.enums.ClassificacaoEnum;
import teste.enums.StatusEnum;
import teste.enums.TipoTransacaoEnum;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroUsuario {

    static List<Usuario> listaUsuario = new ArrayList<>();

    public CadastroUsuario() {

    }


    public static void cadastarUsuario(){
        Usuario usuario = new Usuario();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o ID");
        usuario.setId(scanner.next());

        System.out.println("PF ou PF");
        String tipo = scanner.next().toUpperCase();
        usuario.setClassificacao(ClassificacaoEnum.valueOf(tipo));


        System.out.println("Insira o nome ou razao soocial");
        usuario.setNome(scanner.next());


        usuario.setDataCadastro(LocalDate.now());

        usuario.setStatus(StatusEnum.ATIVO);


        listaUsuario.add(usuario);
        System.out.println("Usario Cadasrrato com sucesso");
        System.out.println("Pressione Enter para voltar ao menu:");
        scanner.nextLine();


    }

    public static void listarUsuario(){
         System.out.println(listaUsuario);

//         for (Usuario usuario : listaUsuario){
//             System.out.println("Nome" + usuario.getNome());
//             System.out.println("Classificacao" + usuario.getClassificacao());
//
//         }

        System.out.println("Pressione Enter para voltar ao menu:");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();1


    }


}
