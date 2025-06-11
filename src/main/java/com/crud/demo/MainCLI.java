package com.crud.demo;

import com.crud.demo.dao.UsuarioDAO;
import com.crud.demo.model.Usuario;
import java.util.List;
import java.util.Scanner;

public class MainCLI {

    public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== Gerenciamento de Usuários ===");
            System.out.println("1 - Listar usuários");
            System.out.println("2 - Adicionar usuário");
            System.out.println("3 - Atualizar usuário");
            System.out.println("4 - Deletar usuário");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    List<Usuario> usuarios = usuarioDAO.getAll();
                    usuarios.forEach(u -> System.out.println("ID:" + u.getId() +
                            " | Nome:" + u.getNome() +
                            " | Email:" + u.getEmail()));
                    break;
                case 2:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    usuarioDAO.create(new Usuario(0, nome, email));
                    System.out.println("Usuário adicionado!");
                    break;
                case 3:
                    System.out.print("ID p/ atualizar: ");
                    int idUpd = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Novo nome: ");
                    String nNome = scanner.nextLine();
                    System.out.print("Novo email: ");
                    String nEmail = scanner.nextLine();
                    Usuario u = new Usuario(idUpd, nNome, nEmail);
                    usuarioDAO.update(u);
                    System.out.println("Usuário atualizado!");
                    break;
                case 4:
                    System.out.print("ID p/ deletar: ");
                    int idDel = scanner.nextInt();
                    scanner.nextLine();
                    usuarioDAO.delete(idDel);
                    System.out.println("Usuário deletado!");
                    break;
                case 0:
                    System.out.println("Saindo…");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
