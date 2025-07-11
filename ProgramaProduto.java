import java.util.Locale;
import java.util.Scanner;
 
public class ProgramaProduto{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(new Locale("pt" , "BR"));
        
        Produto produto1 = new Produto();

        System.out.println("Insira os dados do Produto");
        System.out.println("Nome: ");
        produto1.nome = scanner.nextLine();
        System.out.println("Preço: ");
        produto1.preço = scanner.nextDouble();
        System.out.println("Quantidade em  Estoque: ");
        produto1.quantidade= scanner.nextInt();
        System.out.println(produto1.mensagem());

        System.out.println("Informe o numero de produtos para adicionar em estoque: " );
        int estoque = scanner.nextInt();
        produto1.adicionarQuantidadeProdutos(estoque);
 
        System.out.println(produto1.mensagem());  
 
        System.out.println("Informe com o numero de produtos para retirar do  estoque: " );
        estoque = scanner.nextInt();
        produto1.removerProdutos(estoque);
 
        System.out.println(produto1.mensagem());  
 
        System.out.println("Total em Estoque : "+ produto1.valorTotalemEstoque  ());  
 
        scanner.close();
 
    }
 
}