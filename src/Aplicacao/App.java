package Aplicacao;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import Entidades.Produto;
import Entidades.ProdutoImportado;
import Entidades.ProdutoUsado;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Produto> list = new ArrayList<>();
        Produto produto;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        
        System.out.print("Numeros de produtos: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Produto #" + i);
            System.out.print("comum, usado ou importado(c/u/i): ");
            char tipo = sc.next().charAt(0);

            double preco;
            String nome;
            switch (tipo) {
                case 'c':
                    System.out.print("Nome: ");
                    sc.nextLine();
                    nome = sc.nextLine();
                    System.out.print("Preco: ");
                    preco = sc.nextDouble();
                    list.add(produto = new Produto(nome, preco));
                    System.out.println();
                break;

                case 'u':
                    System.out.print("Nome: ");
                    sc.nextLine();
                    nome = sc.nextLine();
                    System.out.print("Preco: ");
                    preco = sc.nextDouble();
                    System.out.print("Data de fabricacao(dd/mm/yy): ");
                    Date data = sdf.parse(sc.next());
                    list.add( produto = new ProdutoUsado(nome, preco, data));
                    System.out.println();
                break;
                
                case 'i':
                    System.out.print("Nome: ");
                    sc.nextLine();
                    nome = sc.nextLine();
                    System.out.print("Preco: ");
                    preco = sc.nextDouble();
                    System.out.print("Taxa de importacao: ");
                    double taxa = sc.nextDouble();
                    list.add(produto = new ProdutoImportado(nome, preco, taxa));
                    System.out.println();
                break;
                    
            }
        }
        System.out.println("Precos: ");
        for (Produto p : list) {
            System.out.println(p.precoTag());
        }
        sc.close();
    }
}
