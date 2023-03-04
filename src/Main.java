import models.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a descrição que você deseja dar ao novo produto: ");
        String descricao = scanner.nextLine();

        System.out.println("Qual o ID você deseja dar ao novo produto: ");
        int id = scanner.nextInt();

        Produto novoProduto =  new Produto(id,descricao);

        System.out.println("Produto criado com sucesso: ");
        System.out.println("----ID: "+novoProduto.getId());
        System.out.println("----Descrição: "+novoProduto.getDescricao());
    }
}