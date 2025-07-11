import java.util.Scanner;
 
public class Produto{
    double preço;
    String nome;
    int quantidade;
    
    public String  mensagem(){
        String mensagem = "Produto:" +nome+ ", R$ " +preço+ " , " +quantidade+ " unidades, total:" + (preço * quantidade);
        return mensagem;
    }
    public double valorTotalemEstoque(){
        return preço * quantidade;
    }
    public void adicionarQuantidadeProdutos(int qtde){
        int adicionarQuantidadeProdutos = (quantidade += qtde);
    }
    public void removerProdutos(int qtde){
        int removerProdutos = (quantidade -= qtde );
        }
}