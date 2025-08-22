package system_produtos.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import system_produtos.model.entities.Produto;
import system_produtos.model.entities.ProdutoImportado;
import system_produtos.model.entities.ProdutoUsado;
import system_produtos.model.enums.TipoProduto;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);

        List<Produto> list = new ArrayList<>();

        try{
            System.out.print("Quantidade de produtos: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Produto #" +(i+1) + ": ");
            System.out.print("Nome:  ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Preço produto:  ");
            double preco = sc.nextDouble();

        System.out.print("Produto Importado ou Usado (I/U):");
        char opProduto = sc.next().toUpperCase().charAt(0);

        while (opProduto != 'I' && opProduto != 'U') {
            System.out.println("Opção incorreta, digite I ou U!");
            opProduto = sc.next().toUpperCase().charAt(0);
            
        }

        if (opProduto == 'I') {
            System.out.print("Taxa Importação: ");
            double taxaImportacao = sc.nextDouble();
            list.add(new ProdutoImportado(nome, preco, taxaImportacao, TipoProduto.IMPORTADO));
            
        }else{
            System.out.print("Data Fabricação: ");
           LocalDate dataFabricacao = LocalDate.parse(sc.next(), sdf);
           list.add(new ProdutoUsado(nome, preco, dataFabricacao, TipoProduto.USADO));

        }


        }

        Collections.sort(list);

        for (Produto produto : list) {

            System.out.println(produto);

            
        }

            
        } catch (Exception e) {
            System.out.println("Erro ao preencher informações: " + e.getMessage());

        }finally{

            sc.close();

        }

    }

}
